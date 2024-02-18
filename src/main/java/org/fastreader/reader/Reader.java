package org.fastreader.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Reader {


    public List<String> readFile(String path) throws FileNotFoundException {
        List<String> words=new ArrayList<>();
        File file=new File(path);
        Scanner reader=new Scanner(file);
        while (reader.hasNextLine()){
            String line=reader.nextLine();
            String[] wordList=line.split(" ");
            words.addAll(Arrays.asList(wordList));
        }
        words.removeAll(Collections.singleton(null));
        words.removeAll(Collections.singleton(""));
    return words;
    }
}
