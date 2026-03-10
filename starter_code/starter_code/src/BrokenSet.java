/**
 * @author Anne Villota
 * Broken implementation for set(). Should return incorrect oldVal.
 */
public class BrokenSet<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
        // Incorrectly clamps index instead of throwing for out-of-bounds.
        int bounded = Math.max(0, Math.min(index, size() - 1));
        Node<E> x = node(bounded);
        x.item = element;
        return element; // wrong: return new value instead of old
    }
}
