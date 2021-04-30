package com.mattsmakhura.lil.learningspring.web;


import com.mattsmakhura.lil.learningspring.business.domain.RoomReservation;
import com.mattsmakhura.lil.learningspring.business.service.ReservationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//Add Runner or ExtendWith. We want to run with SpringJUnit4ClassRunner
@RunWith(SpringJUnit4ClassRunner.class)
//Add the actual controller you want to test
@WebMvcTest(RoomReservationWebController.class)
public class RoomReservationWebControllerTest1 {
    @MockBean
    private ReservationService reservationService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getReservation() throws Exception{

        //add variables for date and convert into date object
        String dateString = "2020-01-01";
        Date date =DateUtils.createDateFromDateString(dateString);

        //Add a list of all RoomReservations
        List<RoomReservation> roomReservations = new ArrayList<>();

        //Add our abstract domain layer with non-abstract methods
        RoomReservation roomReservation = new RoomReservation();

        //Set all the roomRerservation fields with random vars
        roomReservation.setLastName("Unit");
        roomReservation.setFirstName("JUnit");
        roomReservation.setDate(date);
        roomReservation.setGuestId(1);
        roomReservation.setRoomId(100);
        roomReservation.setRoomName("Junit Room");
        roomReservation.setRoomNumber("J1");

        // Now add it to the roomReservations list
        roomReservations.add(roomReservation);

        //Now we use a cool BDDMockito.given component to return our room reservation for our specified date above
        given(reservationService.getRoomReservationsForDate(date)).willReturn(roomReservations);

        //We are going to perform a Mock MVC perform and we do that operation we expecting 200 (OK) and also a formatted full name content
        this.mockMvc.perform(get("/reservations?date=2020-01-01"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Unit, Junit")));

    }
}
