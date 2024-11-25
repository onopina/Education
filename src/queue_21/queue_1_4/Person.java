package queue_21.queue_1_4;

public class Person{
    private String firstName;
    private String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", sum of symbols='" + sumSymbols() + '\'' +
                '}';
    }
    public int sumSymbols(){
        return firstName.length() + secondName.length();
    }
}
