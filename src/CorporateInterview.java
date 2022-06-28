public class CorporateInterview {
    String profession;
    String name;
    int age;
    String gender;

    public CorporateInterview(String profession, String name, int age, String gender){
        this.profession=profession;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public void takesInterview(String profession){
        System.out.println(profession+" takes interview");
    }
    public void givesInterview() {
        System.out.println(profession + " gives interview");
    }

    public static void main(String[] args) {
        CorporateInterview HR = new CorporateInterview("Interviewer", "Pradnya", 25, "Female");
        CorporateInterview GradFresher = new CorporateInterview("Attendant", "Ganga", 22, "Female");
        HR.takesInterview("Interviewer");
    }

}




