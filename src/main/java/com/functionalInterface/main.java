package com.functionalInterface;

public class main {
    public static void main(String[] args) {
        myInter i1 = new myInterImpl();
        i1.sayHello();

        myInter i2 = new myInter() {
            @Override
            public void sayHello() {
                System.out.println("Functional Interface by Anonymous class");
            }
        };
        i2.sayHello();

        // It can only happen with functional interfaces
        myInter l3 = () -> System.out.println("Functional Interface by Lambda Expression");
        l3.sayHello();

        sumInter sum = (a, b) -> (a + b);
        System.out.println(sum.getSum(5, 6));
    }
}
