package bigdata;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * @anthor LingChen
 * @create 9/16/2019 2:08 PM
 * @Description Guava布隆过滤器，判断一个元素是否在一个集合中，优势是只需要占用很小的内存空间以及有着高效的查询效率
 */
public class BloomGuava {

    public static BloomFilter init(int capacity, double errorRate) {
        long start = System.currentTimeMillis();
        BloomFilter<Integer> filter = BloomFilter.create(Funnels.integerFunnel(), capacity, errorRate);
        for (int i = 0; i < capacity; i++) {
            filter.put(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - start) + " ms");
        return filter;
    }

    public static void main(String[] args) {
        System.out.println(BloomGuava.init(100000, 0.001).mightContain(99999));
        System.out.println(BloomGuava.init(100000, 0.001).mightContain(100000));
    }
}
