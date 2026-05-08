 public class Node{
    protected Person p ;
    protected Node next ;
    protected Node prev ;

    public Node(Person p, Node prev, Node next) {
        this.p = p;
        this.next = next;
        this.prev = prev;
    }
    public Person getPerson() {
        return p;
    }
    public void setPerson(Person p) {
        this.p = p;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}