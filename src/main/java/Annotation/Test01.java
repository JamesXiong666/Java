//package Annotation;
//
//@MyAnnotation(name = "james")
//public class Test01{
//  public static void main(String[] args) {
//    // 通过反射读取注解的属性值
//    Class<Test01> claxx = Test01.class;
//
////反射注解
//    MyAnnotation myAnnotation = claxx.getAnnotation(MyAnnotation.class);
//    if (myAnnotation != null) {
//      String name = myAnnotation.name();
//      System.out.println(name);
//    }
//  }
//}