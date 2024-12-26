import javax.xml.transform.Source;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        student[0] = new Student("Maks", "rafas", 4.0);
        student[1] = new Student();
        student[1].setName("Abai");
        student[1].setSurname("Qunanbayev");
        student[1].setGpa(4.00);
        System.out.println(student[0]);
        System.out.println(student[1]);
    }
}