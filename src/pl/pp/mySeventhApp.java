import java.util.Scanner;

public class mySeventhApp {

    public static void main(String[] args) {
        // Person class instance oluşturuluyor
        Person person = new Person("John", 25, "123 Main St", 1996);

        // Person'ın başlangıç durumunu yazdırıyoruz
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Address: " + person.address);
        System.out.println("Year of Birth: " + person.year_of_birth);

        // Scanner nesnesi ile kullanıcıdan veri alıyoruz
        Scanner scanner = new Scanner(System.in);

        // Yaş artırma metodu test edilmesi
        System.out.print("Enter years to grow older: ");
        int yearsToGrow = scanner.nextInt();
        person.growOld(yearsToGrow);
        System.out.println("After growing older: " + person.age);

        // Yaş azaltma metodu test edilmesi
        person.beYounger();
        System.out.println("After becoming younger: " + person.age);

        scanner.close();
    }
}

class Person {
    String name;
    int age;
    String address;
    int year_of_birth;

    // Constructor: Person sınıfı oluşturulurken parametre ile veriler alınır
    public Person(String name, int age, String address, int year_of_birth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    // Yaş artırma metodu (growOld)
    public void growOld(int years) {
        this.age += years;
    }

    // Yaş azaltma metodu (beYounger)
    public void beYounger() {
        this.age -= 1;
    }
}

