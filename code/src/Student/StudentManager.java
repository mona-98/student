package Student;

import java.util.HashMap;

public class StudentManager {
       HashMap<Long,Student> details = new HashMap<Long,Student>();
       StudentManager(Student st) {
            details.put(Student.idMarker,st);
              System.out.println(details);
       }
}
