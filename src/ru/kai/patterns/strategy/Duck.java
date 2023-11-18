package ru.kai.patterns.strategy;
public class Duck {
    TypeStrategy typeStrategy;
    FlyStrategy flyStrategy;
    SpeakStrategy speakStrategy;

    public Duck(TypeStrategy type, FlyStrategy fly,SpeakStrategy speak) {
        this.typeStrategy = type;
        this.flyStrategy = fly;
        this.speakStrategy = speak;
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setTypeStrategy(TypeStrategy typeStrategy) {
        this.typeStrategy = typeStrategy;
    }

    public void setSpeakStrategy(SpeakStrategy speakStrategy) {
        this.speakStrategy = speakStrategy;
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void speak() {
        speakStrategy.speak();
    }

    public void type() {
        typeStrategy.type();
    }

    public void info() {
        flyStrategy.fly();
        speakStrategy.speak();
        typeStrategy.type();
    }
}
