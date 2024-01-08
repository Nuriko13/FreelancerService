package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {

        int initialBalance = 0;
        int counter = 0;


        for (int i = 0; i < 12; i++) {
            if (initialBalance >= threshold) {

                initialBalance -= expenses;
                initialBalance /= 3;
                counter++;
            } else {

                initialBalance += income;
                initialBalance -= expenses;


            }
        }

        return counter;
    }
}
