package com.peter.study.annotation.method;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自动调用方法生成默认值
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午3:28:20
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValueBind {
	/**
	 * 属性类别
	 * 
	 * @author peter_wang
	 * @create-time 2015-10-20 下午3:41:17
	 */
	public enum FiledType {
		INT, STRING
	}

	/**
	 * 类别
	 * 
	 * @return 类别
	 */
	FiledType type();

	/**
	 * 参数值
	 * 
	 * @return 参数值
	 */
	String value();
}
