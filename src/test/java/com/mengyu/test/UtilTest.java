package com.mengyu.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.format.annotation.DateTimeFormat;

import com.mengyu.common.utils.DateUtil;


/** 
 * @ClassName: UtilTest 
 * @Description: 测试类
 * @author: mengyu
 * @date: 2019年8月22日 上午8:33:22  
 */
public class UtilTest {
	
    @Test
    public void test1() {
    	/** 
    	 * @ClassName: UtilTest 
    	 * @Description: 获取当前日期的getDateByInitMonth
    	 * @author: mengyu
    	 * @date: 2019年8月22日 上午8:33:22  
    	 */
    	Date date1=new Date();
    	Date date11 = DateUtil.getDateByInitMonth(date1);
    	System.out.println(date11);
    	/** 
    	 * @ClassName: UtilTest 
    	 * @Description: 获取当前日期的getDateByFullMonth
    	 * @author: mengyu
    	 * @date: 2019年8月22日 上午8:33:22  
    	 */
    	Date date2=new Date();
        Date date22 = DateUtil.getDateByFullMonth(date2);
        System.out.println(date22);
        /** 
         * @ClassName: UtilTest 
         * @Description: 拼接sql
         * @author: mengyu
         * @date: 2019年8月22日 上午8:33:22  
         */
        String sql = "select * from t_order where create_time>="+date1+" and create_time<="+date2;
        System.out.println(sql);
    }
    
    @Test 
    public void test2() {
    	Date date2=new Date();
        Date date22 = DateUtil.getDateByFullMonth(date2);
        System.out.println(date22);
    }
}
