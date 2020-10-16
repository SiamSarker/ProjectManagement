package inheritance;

public class Teacher extends Person {

    String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    void displayInformation2(){
        displayInformation();
        System.out.println(getQualification());
    }
}
