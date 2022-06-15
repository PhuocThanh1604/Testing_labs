/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimechecker;

import java.util.StringTokenizer;

/**
 *
 * @author Mr.Thanh
 */
public class DateTimeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static boolean isLeap(int year) {
        boolean result = false;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            result = true;
        }
        return result;

    }

    public static boolean checkDate(int day, int month, int year) {
        if (year < 1000 || year > 3000 || month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        } else {
            int maxDay = 31;
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDay = 30;
            } else if (month == 2) {
                if (isLeap(year)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            }
            return day <= maxDay;
        }
    }

    public static int dayInMonth(int month, int year) {
        if (year < 1000 || year > 3000 || month < 1 || month > 12) {
            return 0;
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else if (month == 2) {
                if (isLeap(year)) {
                    return 29;
                } else {
                    return 28;
                }
            }
        }
        return 0;
    }

    // check  hàm ChecDate daymonthyear null
    public static boolean CheckDateEmpty(String daymonthyear) {
        if (daymonthyear.trim().isEmpty()) {
            return false;
        } else {
            try {
                StringTokenizer stk = new StringTokenizer(daymonthyear, "/-");
                int day = Integer.parseInt(stk.nextToken());
                int month = Integer.parseInt(stk.nextToken());
                int year = Integer.parseInt(stk.nextToken());
                if (!checkDate(day, month, year)) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
        }
    }

    //Hàm check  dayinmonth null
    public static int dayInMonthEmpty(String monthyear) {
        if (monthyear.trim().isEmpty()) {
            return 0;
        } else {
            try {
                StringTokenizer stk = new StringTokenizer(monthyear, "/-");

                int month = Integer.parseInt(stk.nextToken());
                int year = Integer.parseInt(stk.nextToken());
                int day = dayInMonth(month, year);
                return day;
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
