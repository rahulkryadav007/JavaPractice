package com.staticExample;

class Test {

    static int a = 10;

    public static void main(String[] args) {

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        Test t5 = new Test();
        Test t6 = new Test();

        t1.a = 20;
        t3.a = 50;
        t4.a = 100;
        t5.a = 10000;
        t6.a = -584;

        System.out.println(t1.a);
    }
}