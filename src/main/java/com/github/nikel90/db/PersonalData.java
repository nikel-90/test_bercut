package com.github.nikel90.db;

public class PersonalData {
    private final String firstName;
    private final String secondName;
    private final String patronymicName;

    public PersonalData(String firstName, String secondName, String patronymicName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymicName = patronymicName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    @Override
    public String toString() {
        return "PersonalData{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                '}';
    }
}
