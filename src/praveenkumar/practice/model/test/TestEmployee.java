package praveenkumar.practice.model.test;

import praveenkumar.practice.model.Employee;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee("Himanshhu",10);
//        employee.setAddress("Some Address emp 1");
//        employee.setName("Some Name emp 1");

        Employee employee1 = new Employee("Praveen",10);
//        employee1.setAddress("Some Address emp 2");
//        employee1.setName("Some Name emp 2");

        if (employee.equals(employee1)){
            System.out.println("1st if ---- >>>>> "+true);
        }


        if (employee == employee1){
            System.out.print("2nd if ---- >>>>> "+true);
        }else {
            System.out.println("else ---- >>>>> "+false);
        }
        System.out.println();

    }

}
