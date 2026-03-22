package Interview;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Rahul"));
        list.add(new Employee(2, "Aman"));
        list.add(new Employee(3, "Ravi"));
        list.add(new Employee(4, "Priya"));
        list.add(new Employee(5, "Neha"));

        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
