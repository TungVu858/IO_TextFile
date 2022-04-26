import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        List<Integer> list = new ArrayList<>();
//        list.add(scanner.nextInt());
//        list.add(scanner.nextInt());
//        list.add(scanner.nextInt());
//        list.add(scanner.nextInt());
//        list.add(scanner.nextInt());
//        writeFile("Helloworld.txt",list);
       readFile("Helloworld1.txt");
    }

    public static void  readFile(String path){
        try {
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = "";
            while (true) {
                str = bufferedReader.readLine();
                if (str == null) {
                    break;
                }
                System.out.println(str);
            }
            bufferedReader.close();
        }catch (Exception e){
            System.err.println("Không có file");
        }
    }

    public static void writeFile(String path, List<Integer> list) throws IOException {
        FileWriter file = new FileWriter(path,true);
        BufferedWriter bufferedWriter = new BufferedWriter(file);
        String str = "";
        for (Integer integer : list) {
            str += integer;
            bufferedWriter.newLine();
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
    }
}
