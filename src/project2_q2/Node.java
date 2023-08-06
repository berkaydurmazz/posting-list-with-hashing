package project2_q2;

public class Node<Item> {
    Node<Item> next;
    Item data;
    
    public Node(Item data){
        next=null;
        this.data=data;
    }
    public String toString(){
        return (data+",");
    }
}
