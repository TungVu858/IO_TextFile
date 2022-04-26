import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("output.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
    }
}
