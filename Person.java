package oops;

public class Person {
   private String name;
   private int age;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Swathi");
        System.out.println(person1.getName());
        person1.setAge(25);
        System.out.println(person1.getAge());
        
    }
    
}
