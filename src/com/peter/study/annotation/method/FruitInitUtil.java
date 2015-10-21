package com.peter.study.annotation.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.peter.study.annotation.method.ValueBind.FiledType;

/**
 * 水果类自动初始化
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午3:59:59
 */
public class FruitInitUtil {
	public static void initFruitInfo(Apple apple)
			throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		Method[] methods = apple.getClass().getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(ValueBind.class)) {
				ValueBind valueBind = method.getAnnotation(ValueBind.class);
				ValueBind.FiledType type = valueBind.type();
				String value = valueBind.value();
				if (type == FiledType.STRING) {
					method.invoke(apple, value);
				} else if (type == FiledType.INT) {
					method.invoke(apple, Integer.valueOf(value));
				}
			}
		}
	}
}
