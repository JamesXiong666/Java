package Reflection;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class Test02 {
    // class.getModifiers()返回类的修饰符
    // class.getSimpleName()反问类的简易类名
    // class.getName()返回类的完整类名
    // class.getPackage()返回类的包
    public static void main(String[] args) {
        // 1)先获得字节码文件
        Class claxx = ArrayList.class;

        // 2.1 类的修饰符 modifier,返回值是int整数
        int mode = claxx.getModifiers();
        System.out.println(mode);
        // Modifiers类提供了静态方法toString(int)可以把整数转化为字符串
        String modifier = Modifier.toString(mode);
        System.out.println(modifier);

        //2.2 类名
        String name = claxx.getName();// 返回完整类名
        System.out.println(name);
        String simpleName = claxx.getSimpleName();
        System.out.println(simpleName);

        // 父类
        String superName = claxx.getSuperclass().getName();
        System.out.println(superName);
        simpleName = claxx.getSimpleName();
        System.out.println(simpleName);

        // 接口,返回的是一个数组，因为类可以同时实现多个接口
        Class[] interfaces = claxx.getInterfaces();
        for(Class cls:interfaces){
            System.out.println(cls.getSimpleName());
        }
    }
}
