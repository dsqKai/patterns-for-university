package ru.kai.patterns.strategy;

public class DuckBuilder {
    TypeStrategy typeStrategy;
    FlyStrategy flyStrategy;
    SpeakStrategy speakStrategy;
    public DuckBuilder fly(String string) {
        flyStrategy = () -> System.out.println(string);
        return this;
    }

    public DuckBuilder speak(String string) {
        speakStrategy = () -> System.out.println(string);
        return this;
    }

    public DuckBuilder type(String string) {
        typeStrategy = () -> System.out.println(string);
        return this;
    }

    public Duck build() {
        if(flyStrategy == null || speakStrategy == null || typeStrategy == null)
            throw new ExceptionInInitializerError();
        return new Duck(typeStrategy, flyStrategy, speakStrategy);
    }
}
