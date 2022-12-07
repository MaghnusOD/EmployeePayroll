package ie.atu;

public class Employee {

    private String usr_name;
    private String usr_ppsid;
    private String usr_phone;
    private String usr_gender;
    private String usr_employ_type;
    private int usr_age;

    public Employee(){

    }

    public Employee(String usr_name, String usr_ppsid, String usr_phone, String usr_gender, String usr_employ_type, int usr_age){
        this.usr_name = usr_name;
        this.usr_ppsid = usr_ppsid;
        this.usr_phone = usr_phone;
        this.usr_gender = usr_gender;
        this.usr_employ_type = usr_employ_type;
        this.usr_age = usr_age;
    }


    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        String buffer = usr_name;

        if(buffer.toCharArray().length < 5 && buffer.toCharArray().length > 22){
            throw new IllegalArgumentException("INVALID NAME, MUST BE BETWEEN 5-22 CHARACTER");
        } else {
            this.usr_name = usr_name;
        }

    }

    public String getUsr_ppsid() {
        return usr_ppsid;
    }

    public void setUsr_ppsid(String usr_ppsid) {
        String buffer = usr_ppsid;

        if(buffer.toCharArray().length < 6 && buffer.toCharArray().length > 6){
            throw new IllegalArgumentException("INVALID PPS ID, CANNOT BE LESS/GREATER THAN 6 DIGITS");
        } else {
            this.usr_ppsid = usr_ppsid;
        }
    }

    public String getUsr_phone() {
        return usr_phone;
    }

    public void setUsr_phone(String usr_phone) {
        String buffer = usr_phone;

        if(buffer.length() < 11 && buffer.length() > 11){
            throw new IllegalArgumentException("PHONE NUMBER INVALID, CANNOT BE LESS/GREATER THAN 11 DIGITS");
        } else {
            this.usr_phone = usr_phone;
        }
    }

    public String getUsr_gender() {
        return usr_gender;
    }

    public void setUsr_gender(String usr_gender) {
        String buffer = usr_gender;

        switch (buffer){
            case "male":
            case "Male":
            case "MALE":    this.usr_gender = "male";
                break;
            case "female":
            case "Female":
            case "FEMALE":  this.usr_gender = "female";
                break;
            case "non-binary":
            case "Non-binary":
            case "NON-BINARY":  this.usr_gender = "non-binary";
                break;
            default: throw new IllegalArgumentException("INVALID INPUT, PLEASE ENTER CORRECT INPUT");
        }
    }

    public String getUsr_employ_type() {
        return usr_employ_type;
    }

    public void setUsr_employ_type(String usr_employ_type) {
        String buffer = usr_employ_type;

        switch(buffer){
            case "full":
            case "Full":
            case "FULL":    this.usr_employ_type = "full-time";
                break;
            case "part":
            case "Part":
            case "PART":    this.usr_employ_type = "part-time";
                break;
            default:    throw new IllegalArgumentException("INVALID INPUT, PLEASE ENTER 'FULL' OR 'PART'");
        }
    }

    public int getUsr_age() {
        return usr_age;
    }

    public void setUsr_age(int usr_age) {

        if(usr_age <=18){
            throw new IllegalArgumentException("INVALID AGE, MUST BE OVER 18 TO BE EMPLOYED");
        }   else {
            this.usr_age = usr_age;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "usr_name='" + usr_name + '\'' +
                ", usr_ppsid='" + usr_ppsid + '\'' +
                ", usr_phone=" + usr_phone +
                ", usr_gender='" + usr_gender + '\'' +
                ", usr_employ_type='" + usr_employ_type + '\'' +
                ", usr_age=" + usr_age +
                '}';
    }
}
