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
    }
}