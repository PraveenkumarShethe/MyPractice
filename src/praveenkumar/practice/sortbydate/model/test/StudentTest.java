package praveenkumar.practice.sortbydate.model.test;

import praveenkumar.practice.sortbydate.model.Student;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StudentTest {

    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

        student.setId(1);
        student1.setId(2);
        student2.setId(3);
        student3.setId(4);
        student4.setId(5);
        student5.setId(6);

        student.setName("S");
        student1.setName("A");
        student2.setName("X");
        student3.setName("Z");
        student4.setName("D");
        student5.setName("C");

        student.setDobDate(dateFormat.parse("02-02-14"));
        student1.setDobDate(dateFormat.parse("04-02-19"));
        student2.setDobDate(dateFormat.parse("06-02-19"));
        student3.setDobDate(dateFormat.parse("07-02-19"));
        student4.setDobDate(dateFormat.parse("08-02-19"));
        student5.setDobDate(dateFormat.parse("12-02-19"));



    }
}
