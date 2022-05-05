
import Student.StudentHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String name;
            String department;
            boolean isContinue = true;
            StudentHandler obj = new StudentHandler();
            while(isContinue) {
                System.out.println("Enter 1 for add operation" +
                        "Enter 2 for edit operation" +
                        "Enter 3 for delete operation" +
                        "Enter 4 for view operation");

                int decision = scan.nextInt();
                if(decision == 1) {
                    System.out.println("Enter the name and department");
                    scan.nextLine();
                     name = scan.nextLine();
                     department = scan.nextLine();
                    System.out.println(obj.addStudent(name,department));
                }
                else if(decision == 2) {
                    obj.editStudent();
                }
                else if(decision == 3) {
                    obj.deleteStudent();
                }
                else if(decision == 4) {
                    obj.viewStudent();
                }

                System.out.println("Enter 0 for exit this operation 1 for continue");
                int val = scan.nextInt();
                if(val==0) {
                    isContinue = false;
                }
            }

    }
}
