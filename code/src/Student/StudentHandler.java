package Student;

import java.util.HashMap;
import java.util.Map;

public class StudentHandler {
   
    public Long addStudent(String name,String department){
        Student st = new Student(name,department);
        Map output = st.getDetails();
        System.out.println(output);
        //System.out.println(output.get(name));
        StudentManager manager = new StudentManager(st);
        System.out.println(st);
        return Student.idMarker;
    }
    public void editStudent() {

    }

    public void deleteStudent() {
        
    }
    public void viewStudent() {

    }


}
