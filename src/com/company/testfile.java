package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class testfile {
    public static void main(String[] args) {

        ArrayList<Employee> es = new ArrayList<>();
        es.add(new Employee("E005","Nguyen Van 12",211));
        es.add(new Employee("E006","Nguyen Van 13",212));
        es.add(new Employee("E007","Nguyen Van 14",215));

        File f = new File("employees.txt");
        try {
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employee x: es ){
                pw.println(x.getId()+"," + x.getName()+"," + x.getSalary());
            }
            pw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
