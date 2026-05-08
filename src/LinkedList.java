public class LinkedList {
    private Node head ;
    private Node tail ;
    private int size ;
    
    LinkedList(){
        head = tail = null ;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null ;
    }
    public boolean isFull(){
        return false ;
    }
    public Node next(Node n){
        return n.getNext() ;
    }
    public Node prev(Node n){
        return n.getPrev() ;
    }
    private void addFirst(Person p){
        if(isEmpty()){
           head = tail = new Node(p, null, null) ;
           size +=1 ;
        }else{
            Node t = new Node(p,null, head);
            head.setPrev(t);
            head = t ;
            size++ ;
        }
    }
    private void addLast(Person p){
        if(isEmpty()){
           head = tail = new Node(p, null, null) ;
           size +=1 ;
        }else{
            Node t = new Node(p,tail, null);
            tail.setNext(t);
            tail= t;
            size++;
        }
    }
    public void add(Person p, Node node){
        if(isEmpty()){
            addFirst(p);
        }else if(node == head){
            addFirst(p);
        }else if(node == null){
            addLast(p);
        }else{
            Node t = new Node(p,node.getPrev(), node);
            t.getPrev().setNext(t);
            t.getNext().setPrev(t);
            size++;
        }
    }
    public Node indexOf(Person p){
        Node n = head ;
        for(int i=0; i<size; i++){
            if( n.getPerson() == p ){
                return n ;
            }
            n=n.next ;
        }
        System.out.println("Person Not Found");
        return null ;
    }
    public Node indexOf(String p){
        Node n = head ;
        for(int i=0; i<size; i++){
            if( n.getPerson().getPersonName().equals(p) ){
                return n ;
            }
            n=n.next ;
        }
        System.out.println("Person Not Found");
        return null ;
    }
    public Person get(Node n){
        return n.getPerson() ;
    }
    public void updateExisting(Node n, String phoneNum){
        if(isEmpty()){
            System.out.println("List is empty");
        }else{
            n.getPerson().setPhoneNumber(phoneNum);
        }
    }
    public void remove(Node n){
        if(isEmpty()){
            System.out.println("List is empty");
        }else if(n == head && head == tail){
            head=tail=null ;
            size-- ;
        }else if(n == head){
            head = head.next ;
            head.prev = null ;
            size--;
        }else if(n == tail){
            tail = tail.prev ;
            tail.next = null ;
            size--;
        }else{
            n.prev.setNext(n.next);
            n.next.setPrev(n.prev);
            size--;
        }
    }
    public void clear(){
        head = tail = null ;
        size = 0;
    }
    public Node firstP(){
        return head ;
    }
    public Node lastP(){
        return tail ;
    }
    public void display(){
        Node n = head ;
        for(int i=0; i<size; i++){
            System.out.println((i+1)+" "+ n.getPerson());
            n = next(n) ;
        }
    }
    public void displayIsolated(String s){
        Node n = head ;
        for(int i=0; i<size; i++){
            if(n.getPerson().getPhoneNumber().startsWith(s)){
                System.out.println((i+1)+" "+ n.getPerson());
            }
            n = next(n) ;
        }
    }
    public int size() {
        return size;
    }
}
