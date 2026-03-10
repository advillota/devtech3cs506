/**
 * @author Anne Villota
 * Broken implementation for size(). Should return incorrect size.
 */
public class BrokenSize<E> extends DoublyLinkedList<E> {
    @Override
    public int size() {
        return size - 1; //offset size to fail.
    }
}
