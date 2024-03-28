package Reflection;

import java.lang.reflect.Method;
import java.sql.SQLOutput;

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

        //反射
        Method equals = claxx.getMethod("equals", Object.class);
        Object result =equals.invoke(s1, "hello"); // s1对象调用quals方法与Hello比
        System.out.println(result);

        // 反射静态方法
        Method valueOf = claxx.getMethod("valueOf", int.class);
        Object s2 = valueOf.invoke(null, 123);
        System.out.println(s2);
        System.out.println(s2 instanceof String);
    }

}
