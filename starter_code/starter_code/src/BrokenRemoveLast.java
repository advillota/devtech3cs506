/**
 * @author Anne Villota
 * Broken implementation for removeLast().
 */
public class BrokenRemoveLast<E> extends DoublyLinkedList<E> {
    @Override
    public E removeLast() {
        // Incorrectly removes from the front.
        return super.removeFirst();
    }
}
