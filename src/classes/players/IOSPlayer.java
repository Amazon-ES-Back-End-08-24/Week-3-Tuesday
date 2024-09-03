package classes.players;

import interfaces.Playable;

public class IOSPlayer implements Playable {
    private double volume;

    @Override
    public void play() {
        System.out.println("Playing on iOS");
    }

    @Override
    public void pause() {
        System.out.println("Pausing on iOS");
    }

    @Override
    public void mute() {
        System.out.println("Muting on iOS");
    }

    @Override
    public void increaseVolume(double volume) {
        System.out.println("Increasing volume on iOS");
        this.volume = this.volume + volume;
    }
}
