/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author alexa
 */
public class GetSetDemo {

    public final int MIN_FLOOR = 1;
    public final int MAX_FLOOR = 5;

    private int currentFloor;
    private boolean isDoorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        if (currentFloor >= MIN_FLOOR && currentFloor <= MAX_FLOOR) {
            this.currentFloor = currentFloor;
        }
    }

    public boolean IsDoorOpen() {
        return isDoorOpen;
    }

    public void changeDoorState() {
        isDoorOpen = !isDoorOpen;
    }

}
