package com.accenture.bufferedReaderTest;

import java.io.*;

public class BufferedReaderReadLine {
    public static void main(String[] args) {

    String[] names = {"John", "Carl", "Jerry"};
    try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("Writing to a file.");
        writer.write("\nHere is another line.");

        for (String name : names) {
            writer.write("\n" + name);
        }
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    try {
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        String line;
        while((line = reader.readLine()) != null) {             //Liest eine Zeile oder null bei Dateiende
            System.out.println(line);
        }
        //line = reader.readLine();

        reader.close();                                         //Löscht den Lesebuffer und schließt die Datei
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
