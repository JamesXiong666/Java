package Reflection;

import java.lang.reflect.Method;

// 通过反射调用方法
// clss.getMethod(方法名，形参列表)返回指定方法签名的方法
// method.invoke(对象，实参列表)调用指定方法
public class Test04 {
    public static void main(String[] args) throws Exception {
        // 获得字节码文件
        Class<String> claxx = String.class;

        // 如果是实例方法，需要通过对象名调用，需要先创建对象
        String s1 = claxx.newInstance();

        // 反射length()无参的方法，没有参数，形参列表可以省略
        Method length = claxx.getMethod("length");

        // 调用方法，method.invoke(对象名，实参列表)
        Object len = length.invoke(s1);
        System.out.println(len);



    }

}
