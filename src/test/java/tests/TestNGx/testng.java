package tests.TestNGx;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testng {

    @Test
    public void test1(){
        String str = "TestNG is working fine";
        String str2 = "TestNG is working fine";
        Assert.assertEquals(str,str2);
    }
}
