package ru.oyns.springcourse;

public class ClassicalMusic implements Music {
    @Override
    public String[] getSong() {
        return new String[]{"Sonata no. 11", "Some genius music", "Ideal sound"};
    }
}
