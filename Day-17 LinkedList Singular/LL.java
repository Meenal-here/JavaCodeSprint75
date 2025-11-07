public class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
     //add-> add first and add last
     //add node at the beginning
        public void addFirst(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
                newNode.next=head;
                head=newNode;
        }
        //add node at the end
        public void addLast(String data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode = head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
        public void printList(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node currNode=head;
            while(currNode!=null){
              System.out.print(currNode.data+"->");
              currNode=currNode.next;
            }
            System.out.println("null");
        }

        public void removeFirst(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
            size--;
        }
        //delete last node
        public void removeLast(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
               secondLast=lastNode;
               lastNode=lastNode.next;
            }

            secondLast.next=null;
        }
        public int getSize(){
            return size;
        }
    public static void main(String[] args) {
        LL list = new LL(); 
        list.addFirst("Hello");
        list.addFirst("World");
        list.addLast("Java");
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        System.out.println("Size of the list: " + list.getSize());

}
}