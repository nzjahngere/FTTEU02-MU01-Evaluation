class Student {

    String topper;

    void printTopperStudent () {
        System.out.println("This student got the 1st Rank in the class: ");
    }
}

    class StudentDetails extends Student { // Applied inheritance
        String studentName;
        int rollNo;
        String school;
        protected String studentEmail; // encapsulation : data hiding where to protect unnecessary information i used protected keyword.

        // encapsulation is bringing related methods and classes within one single classes (encapsulated within a single class) and in it comes data hiding and i've achieved that by using 'protected' keyword.

        void printStudentName (String name) { // polymorphism implemented : where one methods can have different behaiors but they should have different parameters...
            System.out.println("This student got the 1st Rank in the class: ");
    }

        void printStudentName(String name, int rank) {
            System.out.println("Name: " + this.studentName);
        }

        void rollNo() {
            System.out.println("Name: " + this.rollNo);
        }

        void printSchool() {
            System.out.println("School: " + this.school);
        }

        void printStudentEmail() {
            System.out.println("Email ID: " + this.studentEmail);
        }
    }

    class Course {
        String courseName;
        String gradeName;
        String section;

        void printCourseName() {
            System.out.println("Course Name: " + courseName);
        }

         void gradeName() {
            System.out.println("Course Name: " + gradeName);
        }

         void printSection() {
            System.out.println("Course Name: " + section);
        }

    }

public class ProgressTrackerApp { //main class
    public static void main(String[] args) { //main method

        /*Student theTopper = new Student();
        theTopper.topper = "Student Nazish has topped in 12th Grade";

        theTopper.printTopperStudent(); */


        StudentDetails sd1 = new StudentDetails(); // creating objects and self-bulit constructors to access the class's properties...
        sd1.studentName = "Nazish Jehangir";
        sd1.rollNo = 123456;
        sd1.school = "Vijay Mandir Sr. Sec. School";
        sd1.studentEmail = "nj@gmail.com";

        Course c1 = new Course();
        c1.courseName = "Science";
        c1.gradeName = "12th";
        c1.section = "A";

        System.out.println(sd1.studentName);
        sd1.rollNo();
        sd1.printSchool();

        c1.printCourseName();
        c1.printSection();
        c1.gradeName();

        System.out.println("================================");

        StudentDetails sd2 = new StudentDetails();
        sd2.studentName = "Arati Prajapat";
        sd2.rollNo = 789101;
        sd2.school = "Mahatma Gandhi Sr. Sec. School";
        sd2.studentEmail = "ap@gmail.com";

        Course c2 = new Course();
        c2.courseName = "Arts";
        c2.gradeName = "11th";
        c2.section = "A";

        System.out.println(sd2.studentName);
        sd2.rollNo();
        sd2.printSchool();

        c2.printCourseName();
        c2.printSection();
        c2.gradeName();

        System.out.println("================================");

        StudentDetails sd3 = new StudentDetails();
        sd3.studentName = "Khushi Bothra";
        sd3.rollNo = 445566;
        sd3.school = "Vidya Mandir Sr. Sec. School";
        sd3.studentEmail = "kb@gmail.com";

        Course c3 = new Course();
        c3.courseName = "Commerce";
        c3.gradeName = "12th";
        c3.section = "A";

        System.out.println(sd2.studentName);
        sd3.rollNo();
        sd3.printSchool();

        c3.printCourseName();
        c3.printSection();
        c3.gradeName();

        System.out.println("================================");

        StudentDetails sd4 = new StudentDetails();
        sd4.studentName = "Vivek Dahiya";
        sd4.rollNo = 122233;
        sd4.school = "St. Joseph Sr. Sec. School";
        sd4.studentEmail = "vd@gmail.com";

        Course c4 = new Course();
        c4.courseName = "Agriculture";
        c4.gradeName = "11th";
        c4.section = "B";

        System.out.println(sd2.studentName);
        sd4.rollNo();
        sd4.printSchool();

        c4.printCourseName();
        c4.printSection();
        c4.gradeName();

        System.out.println("================================");

        StudentDetails sd5 = new StudentDetails();
        sd5.studentName = "Rohit Bothra";
        sd5.rollNo = 788899;
        sd5.school = "Akanksha Covenant School";
        sd5.studentEmail = "rb@gmail.com";

        Course c5 = new Course();
        c5.courseName = "Commerce";
        c5.gradeName = "12th";
        c5.section = "B";

        System.out.println(sd2.studentName);
        sd5.rollNo();
        sd5.printSchool();

        c5.printCourseName();
        c5.printSection();
        c5.gradeName();

        System.out.println("================================");
        
    }
}






























/* class Student2 extends Student {
        String studentName;
        String studentCode;
        static String school; //here i declared schoolName with static keyword because school name remains same for all students.
        protected String studentEmail; // encapsulation : data hiding where to protect unnecessary information i used protected keyword.

        void printStudentName(String str) {
            System.out.println("Name: " + studentName);
        }

        void printStudentCode(String str) {
            System.out.println("Name: " + studentCode);
        }

        void printSchool(String str) {
            System.out.println("School: " + school);
        }

        void printStudentEmail(String str) {
            System.out.println("Email ID: " + studentEmail);
        }
    }

    class Student3 extends Student {
        String studentName;
        String studentCode;
        static String school; //here i declared schoolName with static keyword because school name remains same for all students.
        protected String studentEmail; // encapsulation : data hiding where to protect unnecessary information i used protected keyword.

        void printStudentName(String str) {
            System.out.println("Name: " + studentName);
        }

        void printStudentCode(String str) {
            System.out.println("Name: " + studentCode);
        }

        void printSchool(String str) {
            System.out.println("School: " + school);
        }

        void printStudentEmail(String str) {
            System.out.println("Email ID: " + studentEmail);
        }
    }

    class Student4 extends Student {
        String studentName;
        String studentCode;
        static String school; //here i declared schoolName with static keyword because school name remains same for all students.
        protected String studentEmail; // encapsulation : data hiding where to protect unnecessary information i used protected keyword.

        void printStudentName(String str) {
            System.out.println("Name: " + studentName);
        }

        void printStudentCode(String str) {
            System.out.println("Name: " + studentCode);
        }

        void printSchool(String str) {
            System.out.println("School: " + school);
        }

        void printStudentEmail(String str) {
            System.out.println("Email ID: " + studentEmail);
        }
    }

    class Student5 extends Student {
        String studentName;
        String studentCode;
        static String school; //here i declared schoolName with static keyword because school name remains same for all students.
        protected String studentEmail; // encapsulation : data hiding where to protect unnecessary information i used protected keyword.

        void printStudentName(String str) {
            System.out.println("Name: " + studentName);
        }

        void printStudentCode(String str) {
            System.out.println("Name: " + studentCode);
        }

        void printSchool(String str) {
            System.out.println("School: " + school);
        }

        void printStudentEmail(String str) {
            System.out.println("Email ID: " + studentEmail);
        }
    } */
