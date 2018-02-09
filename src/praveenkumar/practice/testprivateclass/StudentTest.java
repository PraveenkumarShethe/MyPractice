package praveenkumar.practice.testprivateclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class StudentTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method student = Student.class.getDeclaredMethod("roll", String.class);
        student.setAccessible(true);
        String s = (String) student.invoke(student, "Praveen");
        System.out.println(s);

    }

}
