package linklistt;
import java.util.*;

public class Linklistt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
      
        while (true) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            System.out.println("Options:");
            System.out.println("[1] Insert into Array");
            System.out.println("[2] Insert into Linked List");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                array.add(number);
                System.out.println("Array after insertion: " + array);
            } else if (choice == 2) {
                System.out.println("Options:");
                System.out.println("[1] Insert at Beginning");
                System.out.println("[2] Insert at End");
                System.out.print("Choice: ");
                int position = scanner.nextInt();

                if (position == 1) {
                    linkedList.addFirst(number);
                } else if (position == 2) {
                    linkedList.addLast(number);
                }

                System.out.print("Linked list after insertion: ");
                for (int num : linkedList) {
                    System.out.print(num + " -> ");
                }
                System.out.println("null");
            } else {
                System.out.println("Invalid choice.");
            }

            // Input validation for proceed
            String proceed;
            while (true) {
                System.out.print("Proceed? [yes/no]: ");
                proceed = scanner.next().toLowerCase(); // Convert input to lowercase
                
                if (proceed.equals("yes")) {
                    break; // Valid input, continue the loop
                } else if (proceed.equals("no")) {
                    System.out.println("Terminating program...");
                    scanner.close();
                    return; // Exits the `main` method, stopping the program
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }
        }
    }
}
