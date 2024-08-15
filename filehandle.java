package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandle{
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("practice.txt");
        BufferedReader br = new BufferedReader(fr);
        String rr=br.readLine();   
        char[] chars = rr.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (chars[j] > chars[j+1]) {
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;
                }
            }
        }
        String sorted = new String(chars);
        System.out.println(sorted);
        File file = new File("practice.txt");
        file.createNewFile();
        FileWriter fw = new FileWriter("practice.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sorted);
        bw.close();    }
}