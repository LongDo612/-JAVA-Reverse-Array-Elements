import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int first, last;
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.println("Enter size of array (less than 20): ");
             size = scanner.nextInt();
        }while (size>20);

        array = new int[size];
        for (int i=0;i<array.length;i++){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i=0;i < array.length;i++){
            System.out.println("array[" +i+"]: " + array[i]);
            System.out.println();
        }

        first = 0;
        last = array.length - 1;
        while (last > first){
            int b = array[first];
            array[first] = array[last];
            array[last] = b;
            first++;
            last--;
        }

        System.out.println("Array after reverse: ");

        for (int i=0;i < array.length;i++){
            System.out.println("array[" +i+"]: " + array[i]);
        }

    }
}
