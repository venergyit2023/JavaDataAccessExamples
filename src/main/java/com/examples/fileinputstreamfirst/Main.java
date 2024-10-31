package com.examples.fileinputstreamfirst;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("input.txt")){
            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }
    }
}
