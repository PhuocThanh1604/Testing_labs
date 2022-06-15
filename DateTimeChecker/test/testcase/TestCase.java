/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcase;

import org.junit.Test;
import static org.junit.Assert.*;
import datetimechecker.DateTimeChecker;

/**
 *
 * @author Mr.Thanh
 */
public class TestCase {
    
   DateTimeChecker date;

    public TestCase() {
        date = new DateTimeChecker();
    }
    // Test Hàm ChecDate
    @Test
    public void CheckDateUTCID01() {
        boolean result = date.checkDate(29, 2, 2020);
        boolean expected = true;
        assertEquals(expected, result);
    }
      @Test
    public void CheckDateUTCID02() {
        boolean result = date.checkDate(29, 2, 2009);
        boolean expected = true;
        assertEquals(expected, result);
    }
      @Test
    public void CheckDateUTCID03() {
        boolean result = date.checkDate(31, 3, 2009);
        boolean expected = true;
        assertEquals(expected, result);
    }
      @Test
    public void CheckDateUTCID04() {
        boolean result = date.checkDate(-8, 12, 2000);
        boolean expected = true;
        assertEquals(expected, result);
    }
    
    //Test Hàm DayInMonth
    
    @Test
    public void DayInMonthUTCID01() {
        int rs=date.dayInMonth(12,2020);
        int  expected = 31;
        assertEquals(expected, rs);
    } 
     @Test
    public void DayInMonthUTCID02() {
        int rs=date.dayInMonth(11,2020);
        int  expected = 30;
        assertEquals(expected, rs);
    } 
     @Test
    public void DayInMonthUTCID03() {
        int rs=date.dayInMonth(10,2010);
        int  expected = 31;
        assertEquals(expected, rs);
    } 
     @Test
    public void DayInMonthUTCID04() {
        int rs=date.dayInMonth(9,2021);
        int  expected = 30;
        assertEquals(expected, rs);
    } 
     @Test
    public void DayInMonthUTCID05() {
        boolean rs=date.checkDate(33,1,2000);
        boolean expected=true;
        assertEquals(expected, rs);
    }
    
    
//     @Test
//    public void testVaildMonth() {
//        int result = date.dayInMonth(9, 2021);
//        int expected = 30;
//        assertEquals(expected, result);
//    }
//        @Test
//    public void testDayMonthYear1() {
//        boolean rs=date.DayMonthYearEmpty("abc.2@/02/2000");
//        boolean expected=false;
//        assertEquals(expected, rs);
//    }   
//       @Test
//    public void testDayMonthYear2() {
//        boolean rs=date.CheckDateEmpty("/4/2024");
//        boolean expected=false;
//        assertEquals(expected, rs);
//    } 
//    @Test
//    public void testDayMonthYear2() {
//        int rs=date.dayInMonthEmpty("");
//        int  expected = 30;
//        assertEquals(expected, rs);
//    } 
}
