package com.kodtodya.practice.wrapperClazz;

public class WrapperClazzDemo {

    public static void main(String[] args) {

        // primitive data types
        int intNo = 10;
        float floatNo = 10.5f;
        double doubleNo = 10.58467328;
        char character = 'a';
        byte aByte = 'a';
        boolean flag = false;
        long longId = 873464826428468276L;
        short shortNo = 254;

        // non-primitive(Wrapper) data types
        // auto-boxing
        Integer integerWrapperNo = intNo;
        Float floatWrapperNo = floatNo;
        Double doubleWrapperNo = doubleNo;
        Character wrapperCharacter = character;
        Byte wrapperByte = aByte;
        Boolean wrapperFlag = flag;
        Long longWrapperId = longId;
        Short shortWrapperNo = shortNo;

        System.out.println("\nInteger integerWrapperNo :" + integerWrapperNo +
                "\nFloat floatWrapperNo :" + floatWrapperNo +
                "\nDouble doubleWrapperNo :" + doubleWrapperNo +
                "\nCharacter wrapperCharacter :  " + wrapperCharacter +
                "\nByte wrapperByte :" + wrapperByte +
                "\nBoolean wrapperFlag :" + wrapperFlag +
                "\nLong longWrapperId :" + longWrapperId +
                "\nShort shortWrapperNo : " + shortWrapperNo
        );
        System.out.println("---------------------------------");
        // unboxing
        int primitiveIntNo = integerWrapperNo;
        System.out.println("\nint primitiveIntNo :" + primitiveIntNo );
    }
}
