/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expert_system_jsf;

import com.mycompany.expert_system_jsf.util.PaginationHelper;
import com.mycompany.expert_system_models.Mark;
import com.mycompany.expert_system_models.Organization;
import com.mycompany.expert_system_models.User;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hzhzx
 */
public class OrganizationControllerTest {
    
    public OrganizationControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSelected method, of class OrganizationController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        OrganizationController instance = new OrganizationController();
        Organization expResult = null;
        Organization result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class OrganizationController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        OrganizationController instance = new OrganizationController();
        PaginationHelper expResult = null;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareList method, of class OrganizationController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareView method, of class OrganizationController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        int id = 0;
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.prepareView(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class OrganizationController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class OrganizationController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        User u = null;
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.create(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of marks method, of class OrganizationController.
     */


    /**
     * Test of markList method, of class OrganizationController.
     */
    @Test
    public void testMarkList() {
        System.out.println("markList");
        Organization o = null;
        int code = 0;
        OrganizationController instance = new OrganizationController();
        List<Mark> expResult = null;
        List<Mark> result = instance.markList(o, code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sales method, of class OrganizationController.
     */
    @Test
    public void testSales() {
        System.out.println("sales");
        int i = 0;
        OrganizationController instance = new OrganizationController();
        float expResult = 0.0F;
        float result = instance.sales(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of money method, of class OrganizationController.
     */
    @Test
    public void testMoney() {
        System.out.println("money");
        int i = 0;
        OrganizationController instance = new OrganizationController();
        float expResult = 0.0F;
        float result = instance.money(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Grs method, of class OrganizationController.
     */

    /**
     * Test of resultMark method, of class OrganizationController.
     */
    @Test
    public void testResultMark() {
        System.out.println("resultMark");
        Organization o = null;
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.resultMark(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class OrganizationController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        int id = 0;
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.prepareEdit(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class OrganizationController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class OrganizationController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.destroy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyAndView method, of class OrganizationController.
     */
    @Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class OrganizationController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        OrganizationController instance = new OrganizationController();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserItems method, of class OrganizationController.
     */
    @Test
    public void testGetUserItems() {
        System.out.println("getUserItems");
        User u = null;
        OrganizationController instance = new OrganizationController();
        List<Organization> expResult = null;
        List<Organization> result = instance.getUserItems(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class OrganizationController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class OrganizationController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        OrganizationController instance = new OrganizationController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class OrganizationController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        OrganizationController instance = new OrganizationController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class OrganizationController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        OrganizationController instance = new OrganizationController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrganization method, of class OrganizationController.
     */
    @Test
    public void testGetOrganization() {
        System.out.println("getOrganization");
        Integer id = null;
        OrganizationController instance = new OrganizationController();
        Organization expResult = null;
        Organization result = instance.getOrganization(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
