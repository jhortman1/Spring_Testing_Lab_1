package com.flatiron.spring.FlatironSpring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    HelloController helloController = new HelloController();

    @Test
    void hello() {
        String name = "James";
        assertEquals("Hello "+ name, helloController.hello(name));
    }

    @Test
    void mixedCase() {
        String word = "HeLlo";
        String reverseWord = "olLeH";
        assertEquals(reverseWord,helloController.reverse(word));
    }
    @Test
    void allLowerCase() {
        String word = "lowercase";
        String reverseWord = "esacrewol";
        assertEquals(reverseWord,helloController.reverse(word));
    }
    @Test
    void allUpperCase() {
        String word = "UPPERCASE";
        String reverseWord = "ESACREPPU";
        assertEquals(reverseWord,helloController.reverse(word));
    }
    @Test
    void withSpacesNumbersAndSpecialChars() {
        String word = "Hello World!! I'm # 1!!";
        String reverseWord = "!!1 # m'I !!dlroW olleH";
        assertEquals(reverseWord,helloController.reverse(word));
    }
}