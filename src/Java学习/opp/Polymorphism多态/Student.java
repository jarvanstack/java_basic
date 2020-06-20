package Java学习.opp.Polymorphism多态;

public class Student extends Person {
    Student(){
        System.out.println("The construction method of the subclass Student run successfully.");
    }
    void learn(){
        System.out.println("method of subclass Student learn run successfully.learning");
    }
}
