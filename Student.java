package day10;

import java.util.Scanner;

public class Student {//Take input student name,Student ID, Student Subjects,Students Score, 
    //print All data..... Encapsulation Class where all of it is private
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name;
        int id;
        String subject;
        int score;
        information i1= new information();
        System.out.println("Enter Students Name");
        name=sc.next();
        i1.setName(name);
        System.out.println("Enter Students ID");
        id=sc.nextInt();
        i1.setId(id);
        System.out.println("Enter Students Subject");
        subject=sc.next();
        i1.setSubject(subject);
        System.out.println("Enter Students Score");
        score= sc.nextInt();
        i1.setScore(score);
        sc.close();
    }
}
class information{
        private String name;
        private int id;
        private String subject;
        private int score;
        void setName(String name){
            this.name=name;
        }
        void setId(int id){
            this.id=id;
        }
        void setSubject(String subject){
            this.subject=subject;
        }
        void setScore(int score){
            this.score=score;
        }
        void Percentage(){
            System.out.println("the Percentage is"+ score/100+"%");
        }
        String getName(){
            return this.name;
        }
        int getId(){
            return this.id;
        }
        String getSubject(){
            return this.subject;
        }
}
