package com.mattsmakhura.lil.learningspring.data.repository;


import com.mattsmakhura.lil.learningspring.data.entity.Room;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration
@EnableJpaRepositories
public interface RoomRepository extends JpaRepository<Room,Long> {

}
