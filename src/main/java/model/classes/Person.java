package model.classes;

import enums.Country;
import enums.EMail;
import enums.Gender;
import validators.DateValidator;
import validators.TextValidator;

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
    protected Person(String firstName, String lastName, Country nationality, String ID, Gender gender, String email, LocalDate birthDate) {
        setFirstName(firstName);
        setLastName(lastName);
        setNationality(nationality);
        setID(ID);
        setGender(gender);
        setEmail(email);
        setBirthDate(birthDate);
    }

    protected Person(String firstName, String lastName, Country nationality, String ID, Gender gender, LocalDate birthDate) {
        this(firstName, lastName, nationality, ID, gender, null, birthDate);
    }


    //Setters
    public void setFirstName(String firstName) {
        if (TextValidator.isValidName(firstName)) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException(firstName + " no es un nombre válido");
        }
    }

    public void setLastName(String lastName) {
        if (TextValidator.isValidLastName(lastName)) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException(firstName + " no es un apellido válido");
        }
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setID(String ID) {
        if (TextValidator.isValidID(ID, this.nationality)) {
            this.ID = ID;
        } else {
            throw new IllegalArgumentException("El identificador " + ID + " no cumple con el formato adecuado para el país " + this.nationality.getName());
        }
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = new EMail(email);
    }

    public void setBirthDate(LocalDate birthDate) {
        if (DateValidator.isValidBirthDate(birthDate)) {
            this.birthDate = birthDate;
        } else {
            throw new IllegalArgumentException("La fecha debe ser posterior a " + DateValidator.MIN_BIRTH_DATE);
        }
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
