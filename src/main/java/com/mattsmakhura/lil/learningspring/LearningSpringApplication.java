package com.mattsmakhura.lil.learningspring;

import com.mattsmakhura.lil.learningspring.data.entity.Guest;
import com.mattsmakhura.lil.learningspring.data.entity.Reservation;
import com.mattsmakhura.lil.learningspring.data.entity.Room;
import com.mattsmakhura.lil.learningspring.data.repository.GuestRepository;
import com.mattsmakhura.lil.learningspring.data.repository.ReservationRepository;
import com.mattsmakhura.lil.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@ComponentScan(basePackages = {"com.mattsmakhura.lil.learningspring.data"})
@EnableAutoConfiguration
@EntityScan("com.mattsmakhura.lil.learningspring.data.entity")
@EnableJpaRepositories("com.mattsmakhura.lil.learningspring.data.repository")
@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}


}
