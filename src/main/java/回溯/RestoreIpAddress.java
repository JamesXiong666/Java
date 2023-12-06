package 回溯;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddress {
    List<String> result = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if(s.length() > 0) return result;
        backtrack(s, 0, 0);
        return result;
    }

    //startIndex:搜索的起始位置，pointNum：添加逗号的数量
    private void backtrack(String s, int startIndex, int pointNum) {
        if (pointNum == 3){ //逗点数为3时，分隔结束
            //判断第四段字符串是否合法，合法就放入result中
            if (isValid(s, startIndex,s.length()-1)){
                result.add(s);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++){
            //判断第i个字符是否合法
            if (isValid(s, startIndex, i)){
                s = s.substring(0, i) + "." + s.substring(i+1);
                pointNum++;
                //第i个字符合法，继续递归
                backtrack(s, i+2, pointNum);
                pointNum--;
                s = s.substring(0, i+1) + s.substring(i+2);
            }else{
                break;
            }
        }
    }
    //判断字符串s在左闭右闭区间[start,end]内是否合法
    private boolean isValid(String s, int start, int end) {
        if (start > end){
            return false;
        }
        if (s.charAt(start) == '0' && start!= end){
            return false;
        }
        int num = 0;
        for (int i = start; i <= end; i++){
            if (s.charAt(i) > '9' || s.charAt(i) < '0'){
                return false;
            }
            num = num * 10 + s.charAt(i) - '0';
            if (num > 255){
                return false;
            }
        }
        return true;

    }

}
