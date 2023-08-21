package Seminar_3OOP;

public class User implements Comparable<User> {
    private String firsName;

    private String lastName;

    private int age;
    private Personal personal= new Personal();

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public User(String firsName, String lastName, int age) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        int companeFirstName = this.firsName.compareTo(o.firsName);
       if( companeFirstName != 0){
           return companeFirstName;
       }
        int companeLastName = this.lastName.compareTo(o.lastName);
        if( companeLastName != 0){
            return companeLastName;
        }

        return this.age - o.age;
    }
}
