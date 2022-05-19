package com.accenture.bufferedReaderTest;

import java.io.*;

public class BufferedReaderFirstTest {
    public static void main(String[] args) {

        //Test1
        File f = new File("brTest1.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            bw.write("howdy");
            bw.newLine();
            bw.write("friends");
            bw.newLine();
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            do {
                line = br.readLine();
                if (line != null)
                    System.out.println(line);
            } while (line != null);
            br.close();
        }
        catch(IOException e) { System.out.println(e.getMessage()); }


        //Test2
        try {
            BufferedReader br2 = new BufferedReader(new FileReader("brTest2.txt"));
            String line;
            do {
                line = br2.readLine();              //Liest eine Zeile oder null bei Dateiende
                if (line != null)
                    System.out.println(line);
            } while (line != null);
            br2.close();                            //Löscht den Lesebuffer und schließt die Datei
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
