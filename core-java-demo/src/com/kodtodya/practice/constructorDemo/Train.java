package com.kodtodya.practice.constructorDemo;

public class Train {
    private int trainId;
    private String trainName;

    // default constructor - non-parameterized
    public Train() {

    }

    // parameterized constructor
    public Train(int id, String name) {
        this.trainId = id;
        this.trainName = name;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", trainName='" + trainName + '\'' +
                '}';
    }
}
