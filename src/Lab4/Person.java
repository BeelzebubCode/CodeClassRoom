package Lab4;

public class Person {
    private String name;
    private int age;

    // Default Constructor 
    public Person(){
        name = "NoName";
        age = 0;
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void increaseAge(){
        age+=1;
    }
    
    public String toString(){
        return name+" ("+age+")";
    }

    public boolean equals(Person p){
        return this.age == p.age && this.name.equals(p.name);
    } 
}

    // @Override
    // public boolean equals(Object obj){
    //     // ตรวจสอบ reference ว่าเป็นอ็อบเจกต์เดียวกันหรือไม่
    //     if(this == obj){
    //         return true;
    //     }

    //     // ตรวจสอบว่า obj ไม่เป็น null และเป็น instance ของคลาส Person
    //     if (obj == null || getClass() != obj.getClass()) {
    //         return false;
    //     }
    
    //     // แปลง obj เป็น Person
    //     Person otherPerson = (Person) obj;
    
    //     // เปรียบเทียบชื่อและอายุ
    //     return age == otherPerson.age && name.equals(otherPerson.name);
    // }



  