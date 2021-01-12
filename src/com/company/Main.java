package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // B1: khai bao bien,nhap va kiem tra kich thuoc mang;
        int size;
        int[] arr;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size :");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size ko duoc qua 20");
            }
        } while (size > 20);

        // B2: nhap gia tri cho cac phan tu cua mang;
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Enter element "+(i+1)+ " :");
            arr[i] = sc.nextInt();
            i++;
        }

        // B3: in ra dsach tai san;
        System.out.println("danh sach tai san : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]+"\t");
        }

        // B4: duyet cac phan tu trong mang de tim gia tri lon nhat;
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }
        System.out.println("gia tri lon nhat is : "+max+" tai vi tri : "+index);
    }
}
