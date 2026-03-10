import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DoublyLinkedListTest {
    /**
     * Use this to toggle between using the DoublyLinkedList class and your broken classes
     * You may submit with either true or false.
     */
    boolean SHOULD_FAIL = false;

    private DoublyLinkedList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new DoublyLinkedList<>();
    }

        // Tests for get

    /**
     * @author grayson_replace_this
     * @see GetAtOutOfBoundsThrowsException
     * given example tests
     */
    @Test
    public void testGetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new GetAtOutOfBoundsThrowsException<>();

        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-1));
    }

    /**
     * @author Anne Villota
     * @see list.add()
     * Tests that get() returns the element added 
     */
    @Test
    public void testGetAtIndex() {
        list.add(1, 0);
        list.add(2, 1);
        list.add(3,2);
        list.add(4, 3);

        assertEquals(2, list.get(3));
    }

    // Tests for getFirst

     /**
     * @author Anne Villota
     * @see list.addFirst()
     * Tests that get() returns the element at the front of the stack
     */
    @Test
    public void testGetFirst() {
        list.addFirst(1);
        list.addFirst(3);  
        list.addFirst(2);  

        assertEquals(2, list.getFirst()); //check last element added
    }

    // Tests for getLast

    
     /**
     * @author Anne Villota
     * @see list.addFirst()
     * Tests that get() returns the element at the front of the stack
     */
    @Test
    public void testGetFirst() {
        list.addFirst(1);
        list.addFirst(3);  
        list.addFirst(2);  

        assertEquals(1, list.getLast()); //check first element added
    }
    
    // Tests for isEmpty

    /**
     * @author
     * @see
     */
    @Test
    public void testIsEmptyWhenCreated() {
    }

    // Tests for add

    /**
     * @author
     * @see
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        fail("Not yet implemented");
    }

    // Tests for addFirst

    /**
     * @author
     * @see
     */
    @Test
    public void testAddFirstAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for addLast

    /**
     * @author
     * @see
     */
    @Test
    public void testAddLastAddsElement() {
        fail("Not yet implemented");
    }

    // Tests for remove

    /**
     * @author
     * @see
     */
    @Test
    public void testRemoveAtIndex() {
        fail("Not yet implemented");
    }

    // Tests for removeFirst

    // Tests for removeLast

    // Tests for size

    // Tests for set

}