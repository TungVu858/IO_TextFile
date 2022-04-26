import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn : ");
        String link = sc.nextLine();
        readFile(link);
        File file = new File(link);
    }

    public static void readFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";
            int sum = 0;
            while (true) {
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                }
                System.out.println(str);
                sum += Integer.parseInt(str);
            }
            bufferedReader.close();
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Không có file");
        }

    }
}
