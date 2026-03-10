/**
 * @author Anne Villota
 * Broken implementation for set(). Should return incorrect oldVal.
 */
public class BrokenSet<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return element; // wrong: return new value instead of old
    }
}
