package DSA;

public class Main {
    public static void main(String[] args) {
        SigleLL sll = new SigleLL();
        sll.createSingleLL(5);
        System.out.println(sll.head.val);
        sll.insertionInSingleLL(6,1);
        sll.insertionInSingleLL(7,3);
        sll.insertionInSingleLL(8,4);
        sll.insertionInSingleLL(9,5);
        sll.insertionInSingleLL(10,6);
        sll.insertionInSingleLL(11,7);
        System.out.println(sll.head.next.val);

        sll.traversalInSingleLL();

        sll.searchInSingleLL(12);

        sll.deleteLL(); 
        
        sll.traversalInSingleLL();
    }
    
}
