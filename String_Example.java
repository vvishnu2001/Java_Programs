package org.example;

public class String_Example {

    private static final String COUNTRY = "Usa";

    public static void main(String[] args) {
//        String str1 = "Hello";
//        String str2 = "Hello";
//
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//
//        String str3 = new String("Hello").intern();
//        System.out.println(str1==str3);


        System.out.println(isValidCountry("usa"));
    }

        public static boolean isValidCountry(String country)
        {
            return COUNTRY.equalsIgnoreCase(country);
        }


}
