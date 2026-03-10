/**
 * @author Anne Villota
 * Broken implementation for remove(int).
 */
public class BrokenRemoveAtIndex<E> extends DoublyLinkedList<E> {
    @Override
    public E remove(int index) {
        checkElementIndex(index);
        // Incorrectly removes the previous element when possible.
        int shifted = Math.max(0, index - 1);
        return super.remove(shifted);
    }
}
