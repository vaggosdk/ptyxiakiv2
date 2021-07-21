package com.example.ptyxiakiv2;

import java.util.Random;
//a class that generates random values for traffic ahead

public class OncomingTraffic {
    Random rand = new Random();
    //traffic situation numbers:
    //0: no traffic
    //1: almost no traffic
    //2: typical traffic
    //3: heavy traffic
    public int traffic_situation = rand.nextInt(3);
    //incident situation is a boolean value that indicates if there is an incident ahead
    public boolean incident_situation = rand.nextBoolean();


}
