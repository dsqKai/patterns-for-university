package ru.kai.patterns.fabric.fabric;

public class LargeVolumeFactory extends VolumeFactory{
    @Override
    public float createVolume() {
        return 0.8f;
    }
}
