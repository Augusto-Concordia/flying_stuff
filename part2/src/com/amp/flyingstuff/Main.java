// -----------------------------------------------------
// Assignment 2 - COMP 249
// Due Date: March 4th
// Question: Part II
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

    private static Flying[] copyFlyingObjects(Flying[] arrayToCopy) {
        Flying[] copiedArray = new Flying[arrayToCopy.length];

        for (int i = 0; i < arrayToCopy.length; i++) {
            copiedArray[i] = arrayToCopy[i].deepCopy();
        }

        return copiedArray;
    }

    public static void main(String[] args) {
        Flying airplane1 = new Airplane();
        Flying airplane2 = new Airplane("Horseroo", 31.4, 232);
        Flying airplane3 = new Airplane("Horseroo", 31.4, 231);

        Flying helicopter1 = new Helicopter();
        Flying helicopter2 = new Helicopter("Aerokine", 23, 520, 3, 2003, 2);
        Flying helicopter3 = new Helicopter("Oleor", 62.23, 717, 3, 2002, 2);

        Flying quadcopter1 = new Quadcopter();
        Flying quadcopter2 = new Quadcopter("Bob", 391.4, 29, 20, 2001, 4, 550);
        Flying quadcopter3 = new Quadcopter("Ross", 310.14, 59, 12, 2022, 4, 520);

        Flying multirotor1 = new Multirotor();
        Flying multirotor2 = new Multirotor("Bob Ross!", 71.03, 99, 12, 1995, 20, 452);
        Flying multirotor3 = new Multirotor("Fiaran", 27, 50, 3, 2012, 2, 6);

        Flying UAV1 = new UAV(21, 52);
        Flying UAV2 = new UAV(21, 52);

        Flying agriculturalDrone1 = new AgriculturalDrone();
        Flying agriculturalDrone2 = new AgriculturalDrone(423.2, 395.1, "Rotor LLC", 223);

        Flying MAV1 = new MAV();
        Flying MAV2 = new MAV(22.86, 2.31, "POLQ-32JA-HK", 13.8);
        Flying MAV3 = new MAV((MAV) MAV2);

        Flying[] flying = new Flying[]{
                airplane1,
                airplane2,
                airplane3,
                helicopter1,
                helicopter2,
                helicopter3,
                quadcopter1,
                quadcopter2,
                quadcopter3,
                multirotor1,
                multirotor2,
                multirotor3,
                UAV1,
                UAV2,
                agriculturalDrone1,
                agriculturalDrone2,
                MAV1,
                MAV2,
                MAV3
        };

        Flying[] copiedFlying = copyFlyingObjects(flying);

        for (Flying flyer : flying) {
            System.out.println(flyer);
        }

        System.out.println("-----------");

        for (Flying flyer : copiedFlying) {
            System.out.println(flyer);
        }

        System.out.println("Thank you for using our program!");
    }
}
