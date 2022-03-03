// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part I
// Written by: Augusto Mota Pinheiro (40208080)
//             Michaël Gugliandolo (40213419)
// -----------------------------------------------------

package com.amp.flyingstuff;

import com.amp.flyingstuff.airplane.Airplane;
import com.amp.flyingstuff.multi.Multirotor;
import com.amp.flyingstuff.copters.*;
import com.amp.flyingstuff.drones.*;
import com.amp.flyingstuff.uav.UAV;

public class Main {

    public static void main(String[] args) {
        Flying airplane1 = new Airplane();
        Flying airplane2 = new Airplane("Horseroo", 31.4, 232);
        Flying airplane3 = new Airplane("Horseroo", 31.4, 231);
        Flying airplane4 = new Airplane((Airplane) airplane3);

        Flying helicopter1 = new Helicopter();
        Flying helicopter2 = new Helicopter("Aerokine", 23, 520, 3, 2003, 2);
        Flying helicopter3 = new Helicopter("Oleor", 62.23, 717, 3, 2002, 2);
        Flying helicopter4 = new Helicopter((Helicopter) helicopter3);

        Flying quadcopter1 = new Quadcopter();
        Flying quadcopter2 = new Quadcopter("Bob", 391.4, 29, 20, 2001, 4, 550);
        Flying quadcopter3 = new Quadcopter("Ross", 310.14, 59, 12, 2022, 4, 520);
        Flying quadcopter4 = new Quadcopter((Quadcopter) quadcopter3);

        Flying multirotor1 = new Multirotor();
        Flying multirotor2 = new Multirotor("Bob Ross!", 71.03, 99, 12, 1995, 20, 452);
        Flying multirotor3 = new Multirotor("Fiaran", 27, 50, 3, 2012, 2, 6);
        Flying multirotor4 = new Multirotor((Multirotor) multirotor3);

        Flying UAV1 = new UAV();
        Flying UAV2 = new UAV(21, 52);
        Flying UAV3 = new UAV(21, 52);
        Flying UAV4 = new UAV((UAV) UAV3);

        Flying agriculturalDrone1 = new AgriculturalDrone();
        Flying agriculturalDrone2 = new AgriculturalDrone(423.2, 395.1, "Rotor LLC", 223);
        Flying agriculturalDrone3 = new AgriculturalDrone((AgriculturalDrone) agriculturalDrone2);

        Flying MAV1 = new MAV();
        Flying MAV2 = new MAV(12.45, 52.1, "PLA-LAD42-JE", 3.98);
        Flying MAV3 = new MAV(22.86, 2.31, "POLQ-32JA-HK", 13.8);
        Flying MAV4 = new MAV((MAV) MAV3);

        Flying[] flying = new Flying[]{
                airplane1,
                airplane2,
                helicopter2,
                helicopter3,
                quadcopter2,
                quadcopter4,
                multirotor1,
                multirotor2,
                multirotor3,
                UAV2,
                UAV3,
                agriculturalDrone1,
                agriculturalDrone2,
                MAV1,
                MAV3,
                MAV4
        };

        Flying[] airplanes = new Flying[]{
                airplane1,
                airplane2,
                airplane3,
                airplane4,
                helicopter1,
                helicopter2,
                helicopter3,
                helicopter4,
                quadcopter1,
                quadcopter2,
                quadcopter3,
                quadcopter4,
                multirotor1,
                multirotor2,
                multirotor3,
                multirotor4
        };

        //ToString

        for (Flying flyer : flying) {
            System.out.println(flyer);
        }

        System.out.println("-----------");

        //Equals

        //Compare objects of different types
        System.out.println("Airplane 1 and helicopter 1 are " + (airplane1.equals(helicopter1) ? "equal." : "different."));
        System.out.println("Quadcopter 2 and multirotor 3 are " + (quadcopter2.equals(multirotor3) ? "equal." : "different."));
        System.out.println("Quadcopter 4 and agricultural drone 3 are " + (quadcopter3.equals(agriculturalDrone3) ? "equal." : "different."));
        System.out.println("UAV 1 and MAV 2 are " + (UAV1.equals(MAV2) ? "equal." : "different."));

        //Compare objects of same types with different attributes
        System.out.println("Quadcopter 2 and quadcopter 3 are " + (quadcopter2.equals(quadcopter3) ? "equal." : "different."));
        System.out.println("Multirotor 2 and multirotor 4 are " + (multirotor2.equals(multirotor4) ? "equal." : "different."));
        System.out.println("MAV 2 and MAV 3 are " + (MAV2.equals(MAV3) ? "equal." : "different."));

        //Compare objects of same types with similar attributes
        System.out.println("Airplane 2 and airplane 3 are " + (airplane2.equals(airplane3) ? "equal." : "different."));

        //Compare objects of same types with same attributes
        System.out.println("Helicopter 3 and helicopter 4 are " + (helicopter2.equals(helicopter4) ? "equal." : "different."));
        System.out.println("UAV 2 and UAV 3 are " + (UAV2.equals(UAV3) ? "equal." : "different."));
        System.out.println("UAV 2 and UAV 4 are " + (UAV2.equals(UAV4) ? "equal." : "different."));

        System.out.println("-----------");

        findLeastAndMostExpensiveUAV(flying);
        findLeastAndMostExpensiveUAV(airplanes);

        System.out.println("-----------");

        System.out.println("Thank you for using our program!");
    }

    private static void findLeastAndMostExpensiveUAV(Flying[] prices) {
        Flying mostExpensive = null;
        Flying leastExpensive = null;
        boolean hasFoundUAV = false;

        for (Flying testPrice : prices) {
            if (!(testPrice instanceof UAV)) continue;

            if (!hasFoundUAV) {
                mostExpensive = testPrice;
                leastExpensive = testPrice;
                hasFoundUAV = true;
            } else if (mostExpensive.getPrice() < testPrice.getPrice()) {
                mostExpensive = testPrice;
            } else if (leastExpensive.getPrice() > testPrice.getPrice()) {
                leastExpensive = testPrice;
            }
        }

        if (!hasFoundUAV) System.out.println("There aren't any UAVs in this array.");
        else {
            System.out.println("Most expensive: " + mostExpensive);
            System.out.println("Least expensive: " + leastExpensive);
        }

    }
}
