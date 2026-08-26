package fileio;
import java.io.*;
public class FileIODemo { public static void main(String[] args) throws Exception { File f=new File("student.txt"); try(FileWriter w=new FileWriter(f)){w.write("Java Training");} try(BufferedReader r=new BufferedReader(new FileReader(f))){System.out.println(r.readLine());} } }
