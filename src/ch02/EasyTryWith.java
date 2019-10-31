package ch02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EasyTryWith {
    public static void main(String[] args) {
        try {
            writeFile(new BufferedWriter(
                    new FileWriter("Easy TryWithResources")
            ), "This is easy in Java 9");
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    public static void writeFile(BufferedWriter writer, String text) {
        try (writer) {
            writer.write(text);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    public static void oldWriteFile(BufferedWriter writer, String text) {
        // Prior to Java 9, there is no need to create the new variable w.
        try (BufferedWriter w = writer) {
            w.write(text);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
