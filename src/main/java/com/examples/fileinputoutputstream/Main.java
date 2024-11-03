package com.examples.fileinputoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *   BASIC SIMPLE example: getting the file context reading 8-bits data stream
 *   The following comment is ONLY for learning purposes
 * <p>
 *   InputStream & OutputStream
 *
 *   <li>FileInputStream</>fis
 *   <li>FileOutputStream</>fos
 * </p>
 *
 *   Conclusion:
 *   <li>
 *       1.
 *       When try() is executed?
 *       When there is no error (catch() is not executing, finally IS executed).
 *       In case of exception - we MUST catch the exact exception.
 *
 *       2.
 *       try - catch
 *       try - catch - finally
 *       try - with resources
 *   </li>
 * */
public class Main {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("input.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("output.txt")){

            int c;
            while ((c = fileInputStream.read()) != -1) {
                System.out.println(c);

                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
