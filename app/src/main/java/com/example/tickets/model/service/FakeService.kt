package com.example.tickets.model.service


import android.telecom.Call
import com.example.tickets.model.entity.Airline
import com.example.tickets.model.entity.Flight
import com.example.tickets.model.entity.Location
import com.example.tickets.model.entity.Offer
import retrofit2.Response
import java.util.UUID
import javax.security.auth.callback.Callback

object FakeService {
    val offerList = listOf(
        Offer(
            id = UUID.randomUUID().toString(),
            price = 24550,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "20:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "22-30",
                flightNumber = "981",
                airline = Airline(
                    name = "Air Astana",
                    code = "KC"
                ),
                duration = 120
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 16250,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "16:00",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "18-00",
                flightNumber = "991",
                airline = Airline(
                    name = "Air Astana",
                    code = "KC"
                ),
                duration = 120
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 8990,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "09:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "11-10",
                flightNumber = "445",
                airline = Airline(
                    name = "FlyArystan",
                    code = "KC"
                ),
                duration = 100
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 14440,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "14:30",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "16-00",
                flightNumber = "223",
                airline = Airline(
                    name = "SCAT Airlines",
                    code = "DV"
                ),
                duration = 90
            )
        ),
        Offer(
            id = UUID.randomUUID().toString(),
            price = 15100,
            flight = Flight(
                departureLocation = Location(
                    cityName = "Алматы",
                    code = "ALA"
                ),
                departureTimeInfo = "18:00",
                arrivalLocation = Location(
                    cityName = "Астана",
                    code = "NQZ"
                ),
                arrivalTimeInfo = "20:15",
                flightNumber = "171",
                airline = Airline(
                    name = "QazaqAir",
                    code = "IQ"
                ),
                duration = 135
            )
        )
    )
}