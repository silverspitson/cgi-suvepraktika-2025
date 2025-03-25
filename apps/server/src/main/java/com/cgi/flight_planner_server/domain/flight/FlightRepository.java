package com.cgi.flight_planner_server.domain.flight;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    //https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html
    List<Flight> findAllByOrderByFlightDateAscDestinationAsc();
}
