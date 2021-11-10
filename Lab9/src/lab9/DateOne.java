/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author alexa
 */
public class DateOne {

    private int day;
    private int month;
    private int year;
    
    private LocalDate date;
    
    private String getWeekDay(){
        date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ROOT);
    }

    @Override
    public String toString() {
        return "\nToday's date is " + day + "." + month + "." + year+"\nIt's a "+getWeekDay();
    }

    public void setDay(int day) {
        if (day >= 1 && day <= calcDaysInMonth()) {
            this.day = day;
        } else {
            this.day = calcDaysInMonth();
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }

    }

    public void setYear(int year) {
        if (year >= 1970) {
            this.year = year;
        } else {
            this.year = 1970;
        }

    }

    public DateOne(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public DateOne() {
        date = LocalDate.now();
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        year = date.getYear();
    }
    

    private int calcDaysInMonth() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        if (year % 4 == 0 && month == 2) {
            return 29;
        } else {
            return 28;
        }
    }

}
