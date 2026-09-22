public class LL{
    class Node{
        int data;
        Node next; //create a variable that store the reference to a Node.
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    class LinkedList{
        Node head;
        void insertBeggining(int data){
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        }
        void insertatend(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " -> ");
                temp=temp.next;

            }
            
            System.out.println("null");
        }
        void insertatpostion(int position,int data){
           
            Node newnode=new Node(data);
            if(position==0){
                newnode.next=head;
                head=newnode;
                return;
            }
            Node temp=head;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
            


        }
        void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    void middleNode(){
    Node temp = head;

    int low = 0;
    int high = 0;

    
    while(temp != null){
        temp = temp.next;
        high++;
    }

    temp = head;

    int middle = (low + high) / 2;

    
    for(int i = 0; i < middle; i++){
        temp = temp.next;
    }

    System.out.println("Middle Node: " + temp.data);
}
void deleteDuplicates() {
    Node temp = head;

    while (temp != null && temp.next != null) {

        if (temp.data == temp.next.data) {
            temp.next = temp.next.next;
        } else {
            temp = temp.next;
        }
    }
}
 void deleteatposition(int k){
            if(head==null){
                return;
            }
            if(k==1){
                head=head.next;
                return;
            }
            int count=0;
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                count++;
                if(count==k){
                    prev.next=prev.next.next;
                    return;


                }
                prev=temp;
                temp=temp.next;
            }
        }
        void deletefirst(){
            if(head==null){
                return;
            }
            head=head.next;

        }
        void deletelast(){
            if(head==null){
                return;
            }
            if (head.next == null) {
              head = null;
              return;
    }
            Node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;

            }
            temp.next=null;
        }
        
        
    }
    public static void main(String[] args) {
            LL obj=new LL();
            LinkedList list=obj.new LinkedList();

            list.insertBeggining(25);
            list.insertBeggining(30);
            list.insertBeggining(34);
            list.insertatpostion(2, 25);
            list.display();
            list.reverse();
            list.display();     


        }
}