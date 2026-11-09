public abstract class LibraryItem implements Reservable {
  private int itemId;
  private String title;
  private String author;
  private boolean isIssued;
  private Student borrowedBy;

  public LibraryItem(int itemId, String title, String author){
    this.itemId=itemId;
    this.title=title;
    this.author=author;
    this.isIssued= false;
    this.borrowedBy=null;
  }

  public int getItemId(){
    return itemId;
  }
  public String getTitle(){
    return title;
  }
  public String getAuthor(){
    return author;
  }
  public boolean isIssued(){
    return isIssued;
  }
  public Student getBorrowedBy(){
    return borrowedBy;
  }


  public void issueTo(Student student){
    this.isIssued=true;
    this.borrowedBy=student;
  }

  public void returnItem(){
    this.isIssued=false;
    this.borrowedBy=null;
  }

  @Override 
  public void reserveItem(Student student){
    System.out.println("Item ' " + title + " ' reserved for " + student.getName());
  }

  @Override 
  public void cancelReservation(){
    System.out.println("Reservation cancelled for the item ' " + title + " ' ");
  }
  public abstract void displayInfo();
}
