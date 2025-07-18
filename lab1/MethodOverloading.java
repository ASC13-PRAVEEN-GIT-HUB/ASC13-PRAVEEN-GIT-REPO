package lab1;
public class MethodOverloading {

        public class Student {

        private int studentId;
        private String studentName;
        private String city;
        private int marks1;
        private int marks2;
        private int marks3;
        private float feePerMonth;
        private boolean isEligibleForScholarship;


        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setMarks1(int marks1) {
            this.marks1 = marks1;
        }

        public void setMarks2(int marks2) {
            this.marks2 = marks2;
        }

        public void setMarks3(int marks3) {
            this.marks3 = marks3;
        }

        public void setFeePerMonth(float feePerMonth) {
            this.feePerMonth = feePerMonth;
        }

        public void setIsEligibleForScholarship(boolean isEligible) {
            this.isEligibleForScholarship = isEligible;
        }


        public int getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public String getCity() {
            return city;
        }

        public int getMarks1() {
            return marks1;
        }

        public int getMarks2() {
            return marks2;
        }

        public int getMarks3() {
            return marks3;
        }

        public float getFeePerMonth() {
            return feePerMonth;
        }

        public boolean getIsEligibleForScholarship() {
            return isEligibleForScholarship;
        }


        public float getAnnualFee() {
            return feePerMonth * 12;
        }

        public int getTotalMarks() {
            return marks1 + marks2 + marks3;
        }

        public float getAverage() {
            return getTotalMarks() / 3.0f;
        }

        public String getResult() {
            if (marks1 > 60 && marks2 > 60 && marks3 > 60) {
                return "pass";
            } else {
                return "fail";
            }
        }
    }

    int add(int a, int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    String add(String a,int b){
        return  a +" " + b;
    }

    public static void main(String[] args) {
        MethodOverloading sc=new MethodOverloading();

        int sum1=sc.add(25,30);
        System.out.println(sum1);

        int sum2=sc.add(25,56,23);
        System.out.println(sum2);

        String sum3=sc.add("praveen",324);
        System.out.println(sum3);
    }
}
