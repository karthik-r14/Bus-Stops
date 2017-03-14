package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {
        String fromStop, toStop;
        Scanner scanner = new Scanner(System.in);

        List<BusRoute> busRoutes = new ArrayList<>();

        BusRoute busRoute1 = new BusRoute("Bus1", asList("MS", "TBM", "TRI", "MDU"));
        BusRoute busRoute2 = new BusRoute("Bus2", asList("MS", "TBM", "VIL", "PON"));
        BusRoute busRoute3 = new BusRoute("Bus3", asList("MS", "TBM", "TRI"));
        BusRoute busRoute4 = new BusRoute("Bus4", asList("MDU", "TRI", "MS"));

        busRoutes.add(busRoute1);
        busRoutes.add(busRoute2);
        busRoutes.add(busRoute3);
        busRoutes.add(busRoute4);

        System.out.println("Enter from stop : ");
        fromStop = scanner.next();
        System.out.println("Enter to stop : ");
        toStop = scanner.next();

        for (BusRoute busRoute : busRoutes) {
            if (busRoute.containsBusStops(fromStop, toStop)) {
                System.out.println(busRoute.getBusId());
            }
        }
    }
}