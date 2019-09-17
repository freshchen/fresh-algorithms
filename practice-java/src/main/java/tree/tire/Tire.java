package tree.tire;

import common.structure.TireNode;

/**
 * @anthor LingChen
 * @create 9/17/2019 2:59 PM
 * @Description
 */
public class Tire {

    private TireNode root;

    public Tire() {
        root = new TireNode();
    }

    public void insert(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }
        TireNode curr = root;
        int index = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // ASCll码相减转为坐标
            index = chars[i] - 'a';
            if (curr.nexts[index] == null) {
                curr.nexts[index] = new TireNode();
            }
            curr = curr.nexts[index];
            curr.path++;
        }
        curr.end++;
    }

    /**
     * 返回单词出现的次数或者作为前缀出现的次数
     * @param word
     * @param flag true 为单词， false为前缀
     * @return
     */
    public int searchCount(String word, boolean flag) {
        if (word == null || word.isEmpty()) {
            return 0;
        }
        TireNode curr = root;
        int index = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // ASCll码相减转为坐标
            index = chars[i] - 'a';
            if (curr.nexts[index] == null) {
                return 0;
            }
            curr = curr.nexts[index];
        }
        return flag ? curr.end : curr.path;
    }

    public void delete(String word) {
        if (word == null || word.isEmpty()) {
            return;
        }
        TireNode curr = root;
        int index = 0;
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // ASCll码相减转为坐标
            index = chars[i] - 'a';
            // 下一个节点经过数如果减为0了，再下面的节点全都不要
            if (--curr.nexts[index].path == 0) {
                curr.nexts[index] = null;
                return;
            }
            curr = curr.nexts[index];
        }
        curr.end--;
    }

}
