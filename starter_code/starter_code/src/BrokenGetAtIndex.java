/**
 * @author George Gissel
 * Broken implementation for get(int).
 */
public class BrokenGetAtIndex<E> extends DoublyLinkedList<E> {
    @Override
    public E get(int index) {
        checkElementIndex(index);
        // Incorrectly shifts the index right by one (clamped at tail).
        int shifted = Math.min(size() - 1, index + 1);
        return super.get(shifted);
    }
}
