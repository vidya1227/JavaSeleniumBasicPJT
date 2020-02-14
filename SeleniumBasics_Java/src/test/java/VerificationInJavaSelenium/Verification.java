package VerificationInJavaSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification {

	
	@Test
	public void verifyTest(){  

	    /* buffer to hold your errors */
	    StringBuffer errorBuffer = new StringBuffer();      

	    /* verification 1 */
	    try{        
	        Assert.assertEquals("value1", "value!");            
	    }catch(AssertionError e){           
	        errorBuffer.append(e.getMessage() + "\n");      
	    }       

	    /* verification 2 */
	    try{            
	        Assert.assertEquals("value2", "value!");            
	    }catch(AssertionError e){           
	        errorBuffer.append(e.getMessage());     
	    }

	    if(errorBuffer.length() > 0){
	        throw new AssertionError(errorBuffer.toString()); 
	    }

	}
}
