
//BNode types
public const int internalNode = 1;
public const inr leafNode = 2;

public class BNode {
    private int nodeType;
    private int keyNums;
    private List<BNode> children;
    private List<Integer> offsets;
    private byte[] keyValues; //not sure what to do with the KV pairs yet
}
