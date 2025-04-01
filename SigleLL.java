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
}