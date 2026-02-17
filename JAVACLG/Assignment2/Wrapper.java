/*Consider a wrapper class for a numeric basic type. Check the support for the following: conversion from i) basic type to object ii) object to basic type iii) basic type to String iv) String (holding numeric data) to numeric object v) object to String.  */
public class Wrapper {
    public static void main(String[] args) {
        // i) basic type to object
        int basic = 10;
        Integer objBasic = basic;
        System.out.println("Basic type to object: "+objBasic);
        // ii) object to basic type 
        Integer obj1 = 20;
        int basic1 = obj1;
        System.out.println("Object to basic type: "+basic1);
        // iii) basic type to String
        int b1 = 23;
        String s = String.valueOf((b1));
        System.out.println("Basic type to String: "+s);
        // iv) String (holding numeric data) to numeric object
        String numString = "40";
        Integer objFromString = Integer.valueOf(numString);
        int basicFromString = Integer.parseInt(numString);
        System.out.println("String (holding numeric data) to numeric object: "+objFromString);
        System.out.println("String (holding numeric data) to numeric object: "+basicFromString);
        // v) object to String.
        Integer obj5 = 50;
        String strFromObj5 = obj5.toString();
        String striFromObj5 = String.valueOf(obj5);

        System.out.println("v) Object → String:");
        System.out.println("Using toString(): " + strFromObj5);
        System.out.println("Using String.valueOf(): " + striFromObj5);
    }
}
