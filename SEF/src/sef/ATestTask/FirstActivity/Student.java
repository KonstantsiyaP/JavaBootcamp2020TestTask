package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
    private String schoolName;

    public String companyName() {
        return schoolName;
    }

    public void getCompanyName(String companyName) {
        this.schoolName = companyName;
    }

    public String announce() {
        String personAnnounce = super.announce();
        return personAnnounce + "I study at" + schoolName;
    }
}