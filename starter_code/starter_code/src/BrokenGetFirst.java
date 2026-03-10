/**
 * @author George Gissel
 * Broken implementation for getFirst().
 */
public class BrokenGetFirst<E> extends DoublyLinkedList<E> {
    @Override
    public E getFirst() {
        // Incorrectly returns the tail element.
        return super.getLast();
    }
}
