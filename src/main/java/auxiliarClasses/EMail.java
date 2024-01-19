package auxiliarClasses;

public class EMail {
    private String user;
    private String domain;

    public EMail(String email) {
        String[] parts = splitEmail(email);
        //user - TextValidator.validateUser()
    }

    public EMail(String user, String domain) {

    }

    private String[] splitEmail(String wholeEmail) {
        return wholeEmail.split("@");
    }
}
