package cn.ks.kd.animal;

public class Animal {
    String kind;
    String picture;
    String food;
    int hungre;
    String location;
    String boundaries;

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getHungre() {
        return hungre;
    }

    public void setHungre(int hungre) {
        this.hungre = hungre;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(String boundaries) {
        this.boundaries = boundaries;
    }

    public void makeNoise(){
        System.out.println("HHHHHH!");
    }
    public void eat(){
        System.out.println("eat food: " + food);
    }
    public void sleep(){
        System.out.println("sleeping .....................................");
    }
    public void roan(){
        System.out.println("walking round: " + boundaries);
    }



}
