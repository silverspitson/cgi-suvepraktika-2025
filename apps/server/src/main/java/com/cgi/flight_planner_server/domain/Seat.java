package com.cgi.flight_planner_server.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Seat {
    private long id;
    private boolean isWindowSeat;
    private boolean isAisleSeat;
}
