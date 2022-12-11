package ie.atu;


public class UserInfo {

    private String usr_name;
    private String usr_occupation;
    private int usr_age;

    public UserInfo(){}

    public UserInfo(String usr_name, String usr_occupation, int age){
        this.usr_name = usr_name;
        this.usr_occupation = usr_occupation;
        this.usr_age = age;
    }


    public String getUsr_name() {
        return usr_name;
    }

    public void setUsr_name(String usr_name) {
        if(usr_name.toCharArray().length >= 3){
            this.usr_name = usr_name;
        } else {
            throw new IllegalArgumentException("Name too short, must be more than 2 letters");
        }
    }

    public String getUsr_occupation() {
        return usr_occupation;
    }

    public void setUsr_occupation(String usr_occupation) {
        switch (usr_occupation) {
            case "Student":
            case "STUDENT":
            case "student":
                this.usr_occupation = "student";
                break;
            case "Elderly":
            case "ELDERLY":
            case "elderly":
                this.usr_occupation = "elderly";
                break;
            case "Family":
            case "FAMILY":
            case "family":
                this.usr_occupation = "family";
                break;
            case "Individual":
            case "INDIVIDUAL":
            case "individual":
                this.usr_occupation = "individual";
                break;
            default:
                throw new IllegalArgumentException("Wrong input please try again");
        }
    }

    public int getUsr_age () {
        return usr_age;
    }

    public void setUsr_age(int usr_age) {
        if(usr_age > 16){
            this.usr_age = usr_age;
        } else {
            throw new IllegalArgumentException("Below age to purchase ticket without permission");
        }
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "usr_name='" + usr_name + '\'' +
                ", usr_occupation='" + usr_occupation + '\'' +
                ", usr_age=" + usr_age +
                '}';
    }
}
