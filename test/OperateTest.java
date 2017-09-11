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
    assertEquals("whenInputParamLengthMoreThan5ShouldReturnFalse",false,new Operate().checkTheRequestAttributesEnough("as d fa sd fas df1 2124 12312"));
    assertEquals("whenInputParamRightShouldReturnTrue",true,new Operate().checkTheRequestAttributesEnough("11 12 as 12"));
    assertEquals("whenInputParamRightShouldReturnTrue",true,new Operate().checkTheRequestAttributesEnough("11 12 as 12 tt"));
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
 * Method: checkTheSiteWhetherInvalid(String request)
 *
 */
@Test public void testCheckTheSiteWhetherInvalid() throws Exception {
//TODO: Test goes here...
    assertEquals("WhenInputNullShouldReturnFalse",false,new Operate().checkTheSiteWhetherInvalid(""));
    assertEquals("WhenInputWrongStringShouldReturnFalse",false,new Operate().checkTheSiteWhetherInvalid("saf"));
    assertEquals("WhenInputWrongSiteShouldReturnFalse",false,new Operate().checkTheSiteWhetherInvalid("E"));
    assertEquals("WhenInputRightSiteShouldReturnTrue",true,new Operate().checkTheSiteWhetherInvalid("D"));
}

/**
 *
 * Method: getWeekByDate(String data)
 *
 */
@Test public void testGetWeekByDate() throws Exception {
//TODO: Test goes here...
    assertEquals("WhenInput20170911ShouldReturnWeekflag","weekflag",new Operate().getWeekByDate("2017-09-11"));
    assertEquals("WhenInput20170910ShouldReturnWeekflag","weekend",new Operate().getWeekByDate("2017-09-10"));
}
/**
 *
 * Method: calculateTheIncome(DateBean dateBean)
 *
 */
@Test public void testCalculateTheIncome() throws Exception {
//TODO: Test goes here...
    DataBean dataBean=new DataBean();
    dataBean.setDate("2017-09-10");
    dataBean.setTime("10:00~21:00");
    //assertEquals("WhenInput2017091110:00-21:00ShouldReturn580.0",580.0,new Operate().calculateTheIncome(dataBean),0.0);
    assertEquals("WhenInput2017091010:00-21:00ShouldReturn560.0",560.0,new Operate().calculateTheIncome(dataBean),0.0);
    }
} 
