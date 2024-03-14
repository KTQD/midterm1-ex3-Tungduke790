import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileIn = "input.txt";
        String fileOut = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileIn));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            String replacedWord = content.toString().replaceAll("Nha Trang", "Vũng Tàu");

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOut));
            writer.write(replacedWord);
            writer.close();

            System.out.println("OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
