package reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Test {

    public static void main(String[] args) throws IOException {

        // читаємо текст з звичайного BufferedReader
        File file = new File("src/main/resources/text.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));

        System.out.println("BufferedReader:");
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
        System.out.println("=============\n");

        // читаємо текст з UpperCaseReader
        BufferedReader uppercaseReader = new UpperCaseReader(new BufferedReader(new FileReader(file)));
        System.out.println("UpperCaseReader:");
        while ((line = uppercaseReader.readLine()) != null) {
            System.out.println(line);
        }

        uppercaseReader.close();
        System.out.println("=============\n");

        // читаємо текст з NoDigitsReader
        BufferedReader noDigitsReader = new NoDigitsReader(new BufferedReader(new FileReader(file)));
        System.out.println("NoDigitsReader: ");
        while ((line = noDigitsReader.readLine()) != null) {
            System.out.println(line);
        }

        noDigitsReader.close();
        System.out.println("=============\n");


        // читаємо текст з двома обгортками NoDigitsReader та UpperCaseReader
        BufferedReader noDigitsUpperCaseReader = new NoDigitsReader(new UpperCaseReader(new BufferedReader(new FileReader(file))));
        System.out.println("noDigitsUpperCaseReader: ");
        while ((line = noDigitsUpperCaseReader.readLine()) != null) {
            System.out.println(line);
        }


    }
}