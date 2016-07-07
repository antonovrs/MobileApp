package com.example.testapplication.model;

public class Employee {
    private String name;
    private String position;
    private String currentVehicle;
    private boolean vacation;
    private String phoneNumber;
    private String email;

    public Employee(String name, String position, String currentVehicle, boolean vacation, String phoneNumber, String email) {
        this.name = name;
        this.position = position;
        this.currentVehicle = currentVehicle;
        this.vacation = vacation;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCurrentVehicle() {
        return currentVehicle;
    }

    public void setCurrentVehicle(String currentVehicle) {
        this.currentVehicle = currentVehicle;
    }

    public boolean isVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
