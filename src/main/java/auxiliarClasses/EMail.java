package auxiliarClasses;

public class EMail {
    private String user;
    private String domain;

    public EMail(String email) {
        String[] parts = splitEmail(email);
        user = parts[0];
        domain = parts[1];
    }

    public EMail(String user, String domain) {
        this.setUser(user);
        this.setDomain(domain);
    }

    private String[] splitEmail(String wholeEmail) {
        return wholeEmail.split("@");
    }

    private void setUser(String user) {
        if (TextValidator.isValidUserEmail(user)) {
            this.user = user;
        }
    }

    private void setDomain(String domain) {
        if (TextValidator.isValidDomainEmail(domain)) {
            this.domain = domain;
        }
    }

    @Override
    public String toString() {
        return user + "@" + domain;
    }
}
