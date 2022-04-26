package thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Find_Max {
    public List<Integer> readFile(String filepath) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                list.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Không tồn tại file ");
        }
        return list;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fw = new FileWriter(filePath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Giá trị lớn nhất là : " + max);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception ignored) {

        }
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (Integer integer : list) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Find_Max findMax = new Find_Max();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(9);
        integerList.add(8);
        integerList.add(15);
        integerList.add(26);
        integerList.add(2);
        integerList.add(4);
        integerList.add(10);
        integerList.add(15);
        integerList.add(40);
        try {
            FileWriter fileWriter = new FileWriter("number.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer integer : integerList) {
                bufferedWriter.write(integer.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception ignored) {

        }
//        List<Integer> list = findMax.readFile("number1.txt");
        integerList = findMax.readFile("number.txt");
        int max = findMax(integerList);
        findMax.writeFile("result.txt", max);
    }
}
