package com.evergent.corejava.exceptionhandling;



class ExceedingCalorieIntakeException extends Exception {
    public ExceedingCalorieIntakeException(String message) {
        super(message);
    }
}

class DietPlan {
    private String userName;
    private int dailyCalorieLimit;

    public DietPlan(String userName, int dailyCalorieLimit) {
        this.userName = userName;
        this.dailyCalorieLimit = dailyCalorieLimit;
    }

    public void logMeal(int calorieAmount) throws ExceedingCalorieIntakeException {
        if (calorieAmount > dailyCalorieLimit) {
            throw new ExceedingCalorieIntakeException("Calorie intake exceeds daily limit. Intake: " + calorieAmount + " kcal, Limit: " + dailyCalorieLimit + " kcal.");
        } else {
            System.out.println("Meal logged successfully. Calories: " + calorieAmount + " kcal.");
        }
    }
}

public class FitnessManagementSystem {
    public static void main(String[] args) {
        DietPlan dietPlan = new DietPlan("Alice", 2000);
        try {
            dietPlan.logMeal(2500);
        } catch (ExceedingCalorieIntakeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
            System.out.println(e);
        }
        System.out.println("Program continues after handling the exception.");
    }
}

