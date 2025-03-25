package com.cgi.flight_planner_server.domain.flight;

import com.cgi.flight_planner_server.domain.flight.dto.FlightResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FlightMapper {
    public static FlightResponse from(Flight flight) {
        return FlightResponse.builder()
                .id(flight.getId())
                .destination(flight.getDestination())
                .flightDate(flight.getFlightDate())
                .duration(flight.getDuration())
                .price(flight.getPrice())
                .build();
    }
}