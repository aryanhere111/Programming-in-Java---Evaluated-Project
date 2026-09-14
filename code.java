import java.util.Scanner;

public class Library {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
            "Basics of Java Programming",
            "Python fun",
            "Data Structures",
            "Machine Learning",
            "Artificial Intelligence",
            "Database Management"
        };

        String[] domain = {
            "Programming",
            "Programming",
            "Programming",
            "AI",
            "AI",
            "Database"
        };

        
        System.out.println("  WELCOME TO LIBRARY SYSTEM");
       
        

        System.out.print("Create Username: ");
        String username = sc.nextLine();

        System.out.print("Create Password: ");
        String password = sc.nextLine();

        System.out.println("\nRegistration Successful!");

        

        System.out.println(" LOGIN ");

        System.out.print("Enter Username: ");
        String loginUsername = sc.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = sc.nextLine();

        

        if (loginUsername.equals(username) && loginPassword.equals(password)) {

            System.out.println("\nLogin Successful!");
            System.out.println("Hello " + username + "! Welcome to the Library.");

        }

        else {

            System.out.println("\nInvalid Username or Password.");
            System.out.println("Please try again later.");

            return;
        }


        

        for (;;) {

            System.out.println("\nDo you want Books or Other Files?");

            System.out.println("1. Books Domain");

            System.out.println("2. Other Files");

            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.println("\n BOOK DOMAINS ");

                System.out.println("1. Programming");

                System.out.println("2. AI");

                System.out.println("3. Database");

                System.out.print("Enter domain choice: ");
                int domainChoice = sc.nextInt();
                sc.nextLine();

                String selectedDomain;

                if (domainChoice == 1) {

                    selectedDomain = "Programming";

                    System.out.println(
                        "We Have - Java Programming (Not issued), " +
                        "Python fun (Not issued), " +
                        "Data Structures (Issued)"
                    );
                }

                else if (domainChoice == 2) {

                    selectedDomain = "AI";

                    System.out.println(
                        "We Have - Machine Learning (Not issued), " +
                        "Artificial Intelligence (Not issued)"
                    );
                }

                else if (domainChoice == 3) {

                    selectedDomain = "Database";

                    System.out.println(
                        "We Have - Database Management (Issued)"
                    );
                }

                else {

                    System.out.println(
                        "Invalid domain no book available for this Domain."
                    );

                }

                System.out.print("\nEnter the book you want to issue: ");
                String book = sc.nextLine();

                if (book.equals("Java Programming")) {

                    System.out.println(
                        "Java Programming is available, (issued)"
                    );
                }

                else if (book.equals("Python fun")) {

                    System.out.println(
                        "Python fun is available, (issued)"
                    );
                }

                else if (book.equals("Machine Learning")) {

                    System.out.println(
                        "Machine Learning is available, (issued)"
                    );
                }

                else if (book.equals("Artificial Intelligence")) {

                    System.out.println(
                        "Artificial Intelligence is available, (issued)"
                    );
                }

                else {

                    System.out.println(
                        "This book is not Available"
                    );
                }

                if (book.equals("Java Programming")) {

                    System.out.println(
                        "Book is issued, return time is 15 Days, return it on time!!"
                    );
                }

                else if (book.equals("Python fun")) {

                    System.out.println(
                        "Book is issued, return time is 15 Days, return it on time!!"
                    );
                }

                else if (book.equals("Machine Learning")) {

                    System.out.println(
                        "Book is issued, return time is 15 Days, return it on time!!"
                    );
                }

                else if (book.equals("Artificial Intelligence")) {

                    System.out.println(
                        "Book is issued, return time is 15 Days, return it on time!!"
                    );
                }

                else {

                    System.out.println(
                        "Return to main menu!!"
                    );
                }
            }
        }
    }
}
