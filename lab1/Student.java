package lab1;


public class Student{
    private int studentId;
    private String studentName;
    private String city;
    private int marks1;
    private int marks2;
    private int marks3;
    private float feePerMonth;
    private boolean isEligibleForScholarship;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public float getFeePerMonth() {
        return feePerMonth;
    }

    public void setFeePerMonth(float feePerMonth) {
        this.feePerMonth = feePerMonth;
    }

    public boolean isEligibleForScholarship() {
        return isEligibleForScholarship;
    }

    public void setEligibleForScholarship(boolean eligibleForScholarship) {
        isEligibleForScholarship = eligibleForScholarship;
    }

    //add-on methods
    public float getAnnualFee() {
        return feePerMonth * 12;
    }

    public int getTotalMarks() {
        return marks1 + marks3 + marks2;
    }

    public float getAverage() {
        return getFeePerMonth() / 3.0f;
    }

    public String getResult() {
        if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
            return "pass";
        } else {
            return "fail";
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setStudentId(101);
        s1.setStudentName("Alice");
        s1.setCity("New York");
        s1.setMarks1(85);
        s1.setMarks2(78);
        s1.setMarks3(92);
        s1.setFeePerMonth(500.0f);
        s1.setEligibleForScholarship(true);

        s2.setStudentId(102);
        s2.setStudentName("Bob");
        s2.setCity("Los Angeles");
        s2.setMarks1(65);
        s2.setMarks2(70);
        s2.setMarks3(75);
        s2.setFeePerMonth(450.0f);
        s2.setEligibleForScholarship(false);

        s3.setStudentId(103);
        s3.setStudentName("Charlie");
        s3.setCity("Chicago");
        s3.setMarks1(55);
        s3.setMarks2(68);
        s3.setMarks3(72);
        s3.setFeePerMonth(400.0f);
        s3.setEligibleForScholarship(true);

        Student[] students = {s1, s2, s3};

        Student topStudent = students[0];
        for (Student s : students) {
            if (s.getTotalMarks() > topStudent.getTotalMarks()) {
                topStudent = s;
            }
        }
        System.out.println("Student with highest total marks: " + topStudent.getStudentName());

        Student lowestFeeStudent = students[0];
        for (Student s : students) {
            if (s.getFeePerMonth() < lowestFeeStudent.getFeePerMonth()) {
                lowestFeeStudent = s;
            }
        }
        System.out.println("Student paying least monthly fee: "
                + lowestFeeStudent.getStudentName()
                + " with fee $" + lowestFeeStudent.getFeePerMonth());

        System.out.println("\nDetails of each student:");
        for (Student s : students) {
            System.out.println(" ");
            System.out.println("Name: " + s.getStudentName());
            System.out.println("Total Marks: " + s.getTotalMarks());
            System.out.printf("Average Marks: %.2f%n", s.getAverage());
            System.out.println("Result: " + s.getResult());
            System.out.println("Eligible for Scholarship: " + s.isEligibleForScholarship());
            System.out.printf("Annual Fee: Rs. %.2f%n", s.getAnnualFee());
        }
    }
}
