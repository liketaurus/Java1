/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

/**
 *
 * @author alexa
 */
public class Clock {

    private int currentTime;

    public void setCurrentTime(int currentTime) {
        if (currentTime >= 0 && currentTime <= 2359) {
            this.currentTime = currentTime;
        } else {
            this.currentTime = 0;
        }
    }

    public Clock(int currentTime) {
        setCurrentTime(currentTime);
    }

    @Override
    public String toString() {
        String message;

        if (currentTime >= 801 && currentTime <= 1200) {
            message = "утро";
        } else if (currentTime >= 1201 && currentTime <= 1700) {
            message = "день";
        } else if (currentTime >= 1701 && currentTime < 2400) {
            message = "вечер";
        } else if (currentTime >= 1 && currentTime <= 800) {
            message = "ранне утро";
        } else if (currentTime == 0) {
            message = "полночь";
        } else {
            message = "неизвестно что... Ошибка?";
        }

        return "Вы ввели " + currentTime + ". Это " + message + "!";
    }

}
