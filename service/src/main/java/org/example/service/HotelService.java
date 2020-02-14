package org.example.service;

import org.example.domain.Hotel;
import org.example.persistence.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelDao hotelDao;

    public Hotel findById(Integer id) {
        return hotelDao.findById(id);
    }

    public List<Hotel> findAll() {
        return hotelDao.findAll();
    }
}
