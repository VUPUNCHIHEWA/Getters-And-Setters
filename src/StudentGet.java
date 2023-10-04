
public class StudentGet {
    // Task 2: Declare private instance variables
    private String name;
    private int age;
    private char grade;

    // Task 2: Implement Getters and Setters
    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        name = newName;
    }
    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int newAge) {
        age = newAge;
    }

    // Getter for grade
    public char getGrade() {
        return grade;
    }

    // Setter for grade
    public void setGrade(char newGrade) {
        grade = newGrade;
    }
    // Task 3: Display Student Information
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }
}
