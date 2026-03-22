package Interview;

import java.util.*;
import java.io.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class UserDataToFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Collection Framework
        ArrayList<Person> list = new ArrayList<>();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        // Store in collection
        list.add(new Person(name, age));

        try {
            // Writing into Notepad file
            FileWriter fw = new FileWriter("userdata.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for(Person p : list) {
                bw.write("Name: " + p.name + " Age: " + p.age);
                bw.newLine();
            }

            bw.close();
            System.out.println("Data successfully saved to file.");

        } catch(IOException e) {
            System.out.println("Error writing file");
        }

        sc.close();
    }
}