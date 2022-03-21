package com.groupProjects.project2;
    /*
    We have to calculate the average of marks obtained
    in three subjects by student A and by student B.
    Create   class   'Marks'   with   an   abstract   method
    'getPercentage' that will be returning the average
    percentage   of   marks.   Provide   implementation   of
    abstract   method   in   classes   'A'   and   'B'.   The
    constructor of student A takes the marks in three
    subjects as its parameters and the marks in four
    subjects as its parameters for student B. Test your
    code
     */

public class Task2 {

    public static void main(String[] args) {
        Marks marks=new A(10,20,30);
        Marks marks1=new B(20,30,40,50);
        marks.getPercentage();
        marks1.getPercentage();


    }
}
abstract class Marks{
    int subject1;
    int subject2;
    int subject3;
    int subject4;

    abstract void getPercentage();


}
class A extends Marks{

    public A(int subject1, int subject2, int subject3) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
    }

    @Override
    void getPercentage() {
        System.out.println((subject1+subject2+subject3)/3);

    }
}
class B extends Marks{
    public B(int subject1, int subject2, int subject3, int subject4) {
        this.subject1=subject1;
        this.subject2=subject2;
        this.subject3=subject3;
        this.subject4=subject4;
    }

    @Override
    void getPercentage() {
        System.out.println((subject1+subject2+subject3+subject4)/4);
    }
}
