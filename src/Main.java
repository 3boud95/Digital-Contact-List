import java.util.Scanner;

void main() {
    Scanner input = new Scanner(System.in);
    ContactList CL = new ContactList();
    BST phoneBook = new BST();

    int choice = 0;
    while (true) {
        System.out.println("Welcome to phone book menu, choose your type: \n" +
                "1. Binary Search Tree\n" +
                "2. LinkedList\n");

        System.out.println("Enter your choice: ");
        if (input.hasNextInt()) {
            choice = input.nextInt();
            input.nextLine();
            if (choice == 1 || choice == 2)
                break;
        } else {
            input.nextLine();
        }
    }

    if (choice == 2) {
        System.out.println("=== Phonebook Menu ===\n" +
                "1. Insert contact\n" +
                "2. Search by name\n" +
                "3. Remove contact\n" +
                "4. Update phone number\n" +
                "5. Display all contacts (sorted by name)\n" +
                "6. Show contacts starting with ....\n" +
                "7. Show total size\n" +
                "8. Exit");

        System.out.print("Enter Value: ");
        String state = input.nextLine();
        System.out.println("-------------------");

        while (!state.equals("8")) {
            if (state.equals("1")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                System.out.print("Enter Person number : ");
                String number = input.nextLine();
                Person p = new Person(name, number);
                CL.insert(p);
                System.out.println("Person Added Succesfully...");
            } else if (state.equals("2")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                CL.search(name);
            } else if (state.equals("3")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                CL.remove(name);
                System.out.println("Person Removed Succesfully...");
            } else if (state.equals("4")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                System.out.print("Enter new number : ");
                String number = input.nextLine();
                CL.updateExisting(name, number);
                System.out.println("PhoneNumber Updated Succesfully...");
            } else if (state.equals("5")) {
                CL.display();
            } else if (state.equals("6")) {
                System.out.print("Enter starting number : ");
                String number = input.nextLine();
                CL.displayIsolatedStarting(number);
            } else if (state.equals("7")) {
                System.out.println("Total contacts = " + CL.size());
            } else {
                System.out.println("Wrong input, Enter Again: ");
            }
            System.out.println("-------------------");
            System.out.println("=== Phonebook Menu ===\n" +
                    "1. Insert contact\n" +
                    "2. Search by name\n" +
                    "3. Remove contact\n" +
                    "4. Update phone number\n" +
                    "5. Display all contacts (sorted by name)\n" +
                    "6. Show contacts starting with ....\n" +
                    "7. Show total size\n" +
                    "8. Exit");
            System.out.print("Enter Value: ");
            state = input.nextLine().trim();
            System.out.println("-------------------");

        }

        System.out.println("Bye!!!");
    } else if (choice == 1) {
        String state = "";
        while (!state.equals("8")) {
            System.out.println("=== BST Phonebook Menu ===\n" +
                    "1. Insert contact\n" +
                    "2. Search by name\n" +
                    "3. Remove contact\n" +
                    "4. Update phone number\n" +
                    "5. Display all contacts (sorted by name)\n" +
                    "6. Show contacts starting with ....\n" +
                    "7. Show total size\n" +
                    "8. Exit");

            System.out.print("Enter Value: ");
            state = input.nextLine().trim();
            System.out.println("-------------------");

            if (state.equals("1")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                System.out.print("Enter Person number : ");
                String number = input.nextLine();
                Person p = new Person(name, number);
                phoneBook.insert(p);
                System.out.println("Person Added Succesfully...");
            } else if (state.equals("2")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                searchResult(phoneBook, name);
            } else if (state.equals("3")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                phoneBook.remove(name);
                System.out.println("Person Removed Succesfully...");
            } else if (state.equals("4")) {
                System.out.print("Enter Person name : ");
                String name = input.nextLine();
                System.out.print("Enter new number : ");
                String number = input.nextLine();
                phoneBook.UpdateExistingOne(name, number);
            } else if (state.equals("5")) {
                phoneBook.printAlphabetical();
            } else if (state.equals("6")) {
                System.out.print("Enter starting number : ");
                String number = input.nextLine();
                phoneBook.printStartingWith(phoneBook.root, number);
            } else if (state.equals("7")) {
                System.out.println("Total contacts = " + phoneBook.size());
            } else {
                System.out.println("Wrong input, Enter Again: ");
            }
        }
    }
}

public static void searchResult(BST tree, String name) {
    BSTNode result = tree.search(name);
    if (result != null) {
        // This will print the memory address unless you override toString in Person/BSTNode
        System.out.println("Found: " + result.getPerson().toString());
    } else {
        System.out.println("Search Result: " + name + " not found.");
    }
}
