import java.util.Scanner;

public class DataStructureProjects {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContactList CL = new ContactList() ;
        
        {
//            //remove comment to add to contact list 
//            Person[] people = new Person[15];
//            
//            people[0] = new Person("Ahmed Mohamed", "01012345678");
//            people[1] = new Person("Sara Hassan", "01123456789");
//            people[2] = new Person("Mahmoud Ibrahim", "01234567890");
//            people[3] = new Person("Laila Soliman", "01545678901");
//            people[4] = new Person("Omar Sharif", "01098765432");
//            people[5] = new Person("Zainab Mansour", "01187654321");
//            people[6] = new Person("Mostafa Bakr", "01276543210");
//            people[7] = new Person("Yasmine Sabry", "01565432109");
//            people[8] = new Person("Ihab Galal", "01011223344");
//            people[9] = new Person("Jana El Diwany", "01155667788");
//            people[10] = new Person("Karim Abdel Aziz", "01299001122");
//            people[11] = new Person("Lamia El Sayed", "01533445566");
//            people[12] = new Person("Mazen Gamal", "01077889900");
//            people[13] = new Person("Nour El Sherif", "01144556677");
//            people[14] = new Person("Abdelrahman Isaac", "01222334455");
//
//            for(int i=0 ; i<15; i++){
//                CL.insert(people[i]);
//            }
        }
        
        
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
        String state = input.nextLine() ;
        System.out.println("-------------------");
        
        while (! state.equals("8") ){
            if(state.equals("1")){
                System.out.print("Enter Person name : ");
                String name = input.nextLine() ;
                System.out.print("Enter Person number : ");
                String number = input.nextLine() ;
                Person p = new Person(name,number);
                CL.insert(p);
                System.out.println("Person Added Succesfully...");
            }else if(state.equals("2")){
                System.out.print("Enter Person name : ");
                String name = input.nextLine() ;
                CL.search(name);
            }else if(state.equals("3")){
                System.out.print("Enter Person name : ");
                String name = input.nextLine() ;
                CL.remove(name);
                System.out.println("Person Removed Succesfully...");
            }else if(state.equals("4")){
                System.out.print("Enter Person name : ");
                String name = input.nextLine() ;
                System.out.print("Enter new number : ");
                String number = input.nextLine() ;
                CL.updateExisting(name, number);
                System.out.println("PhoneNumber Updated Succesfully...");
            }else if(state.equals("5")){
                CL.display();
            }else if(state.equals("6")){
                System.out.print("Enter starting number : ");
                String number = input.nextLine() ;
                CL.displayIsolatedStarting(number);
            }else if(state.equals("7")){
                System.out.println("Total contacts = "+ CL.size());
            }else{
                System.out.println("Wrong input, Enter Again:: ");
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
        
        
        
        
        
        
    }
    
    
    
    
}
