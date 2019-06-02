/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.expert_system_jsf;

import com.mycompany.expert_system_jsf.util.PaginationHelper;
import com.mycompany.expert_system_models.Role;
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
public class RoleControllerTest {
    
    public RoleControllerTest() {
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
     * Test of getSelected method, of class RoleController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        RoleController instance = new RoleController();
        Role expResult = null;
        Role result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPagination method, of class RoleController.
     */
    @Test
    public void testGetPagination() {
        System.out.println("getPagination");
        RoleController instance = new RoleController();
        PaginationHelper expResult = null;
        PaginationHelper result = instance.getPagination();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareList method, of class RoleController.
     */
    @Test
    public void testPrepareList() {
        System.out.println("prepareList");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.prepareList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareView method, of class RoleController.
     */
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.prepareView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareCreate method, of class RoleController.
     */
    @Test
    public void testPrepareCreate() {
        System.out.println("prepareCreate");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.prepareCreate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class RoleController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepareEdit method, of class RoleController.
     */
    @Test
    public void testPrepareEdit() {
        System.out.println("prepareEdit");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.prepareEdit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class RoleController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.update();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroy method, of class RoleController.
     */
    @Test
    public void testDestroy() {
        System.out.println("destroy");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.destroy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of destroyAndView method, of class RoleController.
     */
    @Test
    public void testDestroyAndView() {
        System.out.println("destroyAndView");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.destroyAndView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class RoleController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        RoleController instance = new RoleController();
        DataModel expResult = null;
        DataModel result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class RoleController.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class RoleController.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        RoleController instance = new RoleController();
        String expResult = "";
        String result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectMany method, of class RoleController.
     */
    @Test
    public void testGetItemsAvailableSelectMany() {
        System.out.println("getItemsAvailableSelectMany");
        RoleController instance = new RoleController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectMany();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemsAvailableSelectOne method, of class RoleController.
     */
    @Test
    public void testGetItemsAvailableSelectOne() {
        System.out.println("getItemsAvailableSelectOne");
        RoleController instance = new RoleController();
        SelectItem[] expResult = null;
        SelectItem[] result = instance.getItemsAvailableSelectOne();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRole method, of class RoleController.
     */
    @Test
    public void testGetRole() {
        System.out.println("getRole");
        Integer id = null;
        RoleController instance = new RoleController();
        Role expResult = null;
        Role result = instance.getRole(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
