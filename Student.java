public class Student {
    private int studentId;
    private String name;
    private LibraryItem[] borrowedItems= new LibraryItem[5];
    private int borrowedCount=0;

    public Student (int studentId, String name){
      this.studentId=studentId;
      this.name= name;
    }

    public int getStudentId(){
      return studentId;
    }
    public String getName(){
      return name;
    }
    public int getBorrowedCount(){
      return borrowedCount;
    }
    public boolean canBorrow(){
      return borrowedCount<borrowedItems.length;
    }

    public void addBorrowedItem(LibraryItem item){
      if(canBorrow()==true){
        borrowedItems[borrowedCount] = item;
        borrowedCount++;
      }
    }
    public void removeBorrowedItem(int itemId){
      int foundIndex = -1;
      for (int i =0;i < borrowedCount; i++){
        if(borrowedItems[i].getItemId()== itemId){
          foundIndex = i;
          break;
        }
      }
      if (foundIndex!= -1){
        System.out.println("Item '"+ borrowedItems[foundIndex].getTitle()+ " ' returned by "+ name);

        for(int i = foundIndex; i< borrowedCount-1; i++){
          borrowedItems[i] = borrowedItems[i+1];
        }

        borrowedItems[borrowedCount-1] = null;
        borrowedCount--;
      }else{
        System.out.println("Item ID "+ itemId+" not found in "+ name + " 's borrowed list.");
      }
    }
    
    public void displayStudentInfo() {
        System.out.println("\n------------------------------------");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + name);
        System.out.println("Items Borrowed: " + borrowedCount + "/5");
        
        if (borrowedCount > 0) {
            System.out.println("Borrowed Items:");
            for (int i = 0; i < borrowedCount; i++) {
                System.out.println("  - [ID: " + borrowedItems[i].getItemId() + "] " + borrowedItems[i].getTitle());
            }
        } else {
            System.out.println("No items currently borrowed.");
        }
        System.out.println("------------------------------------");
    }
    
}
