public class ContactList {
    LinkedList list ;
    
    ContactList(){
        list = new LinkedList();
    }
    
    public void insert(Person p){
        if(list.size()<1 ){
            list.add(p, null);
        }else{
            boolean added = false ;
            Node n = list.firstP() ;
            for(int i=0; i<list.size(); i++){
                if( (n.getPerson().getPersonName()).compareTo(p.getPersonName()) < 0 ){
                    n = n.getNext() ;
                }
            }
            list.add(p, n);
        }
    }
    
    public void search(String p){
        System.out.println(list.indexOf(p).getPerson());
    }
    
    
    
    public void remove(String p){
        list.remove(list.indexOf(p));
    }
    public int size(){
        return list.size() ;
    }
    
    public void updateExisting(String p, String number){
        list.updateExisting(list.indexOf(p), number);
    }
    
    public void displayIsolatedStarting(String s){
        list.displayIsolated(s);
    }
    
    
    public void display(){
        list.display();
    }
    
    
}
