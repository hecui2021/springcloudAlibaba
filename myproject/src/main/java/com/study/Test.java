package com.study;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author peterche
 * @Description
 * @Date 2023/8/21 15:38
 **/
public class Test {

    public static void main(String[] args) {
        String filePath = "/Users/peterche/local/code/myself/springcloudAlibaba/myproject/doc/country.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String str = "insert into tc_oversea_country(country) values ('"  + line + "');";
                System.out.println(str);
            }
            reader.close();
            return;
        } catch (IOException e) {
            e.printStackTrace();
        }


        long curTime = System.currentTimeMillis();

        long startTime = 1706688590749l;

        long monthMillis = 2678400000L;// 一个月的毫秒数(1000 * 3600 * 24 * 31)
        for (int i = 0; i < 24; i++) {
            if (startTime > curTime- i * monthMillis) {
                System.out.println("startTime:" + i);
                break;
            }
        }
        if (true) {
            return;
        }

        String strt = "[\"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\"]";

        System.out.println(strt.getBytes().length);

        String str = "[\"version1;112.47608,37.8457,1732104000;112.475845,37.845554,1732104027;\",\"version1;112.47735,37.857094,1732103661;112.476746,37.85666,1732103700;112.476746,37.85666,1732103700;112.476685,37.84723,1732103964;112.476685,37.84723,1732103964;112.47614,37.845715,1732103999;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.47608,37.8457,1732104000;112.475845,37.845554,1732104027;\",\"version1;112.47735,37.857094,1732103661;112.476746,37.85666,1732103700;112.476746,37.85666,1732103700;112.476685,37.84723,1732103964;112.476685,37.84723,1732103964;112.47614,37.845715,1732103999;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.47608,37.8457,1732104000;112.475845,37.845554,1732104027;\",\"version1;112.47735,37.857094,1732103661;112.476746,37.85666,1732103700;112.476746,37.85666,1732103700;112.476685,37.84723,1732103964;112.476685,37.84723,1732103964;112.47614,37.845715,1732103999;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.47608,37.8457,1732104000;112.475845,37.845554,1732104027;\",\"version1;112.47735,37.857094,1732103661;112.476746,37.85666,1732103700;112.476746,37.85666,1732103700;112.476685,37.84723,1732103964;112.476685,37.84723,1732103964;112.47614,37.845715,1732103999;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\",\"version1;112.476845,37.847374,1732061011;112.47686,37.85667,1732061389;112.47686,37.85667,1732061389;112.480545,37.85712,1732061456;112.480545,37.85712,1732061456;112.48077,37.859745,1732061482;112.48077,37.859745,1732061482;112.48237,37.859898,1732061506;112.48237,37.859898,1732061506;112.48242,37.860573,1732061527;\",\"version1;112.47659,37.846294,1732045793;\"]";

        System.out.println(str.getBytes().length);

        String scientificNotation = "1.500718831058E12";
        Long serverEndTimeLong = new BigDecimal(String.valueOf(scientificNotation)).longValueExact();

        // 将科学计数法表示的数字转换为 BigDecimal 对象
//        BigDecimal bd = new BigDecimal(scientificNotation);
//
//        // 将 BigDecimal 对象转换为常规的数字形式
//        long normalNumber = bd.longValueExact();

        System.out.println(serverEndTimeLong);
        System.out.println(System.currentTimeMillis());

        LocalDateTime currentTime = LocalDateTime.now();

        // 将当前时间减月数
        LocalDateTime lastYear = currentTime.minusMonths(24);
        long l = lastYear.toEpochSecond(ZoneId.systemDefault().getRules().getOffset(lastYear)) * 1000;

        System.out.println(l);



//        // 获取当前时间
//        LocalDateTime currentTime = LocalDateTime.now();
//
//        // 将当前时间减去十二个月
//        LocalDateTime lastYear = currentTime.minusMonths(12);
//        System.out.println(lastYear.toEpochSecond(ZoneId.systemDefault().getRules().getOffset(lastYear)));
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        int s = diameterOfBinaryTree(root);
//        System.out.println(s);
    }

    public static void test() {
        BigInteger sum = new BigInteger("1");
        for (int i = 1;i<=1024;i++) {
            sum = sum.multiply(new BigInteger(i+""));
        }
        int count = 0;
        while (sum.mod(new BigInteger(10+"")).intValue() == 0) {
            count++;
            sum = sum.divide(new BigInteger(10+""));
        }
        System.out.println(count);
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int sum = 0;
        for (int i = 0;i < nums.length;i++) {
            if(nums[i] == 1) {
                count++;
                if (count > 0) {
                    sum = count;
                }
            } else {
                count = 0;
            }
        }
        return sum;
    }

    /**
     * 830. 较大分组的位置
     * @param s
     * @return
     */
    public static List<List<Integer>> largeGroupPositions(String s) {
        int count = 0;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0 ; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                if (count >= 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i - count);
                    list.add(i);
                    result.add(list);
                }
                count = 0;
            }
        }
        if (count >= 2) {
            List<Integer> list = new ArrayList<>();
            list.add(s.length() - 1 - count);
            list.add(s.length() - 1);
            result.add(list);
        }
        return result;
    }

    /**
     * 824. 山羊拉丁文
     * 给你一个由若干单词组成的句子 sentence ，单词间由空格分隔。每个单词仅由大写和小写英文字母组成。
     *
     * 请你将句子转换为 “山羊拉丁文（Goat Latin）”（一种类似于 猪拉丁文 - Pig Latin 的虚构语言）。山羊拉丁文的规则如下：
     *
     * 如果单词以元音开头（'a', 'e', 'i', 'o', 'u'），在单词后添加"ma"。
     * 例如，单词 "apple" 变为 "applema" 。
     * 如果单词以辅音字母开头（即，非元音字母），移除第一个字符并将它放到末尾，之后再添加"ma"。
     * 例如，单词 "goat" 变为 "oatgma" 。
     * 根据单词在句子中的索引，在单词最后添加与索引相同数量的字母'a'，索引从 1 开始。
     * 例如，在第一个单词后添加 "a" ，在第二个单词后添加 "aa" ，以此类推。
     * 返回将 sentence 转换为山羊拉丁文后的句子。
     *
     * 示例 1：
     *
     * 输入：sentence = "I speak Goat Latin"
     * 输出："Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
     * 示例 2：
     *
     * 输入：sentence = "The quick brown fox jumped over the lazy dog"
     * 输出："heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
     * @param sentence
     * @return
     */
    public static String toGoatLatin(String sentence) {
        String[] array = sentence.split(" ");

        StringBuffer sb = new StringBuffer();

        for (int i=0;i<array.length;i++) {
            char c = array[i].charAt(0);
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E'
                || c == 'i' || c == 'I' || c == 'o' || c == 'O'
                || c == 'u' || c == 'U') {
                String str = array[i] + "ma";
                for (int j = 0;j<=i;j++) {
                    str += "a";
                }
                sb.append(" ").append(str);
            } else {
                String str = array[i].substring(1,array[i].length()) + array[i].charAt(0) + "ma";
                for (int j = 0;j<=i;j++) {
                    str += "a";
                }
                sb.append(" ").append(str);
            }
        }
        return sb.toString().substring(1,sb.toString().length());
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * 543. 二叉树的直径
     * 给你一棵二叉树的根节点，返回该树的 直径 。
     *
     * 二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。
     *
     * 两节点之间路径的 长度 由它们之间边数表示。
     *
     *
     *
     * 示例 1：
     *        1
     *    2       3
     * 4    5
     *
     * 输入：root = [1,2,3,4,5]
     * 输出：3
     * 解释：3 ，取路径 [4,2,1,3] 或 [5,2,1,3] 的长度。
     * 示例 2：
     *
     * 输入：root = [1,2]
     * 输出：1
     * @param root
     * @return
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        anx = 1;
        aa(root);
        return anx - 1;
    }

    static int anx = 0;

    /**
     * 查每个节点的左子树+右子树最大之和
     * @param root
     * @return
     */
    private static int aa(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = aa(root.left);
        int r = aa(root.right);
        anx = Math.max(anx,l+r+1);
        return Math.max(l,r) + 1;
    }

    /**
     * 448. 找到所有数组中消失的数字
     * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [4,3,2,7,8,2,3,1]
     * 输出：[5,6]
     * 示例 2：
     *
     * 输入：nums = [1,1]
     * 输出：[2]
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(set.add(i)){
                res.add(i);
            }
        }
        return res;
    }

    /**
     * 724. 寻找数组的中心下标
     * 给你一个整数数组 nums ，请计算数组的 中心下标 。
     *
     * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
     *
     * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
     *
     * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：nums = [1, 7, 3, 6, 5, 6]
     * 输出：3
     * 解释：
     * 中心下标是 3 。
     * 左侧数之和 sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11 ，
     * 右侧数之和 sum = nums[4] + nums[5] = 5 + 6 = 11 ，二者相等。
     * 示例 2：
     *
     * 输入：nums = [1, 2, 3]
     * 输出：-1
     * 解释：
     * 数组中不存在满足此条件的中心下标。
     * 示例 3：
     *
     * 输入：nums = [2, 1, -1]
     * 输出：0
     * 解释：
     * 中心下标是 0 。
     * 左侧数之和 sum = 0 ，（下标 0 左侧不存在元素），
     * 右侧数之和 sum = nums[1] + nums[2] = 1 + -1 = 0 。
     *
     */
//    public int pivotIndex(int[] nums) {
//
//    }

}
