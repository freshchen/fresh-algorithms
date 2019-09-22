package greedy;

import common.structure.VVVNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/22 16:26
 * @Author: Ling Chen
 * @Description: 做项目，一次一个，项目（花费，收益），如何在k次内获得最大收益
 */
public class DoProjectMakeMoney {


    private static Comparator <VVVNode <String, Integer, Integer>> comparatorMapByValueAsc = (node1, node2) -> {
        return node1.getV2() - node2.getV2();
    };

    private static Comparator <VVVNode <String, Integer, Integer>> comparatorMapByValueDes = (node1, node2) -> {
        return node2.getV3() - node1.getV3();
    };

    /**
     * v1 项目名 v2 成本 v3 利益
     *
     * @param list
     * @param init
     * @param times
     * @return
     */
    public static String greedyPlan(List <VVVNode <String, Integer, Integer>> list, int init, int times) {
        StringBuffer buffer = new StringBuffer().append("初始资源：").append(Integer.valueOf(init)).append(" ")
                .append("执行次数：").append(Integer.valueOf(times)).append("\n")
                .append("推荐计划： ").append("\n");
        PriorityQueue <VVVNode <String, Integer, Integer>> cost = new PriorityQueue <>(comparatorMapByValueAsc);
        PriorityQueue <VVVNode <String, Integer, Integer>> profit = new PriorityQueue <>(comparatorMapByValueDes);
        list.stream().forEach(node -> {
            cost.add(node);
        });
        for (int i = 0; i < times; i++) {
            while (!cost.isEmpty() && cost.peek().getV2() <= init) {
                profit.add(cost.poll());
            }
            if (profit.isEmpty()) {
                break;
            }
            VVVNode<String, Integer, Integer> curr = profit.poll();
            init += curr.getV3();
            buffer.append("任务").append(Integer.valueOf(i)).append("：").append(curr.getV1()).append(" ")
                    .append("获得资源：").append(curr.getV3()).append("\n");
        }
        buffer.append("最终资源：").append(Integer.valueOf(init));
        return buffer.toString();
    }
}
