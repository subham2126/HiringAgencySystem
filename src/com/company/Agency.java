package com.company;

public class Agency {

    int people;
    Hiring hiring;
    Agency(int people){
        this.people = people;
        if(people <= 10)
            hiring = new LowBudgetHiring(people);
        else if(people <= 100)
            hiring = new MediumBudgetHiring(people);
        else
            hiring = new HighBudgetHiring(people);

    }

    public int getHiringCost(){
        return hiring.getTotalCost();
    }
}
