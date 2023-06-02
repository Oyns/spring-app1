package ru.oyns.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private final List<Music> music;

    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public List<Music> getMusic() {
        return music;
    }

    public String playMusic() {
        Random random = new Random();
        return "Playing: " + getMusic().get(random.nextInt(music.size())).getSong() + " with volume " + this.volume
                + " for master " + this.name;
    }
}
