import java.io.*;
import java.util.*;

public class myThirteenthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan input ve output dosya yollarını al
        System.out.print("Enter the path to the input text file: ");
        String inputFilePath = scanner.nextLine();

        System.out.print("Enter the path to the output text file: ");
        String outputFilePath = scanner.nextLine();

        // Dosya okuma ve kelimeleri sayma
        try {
            File inputFile = new File(inputFilePath);

            if (!inputFile.exists()) {
                System.out.println("File not found. Please provide a valid file.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            int wordCount = 0;
            Map<String, Integer> wordOccurrences = new HashMap<>();

            // Dosyayı satır satır oku ve kelimeleri say
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;

                for (String word : words) {
                    word = word.toLowerCase(); // Kelimeleri küçük harfe çevir
                    wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
                }
            }

            reader.close();

            // Sonuçları console'a yazdır
            System.out.println("Total word count: " + wordCount);
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Çıktıyı output dosyasına yaz
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            writer.write("File: " + inputFile.getName() + "\n");
            writer.write("Total word count: " + wordCount + "\n");
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            writer.close();

            System.out.println("Results have been written to the output file.");

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
