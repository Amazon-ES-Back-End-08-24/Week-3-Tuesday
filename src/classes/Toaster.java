package classes;

import interfaces.KitchenAppliance;
import interfaces.Playable;

public class Toaster implements KitchenAppliance, Playable {
    private int timer;
    private double volume;

    private int capacityForToast;
    private final int MAX_CAPACITY_FOR_TOAST = 5;
    private final int MIN_CAPACITY_FOR_TOAST = 1;

    @Override
    public void turnOn() {
        System.out.println("Turning toaster ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning toaster OF");
    }

    @Override
    public void setTimer(int minutes) {

    }

    @Override
    public void play() {
        System.out.println("Playing music on my radio toaster");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on my radio toaster");

    }

    @Override
    public void mute() {
        System.out.println("Muting music on my radio toaster");

    }

    @Override
    public void increaseVolume(double volume) {

        System.out.println("Increasing volume on classes.Toaster");
        this.volume = this.volume + volume;
    }

    public Toaster(int timer, int capacityForToast) {
        this.timer = timer;
        setCapacityForToast(capacityForToast);
        this.volume = 0;
    }

    public int getCapacityForToast() {
        // añado capa de hasheado por privacidad (EJEMPLO)
        return capacityForToast;
    }

    public void setCapacityForToast(int capacityForToast) {

        // añado capa de control a un máximo
        if (capacityForToast > 5) {
            this.capacityForToast = MAX_CAPACITY_FOR_TOAST;

        } else if (capacityForToast <= 0) {
            this.capacityForToast = MIN_CAPACITY_FOR_TOAST;

        } else {
            this.capacityForToast = capacityForToast;
        }
    }

    public int getTimer() {
        return timer;
    }
}
