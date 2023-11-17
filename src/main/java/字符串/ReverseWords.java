package 字符串;

public class ReverseWords {
    //1.去除首尾以及中间多余空格
    public String removeWords(String s) {
        //1.去除首尾以及中间多余空格
        StringBuilder sb = removeSpace(s);
        //2.反转整个字符串
        reverseString(sb,0,sb.length()-1);
        //3.反转各个单词
        reverseEachWord(sb);
        return sb.toString();
    }

    public StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        //去除开头和末尾的空格
        while (s.charAt(start) ==' ') start++;
        while (s.charAt(end) ==' ') end--;
        StringBuilder sb = new StringBuilder();
        //去除中间多余空格
        while (start <= end){
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    //反转字符串指定区间[start,end]的字符
    public void reverseString(StringBuilder sb, int start, int end) {
        while(start < end){
            char temp = sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }

    //反转各个单词
    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 0;
        int n = sb.length();
        while(start < n){
            while (end < n && sb.charAt(end) != ' '){
                end++;
            }
            //指定单词区间,像翻转字符串一样翻转单词
            reverseString(sb,start,end-1);
            start = end + 1;
            end = start;
        }
    }

}
