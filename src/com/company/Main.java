package com.company;

import java.util.Arrays;
import java.util.Scanner;


class student {
    String Name;
    int ID;
    char Gender;
    int[] Marks = new int[4];
    double Total_Percentage;

    void details() {
        System.out.println(Name);
        System.out.println(ID);
        System.out.println(Gender);
        System.out.println(Arrays.toString(Marks));
        System.out.println(Total_Percentage);

return;
}
}
public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner Obj = new Scanner(System.in);


            System.out.println("  MENU  ");

            System.out.println(" 1. Enter Student Details   ");
            System.out.println(" 2. Find Students           ");
            System.out.println(" 3. Top Students            ");
            System.out.println(" 4. Show all Students       ");
            System.out.println(" 5. Exit                    ");


            System.out.println("  Enter your Choice:  ");


            int o = Obj.nextInt();

            student std = new student();
            std.Name ="a";
            std.ID =-1;

            std.Gender ='t';
            std.Total_Percentage =5;

            switch (o){
                case 1:

                    System.out.println("Enter Name : ");
                    std.Name = Obj.next();
                    System.out.println("Enter Student ID : ");
                    std.ID = Obj.nextInt();
                    System.out.println("Enter Marks : ");
                    for(int i=0;i<4;i++){
                        std.Marks[i] = Obj.nextInt();

                    }

                    System.out.println("Enter Gender : ");
                    std.Gender = Obj.next().charAt(0);
                    std.Total_Percentage = (std.Marks[0]+std.Marks[1]+std.Marks[2]+std.Marks[3] )/ 4;
                    System.out.println(std.Total_Percentage);


                    break;

                case 2:
                    std.details();
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println(std.Name);
                default:

            }

        }

    }
}

