
package project2_q2;

public class LinkedList <T>{
    Node <T> first,last;
   int size;
   String data;

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
        data=null;
    }
   public void insertFirst(T x) {
        Node newNode = new Node (x);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    } 
   public Node<T> search(String s){
         Node<T> tmp;
         tmp=first;
         while(tmp!=null){
             if(tmp.data.equals(s))
                 return tmp;
             tmp=tmp.next;
         }
         return null;
     }
   void print(){
        Node tmp=this.first;
        while(tmp!= null){
            System.out.print(tmp.toString());
            tmp=tmp.next;
        }
        System.out.println("");
    }
}
