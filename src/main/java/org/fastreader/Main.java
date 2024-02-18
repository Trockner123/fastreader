package org.fastreader;

import org.fastreader.display.Window;
import org.fastreader.reader.Reader;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("Hello world!");
        List<String> test = new ArrayList<>();
        Reader reader = new Reader();
        test = reader.readFile("src/main/resources/test.txt");

        Window window = new Window("Fast-Reader", 600, 600);

        long time = 500000000;
        for (String word : test) {

            TimeUnit.NANOSECONDS.sleep(time);
            window.updateText(word);
            System.out.println(word);
            time = time - 100000;
        }
    }

}