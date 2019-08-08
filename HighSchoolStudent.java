public class HighSchoolStudent extends Student {
    public HighSchoolStudent(String schoolName) {
        super(schoolName);
    }

    public String toString(){
        return "high school student at" + super.toString;
    }
}