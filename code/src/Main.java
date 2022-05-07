


import java.util.*;


public class Main {
    public static  void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String name;
            String department;
            boolean isContinue = true;
            Long id = 0L;
            Main main = new Main();
        Map<Long, Map<String,Object>> mapName = new HashMap<>();

            while(isContinue) {
                System.out.println("Enter 1 for add operation" +
                        "Enter 2 for edit operation" +
                        "Enter 3 for delete operation" +
                        "Enter 4 for view operation");

                int decision = scan.nextInt();
                if(decision == 1) {
                    id++;
                    System.out.println("Enter the name and department");
                    scan.nextLine();
                     name = scan.nextLine();
                     department = scan.nextLine();
                    System.out.println(addStudent(name,department,id,mapName));
                }
                else if(decision == 2) {
                    System.out.println("Enter the id");
                    System.out.println("Enter the field that you want to edit");
                    main.editStudent();
                }
                else if(decision == 3) {
                   main.deleteStudent();
                }
                else if(decision == 4) {
                    main.viewAllStudent(mapName);
                }

                System.out.println("Enter 0 for exit this operation 1 for continue");
                int val = scan.nextInt();
                if(val==0) {
                    isContinue = false;
                }
            }

    }

    public static  Long addStudent(String name, String department, Long id,Map mapName) {
        Map<String, Object> details = new HashMap<>();
        details.put("id", id);
        details.put("name", name);
        details.put("department", department);
        System.out.println(details);
        mapName.put(id,details);
        System.out.println(mapName);
        return id;
    }
    public void editStudent() {

    }
    public void deleteStudent() {

    }
    public void viewStudent() {

    }
    public void viewAllStudent(Map mapName) {
        for (Object key : mapName.keySet()) {
            System.out.println(key + ":" + mapName.get(key));
        }
    }
}
