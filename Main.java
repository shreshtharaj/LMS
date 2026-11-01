import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    CatalogManager manager = new CatalogManager();
    int choice;

    do{
      System.out.println("1. Add New Book");
      System.out.println("2. Display All Books");
      System.out.println("3. Search Book by ID");
      System.out.println("4. Issue a Book");
      System.out.println("5. Return a Book");
      System.out.println("6. Exit System");
      System.out.println("Enter choice: ");
    
      choice = sc.nextInt();

      switch(choice){
        case 1:
          System.out.println("Enter Book ID: ");
          int id =sc.nextInt();
          sc.nextLine();

          System.out.println("Enter Title: ");
          String title = sc.nextLine();

          System.out.println(("Enter Author: "));
          String author = sc.nextLine();

          System.out.println("Enter Copies Available: ");
          int copies = sc.nextInt();

          Book newBook = new Book(id, title, author, copies);
          manager.addBook(newBook);
          break;

          case 2:
            manager.displayCatalog();
            break;

          case 3:
            System.out.println("Enter Book ID to search: ");
            int searchId = sc.nextInt();
            Book foundBook=manager.searchBookById(searchId);
            if(foundBook!= null){
              foundBook.displayBookInfo();
            } else {
              System.out.println("Book not found in catalog!");
            }
            break;

          case 4:
            System.out.println("Enter Book Id to issue");
            int issueId= sc.nextInt();
            manager.issueBook(issueId);
            break;

          case 5:
            System.out.println("Enter book id to return");
            int returnId=sc.nextInt();
            manager.returnBook(returnId);
            break;

          case 6:
            System.out.println("Exiting System. Goodbye!");
            break;

          default:
            System.out.println("Invalid option! Please enter a number between 1 & 6.");
      }

    } while (choice!=6);
    sc.close();
  }
}
