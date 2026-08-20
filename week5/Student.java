public class Student {
    // Private instance variables
    private String studentID;
    private String name;
    private double cgpa;
    private String programme; // Added requirement 3.1

    // Setter for studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for cgpa
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    // Setter for programme
    public void setProgramme(String programme) {
        this.programme = programme;
    }

    // Getter for studentID
    public String getStudentID() {
        return this.studentID;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Getter for cgpa
    public double getCGPA() {
        return this.cgpa;
    }

    // Getter for programme
    public String getProgramme() {
        return this.programme;
    }
}