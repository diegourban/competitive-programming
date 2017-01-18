package urban.codewars.kyu8;

public class NameMe {
    private final String firstName;
    private final String lastName;
    private final String fullName;

    public NameMe(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }
}
