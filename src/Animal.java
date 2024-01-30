class Animal{
    void eat(){System.out.println("eat");}
}

class Dog extends Animal{
    void bark(){System.out.println("bark");}
}

class test{
    public static void main(String[] args) {
        Animal d = new Dog();
        //d.bark();
        d.eat();
    }
}