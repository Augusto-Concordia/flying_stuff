// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff;

import com.amp.flyingstuff.airplane.Airplane;
import com.amp.flyingstuff.copters.Helicopter;
import com.amp.flyingstuff.copters.Quadcopter;
import com.amp.flyingstuff.drones.AgriculturalDrone;
import com.amp.flyingstuff.drones.MAV;
import com.amp.flyingstuff.multi.Multirotor;
import com.amp.flyingstuff.uav.UAV;

public class Main {

    public static void main(String[] args) {
        // write your code here
        IPrice[] flying = new IPrice[]{
                new Airplane(),
                new Airplane("Horseroo", 31.4, 232),
                new Airplane("Malidu", 23.2, 2314),
                new Helicopter(),
                new Helicopter("", 23, 12, 3, 1002, 2),
                new Quadcopter(),
                new Quadcopter("", 32, 21, 1, 2002, 3, 200),
                new Multirotor(),
                new Multirotor("", 23, 12, 3, 1002, 2, 5),
                new UAV(21, 52),
                new UAV(53, 42),
                new AgriculturalDrone(),
                new AgriculturalDrone(423.2, 395.1, "Rotor LLC", 223),
                new MAV(),
                new MAV(12.45, 52.1, "PLA-LAD42-JE", 3.98),
                new MAV(22.86, 2.31, "POLQ-32JA-HK", 13.8),
                new MAV(23.32, 213.1, "Maverick 3000", 23.8),
                new MAV(42.32, 823.1, "Mouloa-K 2", 31.8)
        };

        IPrice[] airplanes = new IPrice[]{
                new Airplane(),
                new Airplane("Loperot", 311.4, 292),
                new Airplane("Horseroo", 31.4, 232),
                new Airplane("Malidu", 23.2, 2314),
                new Airplane("OKLLASD", 3.8, 293),
                new Quadcopter("Bob", 391.4, 29, 23,1,4,523),
                new Quadcopter("Ross", 31.14, 59, 123,2023,4,620),
                new Quadcopter("Plaoer", 651.54, 21, 52,2042,30,10000),
                new Quadcopter("Jola", 732.73, 27, 12,2421,10,1030),
                new Helicopter(),
                new Helicopter("Oleor", 62.23, 717, 1, 3002,2),
                new Helicopter("Fllas", 23.7, 243, 6, 421,1),
                new Helicopter("Ploer", 2.27, 226, 2, 5634,2000),
                new Helicopter("Blait", 12.78, 514, 9, 2315,20),
                new Multirotor(),
                new Multirotor("Uert", 321.13, 69, 22,2413,640,230),
                new Multirotor("Bob Ross!", 71.03, 99, 12,2002,230,452),
        };

        findLeastAndMostExpensiveUAV(flying);
        findLeastAndMostExpensiveUAV(airplanes);
    }

    private static void findLeastAndMostExpensiveUAV(IPrice[] prices) {
        IPrice mostExpensive = prices[0];
        IPrice leastExpensive = prices[0];

        for (IPrice testPrice : prices) {
            if (mostExpensive.getPrice() < testPrice.getPrice()) mostExpensive = testPrice;
            if (leastExpensive.getPrice() > testPrice.getPrice()) leastExpensive = testPrice;
        }

        System.out.println(mostExpensive);
        System.out.println("-----------");
        System.out.println(leastExpensive);
    }
}
