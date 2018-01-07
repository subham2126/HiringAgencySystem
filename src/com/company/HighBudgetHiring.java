package com.company;

public class HighBudgetHiring implements  Hiring {
    int cost;
    int people;

    HighBudgetHiring(int people){
        this.cost = 1000;
        this.people = people;
    }
    @Override
    public int getTotalCost() {
        return cost*people;
    }

}
