package modelClasses;

import auxiliarClasses.Country;
import auxiliarClasses.EMail;
import auxiliarClasses.TextValidator;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private Gender gender;
    private Country nationality;
    private EMail email;
    private LocalDate birthDate;

    //Constructors
    public Person(String firstName, String lastName, String ID, Gender gender, Country nationality, String email, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(ID);
        setGender(gender);
        setNationality(nationality);
        setEmail(email);
        setBirthDate(birthDate);
    }


    //Setters
    public void setFirstName(String firstName) {
        if (TextValidator.isValidName(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (TextValidator.isValidLastName(lastName)) {
            this.lastName = lastName;
        }
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setID(String ID) {
        if (TextValidator.isValidID(ID, this.nationality)) {
            this.ID = ID;
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = new EMail(email);
    }

    public void setBirthDate(LocalDate dateOfBirth) {
        this.birthDate = dateOfBirth;
    }


    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Country getNationality() {return nationality;}

    public String getID() {
        return ID;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email.toString();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }


}
