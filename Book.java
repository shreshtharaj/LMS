public class Book {
  
  int bookId;
  String title;
  String author;
  boolean isIssued;
  int copiesAvailable;

  Book ( int bookId , String title , String author , int copiesAvailable){
    this.bookId=bookId;
    this.title=title;
    this.author=author;
    this.copiesAvailable=copiesAvailable;
    this.isIssued=(copiesAvailable==0);
  }

  Book ( int bookId, String title , String author ){
    this(bookId, title, author, 1);
  }

  public void displayBookInfo(){
    System.out.println("Book ID: "+bookId+" " +"Title: " + title+" "+ "Author: " +author+" " + "Copies Available: " + copiesAvailable+" " + "Issued Status: "+ isIssued);
  }

  public void issueOneCopy(){
    if (copiesAvailable>0){
      copiesAvailable--;
      if(copiesAvailable==0){
      isIssued= true;
      } 
    }
  }

  public void returnOneCopy(){
    copiesAvailable++;
    isIssued=false;
  }

}