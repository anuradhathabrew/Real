/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ds.project;

import com.ds.objects.House;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Ezio
 */
public class SortedList {
     private List<House> houses;

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
 //    public List<House> getHouses() {
//        Collections.sort(houses, (Object synchronizedListOne, Object synchronizedListTwo) -> ((House) synchronizedListOne).getLotNumber()
//                .compareTo(((House) synchronizedListTwo).getLotNumber()));
//
//        return houses;
//    }
    public List<House> getShortHouses() {

        House[] h = new House[houses.size()];

        for(int i=0;i<houses.size();i++){
            h[i] = houses.get(i);
        }
        for (int i = 1; i < h.length; i++) {
            for (int j = 0; j < h.length-1; j++) {
                if (h[j].getLotNumber() > h[j + 1].getLotNumber()) {
                    House t = h[j];
                    h[j] = h[j + 1];
                    h[j + 1] = t;
                }
            }
        }

        houses = new ArrayList<>();
        for (House t : h) {
            houses.add(t);
        }
        return houses;
    }
}

