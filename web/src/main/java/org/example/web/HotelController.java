package org.example.web;

import org.example.domain.Hotel;
import org.example.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> displayAll () {
        return hotelService.findAll();
    }

    @GetMapping("/{id}")
    public Hotel displayOne (@PathVariable Integer id) {
        return hotelService.findById(id);
    }
}
