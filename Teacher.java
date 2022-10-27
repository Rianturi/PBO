public class Teacher extends Person {
    String name, address;
    int numCourse;
    String[] courses;
    int[] grades;

    public Teacher(String name, String address) {
        super(name, address);
        numCourse = 0;
        courses = new String[30];
        grades = new int[30];
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourse] = course;
        grades[numCourse] = grade;
        ++numCourse;
    }

    public void printGrades() {
        System.out.print(this);
        for (int i = 0; i < numCourse; ++i) {
            System.out.print(" " + courses[i] + ":" + grades[i]);
        }
        System.out.println();
    }

    public double getAverageGrade() {
        int sum = 0;
        for (int i = 0; i < numCourse; ++i) {
            sum += grades[i];
        }
        return (double) sum / numCourse;
    }

    public String toString() {
        return "Teacher: " + super.toString();
    }
}
