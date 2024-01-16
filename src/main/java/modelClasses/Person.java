package modelClasses;

import java.time.LocalDate;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private Gender gender;
   // private EMail email;
    private String email; //TODO convertir a EMail
    private LocalDate dateOfBirth;

    public Person(
            String firstName, String lastName, Gender gender, String ID,
            String email, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setID(ID);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
