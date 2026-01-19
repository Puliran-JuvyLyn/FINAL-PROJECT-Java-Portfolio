import java.util.Scanner;

public class LibrarySystem {
    static final int MAX_BOOKS = 5;
    static String[] titles = new String[MAX_BOOKS];
    static String[] statuses = new String[MAX_BOOKS];
    static int bookCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Display Main Menu
            System.out.println("\n=== Library Book Management System ===");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book Status");
            System.out.println("3. Show All Books");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear newline

            // Menu handling with switch-case
            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    updateBookStatus(sc);
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    generateReport();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please enter 1–5.");
            }
        } while (choice != 5);

        sc.close();
    }

    // Add a New Book
    public static void addBook(Scanner sc) {
        if (bookCount >= MAX_BOOKS) {
            System.out.println("Cannot add more books. Limit reached.");
            return;
        }
        System.out.print("Enter book title: ");
        titles[bookCount] = sc.nextLine();
        statuses[bookCount] = "Available"; // default status
        bookCount++;
        System.out.println("Book added successfully!");
    }

    // Update Book Status (toggle between Available and Borrowed)
    public static void updateBookStatus(Scanner sc) {
        if (bookCount == 0) {
            System.out.println("No books to update.");
            return;
        }
        showBooks();
        System.out.print("Enter book number to update: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num < 1 || num > bookCount) {
            System.out.println("Invalid book number!");
            return;
        }
        
        if (statuses[num - 1].equals("Available")) { //default
            statuses[num - 1] = "Borrowed";
        } else {
            statuses[num - 1] = "Available";
        }
        System.out.println("Book status updated!");
    }

    // Show All Books
    public static void showBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the system.");
            return;
        }
        System.out.println("\n=== List of Books ===");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + titles[i] + " [" + statuses[i] + "]");
        }
    }

    // Generate Report
    public static void generateReport() {
        int available = 0, borrowed = 0;
        for (int i = 0; i < bookCount; i++) {
            if (statuses[i].equals("Available")) {
                available++;
            } else {
                borrowed++;            
            }
        }
        System.out.println("\n=== Library Report ===");
        System.out.println("Books Registered: " + bookCount);
        System.out.println("Available: " + available);
        System.out.println("Borrowed: " + borrowed);
    }
}
