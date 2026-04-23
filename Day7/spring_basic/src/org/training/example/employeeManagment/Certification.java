package org.training.example.employeeManagment;

public class Certification {
    private int no;
    private String subject;

    public Certification(int no, String subject) {
        this.no = no;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Certification{" +
                "no=" + no +
                ", subject='" + subject + '\'' +
                '}';
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
