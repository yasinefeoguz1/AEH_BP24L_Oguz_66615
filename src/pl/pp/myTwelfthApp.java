import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dosya yollarını al
        System.out.print("Enter the path to the input text file: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter the path to the output text file: ");
        String outputFilePath = scanner.nextLine();

        // Dosyayı okuma ve satır sayısını hesaplama
        try {
            File inputFile = new File(inputFilePath);

            // Dosyanın varlığını kontrol et
            if (!inputFile.exists()) {
                System.out.println("File not found. Please provide a valid file.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            int lineCount = 0;

            // Satır sayısını hesapla
            while ((line = reader.readLine()) != null) {
                lineCount++;
            }

            reader.close();

            // Sonucu console'a yazdır
            System.out.println("The number of lines in the input file: " + lineCount);

            // Çıktıyı dosyaya yaz
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("File: " + inputFile.getName() + "\n");
            writer.write("Number of lines: " + lineCount);
            writer.close();

            System.out.println("The result has been written to the output file.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
