package ru.kai.patterns.fabric.fabric;

public class SmallVolumeFactory extends VolumeFactory{
    @Override
    public float createVolume() {
        return 0.4f;
    }
}
