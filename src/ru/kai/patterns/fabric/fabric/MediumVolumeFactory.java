package ru.kai.patterns.fabric.fabric;

public class MediumVolumeFactory extends VolumeFactory{
    @Override
    public float createVolume() {
        return 0.6f;
    }
}
