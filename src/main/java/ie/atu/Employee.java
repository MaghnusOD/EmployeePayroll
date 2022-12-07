package ie.atu;

public class Employee {

    private String usr_name;
    private String usr_ppsid;
    private long usr_phone;
    private String usr_gender;
    private String usr_employ_type;
    private int usr_age;

    public Employee(){

    }

    public Employee(String usr_name, String usr_ppsid, long usr_phone, String usr_gender, String usr_employ_type, int usr_age){
        this.usr_name = usr_name;
        this.usr_ppsid = usr_ppsid;
        this.usr_phone = usr_phone;
        this.usr_gender = usr_gender;
        this.usr_employ_type = usr_employ_type;
        this.usr_age = usr_age;
    }

}
