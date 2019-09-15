package hash;

import java.util.HashMap;

/**
 * @anthor LingChen
 * @create 9/15/2019 4:32 PM
 * @Description 提供add， remove， getRandom（等概率返回）三个函数，要求时间复杂度O（1）
 */
public class EqualRandom {

    private static HashMap<String, Integer> valueIndexMap = new HashMap<>();
    private static HashMap<Integer, String> indexValueMap = new HashMap<>();
    private static int size = 0;

    public static void add(String value) {
        if (!valueIndexMap.containsKey(value)) {
            valueIndexMap.put(value, size);
            indexValueMap.put(size, value);
            size++;
        }
    }

    public static void remove(String value) {
        if (valueIndexMap.containsKey(value)) {
            int currIndex = valueIndexMap.get(value);
            // 拿最后一位值去补洞
            String lastValue = indexValueMap.get(--size);
            valueIndexMap.put(lastValue, currIndex);
            indexValueMap.put(currIndex, lastValue);
            valueIndexMap.remove(value);
            indexValueMap.remove(size);
        }
    }

    public static String getRandom() {
        if (size == 0) {
            return null;
        }
        int random = (int) (Math.random() * size);
        return indexValueMap.get(random);
    }

    public static void main(String[] args) {
        EqualRandom.add("11111");
        EqualRandom.add("22222");
        EqualRandom.add("33333");
        EqualRandom.add("44444");
        EqualRandom.add("55555");
        EqualRandom.remove("55555");
        EqualRandom.remove("11111");

        for (int i = 0; i < 20; i++) {
            System.out.println(EqualRandom.getRandom());
        }
    }

}
