package com.company;
import javax.security.sasl.SaslClient;
import java.util.Scanner;

//-------------------------------------------METHODS IN JAVA---------------------------------------

public class IfElseStatements {
    static int method1(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b= 7;
        int c;
        //Object invocation using object creation
//        IfElseStatements obj = new IfElseStatements();
//        c=obj.method1(a,b);
        c=method1(a,b);
        System.out.println(c);
        int a1= 2;
        int b1= 1;
        int c1;
        c1=method1(a1,b1);
        System.out.println(c1);







//---------------------------------------array---------------------------------------
//        int [][] flats;
//        flats=new int[2][3];
//        flats[0][0]=101;
//        flats[0][1]=102;
//        flats[0][2]=103;
//        flats[1][0]=201;
//        flats[1][1]=201;
//        flats[1][2]=201;
//        System.out.println("Printing 2-D array ");
//        for (int i=0;i<flats.length;i++){
//            for (int j=0;j<flats[i].length;j++){
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }


//-------------------------------------------------Intro to ARRAY-------------------------------------------------------
//        float[] marks={89.5f,99.5f,76,90.5f,98,60};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//        String[] name={"any","anuy","anurag"};
//        System.out.println(name[2]);
//        System.out.println(name.length);
        //display array (naive way)
        /*
        int[] marks={89,99,76,90,98,60};
        System.out.println("display array in naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        //display array (with for loop)
        System.out.println("display array with for loop");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("display array in reverse order");
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
//---------------------------------------introducing for-each loop----------------------------------------------
        System.out.println("display array with for-each loop");
        for (int element :marks){
            System.out.println(element);
        }
        */




//---------------------------------------------break-----------------------------------------------------
//        for (int i = 0; i<=9; i++){
//            if (i==5){
//                break;
//            }
//            System.out.println("this is current number: "+i);
//            System.out.println("ended this loop by break");
//        }

//---------------------------------------------------continue----------------------------------------------------------
//        for (int i = 0; i<=9; i++){
//            if (i==5){
//                continue;
//            }
//            System.out.println("this is current number: "+i);
//            System.out.println("ended this loop by break");
//        }


//----------------------------------------------LOOPS-------------------------------------------
        //try break and continue statements first:)
        /*what does break do?
            it breaks tha loop and come out of it
          what does continue do?
            it it breaks tha current condition in the loop and don't give any output just move to the next condition of the loop
         */


        /*for loop*/
//        for (int i =100; i>0; i--){
//            System.out.println(i);
//        }

        /*while*/
//        int i = -100;
//        while (i<201){
//            System.out.println(i);
//            i++;
//        }
        /*do-while*/
//        int i =1;
//        do{
//            System.out.println(i);
//            i++;
//        }while (i<11);
//-------------------------------------------SWITCH---------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you age: ");
//        int age = sc.nextInt();
//        switch (age) {
//            case 18 -> System.out.println("You are going to became an adult");
//            case 23 -> System.out.println("You are going to join a job");
//            case 60 -> System.out.println("You are going to retired ");
//            default -> System.out.println("Enjoy your life:) ");
//        }

//--------------------------------------IF-ELSE-------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you age: ");
//        int age = sc.nextInt();
//        if (age==18){
//            System.out.println("you are going to became adult:)");
//        }
//        else if (age==60) {
//            System.out.println("You are going to retire ");
//
//        }
//        else if (age==50) {
//            System.out.println("You are experienced");
//
//        }
//        else if (age==23) {
//            System.out.println("You are going to get a job");
//        }
//        else {
//            System.out.println("Enjoy your life:)");
//        }
//
//        if(age>2){
//            System.out.println("You are not a baby");
//        }






//-------------------------------------------------logical operators------------------------------------------------

//        boolean a = true;
//        boolean b = false;
//        if (a || b){
//            System.out.println("Y");
//        }
//        else {
//            System.out.println("N");
//        }

//        System.out.println("For Not L  ogical operator! ");
//        System.out.print("NOT(A) is: ");
//        System.out.println(!a);
//        System.out.print("NOT(B) is: ");
//        System.out.print(!b);







//        int age = 26;
//        boolean cond = (age>18);
//        if(cond){
//            System.out.println("Yes You Can Drive:) ");
//
//        }
//        else {
//            System.out.println("No Buddy Not Yet ");
//        }



    }
}
