package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;
    @BeforeEach
    void setUp() {
        employee = new Employee("Johnny", "J36482", "08712345678", "Male", "Full-time", 27);
        //
    }

    @Test
    void setUsr_name() {
        String test_name = "Johnny";
        assertEquals(test_name, employee.getUsr_name());
    }

    @Test
    void setUsr_ppsid() {
        String test_ppsid = "J36482";
        assertEquals(test_ppsid, employee.getUsr_ppsid());
    }

    @Test
    void setUsr_phone() {
        String test_phone = "08712345678";
        assertEquals(test_phone, employee.getUsr_phone());
    }

    @Test
    void setUsr_gender() {
        String test_gender = "Male";
        assertEquals(test_gender, employee.getUsr_gender());
    }

    @Test
    void setUsr_employ_type() {
        String test_employ = "Full-time";
        assertEquals(test_employ, employee.getUsr_employ_type());
    }

    @Test
    void setUsr_age() {
        int test_age = 27;
        assertEquals(test_age, employee.getUsr_age());
    }

    @AfterEach
    void tearDown() {
    }
}