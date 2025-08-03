class Student {
    void study() {
        System.out.println("Student is studying general subjects.");
    }
}
class CollegeStudent extends Student {

    @Override
    void study() {
        System.out.println("College student is studying Computer Science.");
    }
}

public class OverridingStudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.study();

        CollegeStudent cs1 = new CollegeStudent();
        cs1.study();

        Student s2 = new CollegeStudent();
        s2.study();
    }
}
