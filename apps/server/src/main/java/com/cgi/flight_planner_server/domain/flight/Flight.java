package com.cgi.flight_planner_server.domain.flight;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String destination;
    private LocalDateTime flightDate;
    private LocalDateTime duration;
    private double price;
    //TODO: mõtle, kuidas erinevad lennukid(istmeplaanid) siduda lendudega
    //private PlaneType planeType;
}
