package 字符串;

public class reverseStr {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i <ch.length; i+=2*k){
            int start = i;
            //判断尾数够不够 k 个,如果不够,则翻转所有
            int end = Math.min(i+k-1,ch.length-1);
            //用异或运算反转
            while (start<end){
                ch[start] ^= ch[end];
                ch[end] ^= ch[start];
                ch[start] ^= ch[end];
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
