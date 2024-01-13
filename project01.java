package com.company;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.LineNumberReader;
import java.util.Random;
import java.util.Scanner;


public class project01 {
    public static void main(String[] args) {

//
//        Scanner sc = new Scanner(System.in);
//        System.out .print("Enter Time, Rate, Principle Amount: ");
//        int a = sc.nextInt();


        //30-To 'check' weather array is shorted  or not
//        boolean isSorted=true;
//        int[] array={1,2,3,4,5};
//        for (int i=0;i<array.length-1;i++){
//            if(array[i] > array[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if (isSorted){
//            System.out.println("The array is shorted");
//        }
//        else {
//            System.out.println("The array is not shorted");
//        }



                                         //29_CWH
//        ----------------------------------CWH-----------------------
//        int max=0;
//        int[] array={4,2,3,45,632132768,9,5332143};
//        for (int e:array){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println(max);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//-----------------------------------------------------------------------------
                                          //29.2-find shortest number in an array
//        int a=2147483648; /*or we can directly use this int a =Integer.MAX_VALUE;*/
//        int[] array={4,2,3,45,632132768,9,5332143};
//        for (int i=0;i<array.length;i++){
//            if (a>=array[i]){
//                a=array[i];
//            }
//        }
//        System.out.println(a);

                                        //29.1find the biggest number in an array
//        int a=-2147483648;/*or we can directly use this int a =Integer.MIN_VALUE;*/
//        int[] array={4,2,3,45,632132768,9,5332143};
//        for (int i=0;i<array.length;i++){
//            if (a<=array[i]){
//                a=array[i];
//            }
//        }
//        System.out.println(a);




                                    //28-how to reverse an array
//        int[] array={1,2,3,4,5,6,7,8,9};
//        int l=array.length;
//        int a =Math.floorDiv(l,2);
//        int temp;
//        for (int i=0;i<a;i++){
//            //swap array[i] and array[l-i-1]
//            // a  b  temp ---these are different boxes---
//            //|3|  |4|  ||
//            temp=array[i];
//            array[i]=array[l-i-1];
//            array[l-i-1]=temp;
//        }
//        for (int element:array){
//            System.out.print(element+" ");
//        }


//        int[] array={1,2,3,4,5,6,7,8,9,0,};
//        for (int i=array.length-1;i>0;i--){
//            System.out.print(i);
//        }


                                            //27-to add two matrix using array
//        int[][] mat1={{41,42,43},
//                      {54,55,56}};
//        int[][] mat2={{21,22,23},
//                      {31,32,33}};
//        int[][] result={{0,0,0},
//                        {0,0,0}};
//
//        //printing the array of a 2-D array
//        for (int i=0;i<mat1.length;i++){//this will run row number of times
//            for (int j=0;j<mat1[i].length;j++){//this will run column number of times
////                System.out.format("Setting values for i=%d and j=%d\n",i,j);
//                result[i][j]  =  mat1[i][j]  +  mat2[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println("");//print a new line
//        }






                                        //27-to calculate percentage in a given array
//        float[] array={87.5f,88,89,90.5f,97,80};
//        float sum =0;
//        for (float element:array){
//            sum+=element;
//        }
//        System.out.println(sum/array.length);


                                        //26-to find weather any number is present in an array or not
//        int n=10;
//        int[] array={1,2,3,4,5,6,7,8,9,0,};
//        boolean tr = false;
//        for (int element:array) {
//            if (n==element){
//                tr=true;
//                break;/*use of break-- as for will find the value equals to n it will break the program because of break
//                otherwise even though value is equas to n program will check all the values and this makes program little bit slower*/
//            }
//        }
//        if (tr){
//            System.out.println("yes that number is in this array:) ");
//        }
//        else {
//            System.out.println("No there is no such a number present here:(");
//        }


                                                 //25.2-find the sum of an array using for-each loop
//        float[] array={1.9f,3.6f,6.4f,8.7f,9};
//        float sum =0;
//        for (float element:array){
//            sum+=element;
//        }
//        System.out.println(sum);
                                                //25.1-find the sum of an array using for loop

//        float[] array={1.9f,3.6f,6.4f,8.7f,9};
//        float sum =0;
//        for (int i=0;i<array.length;i++){
//            sum+= array[i];
//        }
//        System.out.println(sum);



                                        //24-to find sum of n even numbers using while
//        int n=5;
//        int sum =0;
//        for (int i=0;i<5;i++){
//            sum +=2*i;
//        }
//        System.out.println(sum);



                                        //23-find the sum of multiplication table of any number
//        int n=8;
//        int sum=0;
//        for (int i =1; i<11;i++){
//            System.out.printf("%d X %d = %d",n,i,n*i);
//            System.out.print("\n");
//            sum+=(i*n);
//        }
//        System.out.println("sum of this table is: "+sum);




                                            //22-to print ******* using while
//        int i=4;
//        while (i>0){
//            int j=0;
//            while (j<i){
//                System.out.print("* ");
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }



                                //21.2-to find factorial using for
//        int n=5;
//        int factorial = 1;
//        for (int i=1; i<=n; i++){
//            factorial *=i;
//        }
//        System.out.println(factorial);



                                //21.1-to find factorial using while
//        int n=5;
//        int i=1;
//        int fctorial = 1;
//        while (i<=n){
//            fctorial=fctorial*i;/*there is an ulternative way to do this is factor *=i;*/
//            i++;
//        }
//        System.out.println(fctorial);



                                            //20-print reverse multiplication table of any number
//        int n=10;
//        for (int i=n; i>0;i-- ){
//            System.out.printf("%d X %d = %d\n",n,i,i*n);
//        }

                                            //19-print multiplication table of any number
//        int n=5;
//        for (int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }




                                                //18-to find sum of n even numbers using for
//        int sum=0 ;
//        int n =3;
//        for (int i=0; i<n; i++){
//            sum = sum +(2*i);
//        }
//        System.out.println("Sum of 3 even numbers is: "+sum);







                                            //17-to print ******* using for

//            int n = 4;
//            for (int i=n; i>0; i-- ){
//                for (int j=0; j<i; j++){
//                    System.out.print("* ");
//                }
//                System.out.print("\n");
//            }

//        String str = "* * * * \n* * * \n* * \n*";
//        int i = 0;
//        while (i==0){
//            System.out.println(str);
//            i++;
//        }



                                            //16-Rock Paper Scissors


//        int count = 1;
//        while (count<6) {
//            System.out.println("This is Rock, Paper, Scissors game ");
//            System.out.print("You are User and Program is computer  Now \nPRESS: 1 for ROCK, 2 for PAPER, 3 for SCISSORS: ");
//            Scanner sc = new Scanner(System.in);
//            Random rnd = new Random();
//            int comp = rnd.nextInt(1, 4);/*completely explored by me:)*/
//            byte user = sc.nextByte();
//            System.out.println("Computer chose: " + comp);
//            if ((user == 1 && comp == 2) || (user == 2 && comp == 1) || (user == 2 && comp == 3) || (user == 3 && comp == 1)) {
//                System.out.println("'''Computer WON!'''");
//            } else if ((user == 1 && comp == 3) || (user == 3 && comp == 2)) {
//                System.out.println("'''User WON!'''");
//            } else if ((user == 1 && comp == 1) || (user == 2 && comp == 2) || (user == 3 && comp == 3)) {
//                System.out.println("'''DRAW MATCH try again'''");
//            } else {
//                System.out.println("'''Your choice with Program don't matches:('''");
//            }
//            count++;
//        }






                                            //-----waste-------
//         switch (user){
//             case 1 -> System.out.print("You choose Rock");
//             case 2 -> System.out.print("You choose paper");
//             case 3 -> System.out.print("You chose scissors");
//         }











                                                //15-waste
//        System.out.print("Player 1: ");
//        byte inp1 = sc.nextByte();
//        System.out.print("Player 2: ");
//        byte inp2 = sc.nextByte();
//        if (inp1==1&&inp2==2){
//            System.out.print("Player 2 WON!");
//        } else if (inp1==1&&inp2==3) {
//            System.out.println("Player 1 WON!");
//        } else if (inp1==1&&inp2==1) {
//            System.out.println("DRAW MATCH try again");
//        } else if (inp1==2&&inp2==1) {
//            System.out.println("Player 2 WON");
//        } else if (inp1==2&&inp2==2) {
//            System.out.println("DRAW MATCH try aagain");
//        } else if (inp1==2&&inp2==3) {
//            System.out.println("Player 2 WON!");
//        } else if (inp1==3&&inp2==1) {
//            System.out.println("Player 2 WON!");
//        } else if (inp1==3&&inp2==2) {
//            System.out.println("Player 1 WON!");
//        } else if (inp1==3&&inp2==3) {
//            System.out.println("DRAW MATCH try aagain");
//        }


                                                    //14-using endWith
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your url: ");
//        String  url = sc.nextLine();
//        if (url.endsWith(".com")){
//            System.out.println("This is a commercial website");
//        }
//        else if (url.endsWith(".org")) {
//            System.out.println("This is an organization website");
//        }
//        else if (url.endsWith(".in")){
//            System.out.println("This is an INDIAN website");
//        }


                                              //13---------to check leap year
                                             //-----------PERFECT PROGRAM--------(butcheated)
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter year to find weather it is leap year or not: ");
//        boolean leap = false;
//        int year = sc.nextInt();
//        if (year%4==0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    leap = true;
//                }
//                else {
//                    leap = false;
//                }
//            }
//            else {
//                leap = true;
//            }
//        }
//        else {
//            leap=false;
//            }
//        if (leap){
//            System.out.println(year+" is a leap year");
//        }
//        else {
//            System.out.println(year+" is not a leap year");
//        }

                                        //------my------to find any leap year
//        if (year%4==0 && year%100==0&&year%400==0){
//            System.out.println("It's a leap year");
//        }
//        else {
//            System.out.println("It's not a leap year");
//        }


                            //------------------cheatcode-----------to find any leap year
//        Scanner = new Scanner(System.in);
//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();
//
//        boolean isLeapYear = false;
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    isLeapYear = true;
//                }
//            } else {
//                isLeapYear = true;
//            }
//        }
//
//        if (isLeapYear) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }









                                //12-use of switch
//        Scanner sc = new Scanner(System.in);
//        byte day = sc.nextByte();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }





                                        //11-calculate tax to pay according to persons salary
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter you income (in LPA)--> ");
//        float inc = sc.nextFloat();
//        float tax = 0;
//        if (5.0>=inc &&2.5<=inc){
//            tax = tax + 0.05f*(inc-2.5f);
//        }
//        else if (inc<=2.5) {
//            tax = tax+0;
//        }
//        else if(5.0<=inc&&inc<=10.0){
//            tax = tax + 0.05f*(inc-2.5f);
//            tax = tax + 0.2f*(inc-5.0f);
//        }
//        else if (inc>=10.0) {
//            tax = tax + 0.05f*(inc-2.5f);
//            tax = tax + 0.2f*(inc-5f);
//            tax = tax + 0.3f*(inc-10f);
//        }
//        System.out.println("total tax you have to pay is: "+tax);


                                     //10----find percentAGE and declare result of a student
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks in subject 1: ");
//        byte marks1 = sc.nextByte();
//        System.out.print("Enter your marks in subject 2: ");
//        byte marks2 = sc.nextByte();
//        System.out.print("Enter your marks in subject 3: ");
//        byte marks3 = sc.nextByte();
//        float total = (marks1+marks2+marks3)/3.0f;
//        System.out.println("Your overall percentage is: "+total);
//        if (total>=40 && marks1>=33 && marks2>=33 && marks3>=33){
//            System.out.println("Congrats you pass! ");
//        }
//        else if (marks1==33&&marks2==33&&marks3==33){
//            System.out.println("PASS!");
//        }
//        else {
//            System.out.println("FAILED");
//        }





                                //09-write letter contex
//        String letter ="Dear Anurag, \n\tThis code works\n\tThank You ";
//        System.out.println(letter);




//                                        08-using replace method
//        String letter = "Dear <|Name|>, Thanks a lot";
//        letter = letter.replace("<|Name|>","Anurag");
//        System.out.print(letter);



                                //07-nothing
//        Scanner sc = new Scanner(System.in);
//        System.out.print("to detect double or triple space ---> ");
//        String anything = sc.nextLine();




                                //06-replace space with underscore
//        Scanner sc = new Scanner(System.in);
//        System.out.print("To replace space to underscore type here---> ");
//        String anything = sc.nextLine();
//        System.out.print(anything.replace(" ","_"));





                                    //05-convert any string into lowercase
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Name Here--> ");
//        String name = sc.nextLine();
//        System.out.print("your name in lowe case is "+name.toLowerCase());


                                        //04-check any number is integer or not
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to check weather it is integer or not: ");
////        int in = sc.nextInt(); -----------if you use boolean then no need of this input--------
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);

                                        //04 CWH -check any number is integer or not
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number to check weather it is integer or not: ");
//        System.out.println(sc.hasNextInt());



                                            //03 -convert KM to miles
//        System.out.println("////////This is a program to convert km to miles///////");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Kilometers: ");
//        float km = sc.nextFloat();
//        double mile = km*0.6213711922;
//        System.out.println(km+" kilometers are Equals to "+mile);








                                                    //01 by CWH -find percentage of a student in given 3 subjects
//        subject s1 = new subject();
//        System.out.println("Enter Maths Marks: ");
//        Scanner scn = new Scanner(System.in);
//        s1.obtd = scn.nextInt();
//        subject s2 = new subject();
//        System.out.println("Enter Physics Marks: ");
////        Scanner scn = new Scanner(System.in);
//        s2.obtd = scn.nextInt();
//        subject s3 = new subject();
//        System.out.println("Enter Chemistry Marks: ");
////        Scanner scn = new Scanner(System.in);
//        s3.obtd = scn.nextInt();
//        subject s4 = new subject();
//        System.out.println("Enter Computer Marks: ");
////        Scanner scn = new Scanner(System.in);
//        s4.obtd = scn.nextInt();
//        subject s5 = new subject();
//        System.out.println("Enter English Marks: ");
////        Scanner scn = new Scanner(System.in);
//        s5.obtd = scn.nextInt();
//        int tobtd = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd);
//        int per = (tobtd*100/500);
//        System.out.println("Percentage Obtained: "+per);

                                           //02-print statement and add any name in between
//        Scanner sc = new Scanner(System.in)  ;
//        System.out.print("Enter your name here: ");
//        String  name = sc.nextLine();
//        System.out.print("Hello "+name+" have a good day!");


                                            //01-find percentage of a student in given 3 subjects
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter your marks in Subject1: ");
//        int a = sc.nextInt();
//        System.out.println("Enter your marks in Subject2: ");
//        int b = sc.nextInt();
//        System.out.println("Enter your marks in Subject3: ");
//        int c = sc.nextInt();
//        System.out.println("Enter your marks in Subject4: ");
//        int d = sc.nextInt();
//        System.out.println("Enter your marks in Subject5: ");
//        int e = sc.nextInt();
//        float sum = a+b+c+d+e;
//        System.out.println("Your total numbers are: "+sum);
//        double per = sum / 5.0;
//        System.out.println("Your percentage is: "+per);
    }
}
