package ie.atu;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Employee employee = new Employee();

        // employee info
        employee.setUsr_name("Morgan");
        employee.setUsr_ppsid("G24852");
        employee.setUsr_phone("08712345678");
        employee.setUsr_gender("male");
        employee.setUsr_employ_type("Full-time");
        employee.setUsr_age(32);

        System.out.println(employee.toString());

        System.out.print("\nGood morning " + employee.getUsr_name() + ", today is " + LocalDate.now());
    }
}
