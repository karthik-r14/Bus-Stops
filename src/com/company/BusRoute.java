package com.company;

import java.util.List;

public class BusRoute {
    String busId;
    List<String> busStops;

    public BusRoute(String busId, List<String> busStops) {
        this.busId = busId;
        this.busStops = busStops;
    }

    public Boolean containsBusStops(String fromStop, String toStop) {
        if (busStops.contains(fromStop) && busStops.contains(toStop)) {
            if (busStops.indexOf(fromStop) < busStops.indexOf(toStop)) {
                return true;
            }
        }
        return false;
    }

    public String getBusId() {
        return busId;
    }
}
