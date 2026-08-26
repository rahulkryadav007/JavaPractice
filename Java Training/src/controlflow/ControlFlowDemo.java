package controlflow;
public class ControlFlowDemo {
    public static void main(String[] args) {
        int n=10;
        if(n>0) System.out.println("Positive"); else System.out.println("Non-positive");
        switch(n){ case 10 -> System.out.println("Ten"); default -> System.out.println("Other"); }
        for(int i=1;i<=5;i++) System.out.println(i);
        int i=1; while(i<=3){System.out.println("while "+i);i++;}
    }
}
