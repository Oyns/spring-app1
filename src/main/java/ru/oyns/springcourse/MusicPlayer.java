package ru.oyns.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private final Music music1;
    private final Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        if (genre.equals(MusicGenre.CLASSICAL)) {
            System.out.println(music1.getSong()[random.nextInt(3)]);
        } else {
            System.out.println(music2.getSong()[random.nextInt(3)]);
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
