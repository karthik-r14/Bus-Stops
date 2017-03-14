package com.company;

import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BusRouteTest {
    BusRoute busRoute;

    @org.junit.Before
    public void setUp() throws Exception {
        busRoute = new BusRoute("bus1", asList("MS", "TBM", "TRI", "MDU"));
    }


    @Test
    public void shouldReturnBusId() throws Exception {
        String busId = "bus1";
        assertEquals(busId, busRoute.getBusId());
    }

    @Test
    public void shouldReturnTrueWhenBusRouteContainsFromAndToStopAndIndexOfFromIsLessThanIndexOfToStop() throws Exception {
        String fromStop = "MS";
        String toStop = "TRI";

        assertEquals(true, busRoute.containsBusStops(fromStop, toStop));
    }

    @Test
    public void shouldReturnFalseWhenBusRouteDoesntContainFromAndToStop() throws Exception {
        String fromStop = "VIL";
        String toStop = "PON";

        assertEquals(false, busRoute.containsBusStops(fromStop, toStop));
    }

    @Test
    public void shouldReturnFalseWhenBusRouteContainsFromAndDoesntContainToStop() throws Exception {
        String fromStop = "MS";
        String toStop = "VIL";

        assertEquals(false, busRoute.containsBusStops(fromStop, toStop));
    }
}
