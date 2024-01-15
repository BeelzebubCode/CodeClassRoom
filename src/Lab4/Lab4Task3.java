package Lab4;

public class Lab4Task3 {
    public static void main(String[] args) {
        Person person = new Person("Kenneth",33);
        System.out.println("Now you are "+person.getAge()+".");
        person.increaseAge();
        System.out.println("Soon you will be "+person.getAge()+".");
    }
}
