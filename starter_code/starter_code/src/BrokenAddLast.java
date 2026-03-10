/**
 * @author George Gissel
 * Broken implementation for addLast(E).
 */
public class BrokenAddLast<E> extends DoublyLinkedList<E> {
    @Override
    public void addLast(E e) {
        // Incorrectly inserts at the front.
        super.addFirst(e);
    }
}
