package TH2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh Sach Phan Tu Cua Mang: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner input = new Scanner(System.in);
        System.out.println("\nVui long nhap chi so mot phan tu bat ky: ");
        int x = input.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so 5 " + x + " La " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chi So Vuot Qua gioi han cua mang");
        }
    }
}
