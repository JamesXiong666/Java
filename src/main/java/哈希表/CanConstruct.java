package 哈希表;
//赎金信
public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 判断ransomNote是否可以由magazine中字符组成
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        //定义一个哈希映射数组
        int[] result = new int[26];

        //遍历
        for (char c : magazine.toCharArray()){
            result[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()){
            result[c - 'a']--;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] < 0) {
                return false;
            }
        }

        return true;
    }

}
