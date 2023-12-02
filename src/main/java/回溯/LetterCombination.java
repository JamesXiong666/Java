package 回溯;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    //设置全局列表存储最后的结果
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0 || digits == null){
            return list;
        }
        // 初始化对应的所有的数字,为了直接对应 2-9,新增了两个无效的字符串
        String[] str = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};
        //迭代处理
        backTrack(digits, str,0);
        return list;
    }

    //每次迭代获取一个字符串,所以会设计大量的字符串拼接,所以这里选择更为高效的 StringBuild
    StringBuilder sb = new StringBuilder();
    private void backTrack(String digits, String[] str, int index){
        //如果已经迭代完所有的字符串,则将结果添加到全局列表中
        if (index == digits.length()){
            list.add(sb.toString());
            return;
        }
        //获取当前的数字
        char c = digits.charAt(index);
        //获取对应的字符串
        String s = str[c - '0'];
        //迭代处理
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            backTrack(digits, str, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
