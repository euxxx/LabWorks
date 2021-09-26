package lab_2;

public class TestList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToEnd(0);
        list.addToEnd(12);
        list.addToEnd(7);
        list.addToEnd(82);
        list.addToEnd(4);
        list.addToEnd(0);
        list.addToEnd(9);
        list.addToEnd(1);

        System.out.println("Длина списка составляет " + list.getLength() + " элемент(-а/-ов)");

        list.printList();

        list.addToBegin(2378);
        list.addToBegin(4);
        list.addToBegin(0);
        list.addToBegin(1);

        System.out.println("Длина списка составляет " + list.getLength() + " элемент(-а/-ов)");

        list.printList();

        list.purgeIndexedElement(3);

        list.printList();

        list.purgeIndexedElement(41);
    }
}
