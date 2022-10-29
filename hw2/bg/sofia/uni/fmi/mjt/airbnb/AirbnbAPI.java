package bg.sofia.uni.fmi.mjt.airbnb;

import bg.sofia.uni.fmi.mjt.airbnb.filter.Criterion;
import bg.sofia.uni.fmi.mjt.airbnb.accommodation.Bookable;


public interface AirbnbAPI {

    Bookable findAccommodationById(String id);

    double estimateTotalRevenue();

    long countBookings();

    Bookable[] filterAccommodations(Criterion... criteria);

}