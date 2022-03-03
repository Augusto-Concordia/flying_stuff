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

        IPrice airplane1 = new Airplane();
        IPrice airplane2 = new Airplane("Horseroo", 31.4, 232);
        IPrice airplane3 = new Airplane("Horseroo", 31.4, 231);
        IPrice airplane4 = new Airplane((Airplane) airplane3);

        IPrice helicopter1 = new Helicopter();
        IPrice helicopter2 = new Helicopter("Aerokine", 23, 520, 3, 2003, 2);
        IPrice helicopter3 = new Helicopter("Oleor", 62.23, 717, 3, 2002, 2);
        IPrice helicopter4 = new Helicopter((Helicopter) helicopter3);

        IPrice quadcopter1 = new Quadcopter();
        IPrice quadcopter2 = new Quadcopter("Bob", 391.4, 29, 20, 2001, 4, 550);
        IPrice quadcopter3 = new Quadcopter("Ross", 310.14, 59, 12, 2022, 4, 520);
        IPrice quadcopter4 = new Quadcopter((Quadcopter) quadcopter3);

        IPrice multirotor1 = new Multirotor();
        IPrice multirotor2 = new Multirotor("Bob Ross!", 71.03, 99, 12, 1995, 20, 452);
        IPrice multirotor3 = new Multirotor("Fiaran", 27, 50, 3, 2012, 2, 6);
        IPrice multirotor4 = new Multirotor((Multirotor) multirotor3);

        IPrice UAV1 = new UAV();
        IPrice UAV2 = new UAV(21, 52);
        IPrice UAV3 = new UAV(21, 52);
        IPrice UAV4 = new UAV((UAV) UAV3);

        IPrice agriculturalDrone1 = new AgriculturalDrone();
        IPrice agriculturalDrone2 = new AgriculturalDrone(423.2, 395.1, "Rotor LLC", 223);
        IPrice agriculturalDrone3 = new AgriculturalDrone((AgriculturalDrone) agriculturalDrone2);

        IPrice MAV1 = new MAV();
        IPrice MAV2 = new MAV(12.45, 52.1, "PLA-LAD42-JE", 3.98);
        IPrice MAV3 = new MAV(22.86, 2.31, "POLQ-32JA-HK", 13.8);
        IPrice MAV4 = new MAV((MAV) MAV3);

        IPrice[] flying = new IPrice[16];
        IPrice[] airplanes = new IPrice[16];

        flying[0] = airplane1;
        flying[1] = airplane2;
        flying[2] = helicopter2;
        flying[3] = helicopter3;
        flying[4] = quadcopter2;
        flying[5] = quadcopter4;
        flying[6] = multirotor1;
        flying[7] = multirotor2;
        flying[8] = multirotor3;
        flying[9] = UAV2;
        flying[10] = UAV3;
        flying[11] = agriculturalDrone1;
        flying[12] = agriculturalDrone2;
        flying[13] = MAV1;
        flying[14] = MAV3;
        flying[15] = MAV4;

        airplanes[0] = airplane1;
        airplanes[1] = airplane2;
        airplanes[2] = airplane3;
        airplanes[3] = airplane4;
        airplanes[4] = helicopter1;
        airplanes[5] = helicopter2;
        airplanes[6] = helicopter3;
        airplanes[7] = helicopter4;
        airplanes[8] = quadcopter1;
        airplanes[9] = quadcopter2;
        airplanes[10] = quadcopter3;
        airplanes[11] = quadcopter4;
        airplanes[12] = multirotor1;
        airplanes[13] = multirotor2;
        airplanes[14] = multirotor3;
        airplanes[15] = multirotor4;

        //ToString

        for (IPrice flyer : flying) {
            System.out.println(flyer.toString());
        }

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

        findLeastAndMostExpensiveUAV(flying);
        findLeastAndMostExpensiveUAV(airplanes);
    }

    private static void findLeastAndMostExpensiveUAV(IPrice[] prices) {
        IPrice mostExpensive = null;
        IPrice leastExpensive = null;
        boolean hasFoundUAV = false;

        for (IPrice testPrice : prices) {
            if (!(testPrice instanceof UAV)) continue;
            if (!hasFoundUAV) {
                mostExpensive = testPrice;
                leastExpensive = testPrice;
                hasFoundUAV = true;
            } else if (mostExpensive.getPrice() < testPrice.getPrice()) mostExpensive = testPrice;
            else if (leastExpensive.getPrice() > testPrice.getPrice()) leastExpensive = testPrice;
        }

        if (!hasFoundUAV) System.out.println("There aren't any UAVs in this array.");
        else {
            System.out.println("Most expensive: " + mostExpensive);
            System.out.println("-----------");
            System.out.println("Least expensive: " + leastExpensive);
        }

    }
}
