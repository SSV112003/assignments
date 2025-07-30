package practise;

import java.util.*;

class StudentQNO12 {
    private static int rollCounter = 1;
    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public StudentQNO12(String studName, int eng, int maths, int science) {
        this.rollNo = rollCounter++;
        this.studName = studName;
        this.marksInEng = eng;
        this.marksInMaths = maths;
        this.marksInScience = science;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudName() {
        return studName;
    }

    public int getMarksInEng() {
        return marksInEng;
    }

    public int getMarksInMaths() {
        return marksInMaths;
    }

    public int getMarksInScience() {
        return marksInScience;
    }

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}

class Standard {
    List<StudentQNO12> students;

    public Standard() {
        students = new ArrayList<>();

        students.add(new StudentQNO12("Alice", 85, 90, 88));
        students.add(new StudentQNO12("Bob", 78, 82, 80));
        students.add(new StudentQNO12("Charlie", 90, 95, 92));
        students.add(new StudentQNO12("David", 70, 75, 72));
        students.add(new StudentQNO12("Eve", 88, 84, 90));
        students.add(new StudentQNO12("Frank", 92, 87, 85));
        students.add(new StudentQNO12("Grace", 76, 89, 91));
        students.add(new StudentQNO12("Hannah", 84, 80, 86));
    }

    // 1. Ascending order by roll no
    public void displayStudentsByRollNo() {
        System.out.println("Students by Roll No:");
        students.stream()
                .sorted(Comparator.comparingInt(StudentQNO12::getRollNo))
                .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    // 2. Highest percentage
    public void displayTopperByPercentage() {
        StudentQNO12 topper = students.stream()
                .max(Comparator.comparingDouble(StudentQNO12::getPercentage))
                .orElse(null);

        if (topper != null) {
            System.out.println("\nTopper by Percentage:");
            System.out.println("Roll No: " + topper.getRollNo() + ", Name: " + topper.getStudName());
        }
    }

    // 3. Highest marks in Mathematics
    public void displayTopperByMaths() {
        StudentQNO12 mathTopper = students.stream()
                .max(Comparator.comparingInt(StudentQNO12::getMarksInMaths))
                .orElse(null);

        if (mathTopper != null) {
            System.out.println("\nTopper in Mathematics:");
            System.out.println("Roll No: " + mathTopper.getRollNo() + ", Name: " + mathTopper.getStudName());
        }
    }

    // 4. Ascending by total of Maths + Science
    public void displayByMathsAndScienceTotal() {
        System.out.println("\nStudents by Maths + Science Total:");
        students.stream()
                .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
                .forEach(s -> System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName()));
    }

    // 5. Rank by percentage in descending order
    public void displayStudentsWithRank() {
        System.out.println("\nAll Students with Total, Percentage and Rank:");

        List<StudentQNO12> sorted = new ArrayList<>(students);
        sorted.sort((s1, s2) -> Double.compare(s2.getPercentage(), s1.getPercentage()));

        int rank = 1;
        for (StudentQNO12 s : sorted) {
            System.out.printf("Roll No: %d, Name: %s, Total: %d, Percentage: %.2f, Rank: %d\n",
                    s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage(), rank++);
        }
    }
}

public class QNO12 {
    public static void main(String[] args) {
        Standard std = new Standard();

        std.displayStudentsByRollNo();
        std.displayTopperByPercentage();
        std.displayTopperByMaths();
        std.displayByMathsAndScienceTotal();
        std.displayStudentsWithRank();
    }
}

