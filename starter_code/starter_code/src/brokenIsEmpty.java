/**
 * @author Anne Villota
 * Broken implementation for isEmpty(). Should return incorrect boolean.
 */
public class brokenIsEmpty<E> extends DoublyLinkedList<E> {
    @Override
    public boolean isEmpty() {
        return size() != 0; //flip condition
    }
}