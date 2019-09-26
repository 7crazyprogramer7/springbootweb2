package cn.cq.springboot.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 *@author chen qiang
 * @return jdk's version
 */
public class A {

     public static void main(String[] args) throws InterruptedException, IOException {
         File java = new File("C:\\Program Files\\java-jdk\\jdk1.8.0_101\\bin\\java.exe");
         Process exec = Runtime.getRuntime().exec("\""+java.getCanonicalPath()+"\" -version");
         exec.waitFor();
         InputStream in = exec.getErrorStream();
         Scanner sc = new Scanner(in);
         String line = null;
         while (sc.hasNextLine()) {
             if (line == null) {
                 line = sc.nextLine();
             } else {
                 line += '\n' + sc.nextLine();
             }
         }
         in.close();
         sc.close();
         exec.destroy();
         System.out.println("hello world "+line);
     }

}
