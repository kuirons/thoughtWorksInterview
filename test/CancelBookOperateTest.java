import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/** 
* CancelBookOperate Tester. 
* 
* @author <Authors name> 
* @since <pre>Sep 12, 2017</pre> 
* @version 1.0 
*/ 
public class CancelBookOperateTest { 

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
    assertEquals("WhenInputRightRequestShouldReturnTrue",true,new CancelBookOperate().checkTheRequestWhetherInvalid("U123 2017-05-11 14:00~15:00 A C"));
    assertEquals("WhenWrongRequestShouldReturnFalse",false,new CancelBookOperate().checkTheRequestWhetherInvalid("U123 2017-05-11 07:00~15:00 A C asda"));

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


/** 
* 
* Method: checkTheCancelFlag(String s) 
* 
*/ 
@Test
public void testCheckTheCancelFlag() throws Exception {
//TODO: Test goes here...
    assertEquals("WhenInputCShouldReturnTrue",true,new CancelBookOperate().checkTheCancelFlag("C"));
    assertEquals("WhenInputOthersShouldReturnFalse",false,new CancelBookOperate().checkTheCancelFlag("12asdf"));
}
/**
 *
 * Method: setDataBean(String request)
 *
 */
@Test public void testsetDataBean() throws Exception {
//TODO: Test goes here...
}

} 
