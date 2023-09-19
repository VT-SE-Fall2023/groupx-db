import org.junit.Test;

public class TestFreeList {

    @Test
    public void testGetFirstItemInFreeList() {
        FreeList fl = new FreeList(-1);
        assert fl.getHead() != null;

        long rtn = fl.getNthNode(0);

        assert rtn == fl.getHead().val;
    }
}
