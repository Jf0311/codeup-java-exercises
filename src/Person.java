import java.security.PublicKey;

public class Person {
   private String name ;

   public Person (String name ){  // constructor
       this.name = name;
   }


     public String getName(){
 //TODO: return the person's name
         return name;

    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello , my name is " + name);
    }


    public static void main(String[] args) {
      Person personName = new Person("West");
      personName.sayHello();
        String name  = personName.getName();
        System.out.println("the person name is : " + name);

        personName.setName("Bubbles");
        personName.sayHello();

         name = personName.getName();
        System.out.println("The updated name is :" + name);

        personName.setName("Adam");
        personName.sayHello();
        name = personName.getName();
        System.out.println("The updated name is :" + name);


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//    Create an input validation class
//
//    Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner.
//    When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
//    The class should have the following methods, all of which return command line input from the user:
//
//    String getString()
//    boolean yesNo()
//    int getInt(int min, int max)
//    int getInt()
//    double getDouble(double min, double max)
//    double getDouble()
//    The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//            The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//        Create another class named InputTest that has a static main method that uses all the methods from the Input class.
//
//    Bonus
//
//    Allow all of your methods for getting input to accept an optional String parameter named prompt. If passed, the method should show the given prompt to the user before parsing the input.










    }
}
