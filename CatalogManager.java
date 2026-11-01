public class CatalogManager {

  Book[] catalog = new Book[50];
  int totalBooks = 0;

  public void addBook( Book newBook){
    if (totalBooks<catalog.length){
      catalog[totalBooks]=newBook;
      totalBooks++;
      System.out.println("Book added to the catalog successfully"); 
    }
    else{
      System.out.println("Catalog is full! Cannot add more books");
    }
  }

  public void displayCatalog(){
    if(totalBooks==0){
      System.out.println("Catalog is empty");
    }
    else{
      for(int i=0; i< totalBooks; i++){
        catalog[i].displayBookInfo();
      }
    }
  }

  public Book searchBookById(int targetId) {
    for(int i =0; i<totalBooks;i++){
      if (catalog[i].bookId==targetId){
        return catalog[i];
      }
    }
        return null;     
  }

  public void issueBook(int targetId){

    Book foundBook= searchBookById((targetId));
    if(foundBook==null){
      System.out.println("Book not found in catalog");
    } else {
      foundBook.issueOneCopy();
    }
  }

  public void returnBook( int targetId){
    Book foundBook = searchBookById(targetId);
    if (foundBook==null){
      System.out.println("Book not found in Catalog");
    } else {
      foundBook.returnOneCopy();
    }
  }
}

