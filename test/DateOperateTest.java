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
 * Method: checkTheTimeWhetherPunctuality(String time)
 *
 */
@Test public void testCheckTheTimeWhetherPunctuality() throws Exception {
//TODO: Test goes here...
    assertEquals("WhenInputNullShouldReturnFalse",false,new DateOperate().checkTheTimeWhetherPunctuality(""));
    assertEquals("WhenInputWrongFormatShouldReturnFalse",false,new DateOperate().checkTheTimeWhetherPunctuality("1011"));
    assertEquals("WhenInputWrongYearShouldReturnFalse",false,new DateOperate().checkTheTimeWhetherPunctuality("10:01"));
    assertEquals("WhenInputRightYearShouldReturnFalse",true,new DateOperate().checkTheTimeWhetherPunctuality("10:00"));
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
    assertEquals("WhenInputWrongFormatShouldReturnFalse",false,new DateOperate().checkTheTimeWhetherInvalid(""));
    assertEquals("WhenInputNullShouldReturnFalse",false,new DateOperate().checkTheTimeWhetherInvalid("1000"));
    assertEquals("WhenInputWrongTimeShouldReturnFalse",false,new DateOperate().checkTheTimeWhetherInvalid("10:30"));
    assertEquals("WhenInputRightTimeShouldReturnFalse",true,new DateOperate().checkTheTimeWhetherInvalid("10:00"));

} 

/** 
* 
* Method: checkTheSiteWhetherInvalid(String request) 
* 
*/ 
@Test
public void testCheckTheSiteWhetherInvalid() throws Exception { 
//TODO: Test goes here...
    assertEquals("WhenInputNullShouldReturnFalse",false,new DateOperate().checkTheSiteWhetherInvalid(""));
} 


} 
