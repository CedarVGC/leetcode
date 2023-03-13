package leetcode.editor.cn;

//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
// Related Topics 字符串 动态规划 
// 👍 5852 👎 0

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {

            return null;
        }

        boolean isP(String a) {
            if (a == null || a == "") {
                return false;
            }
            int start = 0;
            int end = a.length() - 1;
            while (start < end) {
                if (a.charAt(start) != a.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}
