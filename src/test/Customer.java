package test;
public class Customer {
    private String name;
    private boolean member;
    private int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
        member = false;
    }

    public String toString(){
        return name+"("+age+")";
    }

    public void setMember(boolean m){
        member = m;
    }

    public int getAge(){
        return this.age;
    }

    public boolean equals(Customer s){
        return name.equals(s.name) && member == s.member && age == s.age;
    }
}
