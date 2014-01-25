package net.xicp.tarbitrary.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Rentention注解定义的是当前注解的作用范围,一般自定义注解都选用RetentionPolicy.RUNTIME
 * Target注解定义的是当前注解作用域,有作用于方法的,用作用于类的,亦有作用于属性的等八种选择.
 * 如果注解中就一个value属性那么通常可以不用写value=而直接在括号里面赋值
 * Inherited注解定义了注解能否被继承,一般来说一个类继承了一个使用注解的基类后基类的注解不会被继承下去
 * 但如果基类使用了Inherited注解则基类中的其它注解能够被子类继承下来
 * Annotation主要用在框架的开发上,做框架的配置文件是最合适不过的,现在Spring,Hibernate,Struts2等
 * 可以采用注解方式来配置实现其基于的原理是利用反射来获取注解来获得用户配置的信息并调用相应的类来
 * 实现功能.
 * @author tuqiang
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.ANNOTATION_TYPE,ElementType.PACKAGE,ElementType.TYPE})
@Inherited
public @interface MyAnnotation {
	/*
	 * Annoation里面的属性必须加括号类公于interface里面定义接口一样
	 * 属性可以为enum也可以为数组,且可以用default为其设定默认值
	 */
	public int age();
	public String value();
	public String[] myarray();
	public Color color() default Color.BLACK;
}
