package org.example.service;

import org.example.domain.Hotel;
import org.example.domain.User;
import org.example.persistence.HotelDao;
import org.example.persistence.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {

    @Autowired
    private HotelDao hotelDao;

    @Autowired
    private UserDao userDao;

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel("Marriot",4,true);
        Hotel ibis = new Hotel("Ibis", 4, false);
        Hotel hilton = new Hotel("Hilton",5,true);

        hotelDao.save(marriot);
        hotelDao.save(ibis);
        hotelDao.save(hilton);

        User maria = new User("Maria",23);
        User sasha = new User("User",25);

        userDao.save(maria);
        userDao.save(sasha);

    }
}
