package Lab4;

import java.util.Scanner;

public class Lab4Task2 {
    public static void main(String[] args) {
        Person personA = inputPerson();
        Person personB = inputPerson();

        if(personA.getAge() == personB.getAge()){
            System.out.println(personA.getName()+" and "+personB.getName()+" are the same age.");
        }
        else {
            System.out.println("Not the same age");
        }
    }

    private static Person inputPerson() {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Create new object
        Person p = new Person(name, age);
        scanner.close();
        return p;
    }
}
