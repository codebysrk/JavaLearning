// Question 1: Write a Java program to count and calculate the sum of even and odd numbers from 1 to N.
// --------------------------------------------------------------------------------------------------
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int evenCount = 0;
// int oddCount = 0;
// int evenSum = 0;
// int oddSum = 0;
// System.out.print("Enter a number: ");
// int number = input.nextInt();
// input.close();
// for (int i = 1; i <= number; i++) {
// if (i % 2 == 0) {
// evenCount++;
// evenSum += i;
// } else {
// oddCount++;
// oddSum += i;
// }
// }
// System.out.println("Even count = %d".formatted(evenCount));
// System.out.println("Odd count = %d".formatted(oddCount));
// System.out.println("Even sum = %d".formatted(evenSum));
// System.out.println("Odd sum = %d".formatted(oddSum));
// }
// }

// Question 2: Write a Java program to check whether a given number is prime or not.

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a Number: ");
// int num = input.nextInt();
// boolean isPrime = true;
// if (num < 2) {
// isPrime = false;
// } else {
// for (int i = 2; i < num; i++) {
// if (num % i == 0) {
// isPrime = false;
// break;
// }
// }
// }
// if (isPrime) {
// System.out.println("%d is a prime number".formatted(num));
// } else {
// System.out.print("%d is not a prime number".formatted(num));
// }
// input.close();
// }
// }



// Question 3: Write a Java program to print all prime numbers from 1 to N.
// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner num = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int input = num.nextInt();
// for (int i = 1; i <= input; i++) {
// boolean isPrime = true;
// if (i < 2) {
// isPrime = false;
// } else {
// for (int j = 2; j < i; j++) {
// if (i % j == 0) {
// isPrime = false;
// break;
// }
// }
// }
// if (isPrime) {
// System.out.println(i);
// }
// }
// num.close();
// }
// }


// Question 4: Write a Java program to count the total number of prime numbers from 1 to N.

// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner num = new Scanner(System.in);
//     System.out.print("Enter a number: ");
//     int input = num.nextInt();
//     int primeCount = 0;
//     for (int i = 1; i <= input; i++) {
//       boolean isPrime = true;
//       if (i < 2) {
//         isPrime = false;
//       } else {
//         for (int j = 2; j < i; j++) {
//           if (i % j == 0) {
//             isPrime = false;
//             break;
//           }
//         }
//       }
//       if (isPrime) {
//         primeCount++;
//       }
//     }
//     System.out.println("Number of prime numbers = " + primeCount);
//     num.close();
//   }
// }


// Question 5: Write a Java program to find all prime numbers up to N, store them in an ArrayList, and find the largest prime number.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int input = num.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 1; i <= input; i++) {
      boolean isPrime = true;
      if (i < 2) {
        isPrime = false;
      } else {
        for (int j = 2; j < i; j++) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }
      }
      if (isPrime) {
        arr.add(i);
      }
    }
    if (arr.isEmpty()) {
      System.out.println("No prime number found");
    } else {
      int max = arr.get(0);
      for (int k = 1; k < arr.size(); k++) {
        int temp = arr.get(k);
        if (temp > max) {
          max = temp;
        }
      }
      System.out.println("Largest prime = " + max);
      System.out.println("Largest prime = " + arr);
    }
    num.close();
  }
}
