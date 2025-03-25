package com.cgi.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Flight {
    private long id;
    private String destination;
    private LocalDateTime date;
    private Duration duration;
    private double price;
    //private PlaneType planeType;
}
