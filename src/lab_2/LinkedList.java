package lab_2;

public class LinkedList {

    // поля:

    // первый и последний элементы
    private LinkedListNode<Integer> firstElement;
    private LinkedListNode<Integer> lastElement;

    // длина списка
    private long length = getLength();

    // ***

    /*

    TODO:
    1. Обычный конструктор
    2. Конструктор копирования

    */

    // методы:

    // добавление элементов в начало
    protected void addToBegin(Integer content) {
        LinkedListNode<Integer> list = new LinkedListNode<Integer>();
        list.content = content;

        if (firstElement == null) {
            firstElement = list;
            lastElement = list;
        } else {
            list.nextListElement = firstElement;
            firstElement = list;
        }

        length++;
    }

    // добавление элементов в конец
    protected void addToEnd(Integer content) {
        LinkedListNode<Integer> list = new LinkedListNode<Integer>();
        list.content = content;

        if (lastElement == null) {
            firstElement = list;
            lastElement = list;
        } else {
            lastElement.nextListElement = list;
            lastElement = list;
        }

        length++;
    }

    protected long getLength() {
        return length;
    }

    // вывод элементов массива
    protected void printList() {
        LinkedListNode<Integer> list = this.firstElement;

        while (list != null) {
            System.out.print(list.content);

            if (list.nextListElement != null) {
                System.out.print(" -> ");
            }

            list = list.nextListElement;
        }

        System.out.println();
    }

    // TODO: переделать с индекса на значение!

    protected void purgeIndexedElement(long index) {

        try {
            if (index > length) {
                throw new Exception("Указанный индекс превышает длину списка!");
            }

            LinkedListNode<Integer> list = this.firstElement;

            index-=2;

            for (long i = 0; i <= index; i++) {
                list = list.nextListElement;

                if (i == index) {
                    list.nextListElement = list.nextListElement.nextListElement;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
