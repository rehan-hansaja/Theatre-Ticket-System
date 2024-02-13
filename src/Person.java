public class Person {
    private String name;
    private String surname;
    private String email;

    //Person class constructor
    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    // getters to return values
    public String getName() {

        return name;
    }
    public String getSurname() {

        return surname;
    }
    public String getEmail() {

        return email;
    }
}

