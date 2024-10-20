package com.examples.filewriterthird;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try (BufferedWriter bwTest = new BufferedWriter(new FileWriter("export//testexport.txt", true))) {
            bwTest.write("Test");

            System.out.println("Job finished.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }
    }
}
