import java.util.Arrays;
import java.util.List;

public class myEleventhApp {

    public static void main(String[] args) {
        // Öğrenci listesi
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // En yüksek ortalamayı bulan öğrenci
        Student topStudent = findTopStudent(students);
        System.out.println("Student with the highest average: " + topStudent.getFirstName() + " " + topStudent.getLastName() + " (" + topStudent.getIndexNumber() + ") - Average: " + topStudent.calculateAverage());

        // Öğrencileri soyadlarına göre sıralayıp yazdırma
        students.stream()
                .sorted((s1, s2) -> s1.getLastName().compareTo(s2.getLastName()))
                .forEach(student -> System.out.println(student.getFirstName() + " " + student.getLastName() + " (" + student.getIndexNumber() + ") - Average: " + student.calculateAverage()));
    }

    // En yüksek ortalamaya sahip öğrenciyi bulan metod
    public static Student findTopStudent(List<Student> students) {
        return students.stream()
                .max((s1, s2) -> Double.compare(s1.calculateAverage(), s2.calculateAverage()))
                .orElseThrow(() -> new RuntimeException("No students found"));
    }
}

// Öğrenci sınıfı
class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;

    // Constructor
    public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
        this.indexNumber = indexNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    // Getter metodları
    public String getIndexNumber() {
        return indexNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    // Ortalama hesaplama
    public double calculateAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}

