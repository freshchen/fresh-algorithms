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
        BloomFilter <Integer> filter = BloomFilter.create(Funnels.integerFunnel(), capacity, errorRate);
        for (int i = 0; i < capacity; i++) {
            filter.put(i);
        }
        return filter;
    }

    public static void main(String[] args) {
        int capacity = 100000;
        System.out.println(BloomGuava.init(capacity, 0.001).mightContain(capacity - 1));
        System.out.println(BloomGuava.init(capacity, 0.001).mightContain(capacity));
    }
}
