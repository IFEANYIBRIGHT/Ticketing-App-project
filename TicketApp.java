import java.util.Scanner;
public class TicketingApp {
    public static void main(String[] args) {
    
       Scanner input = new Scanner(System.in);

    System.ou.println("\t\t\t\t\t\t WELCOME TO TRENDLY EVENTS \t\t\t\t\t\t");

   System.out.println("\t\t\t USER DASHBOARD \t\t\t");

  }
    public static void userDashboard(){
         
           String userDashboard = """     
                    1. Search event
                    2. View events 
                    3. Create events 
                    4. Book events
                    5. Wallet
                    5. Sign out
                    """;
        System.out.println(userDashboard);    


            int choice = input.nextInt();


        switch (choice) {   
            case 1 ->{
                searchEvent();
                    System.out.println("Search event: ");
                    String search = input.nextLine();

                        EventServices.searchEvent(Search);
            }



            case 2->{
                viewEvent();
            }



            case 3->{
                createEvent();
                    System.out.println("Create an  event: ");
                    String event = input.nextLine();

                    EventServices.getEventDetails();
            }


            case 4->{
                bookTicket();
            }


            case 5->{
                walletMenu();
            }


            case 6->{
                System.out.println("Signed out successfully.");
            }
                    
 
            default->{
                System.out.println("Invalid choice");
                userDashboard();
            }
        }
    }




//    public static void searchEvents(){
//
//          System.out.println("1. Type Event Name");
//          System.out.println("2. View Events");
//
//        int choice = input.nextInt();
//
//
//        if (choice == 1) {
//            System.out.println("Enter event name:");
//            String name = input.nextLine();
//            System.out.println("Searching for: " + name);
//
//        } 
//        else if (choice == 2) {
//            viewEventsMenu();
//        } 
//        else {
//            System.out.println("Invalid choice");
//            searchEventsMenu();
//        }
//    }
//
//
//
//
//    public static void viewEventsMenu() {
//        System.out.println("1. Display Events");
//        System.out.println("2. Book Ticket");
//        System.out.println("3. Main Menu");
//
//        int choice = input.nextInt();
//        input.nextLine();
//
//        switch (choice) {
//            case 1->
//                displayEvents();
//
//            case 2->
//                bookTicket();
//
//            case 3->
//                userDashboard();
//
//            default->
//                System.out.println("Invalid choice");
//                viewEventsMenu();
//        }
//    }
//
//
//
//        public static void displayEvents() {
//        System.out.println("Displaying all available events...");
//        viewEventsMenu();
//    }
//
//    public static void bookTicket() {
//        System.out.println("Booking ticket...");
//        viewEventsMenu();
//    }
//
//    public static void createEvent() {
//        System.out.println("Creating new event...");
//        userDashboard();
//    }
//
//    public static void walletMenu() {
//        System.out.println("Opening wallet...");
//
//    }































//}
    }   
