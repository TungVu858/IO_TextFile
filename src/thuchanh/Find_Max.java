package thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Find_Max {
    public List<Integer> readFile(String filepath){
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(filepath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while (true){
                line = br.readLine();
                if (line == null){
                    break;
                }
                list.add(Integer.parseInt(line));
            }
            br.close();
        }
         catch (Exception e) {
             System.err.println("Không tồn tại file ");
        }
        return list;
    }
    public void writeFile(String filePath,int max){
        try {
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Giá trị lớn nhất là : " + max);
            bw.close();
            fw.close();
        }catch (Exception e){

        }
    }
    public static int findMax(List<Integer> list){
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
        List<Integer> list = findMax.readFile("number.txt");
        int max = findMax(list);
        findMax.writeFile("result.txt",max);
    }
}
