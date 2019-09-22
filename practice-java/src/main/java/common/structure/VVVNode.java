package common.structure;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/22 18:22
 * @Author: Ling Chen
 * @Description:
 */
public class VVVNode<E, F, G> {
    private E v1;
    private F v2;
    private G v3;

    public VVVNode(E v1, F v2, G v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public E getV1() {
        return v1;
    }

    public F getV2() {
        return v2;
    }

    public G getV3() {
        return v3;
    }
}
