package com.kodtodya.practice.lambda;

public class LambdaDemo {

    // class instance variable
    private final int no = 5;

    public static void main(String[] args) {

        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.useLambdaExpression();
    }

    private void useLambdaExpression() {
        // method local variable
        int anotherNo = 10;

        // implementation of lambda
        Demo demo = () -> {
            // we can access global variables directly inside lambda implementation
            System.out.println("Square of no: " + no * no);
            // we can access local variables directly inside lambda implementation
            System.out.println("Square of anotherNo: " + anotherNo * anotherNo);

            // local variables we use inside lambda are always final implicitely or effectively final
            //anotherNo = 100;
        };

        // actual usage of lambda
        demo.printSquare();
    }
}
