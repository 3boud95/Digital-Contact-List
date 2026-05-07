public class Person implements Comparable<Person>{
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

    @Override
    public int compareTo(Person other) {
        int nameCompare = this.PersonName.compareTo(other.PersonName);

        if (nameCompare != 0) {
            return nameCompare;
        }

        return this.PhoneNumber.compareTo(other.PhoneNumber);
    }
}
