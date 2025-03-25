package com.cgi.flight_planner_server.domain.flight.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightResponse {
    private long id;
    private String destination;
    private LocalDateTime flightDate;
    private LocalDateTime duration;
    private double price;
}
