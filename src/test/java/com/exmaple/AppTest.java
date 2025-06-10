package com.exmaple;

import org.junit.Test;
import org.junit.Assert;


public class AppTest 
{
    @Test
    public void testAdd(){
      App app = new App();
        int a = 3;
        int b = 5;
        int result = app.add(a,b);
        System.out.println("Testing....  "+a+" + "+b+" = "+result);
        Assert.assertEquals(8,result);
    }
}
