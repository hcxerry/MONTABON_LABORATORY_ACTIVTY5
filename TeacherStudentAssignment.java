class Person { //PARENT CLASS
    protected String name;
    
    protected int age;
    
    protected String gender;
    
    
public Person(String name, int age, String gender) {
    this.name = name;
        
    this.age = age;
    
    this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
       
        System.out.println("Age: " + age);
        
        System.out.println("Gender: " + gender);
    }
}
class Student extends Person { //STUDENT INHERITS FROM PERSON
    private String studentId;
          public Student(String name, int age, String gender, String studentId) {
       
    super(name, age, gender);
        
    this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("--- Student Information ---");
        displayInfo();
        
        System.out.println("Student ID: " + studentId);
    }
}
class Course {
    private String courseCode;
    
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
    }
    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}

class Teacher extends Person { //TEACHER INHERITS FROM PERSON
    
    private String department;
    
    private Course[] courses; 

    public Teacher(String name, int age, String gender, String department, Course[] courses) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
    }

    public void displayTeacher() {
        System.out.println("--- Teacher Information ---");
        displayInfo();
        
        System.out.println("Department: " + department);
        
        System.out.println("Courses Handled:");
        for (Course c : courses) {
            System.out.println("    " + c.toString());
        }
    }
}

public class TeacherStudentAssignment {
    public static void main(String[] args) {

        //OUTPUT
        System.out.println("1. Example of Student Information");
        
        Student s = new Student("Ana Santos", 19, "Female", "S1023");
        
        s.displayStudent();
        
        System.out.println();

        System.out.println("2. Example of Teacher Information");
        
        Course c1 = new Course("CS101", "Programming Fundamentals");
        
        Course c2 = new Course("CS102", "Object-Oriented Programming");
        
        Course[] teacherCourses = { c1, c2 };
        
        Teacher t = new Teacher("Mr. Dela Cruz", 45, "Male", "Computer Studies", teacherCourses);
        
        t.displayTeacher();
        
        System.out.println();

        System.out.println("3. Course");
        
        c1.displayCourse();
    }
}

// Cherry R. Montabon 
// AI THAT USE ChatGPT-5 
// Conversation of AI 
// https://chatgpt.com/share/68ff6a33-60e8-8005-9050-4eea8050df5c


