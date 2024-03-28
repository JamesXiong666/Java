package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 指定注解可以用于修饰类
@Retention(RetentionPolicy.RUNTIME) // 保留到运行时
public @interface MyAnnotation {
    String name() default "xiong";
}