package com.amp.flyingstuff;

import com.amp.flyingstuff.drones.AgriculturalDrone;
import com.amp.flyingstuff.drones.MAV;
import com.amp.flyingstuff.uav.UAV;

public class Main {

    public static void main(String[] args) {
        // write your code here
        UAV[] uavs = new UAV[]{
                new UAV(),
                new UAV(31.4, 232),
                new UAV(23.2, 2314),
                new UAV(23, 12),
                new UAV(21, 52),
                new UAV(53, 42),
                new AgriculturalDrone(),
                new AgriculturalDrone(42.2, 325.1, "UAV Inc.", 423),
                new AgriculturalDrone(729.2, 214, "Crash Corp.", 33),
                new AgriculturalDrone(79.2, 2314, "Flying Corp.", 323),
                new AgriculturalDrone(423.2, 395.1, "Rotor LLC", 223),
                new MAV(),
                new MAV(2.32, 23.1, "OKLLASD3134-K", 3.8),
                new MAV(12.45, 52.1, "PLA-LAD42-JE", 3.98),
                new MAV(22.86, 2.31, "POLQ-32JA-HK", 13.8),
                new MAV(23.32, 213.1, "Maverick 3000", 23.8),
                new MAV(42.32, 823.1, "Mouloa-K 2", 31.8)
        };

        findLeastAndMostExpensiveUAV(uavs);
    }

    private static void findLeastAndMostExpensiveUAV(UAV[] uavs) {
        UAV mostExpensive = uavs[0];
        UAV leastExpensive = uavs[0];

        for (UAV uav : uavs) {
            if (mostExpensive.getPrice() < uav.getPrice()) mostExpensive = uav;
            if (leastExpensive.getPrice() > uav.getPrice()) leastExpensive = uav;
        }

        System.out.println(mostExpensive);
        System.out.println("-----------");
        System.out.println(leastExpensive);
    }
}
