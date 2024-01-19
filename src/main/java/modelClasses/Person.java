package modelClasses;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private Gender gender;
    private EMail email;
    private LocalDate dateOfBirth;

    //Constructors
    public Person(String firstName, String lastName, String ID, Gender gender, String email, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(ID);
        setGender(gender);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
    }



    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
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
