package com.example.kesar.animationonmap;

import java.util.List;

/**
 * Created by kesar on 11/29/2017.
 */

public class RouteObject {
    private List<LegsObject> legs;
    public RouteObject(List<LegsObject> legs) {
        this.legs = legs;
    }
    public List<LegsObject> getLegs() {
        return legs;
    }
}