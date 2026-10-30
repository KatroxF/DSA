import java.util.*;
public class binarytree {
    Node root; //Create a variable named root whose type is Node.
    static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
            
        }
    }
    public void populate(Scanner scanner){
        System.out.println("Enter the root node: ");
        int value=scanner.nextInt();
        Node root=new Node(value);
        populate(scanner,root);

    }
    public void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of" + node.value );
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left of" + node.value);
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);

        }
        System.out.println("Do you want to enter right of" + node.value);
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of right of" + node.value);
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);

        }
    }
    public void display(){
        display(this.root,"");  //this refer to tree object root is the instance variable of type Node
    }
   public void display(Node node,String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+ "\t");
        display(node.right,indent+ "\t");
    }
    public void bfs(){
        if(this.root==null){
            return;

        }
        Queue<Node> queue=new LinkedList<>();
        queue.offer(this.root);
        while(!queue.isEmpty()){
            Node current=queue.poll();
            if(current.left!=null){
                queue.offer(current.left);

            }
            if(current.right!=null){
                queue.offer(current.right);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        binarytree tree=new binarytree();
        tree.populate(scanner);
        System.out.println("\nYour binary tree");
        tree.display();
        scanner.close();
        System.out.println("\nBFS traversal:");
        tree.bfs();
        scanner.close();

    }
}
