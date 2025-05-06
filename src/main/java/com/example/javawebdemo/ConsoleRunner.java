package com.example.javawebdemo;

import com.example.javawebdemo.models.HockeyPlayer;
import com.example.javawebdemo.models.HockeyPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

    @Autowired
    HockeyPlayerRepo hockeyPlayerRepo;

    @Override
    public void run(String... args) throws Exception {
        if(hockeyPlayerRepo.count() == 0) {
            HockeyPlayer hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(21);
            hockeyPlayer.setName("Player1");
            hockeyPlayerRepo.save(hockeyPlayer);

            hockeyPlayer = new HockeyPlayer();
            hockeyPlayer.setAge(28);
            hockeyPlayer.setName("Player2");
            hockeyPlayerRepo.save(hockeyPlayer);
        }
        // kolla om count(*) = 0
        // insert into hockeyplayer
    }
}
