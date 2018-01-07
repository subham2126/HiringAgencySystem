package com.company;

public class LowBudgetHiring implements  Hiring {

    int cost;
    int people;

    LowBudgetHiring(int people){
        this.cost = 1500;
        this.people = people;
    }
    @Override
    public int getTotalCost() {
        return cost*people;
    }
}
