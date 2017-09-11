import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/** 
* BookOperate Tester. 
* 
* @author <Authors name> 
* @since <pre>Sep 12, 2017</pre> 
* @version 1.0 
*/ 
public class BookOperateTest { 

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
    assertEquals("WhenInputRightRequestShouldReturnTrue",true,new BookOperate().checkTheRequestWhetherInvalid("U123 2017-05-11 14:00~15:00 A"));
    assertEquals("WhenWrongRequestShouldReturnFalse",false,new BookOperate().checkTheRequestWhetherInvalid("U123 2017-05-11 07:00~15:00 A"));
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
