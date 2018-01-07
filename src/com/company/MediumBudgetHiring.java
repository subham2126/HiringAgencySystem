package com.company;

public class MediumBudgetHiring implements  Hiring {


    int cost;
    int people;

    MediumBudgetHiring(int people){
        this.cost = 1200;
        this.people = people;
    }
    @Override
    public int getTotalCost() {
        return cost*people;
    }
}
