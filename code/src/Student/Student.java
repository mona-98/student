package Student;

import java.util.HashMap;

import java.util.Map;

public class Student {
    public static long idMarker = 0L;

    private final long id;
    private final String name;
    private final String department;

    public Student(String name, String department) {
        idMarker = idMarker + 1;
        id = idMarker;
        this.name = name;
        this.department = department;
    }

    Map<String, Object> getDetails() {
        Map<String, Object> details = new HashMap<>();
        details.put("id", id);
        details.put("name", name);
        details.put("department", department);
        return details;
    }
}