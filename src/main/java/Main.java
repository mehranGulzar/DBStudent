import model.Student;
import model.StudentDB;
import model_1.ComputerScinceStudent;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {




        ComputerScinceStudent computerScinceStudent = new ComputerScinceStudent("felix", 12, "Java");

        System.out.println(computerScinceStudent.toString());



        computerScinceStudent.sayHi();

    }
}
