public class PrintedBook extends LibraryItem {
  private int numPages;
  private String shelfLocation;

  public PrintedBook( int itemId, String title, String author, int numPages, String shelfLocation){
      super (itemId, title, author);
      this.numPages = numPages;
      this.shelfLocation = shelfLocation;

  }
  public int getNumPages(){
    return numPages;
  }
  public String shelfLocation(){
    return shelfLocation;
  }

  @Override 
  public void displayInfo(){
    System.out.println("\n--- Printed Book details ---");
    System.out.println("Item ID    : " + getItemId());
    System.out.println("Title    : " + getTitle());
    System.out.println("Author    : " + getAuthor());
    System.out.println("Status    : " + (isIssued() ? "Issued to " + getBorrowedBy().getName() : "Available"));
    System.out.println("Pages    : "+ numPages);
    System.out.println("Shelf Location    : " + shelfLocation);
  }
}
