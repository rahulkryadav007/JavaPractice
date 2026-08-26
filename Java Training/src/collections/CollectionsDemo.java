package collections;
import java.util.*;
public class CollectionsDemo { public static void main(String[] args){ List<String> names=new ArrayList<>();names.add("Rahul");names.add("Amit"); Set<Integer> nums=new HashSet<>(Arrays.asList(10,20,10)); Map<Integer,String> map=new HashMap<>();map.put(1,"Java");System.out.println(names);System.out.println(nums);System.out.println(map); } }
