import java.io.*;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("inp.txt");
        if (file.createNewFile()) {
            System.out.println("Tạo file mới!");
        } else {
            System.out.println("Đã có file này rồi!");
        }
        PrintWriter fileWriter = new PrintWriter("rs.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            fileWriter.println("Nghiệm là : " + (-b / a));
            fileWriter.println("Tổng : " + (a + b));
            fileWriter.println("Tích : " + a * b);
            if (a > b) {
                fileWriter.println("Max : " + a);
                fileWriter.println("Min : " + b);
            } else {
                fileWriter.println("Max : " + b);
                fileWriter.println("Min : " + a);
            }
        }
        fileWriter.close();
    }
}
