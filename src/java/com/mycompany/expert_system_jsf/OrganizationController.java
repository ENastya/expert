package com.mycompany.expert_system_jsf;

import com.mycompany.expert_system_models.Organization;
import com.mycompany.expert_system_jsf.util.JsfUtil;
import com.mycompany.expert_system_jsf.util.PaginationHelper;
import com.mycompany.expert_system_models.Mark;
import com.mycompany.expert_system_models.User;
import com.mycompany.expert_system_sb.OrganizationFacade;

import java.io.Serializable;
import java.io.StringReader;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

@Named("organizationController")
@SessionScoped
public class OrganizationController implements Serializable {

    private Organization current;
    private DataModel items = null;
    @EJB
    private com.mycompany.expert_system_sb.OrganizationFacade ejbFacade;
    @EJB
    private com.mycompany.expert_system_sb.UserFacade ejbUserFacade;
    @EJB
    private com.mycompany.expert_system_sb.MarkFacade ejbMarkFacade;
    @EJB
    private com.mycompany.expert_system_sb.CriterionFacade ejbCriterionFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public OrganizationController() {
    }

    public Organization getSelected() {
        if (current == null) {
            current = new Organization();
            selectedItemIndex = -1;
        }
        return current;
    }

    private OrganizationFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView(int id) {
        current = (Organization) ejbFacade.find(id);
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Organization();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create(com.mycompany.expert_system_models.User u) {
        try {

            try {
                java.lang.String дата11 = "";
                java.lang.String дата21 = "";
                expertmarks.ExpertMarks service1 = new expertmarks.ExpertMarks();
                expertmarks.ExpertMarksPortType port1 = service1.getExpertMarksSoap();
                // TODO process result here
                java.lang.String result = port1.docs(дата11, дата21);
                System.out.println("Result = " + result);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            try {
                current.setUser(u);
                getFacade().create(current);
                JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("OrganizationCreated"));
                expertmarks.ExpertMarks service = new expertmarks.ExpertMarks();
                expertmarks.ExpertMarksPortType port = service.getExpertMarksSoap();

                // TODO process result here
                for (int i = 1; i <= 26; i++) {
                    Mark mark = new Mark();
                    mark.setOrganization(current);
                    switch (i) {
                        case (3):
                            java.lang.String result = port.workers();
                            String[] workersarr = result.split("&");
                            float aswas = Integer.valueOf(workersarr[0]);
                            float asis = Integer.valueOf(workersarr[workersarr.length - 1]);
                            mark.setCriterion(ejbCriterionFacade.find(i));
                            float percent;
                            if (aswas != 0) {
                                percent = asis * 100 / aswas;
                                percent = abs(100 - percent);
                            } else {
                                percent = 0;
                            }
                            if (asis > aswas) {
                                percent = (float) (0.5 + (0.005 * percent));
                            } else {
                                percent = (float) (0.5 + (0.005 * percent));
                            }
                            mark.setMark((float) percent);
                            if (mark.getMark() > 1) {
                                mark.setMark(1);
                            }
                            if (mark.getMark() < 0) {
                                mark.setMark(0);
                            }
                            ejbMarkFacade.create(mark);

                            break;

                        case (7):
                            java.lang.String дата1 = "20000101";
                            java.lang.String дата2 = "20090101";
                            // TODO process result here
                            java.lang.String xmlresp = port.docs(дата1, дата2);
                            String xml = new String(xmlresp.getBytes("UTF-8"), StandardCharsets.UTF_8);
                            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                            DocumentBuilder builder;
                            InputSource is;
                            builder = factory.newDocumentBuilder();
                            is = new InputSource(new StringReader(xml));
                            Document doc;
                            doc = (Document) builder.parse(is);
                            NodeList listRows = doc.getElementsByTagName("Value");
                            int a = listRows.getLength();
                            Map<Integer, Integer> states = new HashMap<Integer, Integer>();
                            int min = 0;
                            int max = 0;
                            for (int id = 2; id < a; id = id + 4) {

                                states.put(Integer.parseInt(listRows.item(id + 1).getTextContent()), 0);
                            }
                            min = Integer.parseInt(listRows.item(3).getTextContent());
                            max = Integer.parseInt(listRows.item(3).getTextContent());
                            for (int id = 2; id < a; id = id + 4) {
                                if (Integer.parseInt(listRows.item(id + 1).getTextContent()) < min) {
                                    min = Integer.parseInt(listRows.item(id + 1).getTextContent());
                                }
                                if (Integer.parseInt(listRows.item(id + 1).getTextContent()) > max) {
                                    max = Integer.parseInt(listRows.item(id + 1).getTextContent());
                                }
                                states.put(Integer.parseInt(listRows.item(id + 1).getTextContent()), states.get(Integer.parseInt(listRows.item(id + 1).getTextContent())) + Integer.parseInt(listRows.item(id).getTextContent()));
                            }
                            System.out.println(min + " " + max);
                            mark.setCriterion(ejbCriterionFacade.find(i));
                            if (states.get(min) != 0) {
                                int mymin = states.get(min);
                                int mymax = states.get(max);
                                percent = mymax * 100 / mymin;
                                percent = abs(100 - percent);
                            } else {
                                percent = 0;
                            }
                            if (states.get(max) > states.get(min)) {
                                percent = (float) (0.5 + (0.005 * percent));
                            } else {
                                percent = (float) (0.5 - (0.005 * percent));
                            }
                            mark.setMark((float) percent);
                            if (mark.getMark() > 1) {
                                mark.setMark(1);
                            }
                            if (mark.getMark() < 0) {
                                mark.setMark(0);
                            }
                            ejbMarkFacade.create(mark);
                            break;
                        case (8):
                            java.lang.String resultmoney = port.money();
                            String[] moneyarr = resultmoney.split("&");
                            String test1 = moneyarr[0].split("#")[1];
                            test1 = test1.replaceAll(" ", "");
                            test1 = test1.replaceAll(",", ".");
                            String test2 = moneyarr[moneyarr.length - 1].split("#")[1];
                            test2 = test2.replaceAll(" ", "");
                            test2 = test2.replaceAll(",", ".");
                            aswas = Float.parseFloat(test1);
                            asis = Float.parseFloat(test2);
                            mark.setCriterion(ejbCriterionFacade.find(i));
                            percent = 0;
                            if (aswas != 0) {
                                percent = asis * 100 / aswas;
                                percent = abs(100 - percent);
                            } else {
                                percent = 0;
                            }
                            if (asis > aswas) {
                                percent = (float) (0.5 + (0.005 * percent));
                            } else {
                                percent = (float) (0.5 - (0.005 * percent));
                            }
                            mark.setMark((float) percent);
                            if (mark.getMark() > 1) {
                                mark.setMark(1);
                            }
                            if (mark.getMark() < 0) {
                                mark.setMark(0);
                            }
                            ejbMarkFacade.create(mark);

                            break;

                        case (9):
                            java.lang.String resultkol = port.money();
                            String[] kolarr = resultkol.split("&");
                            aswas = Integer.valueOf(kolarr[0].split("#")[0]);
                            asis = Integer.valueOf(kolarr[kolarr.length - 1].split("#")[0]);
                            mark.setCriterion(ejbCriterionFacade.find(i));
                            percent = 0;
                            if (aswas != 0) {
                                percent = asis * 100 / aswas;
                                percent = abs(100 - percent);
                            } else {
                                percent = 0;
                            }
                            if (asis > aswas) {
                                percent = (float) (0.5 + (0.5 / 100 * percent));
                            } else {
                                percent = (float) (0.5 - (0.5 / 100 * percent));
                            }
                            mark.setMark((float) percent);
                            if (mark.getMark() > 1) {
                                mark.setMark(1);
                            }
                            if (mark.getMark() < 0) {
                                mark.setMark(0);
                            }
                            ejbMarkFacade.create(mark);

                            break;
                        default:
                            mark.setCriterion(ejbCriterionFacade.find(i));
                            mark.setMark(0);
                            ejbMarkFacade.create(mark);
                            break;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public float [] marks(Organization o, int code){
        List<Mark> markList = markList(o, code);
        float[] myArray = new float[markList.size()];
        for (int i = 0; i< markList.size(); i++){
            myArray[i] = markList.get(i).getMark();
        }
        return myArray;
    }
    
    public List<Mark> markList(Organization o, int code) {
        String sub = "";
        if (code == 1) {
            sub = "Org";
        }
        if (code == 2) {
            sub = "IS";
        }
        List<Mark> markList = ejbMarkFacade.findAll();
        int i = 0;
        while (i < markList.size()) {
            if ((markList.get(i).getOrganization().equals(o)) && (markList.get(i).getCriterion().getSubject().equals(sub))) {
                i++;
            } else {
                markList.remove(i);
            }
        }
        return markList;
    }

    public float sales(int i) {
        float f = 0;
        try {
            expertmarks.ExpertMarks service2 = new expertmarks.ExpertMarks();
            expertmarks.ExpertMarksPortType port2 = service2.getExpertMarksSoap();
            // TODO process result here
            java.lang.String result = port2.money();
            System.out.println("Result = " + result);
            String[] moneyarr = result.split("&");
                            String test1 = moneyarr[i].split("#")[0];
                            test1 = test1.replaceAll(" ", "");
                            test1 = test1.replaceAll(",", ".");
                            f = Float.valueOf(test1);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return f;
    }
    
    public float money(int i) {
        float f = 0;
        try {
            expertmarks.ExpertMarks service2 = new expertmarks.ExpertMarks();
            expertmarks.ExpertMarksPortType port2 = service2.getExpertMarksSoap();
            // TODO process result here
            java.lang.String result = port2.money();
            System.out.println("Result = " + result);
            String[] moneyarr = result.split("&");
                            String test1 = moneyarr[i].split("#")[1];
                            test1 = test1.replaceAll(" ", "");
                            test1 = test1.replaceAll(",", ".");
                            f = Float.valueOf(test1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return f;
    }

    public float[] Grs(Organization o) {
        List<Mark> markList = ejbMarkFacade.findAll();
        int i = 0;
        while (i < markList.size()) {
            if (markList.get(i).getOrganization().equals(o)) {
                i++;
            } else {
                markList.remove(i);
            }
        }
        float Gr1 = 0, Gr2 = 0, Gr3 = 0, Gr4 = 0, Gr5 = 0, Gr6 = 0, Gr7 = 0, Gr8 = 0;
        for (Mark m : markList) {
            switch (m.getCriterion().getSubject()) {
                case ("Org"):
                    switch (m.getCriterion().getCrgroup()) {
                        case ("Характеристики контроля"):
                            Gr1 = Gr1 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Характеристики бизнес-процессов"):
                            Gr2 = Gr2 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Характеристики процессов прогнозирования"):
                            Gr3 = Gr3 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Общие характеристики"):
                            Gr4 = Gr4 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                    }
                    break;
               
                case ("IS"):
                     String aaaa = m.getCriterion().getCrgroup();
                    switch (m.getCriterion().getCrgroup()) {
                        case ("Роль ИС в компании"):
                            Gr5 = Gr5 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Затраты на ИС"):
                            Gr6 = Gr6 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Степень интеграции"):
                            Gr7 = Gr7 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Общие характеристики"):
                            Gr8 = Gr8 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                    }
                    break;
            }

        }
        float[] myArray = new float[8];
        
        myArray[0] = Gr1;
        myArray[1] = Gr2;
        myArray[2] = Gr3;
        myArray[3] = Gr4;
        myArray[4] = Gr5;
        myArray[5] = Gr6;
        myArray[6] = Gr7;
        myArray[7] = Gr8;

        return myArray;
    }

    public String resultMark(Organization o) {
        List<Mark> markList = ejbMarkFacade.findAll();
        int i = 0;
        while (i < markList.size()) {
            if (markList.get(i).getOrganization().equals(o)) {
                i++;
            } else {
                markList.remove(i);
            }
        }
        float Gr1 = 0, Gr2 = 0, Gr3 = 0, Gr4 = 0, Gr5 = 0, Gr6 = 0, Gr7 = 0, Gr8 = 0;
        for (Mark m : markList) {
            switch (m.getCriterion().getSubject()) {
                case ("Org"):
                    switch (m.getCriterion().getCrgroup()) {
                        case ("Характеристики контроля"):
                            Gr1 = Gr1 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Характеристики бизнес-процессов"):
                            Gr2 = Gr2 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Характеристики процессов прогнозирования"):
                            Gr3 = Gr3 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Общие характеристики"):
                            Gr4 = Gr4 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                    }
                    break;
                case ("IS"):
                    switch (m.getCriterion().getCrgroup()) {
                        case ("Роль ИС в компании"):
                            Gr5 = Gr5 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Затраты на ИС"):
                            Gr6 = Gr6 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Характеристики процессов прогнозирования "):
                            Gr7 = Gr7 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                        case ("Степень интеграции"):
                            Gr8 = Gr8 + (m.getMark() * m.getCriterion().getWeight());
                            break;
                    }
                    break;
            }

        }
        float resOrg = (float) sqrt(Gr1 * Gr1 + Gr2 * Gr2 + Gr3 * Gr3 + Gr4 * Gr4);
        float resIs = (float) sqrt(Gr8 * Gr8 + Gr5 * Gr5 + Gr6 * Gr6 + Gr7 * Gr7);
        //[0; 0,5]	[0,5; 0,9]	[0,9; 1,2]	[1,2; 1,4]	[1,4; 2]
        //[0; 0,4]	[0,4; 0,8]	[0,8; 1,1]	[1,1; 1,4]	[1,4; 1,6]	[1,6; 2]
        int orgLvl = 0;
        int isLvl = 0;

        if (resOrg < 0.5) {
            orgLvl = 1;
        } else {
            if (resOrg < 0.9) {
                orgLvl = 2;
            } else {
                if (resOrg < 1.2) {
                    orgLvl = 3;
                } else {
                    if (resOrg < 1.4) {
                        orgLvl = 4;
                    } else {
                        orgLvl = 5;
                    }
                }
            }
        }

        if (resIs < 0.4) {
            isLvl = 1;
        } else {
            if (resIs < 0.8) {
                isLvl = 2;
            } else {
                if (resIs < 1.1) {
                    isLvl = 3;
                } else {
                    if (resIs < 1.4) {
                        isLvl = 4;
                    } else {
                        if (resIs < 1.6) {
                            isLvl = 5;
                        } else {
                            isLvl = 6;
                        }
                    }
                }
            }
        }
        String s = "Уровень организационной зрелости равен " + orgLvl + ", уровень информационной зрелости равен " + isLvl;

        if (isLvl - orgLvl == 1) {
            s = s + ". Уровни зрелости соответствуют друг другу.";
        } else {
            if (orgLvl >= isLvl) {
                s = s + ". Уровни зрелости НЕ соответствуют друг другу. Вам необходимо обратить внимание на уровень зрелости ИС.";
            }
            if (orgLvl < isLvl) {
                s = s + ". Уровни зрелости НЕ соответствуют друг другу. Вам необходимо обратить внимание на уровень зрелости Организации";
            }
        }

        return s;
    }

    public String prepareEdit(int id) {
        current = ejbFacade.find(id);
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("OrganizationUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Organization) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("OrganizationDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    public List<Organization> getUserItems(User u) {
        List<Organization> myList = ejbFacade.findAll();
        int i = 0;
        while (i < myList.size()) {
            if ((myList.get(i).getUser().equals(u)) | (myList.get(i).getExpert().equals(u))) {
                i++;
            } else {
                myList.remove(i);

            }
        }

        return myList;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public Organization getOrganization(java.lang.Integer id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Organization.class)
    public static class OrganizationControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            OrganizationController controller = (OrganizationController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "organizationController");
            return controller.getOrganization(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Organization) {
                Organization o = (Organization) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Organization.class.getName());
            }
        }

    }

}
