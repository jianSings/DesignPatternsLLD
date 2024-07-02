package DesignPatternsLLD.DesignPatterns.Creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Student studentObj = new Student(10, 1456, "Abhi");
        Student cloneObj = (Student) studentObj.clone();
        System.out.println(cloneObj);
    }
}
