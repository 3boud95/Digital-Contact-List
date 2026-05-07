public class BSTNode {
    private Person person;
    private BSTNode parent;
    private BSTNode left ;
    private BSTNode right;

    public BSTNode(Person p, BSTNode parent, BSTNode left, BSTNode right) {
        this.person = p;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public BSTNode getParent() {
        return parent;
    }

    public void setParent(BSTNode parent) {
        this.parent = parent;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

}