import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;


public class TestFreeList {

    @Test
    public void testInitFreeList() {
        FreeList fl = new FreeList();
        assertNull(fl.getHead());
    }

    @Test
    public void testGetFirstItemInFreeList() {
        FreeList fl = new FreeList(2);
        assert fl.getHead() != null;

        long rtn = fl.getNthNode(0);

        assertEquals(rtn, fl.getHead().val);
    }

    @Test
    public void testAppendItemInFreeList() {
        FreeList fl = new FreeList(2);

        fl.append(3);
        assertEquals(3, fl.getNthNode(1));
    }

    @Test
    public void testFreeListTotal() {
        FreeList fl = new FreeList();
        fl.append(1);
        fl.append(2);
        assertEquals(2, fl.total());
    }

    @Test
    public void testFreeListTotal_isEmpty() {
        FreeList fl = new FreeList();
        assertEquals(0, fl.total());
    }

    @Test
    public void testFreeListTotal_isOne_if_head_is_initialized() {
        FreeList fl = new FreeList(2);
        assertEquals(1, fl.total());
    }
}
