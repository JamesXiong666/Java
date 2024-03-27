package Reflection;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException{
        //每个类都有class属性，不会执行静态代码块
        Class claxx = String.class;

        // 每个对象都有getClass（）方法，从Object类继承来的
        Class claxx2 = "abc".getClass();

        // Class.forName(完整类名)返回字节码文件，这种方式会把类加载到内存，执行类的静态代码块
        // JDBC 驱动就是这样加载的。
        Class claxx3 = Class.forName("java.lang.String");

        System.out.println(claxx == claxx2);
        System.out.println(claxx == claxx3);

        // 基本类型也有class属性
        Class claxx4 = int.class;

        // 包装类
        //int.class表示基本数据类型int的Class对象,TYPE是Integer中的静态常量
        //Integer.class表示引用数据类型Integer的class对象,与前者肯定是不相等的.
        //注意:由.class来创建Class对象的引用时,不会自动初始化Class对象.
        Class claxx5 = Integer.class;
        System.out.println(claxx4 == claxx5);
        // api中已经写明它表示的是基本数据类型int的class实例,因此先打印出的是true
        Class class6 = Integer.TYPE;
        System.out.println(claxx4 == class6);
    }
}
