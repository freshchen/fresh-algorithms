package array.matrix;

/**
 * @program: fresh-algorithms
 * @Date: 2019/9/17 21:44
 * @Author: Ling Chen
 * @Description:
 * //给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * //
 * // 你可以假设数组中无重复元素。
 * //
 * // 示例 1:
 * //
 * // 输入: [1,3,5,6], 5
 * //输出: 2
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: [1,3,5,6], 2
 * //输出: 1
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: [1,3,5,6], 7
 * //输出: 4
 * //
 * //
 * // 示例 4:
 * //
 * // 输入: [1,3,5,6], 0
 * //输出: 0
 * //
 * //
 */
public class Lc35SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        } else if (nums[nums.length - 1] < target) {
            result = nums.length;
            return result;
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= target) {
                    result = i;
                    return result;
                }
            }
        }
        return result;
    }
}
