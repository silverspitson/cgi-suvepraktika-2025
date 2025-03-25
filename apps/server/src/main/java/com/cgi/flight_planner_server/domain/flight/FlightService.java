package com.cgi.flight_planner_server.domain.flight;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository repository;

    public List<Flight> getAll() {
        return repository.findAllByOrderByFlightDateAscDestinationAsc();
    }
}
