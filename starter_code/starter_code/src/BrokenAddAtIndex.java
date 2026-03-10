/**
 * @author George Gissel
 * Broken implementation for add(int, E).
 */
public class BrokenAddAtIndex<E> extends DoublyLinkedList<E> {
    @Override
    public void add(int index, E element) {
        // Incorrectly ignores index and always appends.
        super.addLast(element);
    }
}
