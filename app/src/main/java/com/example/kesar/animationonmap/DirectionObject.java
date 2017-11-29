package com.example.kesar.animationonmap;

import java.util.List;

/**
 * Created by kesar on 11/29/2017.
 */

public class DirectionObject {

    private List<RouteObject> routes;
    private String status;
    public DirectionObject(List<RouteObject> routes, String status) {
        this.routes = routes;
        this.status = status;
    }
    public List<RouteObject> getRoutes() {
        return routes;
    }
    public String getStatus() {
        return status;
    }
}
