package com.example.web2;

public class PersonDto {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private char sex;
    private String nationality;

    public PersonDto() {
        System.out.println("PersonDto default constructor....");
    }

    public PersonDto(int id, String firstName, String lastName, int age, char sex, String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
        System.out.println("PersonDto parameterised constructor...");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}