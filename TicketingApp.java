import java.util.Scanner;

public class TicketingApp {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\t\t\t WELCOME TO TRENDLY EVENTS");
        userDashboard();
    }

    public static void userDashboard() {

        String userDashboard = """
                1. Search event
                2. View events
                3. Create events
                4. Book events
                5. Wallet
                6. Sign out
                """;

        System.out.println(userDashboard);

        int choice = input.nextInt();
        input.nextLine(); 

        EventServices service = new EventServices();

        switch (choice) {

            case 1 -> {
                System.out.println("Search event: ");
                String search = input.nextLine();
                service.searchEvent(search);
            }

            case 2 -> {
                service.listOfEvents();
            }

            case 3 -> {
                service.getEventDetails();
            }

            case 4 -> {
                System.out.println("Booking ticket...");
            }

            case 5 -> {
                System.out.println("Opening wallet...");
            }

            case 6 -> {
                System.out.println("Signed out successfully.");
                    SignIn.handleSignOut();
            }

            default -> {
                System.out.println("Invalid choice");
                userDashboard();
            }
        }
    }
}
