import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* Operate Tester. 
* 
* @author <Authors name> 
* @since <pre>Sep 11, 2017</pre> 
* @version 1.0 
*/ 
public class OperateTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: checkTheRequestWhetherInvalid(String request) 
* 
*/ 
@Test
public void testCheckTheRequestWhetherInvalid() throws Exception { 
//TODO: Test goes here...
} 

/** 
* 
* Method: checkTheRequestAttributesEnough(String request) 
* 
*/ 
@Test
public void testCheckTheRequestAttributesEnough() throws Exception {
    assertEquals("whenInputSpaceShouldReturnFalse",false,new Operate().checkTheRequestAttributesEnough(""));
    assertEquals("whenInputParamLengthLessThan4ShouldReturnFalse",false,new Operate().checkTheRequestAttributesEnough("asdfasdfasdf1212412312"));
}


/**
* 
* Method: getRequestBean() 
* 
*/ 
@Test
public void testGetRequestBean() throws Exception { 
//TODO: Test goes here... 
} 


} 
