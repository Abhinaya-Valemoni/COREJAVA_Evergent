package com.evergent.fitness.bean;



public class NutritionPlan {
    private int planId;
    private String planName;
    private String description;
    private double cost;

    // Constructors, Getters, and Setters
    public NutritionPlan() {}

    public NutritionPlan(int planId, String planName, String description, double cost) {
        this.planId = planId;
        this.planName = planName;
        this.description = description;
        this.cost = cost;
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

