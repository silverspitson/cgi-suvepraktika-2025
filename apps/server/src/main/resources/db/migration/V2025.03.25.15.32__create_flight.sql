CREATE TABLE "flight" (
    "id" serial PRIMARY KEY,
    "destination" varchar(250) NOT NULL,
    "flight_date" timestamp,
    "duration" time,
    "price" float
);

INSERT INTO flight (destination, flight_date, duration, price) VALUES
    ('Riia', '2025-04-20 06:20:00', '01:52:00', 25.7),
    ('Stockholm', '2025-04-13 11:37:00', '01:21:00', 32.85),
    ('Oslo', '2025-05-30 22:02:00', '03:05:00', 46.38),
    ('London', '2025-05-11 17:55:00', '04:12:00', 77.15);