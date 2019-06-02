/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expert_system_jsf;

import com.mycompany.expert_system_jsf.util.PaginationHelper;
import com.mycompany.expert_system_models.Mark;
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
public class MarkControllerTest {
    
    public MarkControllerTest() {
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
     * Test of getSelected method, of class MarkController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        MarkController instance = new MarkController();
        Mark expResult = null;
        Mark result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class MarkController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        MarkController instance = new MarkController();
        PaginationHelper expResult = null;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareList method, of class MarkController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareView method, of class MarkController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.prepareView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class MarkController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class MarkController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class MarkController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        int id = 0;
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.prepareEdit(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class MarkController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class MarkController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.destroy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyAndView method, of class MarkController.
     */
    @Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class MarkController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        MarkController instance = new MarkController();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class MarkController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class MarkController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        MarkController instance = new MarkController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class MarkController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        MarkController instance = new MarkController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class MarkController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        MarkController instance = new MarkController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMark method, of class MarkController.
     */
    @Test
    public void testGetMark() {
        System.out.println("getMark");
        Integer id = null;
        MarkController instance = new MarkController();
        Mark expResult = null;
        Mark result = instance.getMark(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
