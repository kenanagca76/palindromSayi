package palindromSayilar;

import java.util.Scanner;

public class palindromSayilar {
// Palindrom Sayı Nedir ?
//Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

//Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            System.out.println("===========");
            System.out.println("sayi --> " + temp);

            lastNumber = temp % 10;
            System.out.println("Son basamak --> " + lastNumber);

            reverseNumber = (reverseNumber * 10) + lastNumber;
            System.out.println("Yeni sayı --> " + reverseNumber);
            temp /= 10;
            System.out.println("Yeni Temp --> " + temp);
        }
        if (number == reverseNumber) {

            System.out.println(number + " sayısı palindrom bir sayıdır");
            return true;
        } else {

            System.out.println(number + " sayısı palindrom bir sayı değildir");
            return false;
        }

    }

    public static void main(String[] args) {
      
        Scanner read = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = read.nextInt();

        System.out.print(isPalindrom(number));

    }
}
