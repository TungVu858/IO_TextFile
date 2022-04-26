import java.io.*;

public class ChuaTest2 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("a");
        fileWriter.write("abc123");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("abcbc1234");
        bufferedWriter.newLine();
        bufferedWriter.write("àasfa");
        bufferedWriter.close();
        FileReader fileReader = new FileReader("country.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";
        while (true) {
            str = bufferedReader.readLine();
            if (str == null) {
                break;
            }
            System.out.println(str);
        }
    }
}
