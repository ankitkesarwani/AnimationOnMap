package com.example.kesar.animationonmap;

import java.util.List;

/**
 * Created by kesar on 11/29/2017.
 */

public class LegsObject {

    private List<StepsObject> steps;
    public LegsObject(List<StepsObject> steps) {
        this.steps = steps;
    }
    public List<StepsObject> getSteps() {
        return steps;
    }
}
