package com.example.Sample.ProjectAndrewJar;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        StringUtilities utils = new StringUtilities();
//        StringBuilder sb = new StringBuilder();
//        while (sb.length()<10){
//            utils.addChar(sb,'a');
//        }
//        System.out.println(sb);
//        String str= "abcdefg";
//        String result = utils.upperAndPrefix(utils.addSuffix(str));
        System.out.println("HelloWorld");
        System.out.println("..................................");
        BankAccount bankAccount = new BankAccount("andrew","ojuku",100);
        System.out.println( "the first name is "+bankAccount.getLastName());
    }
}
