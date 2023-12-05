package com.kodtodya.practice.functions;

public class NumberPlayground {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public boolean isArmstrong(int num) {
        int num1 = num;
  /* Converting Integer to String. It'll help to find number of
  digits in the Integer by using length() */
        String str = Integer.toString(num);
        int rem;
        int result = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            result = result + ((int) Math.pow(rem, str.length()));
        }
        if (result == num1) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber(int no) {
        NumberPlayground numberPlayground = new NumberPlayground();
        System.out.printf("Give no. %d is %s ", no, numberPlayground.isPalindrome(no) ? "Pallindrom" : "not Pallindrome");
        System.out.println("\n");
        System.out.printf("Give no. %d is %s ", no, numberPlayground.isArmstrong(no) ? "Armstrong" : "not Armstrong");
        System.out.println("\n");
        System.out.printf("Give no. %d is %s ", no, numberPlayground.isPrime(no) ? "Prime" : "not Prime");
    }
}
