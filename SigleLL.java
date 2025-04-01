package DSA;

public class SigleLL{
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.val = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;
    }

    //Insertion

    public void insertionInSingleLL(int nodeValue, int location){
        Node nod = new Node();
        nod.val = nodeValue;
        if(head == null){
            createSingleLL(nodeValue);
            return;
        }else if(location == 0){
            nod.next = head;
            head = nod;
        }else if(location >= size){
            nod.next = null;
            tail.next = nod;
            tail = nod; 

        }
        else{
             Node tempNode = head;
             int index =0;
             while(index <location-1){
                tempNode = tempNode.next;
                index++;
             }
             Node nextNode = tempNode.next;
             tempNode.next = nod;
             nod.next = nextNode;
        }
        size++;
    }

    // traversal
    public void traversalInSingleLL(){
        if(head == null){
            System.out.println("LL doen't exist");
        }else{
            Node tempNode = head;
            for(int i =0;i<size;i++){
                System.out.print(tempNode.val);
                if(i != size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    //Search in LL

    public boolean searchInSingleLL(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.val == nodeValue){
                    System.out.println("forund node in "+i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("Node not found");
        return false;

    }

    //Delete a singleLL
    public void deleteInSingleLL(int location){
        if(head == null){
            System.out.println("LL doesnot exist");

        }
        else if(location == 0){
            head = head.next;
            size--;
            if(size ==0){
                tail = null;
            }
        }else if(location >= size){
            Node tempNode = head;
            for(int i =0;i<size-1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                tail = head = null;
                size --;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode  = head;
            for(int  i =0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //Delete entire single LL
    public void deleteLL(){
        head = null;
        tail = null;
        System.out.println("Deleted successfully");
    }

}