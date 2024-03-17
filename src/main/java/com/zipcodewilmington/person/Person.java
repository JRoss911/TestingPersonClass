package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {  //Main Class
    private String name = "";
    private String cityBorn = "";
    private String petsName = "";
    private int height = Integer.MAX_VALUE;
    private int age = Integer.MAX_VALUE;
    private String eyeColor = "";
    private int yearBorn = Integer.MAX_VALUE;

    public Person() { //class constructor
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCityBorn(String cityBorn) {
        this.cityBorn = cityBorn;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName;
    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCityBorn(){
        return cityBorn;
    }

    public String getEyeColor(){
        return eyeColor;
    }

    public String getPetsName() {
        return petsName;
    }

    public int getYearBorn() {
        return yearBorn;
    }

    public int getHeight() {
        return height;
    }
}


//this.eyeColor = eyeColor;
//        this.cityBorn = cityBorn;
//        this.petsName = petsName;
//        this.height = height;
//        this.yearBorn = yearBorn;
//,String cityBorn, String eyeColor, String petsName, int height, int yearBorn