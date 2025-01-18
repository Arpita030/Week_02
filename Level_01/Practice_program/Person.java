public class Person {
    private String name;
    private int age;
    private String city;
    private String number;
   


    Person(String name,int age,String city,String number){
        this.name=name;
        this.age=age;
        this.city=city;
        this.number=number;
    }


    Person(Person p){
         this.name=p.name;
         this.age=p.age;
         this.city=p.city;
         this.number=p.number;
    }


    void display(){
        System.out.println("Person's name is "+name);
        System.out.println("Person's age is "+age);
        System.out.println("Person's city is "+city);
        System.out.println("Person's number is "+number);
    }
    public static void main(String[] args) {
        System.out.println("Displaying data from parameterized constructor :");
        Person person=new Person("Sagar", 23, "Bhopal", "1111111111");
        person.display();
        System.out.println("Displaying data from copy constructor :");
        Person person1=new Person(person);
        person1.display();


    }
}