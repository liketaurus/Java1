/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author alexa
 */
public class ConstructorDemo {

    private LocalDate currentDate;

    public ConstructorDemo(int day, int month, int year) {
        currentDate = LocalDate.of(year, month, day);
    }

    public ConstructorDemo(int day, int month) {
        this(day, month, LocalDate.now().getYear());
    }

    public ConstructorDemo(int day) {
        this(day, LocalDate.now().getMonthValue(), LocalDate.now().getYear());
    }

    public ConstructorDemo() {
        //currentDate = LocalDate.now();
        currentDate = LocalDate.of(2002, 1, 1);
    }

    public void setDate(int day, int month, int year) {
        currentDate = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "\n" + currentDate.toString()
                + ", it`s a " + currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
