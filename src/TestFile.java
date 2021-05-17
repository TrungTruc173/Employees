import com.sun.source.tree.TryTree;

import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("..//Employees.txt");
        if (!f.exists()) return;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details1 = bf.readLine();
            String details2 = bf.readLine();
            String details3 = bf.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
