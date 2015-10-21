package com.peter.study.annotation.field;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 水果颜色
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午2:18:08
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
	/**
	 * 颜色枚举值
	 * 
	 * @author peter_wang
	 * @create-time 2015-10-20 下午2:21:45
	 */
	public enum Color {
		BLUE, YELLOW, GREEN
	};

	/**
	 * 获取水果颜色
	 * 
	 * @return 水果颜色
	 */
	Color getFruitColor() default Color.BLUE;
}
