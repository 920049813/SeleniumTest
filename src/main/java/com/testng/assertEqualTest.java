package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertEqualTest {

    //校验实际值与预期值是否一致
    @Test
    public void asserEqualTest(){
        String a="a";
        String b="b";
        Assert.assertEquals(a,b,"a不等于b");
        //Assert.assertEquals(a,b);

    }





    //校验实际值与预期值是否不一致
    @Test
    public void asserNotEqualTest(){
        String a="a";
        String b="a";
        Assert.assertNotEquals(a,b,"a等于b");
    }

//判断是否为空
    @Test
    public  void assertNullTest(){
        String a=null;
        Assert.assertNull(a);
    }


    //判断是否为False
    @Test
    public  void assertFalse(){
        boolean a=false;
        Assert.assertFalse(a);
    }

    //判断是否为True
    @Test
    public  void assertTrue(){
        boolean a=false;
        Assert.assertTrue(a);
    }

}
