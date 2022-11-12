package class3;

import java.util.Scanner;



public class functions {
    static void print(int [] arr){
        for (var  j = 0; j <arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
    static void swap(int [] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void linearSearch(int [] arr,int elm){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==elm){
                System.out.println(elm +"is on "+i+" position");
            }
        }
        System.out.println("elemnet not found in array");

    }
    static void reverse(int [] arr){
        for (int i = 0; i <arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
    }
    //java  is always call by value ...best example changing reference of two array
    //passing refrence dosent  mean  it is all by reference
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (var i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.println("provide element to find==");
        //int ele=sc.nextInt();
       // linearSearch(arr,ele);
        //swap(arr,2,4);
        reverse(arr);
 print(arr);
//        System.out.println(arr);




    }
}
