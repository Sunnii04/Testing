public class Main {

    public static class student {
        private String stuName;
        private String address;
        private int numCourse;

        public String getStuName() {
            return stuName;
        }

        public void setStuName(String stuName) {
            this.stuName = stuName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getNumCourse() {
            return numCourse;
        }

        public void setNumCourse(int numCourse) {
            this.numCourse = numCourse;
        }

        public student(String stuName, String address, int numCourse) {
            this.stuName = stuName;
            this.address = address;
            this.numCourse = numCourse;
        }

        public void ShowDetail(){
            System.out.println("Name: " + stuName);
            System.out.println("Address: " + address);
            System.out.println("Number of Course: " + numCourse);
        }
        public void Check() {
            if (numCourse > 5) {
                System.out.println("Error!!");
            }
        }
    }

    public static void main(String[] args) {

        student stu1 = new student("Sunny", "Phnom Penh", 7);
        stu1.ShowDetail();
        stu1.Check();
    }
}