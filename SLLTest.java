public class SLLTest {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.add(1);
        sll.add(5);
        sll.add(3);
        sll.add(2);
        sll.add(4);
        // sll.printValues();
        // System.out.println(sll.find(3));
        sll.removeAt(3);
        sll.printValues();
    }
}