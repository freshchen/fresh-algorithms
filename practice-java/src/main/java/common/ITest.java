package common;

import sort.Bubble;
import sort.Insert;

/**
 * @anthor LingChen
 * @create 9/9/2019 5:55 PM
 * @Description
 */
public class ITest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            IUtils.randomArray();
            if ( ! IUtils.test(Bubble.sort(IUtils.getArr()))){
                break;
            }
        }
    }
}
