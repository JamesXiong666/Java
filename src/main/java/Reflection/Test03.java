//package Reflection;
//
//import java.lang.reflect.Field;
//// 通过反射访问字段
//public class Test03 {
//
//    // class.getFiedld()返回指定名称的公共字段
//    // class.getDeclaredField(字段名)返回指定名称的任意权限的字段
//    // field.set(对象名，字段名)设置对象的字段名
//    // field.get(对象名) 返回对象的字段值
//
//
//    public static void main(String[] args) {
//        // 反射第一步，创建Class对象，即获得类的字节码文件
//        Class claxx = MyClass.class;
//
//        // 反射访问MyClass类的实例变量x,y,z，实例变量是属于某个具体对象的
//        // 在访问x，y，z三个实例变量前，需要先创建对象
//        Object obj1 = claxx.newInstance();
//        Object obj2 = claxx.newInstance();
//
//        //反射MyClass类中的公共字段x，claxx.getField(字段名)返回公共字段
//        Field xField = claxx.getField("x");
//
//        // 通过反射设置obj1对象的x字段值，field.set(实例名，字段名)
//        xField.set(obj1, 100);
//
//        //返回obj1对象的x字段的值，field.get(对象名)
//        System.out.println(xField.get(obj1));;
//
//        // 设置obj2对象的x字段
//        xField.set(obj2, 200);
//        System.out.println(xField.get(obj2));;
//
//        // 反射Myclass类中的私有字段z，getField()只能反射公共字段
//        // 非公共字段可以使用getDeclaredField()
//        Field zField = claxx.getDeclaredField("z");
//
//        // 设置成员的可访问性，java没有真正意义上的封装
//        zField.setAccessible(true);
//
//        zField.set(obj1, 300);
//        System.out.println(zField.get(obj1));
//        zField.set(obj2, 400);
//        System.out.println(zField.get(obj2));
//
//        // 反射静态字段s
//        Field sField = claxx.getField("s");
//        // 静态字段跟对象（实例）没有关系，在设置/读取时，在实例名位置传递null
//        sField.set(null, 500);
//        System.out.println(sField.get(null));
//    }
//
//    public static class MyClass {
//        public int x;
//        int y;
//        private int z;
//        static int s;
//
//        public MyClass(int x, int y, int z) {
//            this.x = x;
//            this.y = y;
//            this.z = z;
//        }
//
//        public MyClass(){
//            System.out.println("无参构造方法");
//        }
//    }
//}
