package com.mattsmakhura.lil.learningspring.data.repository;

import com.mattsmakhura.lil.learningspring.data.entity.Guest;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
@EnableJpaRepositories
public interface GuestRepository extends JpaRepository<Guest,Long> {

}
