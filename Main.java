package DSA;

public class Main {
    public static void main(String[] args) {
        SigleLL sll = new SigleLL();
        sll.createSingleLL(5);
        System.out.println(sll.head.val);
        sll.insertionInSingleLL(6,1);
        sll.insertionInSingleLL(4,3);
        System.out.println(sll.head.next.val);
    }
    
}
