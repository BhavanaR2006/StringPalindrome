package com.example;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AppTest {

@Test
public void testPalindrome() {
    App obj = new App();
    assertTrue(obj.isPalindrome("madam"));
}

@Test
public void testNotPalindrome() {
    App obj = new App();
    assertFalse(obj.isPalindrome("hello"));
}

@Test
public void testUppercasePalindrome() {
    App obj = new App();
    assertTrue(obj.isPalindrome("MADAM"));
}

}