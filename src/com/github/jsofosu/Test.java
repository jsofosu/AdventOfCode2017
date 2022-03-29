package com.github.jsofosu;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    void captcha() {
        CircularList circularList = new CircularList();
        List<Integer> digits = List.of(9,1,2,1,2,1,2,9);
        for(Integer digit : digits){
            circularList.addNode(digit);
        }
        Captcha captcha = new Captcha();
        int result = captcha.captcha(circularList);
        assertEquals(result, 9);
    }
}