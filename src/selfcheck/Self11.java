package selfcheck;

import java.io.*;

public class Self11 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/inputTest.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:/outputTest.txt"))) {
            String line;
            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // 줄 바꿈 추가
            }
            System.out.println("File");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
