public class BST {
    BSTNode root ;
    int size ;

    public BST(){
        root = null ;
        size = 0 ;
    }

    public boolean isEmpty(){
        return root == null ;
    }

    public BSTNode root(){
        return root ;
    }

    public int size(){
        return size ;
    }

    public void insert(Person person){
        if (isEmpty()){
            root = new BSTNode(person, null, null, null);
            size++;
            return;
        }
        BSTNode current = root;
        BSTNode parent = null;

        while (current != null){
            parent = current;

            int cmp = person.compareTo(current.getPerson());

            if (cmp < 0) {
                current = current.getLeft();
            } else if (cmp > 0) {
                current = current.getRight();
            } else {
                return;
            }
        }

        BSTNode newNode = new BSTNode(person, parent, null, null);

        if (person.compareTo(parent.getPerson()) < 0) {
            parent.setLeft(newNode);
        } else {
            parent.setRight(newNode);
        }

        size++;
    }

    public BSTNode search(String targetName) {
        return recursiveSearch(root, targetName);
    }

    private BSTNode recursiveSearch(BSTNode current, String targetName) {
        if (current == null) {
            return null;
        }

        int cmp = targetName.toLowerCase().compareTo(current.getPerson().getPersonName().toLowerCase());

        if (cmp == 0) {
            return current;
        } else if (cmp < 0) {
            return recursiveSearch(current.getLeft(), targetName);
        } else {
            return recursiveSearch(current.getRight(), targetName);
        }

    }

    public void remove(String targetName) {

        BSTNode nodeToKill = search(targetName);

        if (nodeToKill == null) {
            System.out.println("Contact not found");
            return;
        }

        kill(nodeToKill);
        size--;
    }

    private void kill(BSTNode node) {

        if (node.getLeft() == null || node.getRight() == null) {
            BSTNode child = (node.getLeft() != null) ? node.getLeft() : node.getRight();

            if (node.getParent() == null) {
                root = child;
            } else if (node == node.getParent().getLeft()) {
                node.getParent().setLeft(child);
            } else {
                node.getParent().setRight(child);
            }

            if (child != null) {
                child.setParent(node.getParent());
            }
        }
        else {
            BSTNode successor = getMin(node.getRight());
            node.setPerson(successor.getPerson());
            kill(successor);
        }
    }

    private BSTNode getMin(BSTNode node) {
        while (node.getLeft() != null)
            node = node.getLeft();
        return node;
    }

    public void printAlphabetical() {
        printRecursive(this.root);
    }

    private void printRecursive(BSTNode node) {
        if (node != null) {
            printRecursive(node.getLeft());
            System.out.println(node.getPerson());
            printRecursive(node.getRight());
        }
    }

    public void UpdateExistingOne(String name, String number) {
        BSTNode node = search(name);
        if (node == null) {
            System.out.println("Contact not found!");
        }

        node.getPerson().setPhoneNumber(number);

        System.out.println("Number Edited Successfully...");
    }

    public void printStartingWith(BSTNode node, String prefix) {
        if (node != null) {
            printStartingWith(node.getLeft(), prefix);
            if (node.getPerson().getPersonName().startsWith(prefix)) {
                System.out.println(node.getPerson());
            }
            printStartingWith(node.getRight(), prefix);
        }
    }
}