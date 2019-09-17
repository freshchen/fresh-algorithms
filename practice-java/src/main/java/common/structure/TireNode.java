package common.structure;

/**
 * @anthor LingChen
 * @create 9/17/2019 2:46 PM
 * @Description 前缀树
 */
public class TireNode {

    // 经过的此节点次数
    public int path;
    // 已此节点结尾的次数
    public int end;
    public TireNode[] nexts;

    public TireNode() {
        path = 0;
        end = 0;
        // 每个节点26条路，对应26个字母
        nexts = new TireNode[26];
    }
}
