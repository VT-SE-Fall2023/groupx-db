import org.junit.Test;


public class TestFreeList {

    @Test
    public void testInitFreeList() {
        FreeList fl = new FreeList();
        assert fl.getHead() == null;
    }

    @Test
    public void testGetFirstItemInFreeList() {
        FreeList fl = new FreeList(2);
        assert fl.getHead() != null;

        long rtn = fl.getNthNode(0);

        assert rtn == fl.getHead().val;
    }

    @Test
    public void testAppendItemInFreeList() {
        FreeList fl = new FreeList(2);

        fl.append(3);
        assert fl.getNthNode(1) == 3;
    }

}
