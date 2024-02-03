package Collection;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class studentCollection {

    private ArrayList<Student>studentArrayList = new ArrayList<>();

    public studentCollection() {
    }

    public void save (Student student){

        studentArrayList.add(student);
       // studentArrayList.add(1,student);
        System.out.println("Successfully added");

    }

    public void update(int index ,Student student){

        studentArrayList.set(index,student);

    }

    public void delete(int index){
        studentArrayList.remove(index);
    }

    public int search(String id){

        int result = -1;

        for (int i = 0 ; i < studentArrayList.size() ; i++){

            if(studentArrayList.get(i).getId().equals(id)){
                result = i ;
                break;
            }
        }

        return result;

    }

    public Student getStudent(String id){
        Student student = null;

        for (int i = 0 ; i < studentArrayList.size() ; i++){

            if(studentArrayList.get(i).getId().equals(id)){
                student = studentArrayList.get(i) ;
                break;
            }
        }

        return student;
    }


    public void print (){
        studentArrayList.toString();

    }

}
