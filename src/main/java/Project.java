import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Project project = new Project();
        project.someMethod1();
        project.someMethod2();
        project.someMethod3();
        project.someMethod4();
        project.someMethod5();
        project.someMethod6();
        project.someMethod7();
        project.someMethod8();
    }

    //сортування елементів масиву за допомогою методу бульбашок
    void someMethod1() {
        int[] intArr1 = {1, 24, 3, 2, 1, 7, 24, 15, 24, 1, 17, 15, 8, 3, 13};
        System.out.println("Original array: " + Arrays.toString(intArr1));
        int intL = intArr1.length;
        boolean isSorted = false;
        int x;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < intL - 1; i++) {
                for (int j = i + 1; j < intL; j++) {
                    if (intArr1[i] > intArr1[j]) {
                        isSorted = false;
                        x = intArr1[i];
                        intArr1[i] = intArr1[j];
                        intArr1[j] = x;
                    }
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(intArr1));
    }

    //мінімальний і максимальний (значення та кількість) елементи у масиві
    void someMethod2() {
        int[] intArr2 = {1, 24, 3, 2, 1, 7, 24, 15, 24, 1, 17, 15, 8, 3, 13};
        int intL = intArr2.length;
        int min = intArr2[0];
        int max = intArr2[intL - 1];
        int quantityMin = 1;
        int quantityMax = 1;

        for (int i = 1; i < intL - 1; i++) {
            if (intArr2[0] == intArr2[i]) {
                quantityMin++;
            } else break;
        }

        for (int i = intL - 2; i > 0; i--) {
            if (intArr2[intL - 1] == intArr2[i]) {
                quantityMax++;
            } else break;
        }
        System.out.println("Min: " + min + " quantity: " + quantityMin);
        System.out.println("Max: " + max + " quantity: " + quantityMax);
    }

    //масив у зворотньому порядку
    void someMethod3() {
        int[] intArr3 = {1, 24, 3, 2, 1, 7, 24, 15, 24, 1, 17, 15, 8, 3, 13};
        int intL = intArr3.length;
        System.out.println("Array in reverse order: ");

        for (int i = intL - 1; i >= 0; i--) {
            System.out.print(intArr3[i] + "; ");
        }
    }

    //перемішаний масив
    void someMethod4() {
        int[] intArr4 = {1, 24, 3, 2, 1, 7, 24, 15, 24, 1, 17, 15, 8, 3, 13};
        int intL = intArr4.length;
        int[] result = new int[intL];
        Random random = new Random();
        for (int i = 0; i < intL; i++) {
            int r = random.nextInt(intL - i);
            result[i] = intArr4[r];
            intArr4[r] = intArr4[intL - 1 - i];
        }
        System.out.println("\nArray in random: " + Arrays.toString(result));
    }

    //кількість простих чисел у масиві
    void someMethod5() {
        int[] intArr5 = {1, 24, 3, 2, 1, 7, 24, 15, 24, 1, 17, 15, 8, 3, 13};
        int intL = intArr5.length;
        System.out.println("The prime numbers in the array: ");
        for (int k : intArr5) {
            if (k > 1 & k <= 3) {
                System.out.print(k + "; ");
            }
            for (int j = 2; j < k; j++) {
                if (k <= 3 || k % j == 0) {
                    break;
                }
                if (k == j + 1) {
                    System.out.print(k + "; ");
                }
            }
        }
    }

    void someMethod6() {
        int[] intArr = {1, 1, -24, 3, 24, -1, 7, 12, -15, 24, -3, 35, -1, -7, -24, 15, 24, -1, 17, 15, -8, 3, 130};

        int intL = intArr.length;

        int x = 0;
        for (int i = 0; i < intL; i++) {
            if (intArr[i] < 0) {
                x = x + intArr[i];
            }
        }
        System.out.println("\nСума негативних елементів: " + x);

        int firstMin = 0;
        int firstMax = 0;

        int xMin = intArr[0];
        int xMax = intArr[0];
        for (int i = 0; i < intL; i++) {
            if (intArr[i] < xMin) {
                xMin = intArr[i];
                firstMin = i;
            }
            if (intArr[i] > xMax) {
                xMax = intArr[i];
                firstMax = i;
            }
        }

        int y = 1;
        for (int i = firstMin + 1; i < firstMax; i++) {
            y = y * intArr[i];
        }
        System.out.println("Добуток елементів між MIN і MAX: " + y);

        int z = 1;
        for (int j : intArr) {
            if (j % 2 == 0) {
                z = z * j;
            }
        }
        System.out.println("Добуток елементів з парними числами: " + z);

        int firstMinus = 0;
        int lastMinus = 0;

        for (int i = 0; i < intL; i++) {
            if (intArr[i] < 0) {
                firstMinus = i;
                break;
            }
        }

        for (int i = intL - 1; i >= 0; i--) {
            if (intArr[i] < 0) {
                lastMinus = i;
                break;
            }
        }

        int s = 0;
        for (int i = firstMinus + 1; i < lastMinus; i++) {
            s = s + intArr[i];
        }
        System.out.println("Сума елементів між першим і останнім негативними елементами: " + s);
    }

    void someMethod7() {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        int[] profits = {10000, 7800, 9800, 8600, 11250, 8950, 9745, 8800, 10500, 7950, 9650, 10650};
        System.out.print("Month\tProfits\n");
        for (int i = 0; i < profits.length; i++) {
            System.out.print(month[i] + "\t");
            System.out.print(profits[i] + "\t" + "\n");
        }

        int min = profits[0];
        for (int j = 1; j < profits.length; j++) {
            if (min > profits[j]) {
                min = profits[j];
                System.out.println("Minimum profits in " + month[j] + ": " + min);
            }
        }

        int max = profits[0];
        for (int j = 1; j < profits.length; j++) {
            if (max < profits[j]) {
                max = profits[j];
                System.out.println("Maximum profits in " + month[j] + ": " + max);
            }
        }
    }

    void someMethod8() {
        int[] pentagon = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the sides of the pentagon: ");
        for (int i = 0; i < 5; i++) {
            pentagon[i] = in.nextInt();
        }
        int sum = 0;
        for (int num : pentagon) {
            sum = sum + num;
        }
        System.out.println("Pentagon perimeter: " + sum);
    }
}









