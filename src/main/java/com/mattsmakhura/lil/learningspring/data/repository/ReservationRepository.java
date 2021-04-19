package com.mattsmakhura.lil.learningspring.data.repository;

import com.mattsmakhura.lil.learningspring.data.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@EnableJpaRepositories
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
