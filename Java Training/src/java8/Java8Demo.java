package java8;
import java.util.*;
import java.util.stream.*;
public class Java8Demo { public static void main(String[] args){List<Integer> n=Arrays.asList(1,2,3,4,5);n.stream().filter(x->x%2==0).map(x->x*x).forEach(System.out::println); } }
