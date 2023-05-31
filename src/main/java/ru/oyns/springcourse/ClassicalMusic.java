package ru.oyns.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    @Override
    public String[] getSong() {
        return new String[]{"Sonata no. 11", "Some genius music", "Ideal sound"};
    }
}
