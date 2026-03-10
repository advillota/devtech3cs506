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
     * @author Anne Villota
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
     * @see BrokenGetAtIndex
     * Tests that get() returns the element added 
     */
    @Test
    public void testGetAtIndex() {
        if (SHOULD_FAIL) list = new BrokenGetAtIndex<>();
        list.addFirst(1);
        list.add(1, 1);
        list.add(1,2);
        list.add(2, 3);

        assertEquals(3, list.get(2));
    }

    // Tests for getFirst

     /**
     * @author Anne Villota
     * @see BrokenGetFirst
     * Tests that get() returns the element at the front of the stack
     */
    @Test
    public void testGetFirst() {
        if (SHOULD_FAIL) list = new BrokenGetFirst<>();

        list.addFirst(1);
        list.addFirst(3);  
        list.addFirst(2);  

        assertEquals(2, list.getFirst()); //check last element added
    }

    // Tests for getLast

    
     /**
     * @author Anne Villota
     * @see BrokenGetLast
     * 
     * Tests that get() returns the element at the back of the stack
     */
    @Test
    public void testGetLast() {
        if (SHOULD_FAIL) list = new BrokenGetLast<>();

        list.addFirst(1);
        list.addFirst(3);  
        list.addFirst(2);  

        assertEquals(1, list.getLast()); //check first element added (now last)
    }
    
    // Tests for isEmpty

    /**
     * @author George Gissel
     * @see BrokenIsEmpty
     */
    @Test
    public void testIsEmptyWhenCreated() {
        if (SHOULD_FAIL) list = new BrokenIsEmpty<>();
        assertTrue(list.isEmpty());
    }

    /**
     * @author George Gissel
     * @see BrokenIsEmpty
     */
    @Test
    public void testIsEmptyWhenNotEmpty() {
        if (SHOULD_FAIL) list = new BrokenIsEmpty<>();
        list.addLast(1);
        assertFalse(list.isEmpty());
        list.addLast(2);
        assertFalse(list.isEmpty());
    }

    /**
     * @author George Gissel
     * @see BrokenIsEmpty
     */
    @Test
    public void testIsEmptyAfterRemovingAll() {
        if (SHOULD_FAIL) list = new BrokenIsEmpty<>();
        list.addLast(1);
        list.addLast(2);
        list.removeFirst();
        list.removeFirst();
        assertTrue(list.isEmpty());
    }


    // Tests for add

    /**
     * @author Anne Villota
     * @see IndexOutOfBoundsException
     * Check if add will throw exception for invalid index
     */
    @Test
    public void testAddAtIndexOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new BrokenAddAtIndex<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-2, 1)); //neg index
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(10, 1)); //index bigger than size
    }

    // Tests for addFirst

   
     /**
     * @author Anne Villota
     * @see BrokenAddFirst
     * Tests that add() adds the element at the correct index 
     */
    
    @Test
    public void testAddFirstAddsElement() {
        if (SHOULD_FAIL) list = new BrokenAddFirst<>();
        list.addFirst(1); //empty list
        assertEquals(1, list.getFirst());
        list.addFirst(3); //make sure it adds first when something is there
        assertEquals(3, list.getFirst());
    }

    // Tests for addLast

    /**
     * @author Anne Villota
     * @see BrokenAddLast
     * Tests that add() will correctly add @ the end
     */
    @Test
    public void testAddLastAddsElement() {
        if (SHOULD_FAIL) list = new BrokenAddLast<>();
        list.addLast(1); //empty list
        assertEquals(1, list.getLast());
        list.addLast(3); //make sure it adds last when something is there
        assertEquals(3, list.getLast());
    }

        // Tests for remove

    /**
     * @author George Gissel
     * @see BrokenRemoveAtIndex
     * Checks to make sure remove() picks the correct elment, updates size and does 
     * not change the rest of the list
     */ 
    @Test
    public void testRemoveAtIndex() {
        if (SHOULD_FAIL) list = new BrokenRemoveAtIndex<>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.remove(1)); //check removed element is correct
        assertEquals(1, list.size()); //check size is updated
        assertEquals(1, list.get(0)); //check remaining elements are correct
    }

    // Tests for removeFirst

    /**
     * @author George Gissel
     * @see BrokenRemoveFirst
     * Checks to make sure removeFirst() picks the correct elment, updates size and does 
     * not change the rest of the list
     */ 
    @Test
    public void testRemoveFirst() {
        if (SHOULD_FAIL) list = new BrokenRemoveFirst<>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(1, list.removeFirst()); //check removed element is correct
        assertEquals(1, list.size()); //check size is updated
        assertEquals(2, list.get(0)); //check remaining elements are correct
    }

    // Tests for removeLast

    /**
     * @author George Gissel
     * @see BrokenRemoveLast
     * Checks to make sure removeLast() picks the correct elment, updates size and does 
     * not change the rest of the list
     */ 
    @Test
    public void testRemoveLast() {
        if (SHOULD_FAIL) list = new BrokenRemoveLast<>();
        list.addLast(1);
        list.addLast(2);
        assertEquals(2, list.removeLast()); //check removed element is correct
        assertEquals(1, list.size()); //check size is updated
        assertEquals(1, list.get(0)); //check remaining elements are correct
    }


    // Tests for size

    /**
     * @author George Gissel
     * @see BrokenSize
     */
    @Test
    public void testSizeWhenEmpty() {
        if (SHOULD_FAIL) list = new BrokenSize<>();
        assertEquals(0, list.size());
    }

    /**
     * @author George Gissel
     * @see BrokenSize
     */
    @Test
    public void testSizeAfterAdd() {
        if (SHOULD_FAIL) list = new BrokenSize<>();
        list.addLast(1);
        assertEquals(1, list.size());
        list.addLast(2);
        assertEquals(2, list.size());
        list.addFirst(0);
        assertEquals(3, list.size());
    }

    /**
     * @author George Gissel
     * @see BrokenSize
     */
    @Test
    public void testSizeAfterRemove() {
        if (SHOULD_FAIL) list = new BrokenSize<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.remove(1);
        assertEquals(2, list.size());
        list.removeFirst();
        list.removeLast();
        assertEquals(0, list.size());
    }


    // Tests for set

/**
     * @author George Gissel
     * @see BrokenSet
     */
    @Test
    public void testSetAtIndex() {
        if (SHOULD_FAIL) list = new BrokenSet<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        assertEquals(20, list.set(1, 99));
        assertEquals(99, list.get(1));
        assertEquals(10, list.get(0));
        assertEquals(30, list.get(2));
    }

    /**
     * @author George Gissel
     * @see BrokenSet
     */
    @Test
    public void testSetAtOutOfBoundsThrowsException() {
        if (SHOULD_FAIL) list = new BrokenSet<>();
        list.addLast(1);
        list.addLast(2);
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(2, 3));
        assertThrows(IndexOutOfBoundsException.class, () -> list.set(-1, 0));
    }


}
