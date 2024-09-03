package classes.players;

import interfaces.Playable;

public class AndroidPlayer implements Playable {
    private double volume;

    @Override
    public void play() {
        System.out.println("Playing on Android");
    }

    @Override
    public void pause() {
        System.out.println("Pausing on Android");
    }

    @Override
    public void mute() {
        System.out.println("Muting on Android");
    }

    @Override
    public void increaseVolume(double volume) {
        System.out.println("Increasing volume on Android");
        this.volume = this.volume + volume;
    }
}
