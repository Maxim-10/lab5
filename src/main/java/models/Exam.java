package models;

public class Exam {
    private String studentName;
    private String studentSurname;
    private String studentMiddlename;
    private String Discipline;
    private int Mark;

    @Override
    public String toString() {
        return "Exam{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentMiddlename='" + studentMiddlename + '\'' +
                ", Discipline='" + Discipline + '\'' +
                ", Mark=" + Mark +
                '}';
    }

    public Exam(String studentName, String studentSurname, String studentMiddlename, String discipline, int mark) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentMiddlename = studentMiddlename;
        Discipline = discipline;
        Mark = mark;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void setStudentMiddlename(String studentMiddlename) {
        this.studentMiddlename = studentMiddlename;
    }

    public void setDiscipline(String discipline) {
        Discipline = discipline;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public String getFullName() {
        return studentName + '_' + studentSurname + '_' + studentMiddlename;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getStudentMiddlename() {
        return studentMiddlename;
    }

    public String getDiscipline() {
        return Discipline;
    }

    public int getMark() {
        return Mark;
    }
}
