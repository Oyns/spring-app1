package ru.oyns.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        ClassicalMusic classicalMusic = new ClassicalMusic();
//        RockMusic rockMusic = new RockMusic();
//
//        MusicPlayer musicPlayer = new MusicPlayer(classicalMusic, rockMusic);
//        System.out.println("Choose your favorite genre: 1 - classical, 2 - rock.");
//        Scanner scanner = new Scanner(System.in);
//        int choose = scanner.nextInt();
//        switch (choose) {
//            case 1 -> musicPlayer.playMusic(MusicGenre.CLASSICAL);
//            case 2 -> musicPlayer.playMusic(MusicGenre.ROCK);
//        }

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1 == classicalMusic2);
        context.close();
    }
}
