package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int len = str.length();
        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equal = str.equals(str);
        // please concatenate str & str2 and set the result to a new String variable below
        String strcont = str+str2;
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        int search = str.indexOf("e");
        String rep = str.replace("l","p");
        String sub = str.substring(1,3);
        Boolean con = str.contains("ll");
        System.out.println(search);
        System.out.println(rep);
        System.out.println(con);
        System.out.println(sub);
        System.out.println(strcont);
    }


}