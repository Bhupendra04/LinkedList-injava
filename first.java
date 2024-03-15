class LL{
  Node head;
  
  class Node{
      String data;
      Node next;
      Node(String data){
          this.data=data;
          this.next=null;
      }
  }
  //add
  public void addFirst(String data){
      Node newNode=new Node(data);
      if(head==null){
          head=newNode;
          return;
      }
      newNode.next=head;
      head=newNode;
  }
  public void addLast(String data){
      Node newNode=new Node(data);
      if(head==null){
          head=newNode;
          return;
      }
      Node currNode=head;
      while(currNode.next!=null){
          currNode=currNode.next;
      }
      currNode.next=newNode;
  }
  
  public void printList(){
      
      if(head==null){
          System.out.println("List are Empty");
          return;
      }
      Node currNode=head;
      while(currNode.next!=null){
          System.out.print(currNode.data+" --> ");
          currNode=currNode.next;
      }
      System.out.println("NULL");
  }
  //remove
  public void removeFirst(){
      if(head==null){
          System.out.println("List are Empty");
          return;
      }
      head=head.next;
  }
  public void removeLast(){
      if(head==null){
          System.out.print("List are Empty");
          return;
      }
      if(head.next==null){
          head=null;
          return;
      }
      Node secondLast=head;
      Node lastNode=head.next;
      while(lastNode.next!=null){
          lastNode=lastNode.next;
          secondLast=secondLast.next;
      }
      secondLast.next=null;
  }
  public static void main(String args[]){
      LL list=new LL();
      list.addFirst("a");
      list.addFirst("is");
      list.addFirst("This");
      list.addLast("List");
      System.out.println("After Adding Elements :");
      list.printList();
      System.out.println("After Delete First :");
      list.removeFirst();
      list.printList();
      System.out.println("After Delete Last :");
      list.removeLast();
      list.printList();
  }
}