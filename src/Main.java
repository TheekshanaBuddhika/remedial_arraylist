import Collection.studentCollection;
import Model.Student;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static studentCollection collection = new studentCollection();

    public static void main(String[] args) {

        getSave();

    }

    public static void getSave(){

        System.out.print("Enter student id : - ");
        String id =  scanner.next();

        System.out.print("Enter student age : - ");
        int age =  scanner.nextInt();

        System.out.print("Enter student dbmarks : - ");
        double dbm =  scanner.nextDouble();

        System.out.print("Enter student prfmarks : - ");
        double prf =  scanner.nextDouble();

        Student student = new Student(id,age,dbm,prf);
        collection.save(student);

    }

    public static void getUpdate(){

        System.out.print("Enter student id : - ");
        String id =  scanner.next();

        int search = collection.search(id);

        if(search>-1){

            System.out.print("Enter student new id : - ");
            String nid =  scanner.next();

            System.out.print("Enter student age : - ");
            int age =  scanner.nextInt();

            System.out.print("Enter student dbmarks : - ");
            double dbm =  scanner.nextDouble();

            System.out.print("Enter student prfmarks : - ");
            double prf =  scanner.nextDouble();


            Student student = collection.getStudent(id);

            student.setId(nid);
            student.setAge(age);
            student.setDbm(dbm);
            student.setPrf(prf);

            collection.update(search,student);

        }

    }

    public static void getDelete(){

        System.out.print("Enter student id : - ");
        String id =  scanner.next();

        int search = collection.search(id);

        if(search>-1){

            collection.delete(search);

        }

    }

}
