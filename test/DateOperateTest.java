import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static junit.framework.TestCase.assertEquals;

/** 
* DateOperate Tester. 
* 
* @author <Authors name> 
* @since <pre>Sep 11, 2017</pre> 
* @version 1.0 
*/ 
public class DateOperateTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: checkTheDateWhetherInvalid(String date) 
* 
*/ 
@Test
public void testCheckTheDateWhetherInvalid() throws Exception { 
//TODO: Test goes here...
    assertEquals("WhenInputNullShouldReturnFalse",false,new DateOperate().checkTheDateWhetherInvalid(""));
    assertEquals("WhenInputWrongFormatShouldReturnFalse",false,new DateOperate().checkTheDateWhetherInvalid("2017~1_5"));
    assertEquals("WhenInputWrongYearShouldReturnFalse",false,new DateOperate().checkTheDateWhetherInvalid("2017-02-31"));
    assertEquals("WhenInputRightYearShouldReturnFalse",true,new DateOperate().checkTheDateWhetherInvalid("2017-02-15"));
}
/**
 *
 * Method: checkTheTimeBetweenInterval(String beginTime,String endTime,String testTime)
 *
 */
@Test
public void testcheckTheTimeBetweenInterval() throws Exception {
//TODO: Test goes here...
    assertEquals("WhenInputNullShouldReturnFalse",false,new DateOperate().checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 22:00",""));
    assertEquals("WhenInputWrongFormatShouldReturnFalse",false,new DateOperate().checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 22:00","2017-09-11 9:00"));
    assertEquals("WhenInputWrongTimeShouldReturnFalse",false,new DateOperate().checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 22:00","2017-09-11 02:00"));
    assertEquals("WhenInputRightTimeShouldReturnFalse",true,new DateOperate().checkTheTimeBetweenInterval("2017-09-11 09:00","2017-09-11 22:00","2017-09-11 10:00"));
}

/** 
* 
* Method: checkTheTimeWhetherInvalid(String request) 
* 
*/ 
@Test
public void testCheckTheTimeWhetherInvalid() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: checkTheSiteWhetherInvalid(String request) 
* 
*/ 
@Test
public void testCheckTheSiteWhetherInvalid() throws Exception { 
//TODO: Test goes here... 
} 


} 
