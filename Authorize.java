/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 *
 * @author thipe
 */
public class Authorize {
    
    public void testCheckUserName() {
        Authorization r = new Authorization("kyl_1", "Ch&&sec@ke99!");
        assertTrue(r.checkUserName());
    }

    public void testCheckUserNameIncorrectlyFormatted() {
        Authorization r = new Authorization("kyle!!!!!!!", "Ch&&sec@ke99!");
        assertFalse(r.checkUserName());
    }

    public void testCheckPasswordComplexity() {
        Authorization r = new Authorization("kyl_1", "Ch&&sec@ke99!");
        assertTrue(r.checkPasswordComplexity());
    }

    public void testCheckPasswordComplexityIncorrectlyFormatted() {
         Authorization r = new;
}
}