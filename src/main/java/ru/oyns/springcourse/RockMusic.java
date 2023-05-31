package ru.oyns.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String[] getSong() {
        return new String[]{"Bohemian Rhapsody", "Wind of changes", "Paint it Black"};
    }
}
