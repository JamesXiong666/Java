package 贪心;

public class MontoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        //将一个整数N转换为字符串，并使用空字符串作为分隔符拆分字符串。结果是一个包含N个元素的字符串数组。
        String[] strings = (N+"").split("");
        int start = strings.length-1;
        for (int i = strings.length-1; i > 0; i--){
            //通过解析字符串并将它们转换为整数
            if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i-1])){
                strings[i-1] =(Integer.parseInt(strings[i-1])-1)+"";
                strings[i] = "9";
                }
            }

        //将字符串数组连接起来，然后使用Integer.parseInt()函数将连接后的字符串转换为整数。
        return Integer.parseInt(String.join("",strings));
    }
}
