/**
 * @author Anne Villota
 * Broken implementation for removeFirst().
 */
public class BrokenRemoveFirst<E> extends DoublyLinkedList<E> {
    @Override
    public E removeFirst() {
        // Incorrectly removes from the back.
        return super.removeLast();
    }
}
