public class Person {
    private String PersonName;
    private String PhoneNumber;

    public Person(String PersonName, String PhoneNumber) {
        this.PersonName = PersonName;
        this.PhoneNumber = PhoneNumber;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
