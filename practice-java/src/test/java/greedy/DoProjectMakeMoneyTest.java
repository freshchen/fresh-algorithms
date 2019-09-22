package greedy;

import common.structure.VVVNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/22 17:33
 * @Author: Ling Chen
 * @Description:
 */
public class DoProjectMakeMoneyTest {

    @Test
    public void greedyPlan() {
        List <VVVNode <String, Integer, Integer>> list = Arrays.asList(
                new VVVNode <>("java", 50, 60),
                new VVVNode <>("python", 20, 30),
                new VVVNode <>("shell", 10, 10),
                new VVVNode <>("php", 1125, 35),
                new VVVNode <>("scala", 1160, 45),
                new VVVNode <>("cpp", 1170, 50),
                new VVVNode <>("js", 1140, 55)
        );
        System.out.println(DoProjectMakeMoney.greedyPlan(list, 100, 5));;
    }
}