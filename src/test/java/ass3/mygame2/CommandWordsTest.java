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
public class CommandWordsTest {
    
    public CommandWordsTest() {
    }

    /**
     * Test of isCommand method, of class CommandWords.
     */
    @Test
    public void testIsCommand() {
        System.out.println("isCommand");
        String aString = "use";
        CommandWords instance = new CommandWords();
        boolean expResult = true;
        boolean result = instance.isCommand(aString);
        assertEquals(expResult, result);
    }

    /**
     * Test of showAll method, of class CommandWords.
     */
    @Test
    public void testShowAll() {
        System.out.println("showAll");
        CommandWords instance = new CommandWords();
        instance.showAll();
    }
    
}
