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
    private LocalDate dateOfBirth;

    //Constructors
    public Person(String firstName, String lastName, String ID, Gender gender, Country nationality, String email, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(ID);
        setGender(gender);
        setNationality(nationality);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
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

    public void setID(String ID) {
        if (TextValidator.)
        this.ID = ID;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


}
