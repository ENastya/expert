/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expert_system_jsf;

import com.mycompany.expert_system_jsf.util.PaginationHelper;
import com.mycompany.expert_system_models.Criterion;
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
public class CriterionControllerTest {
    
    public CriterionControllerTest() {
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
     * Test of getSelected method, of class CriterionController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        CriterionController instance = new CriterionController();
        Criterion expResult = null;
        Criterion result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class CriterionController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        CriterionController instance = new CriterionController();
        PaginationHelper expResult = null;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareList method, of class CriterionController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareView method, of class CriterionController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.prepareView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class CriterionController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class CriterionController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class CriterionController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.prepareEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class CriterionController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class CriterionController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.destroy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyAndView method, of class CriterionController.
     */
    @Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class CriterionController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        CriterionController instance = new CriterionController();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class CriterionController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class CriterionController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        CriterionController instance = new CriterionController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class CriterionController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        CriterionController instance = new CriterionController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class CriterionController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        CriterionController instance = new CriterionController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCriterion method, of class CriterionController.
     */
    @Test
    public void testGetCriterion() {
        System.out.println("getCriterion");
        Integer id = null;
        CriterionController instance = new CriterionController();
        Criterion expResult = null;
        Criterion result = instance.getCriterion(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
