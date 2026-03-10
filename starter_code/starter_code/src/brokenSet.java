/**
 * @author Anne Villota
 * Broken implementation for set(). Should return incorrect oldVal.
 */
public class brokenSet<E> extends DoublyLinkedList<E> {
    @Override
    public E set(int index, E element) {
         checkElementIndex(index);
        Node<E> x = node(index);
        E oldVal = element; //return wrong element as oldVal
        x.item = element;
        return oldVal;  
    }
}