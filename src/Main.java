//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    BST phoneBook = new BST();

    // 2. Add some contacts
    System.out.println("--- Adding Contacts ---");
    phoneBook.insert(new Person("John", "123-4567"));
    phoneBook.insert(new Person("Alice", "987-6543"));
    phoneBook.insert(new Person("Zack", "555-0199"));
    phoneBook.insert(new Person("Mary", "444-2222"));

    System.out.println("Total contacts: " + phoneBook.size());

    // 3. Test the Search Function (Recursive)
    System.out.println("\n--- Searching for Contacts ---");
    searchResult(phoneBook, "Alice");
    searchResult(phoneBook,"Bob"); // Should not be found

    // 4. Test the Remove Function
    System.out.println("\n--- Removing Contact: Mary ---");
    phoneBook.remove("Mary");
    searchResult(phoneBook, "Mary");
    System.out.println("Final total contacts: " + phoneBook.size());
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
