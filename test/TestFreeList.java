import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;


public class TestFreeList {

    @Test
    public void testInitFreeList() {
        FreeList<Object> fl = new FreeList<>();
        assertNull(fl.getHead());
    }

    @Test
    public void testGetFirstItemInFreeList() {
        FreeList<Integer> fl = new FreeList<>(2);
        assert fl.getHead() != null;

        Node rtn = fl.getNthNode(0);

        assertEquals(rtn.val, fl.getHead().val);
    }

    @Test
    public void testGetSecondItemInFreeList() {
        FreeList<Integer> fl = new FreeList<>(2);
        fl.append(3);
        assertEquals(3, fl.getNthNode(1).val);

        fl.append(5);
        assertEquals(5, fl.getNthNode(2).val);
    }

    @Test
    public void testAppendItemInFreeList() {
        FreeList<Integer> fl = new FreeList<>(2);

        fl.append(3);
        assertEquals(3, fl.getNthNode(1).val);
    }

    @Test
    public void testFreeListTotal() {
        FreeList<Integer> fl = new FreeList<>();
        fl.append(1);
        fl.append(2);
        assertEquals(2, fl.total());
    }

    @Test
    public void testFreeListTotal_isEmpty() {
        FreeList<Integer> fl = new FreeList<>();
        assertEquals(0, fl.total());
    }

    @Test
    public void testFreeListTotal_isOne_if_head_is_initialized() {
        FreeList<Integer> fl = new FreeList<>(2);
        assertEquals(1, fl.total());
    }
}
