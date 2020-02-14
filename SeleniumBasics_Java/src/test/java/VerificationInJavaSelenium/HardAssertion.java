package VerificationInJavaSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion {
	String className = "HardAssertion";

    @Test
    public void test_UsingHardAssertion() {
        Assert.assertTrue(true==true);
        Assert.assertEquals("HardAssertion", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
    
    @Test
    public void test_UsingHardAssertion1() {
        Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssert", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }

    SoftAssert softAssert = new SoftAssert();
    String sclassName = "SoftAssertion";

    
    @Test
    public void test_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert", "SoftAssertion");
        softAssert.assertEquals(sclassName, "SoftAssertion");
        System.out.println("Last statement gets executed!");
        softAssert.assertAll();
    }
    
    SoftAssert softAssert1 = new SoftAssert();
    String className1 = "SoftAssertion";

    @Test
    public void test1_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssert", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        softAssert.assertAll();
    }

    @Test
    public void test2_UsingSoftAssertion() {
        softAssert.assertTrue(true == true);
        softAssert.assertEquals("SoftAssertion", "SoftAssertion");
        softAssert.assertEquals(className, "SoftAssertion");
        softAssert.assertAll();
    }
    
    SoftAssert softAssert11 = new SoftAssert();
    SoftAssert softAssert2 = new SoftAssert();
    String className2 = "SoftAssertion";

    @Test
    public void test1_UsingSoftAssertion1() {
        softAssert1.assertTrue(true == true);
        softAssert1.assertEquals("SoftAssert", "SoftAssertion");
        softAssert1.assertEquals(className, "SoftAssertion");
        softAssert1.assertAll();
    }

    @Test
    public void test2_UsingSoftAssertion1() {
        softAssert2.assertTrue(true == true);
        softAssert2.assertEquals("SoftAssertion", "SoftAssertion");
        softAssert2.assertEquals(className, "SoftAssertion");
        softAssert2.assertAll();
    }
}
