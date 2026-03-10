/**
 * @author George Gissel
 * Broken implementation for getLast().
 */
public class BrokenGetLast<E> extends DoublyLinkedList<E> {
    @Override
    public E getLast() {
        // Incorrectly returns the head element.
        return super.getFirst();
    }
}
