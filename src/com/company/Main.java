package com.company;

public class Main {

    public static void main(String[] args) {

        Agency agency = new Agency(3);
        System.out.println(agency.getHiringCost());
        agency = new Agency(12);
        System.out.println(agency.getHiringCost());
        agency = new Agency(101);
        System.out.println(agency.getHiringCost());

    }
}
