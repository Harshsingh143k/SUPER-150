//package day6;
//
//import java.util.Scanner;
//
//public class pro {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int rows=sc.nextInt();
//        int column=sc.nextInt();
//
//
//        int [][] arr=new int[rows][column];
//        for (int i = 0; i <rows ; i++) {
//            for (int j = 0; j <rows ; j++) {
//                arr[i][j]=sc.nextInt();
//            }
//        }
//        int count=0;
//        int minr=0;
//        int maxr=arr.length-1;
//        int minc=0;
//        int maxc=arr[0].length-1;
//
//        for (int i = minc; i <=maxc ; i++) {
//            System.out.println(arr[minr][i] +" ");
//            count++;
//        }
//        minr++;
//        for (int i = minr; i <=maxr  ;i++) {
//            System.out.println(arr[i][maxc]+" ");
//            count++;
//        }
//        maxc--;
//        for (int i = maxc; i >= minc; i++) {
//            System.out.println(arr[maxr][i]+" ");
//            count++;
//        }
//        maxr--;
//        for (int i = 0; i < ; i++) {
//            System.out.println(arr[i][minc]+" ");
//            count++;
//        }
//        minc++;
//
//
//
//    }
//
//}
