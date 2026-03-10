/**
 * @author George Gissel
 * Broken implementation for addFirst(E).
 */
public class BrokenAddFirst<E> extends DoublyLinkedList<E> {
    @Override
    public void addFirst(E e) {
        // Incorrectly inserts at the back.
        super.addLast(e);
    }
}
