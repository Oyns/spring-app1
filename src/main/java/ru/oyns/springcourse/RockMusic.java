package ru.oyns.springcourse;

public class RockMusic implements Music{
    @Override
    public String[] getSong() {
        return new String[]{"Bohemian Rhapsody", "Wind of changes", "Paint it Black"};
    }
}
