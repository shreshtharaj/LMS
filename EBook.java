public class EBook extends LibraryItem {
  private double fileSizeMB;
  private String downloadUrl;

  public ( int itemId, String title, String author, double fileSizeMB, String downloadUrl){

    super (itemId, title, author);
    this.fileSizeMB=fileSizeMB;
    this.downloadUrl=downloadUrl;
  }

  public int getFileSizeMB(){
    return getFileSizeMB();
  }
  public int getDownloadUrl(){
    return getDownloadUrl();
  }

  @Override 

  
}
