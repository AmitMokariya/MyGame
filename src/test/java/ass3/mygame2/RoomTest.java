/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class RoomTest {
    
    Room room;
    public RoomTest() {
        room = new Room("castle", "You are at the castle", false);
        
    }

    /**
     * Test of setExit method, of class Room.
     */
    @Test
    public void testSetExit() {
        System.out.println("setExit");
        String direction = "east";
        
        Room neighbor = new Room("kitchen", "You are at the kitchen", true);
        Room instance = room;
        instance.setExit(direction, neighbor);
    }

    /**
     * Test of getShortDescription method, of class Room.
     */
    @Test
    public void testGetShortDescription() {
        System.out.println("getShortDescription");
        Room instance = room;
        String expResult = "You are at the castle";
        String result = instance.getShortDescription();
        assertEquals(expResult, result);
    }
   
    /**
     * Test of getLockedStatus method, of class Room.
     */
    @Test
    public void testGetLockedStatus() {
        System.out.println("getLockedStatus");
        Room instance = room;
        boolean expResult = false;
        boolean result = instance.getLockedStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Room.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Room instance = room;
        String expResult = "castle";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
}
