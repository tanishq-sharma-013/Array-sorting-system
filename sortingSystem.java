import java.util.*;

public class sortingSystem {
    public static void ascending(double arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Your array is sorted in ascending order :- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void descending(double arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Your array in descending order :-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the sorting system!\nEnter size of the array : ");
        int n = sc.nextInt();
        double arr[] = new double[n];
        System.out.println("Enter elements of the array :- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        System.out.println("Your entered array :- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Press '1' to sort array in ascending order\nPress '2' to sort in descending order!");
        byte c = sc.nextByte();
        switch (c) {
            case 1:
                ascending(arr);
                break;
            case 2:
                descending(arr);

                break;
            default:
                System.out.println("Invalid character!\nTry Again!!");

        }
        System.err.println("\nProgram terminated");
    }
}
