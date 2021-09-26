package lab_2;

public class LinkedListNode <T> {

    // следующий элемент
    protected LinkedListNode<T> nextListElement;

    // содержимое элемента
    protected T content;

    public LinkedListNode(){
        this.nextListElement = null;
        this.content = null;
    }

    // конструктор
    public LinkedListNode(LinkedListNode<T> nextListElement, T content){
        this.nextListElement = nextListElement;
        this.content = content;
    }
}