package org.example.persistence;

import org.example.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelDao extends JpaRepository<Hotel, Long> {

    Hotel findById(Integer id);
}
