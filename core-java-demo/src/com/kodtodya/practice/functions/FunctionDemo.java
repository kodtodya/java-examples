package com.kodtodya.practice.functions;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionDemo {

    // for non-static method calls using function
    private NumberPlayground numberPlayground = new NumberPlayground();

    private Function<Integer, Boolean> isArmstrong = numberPlayground::isArmstrong;

    // for static method calls using function
    private Consumer<Integer> checkNumber = NumberPlayground::checkNumber;

    public static void main(String[] args) {
        FunctionDemo functionDemo = new FunctionDemo();

        // local non-static method call
        functionDemo.runPlaygroundCheck();
    }

    private void runPlaygroundCheck() {
        // usage of non-static method calls using function
        System.out.println(this.isArmstrong.apply(153) ? "Armstrong" : "Not Armstrong");

        // usage of static method calls using function
        checkNumber.accept(121);
    }
}
