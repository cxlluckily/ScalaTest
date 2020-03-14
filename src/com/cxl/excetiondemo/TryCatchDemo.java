package com.cxl.excetiondemo;

public class TryCatchDemo {

    public static void main(String[] args) {
        String demo = demo();
        System.out.println(demo);

    }

    private static String demo() {
        try {
            System.out.println("try");
            return "try";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return "finally";
        }
    }
}
