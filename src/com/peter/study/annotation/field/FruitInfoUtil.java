package com.peter.study.annotation.field;

import java.lang.reflect.Field;

/**
 * 获取水果数据信息
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午2:28:10
 */
public class FruitInfoUtil {
	public static void showFruitInfo(Class<?> clazz) {
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(FruitName.class)) {
				FruitName fruitName = field.getAnnotation(FruitName.class);
				System.out.println("水果名称：" + fruitName.getFruitName());
			}
			else if (field.isAnnotationPresent(FruitColor.class)) {
				FruitColor fruitColor = field.getAnnotation(FruitColor.class);
				System.out.println("水果颜色：" + fruitColor.getFruitColor());
			}
		}
	}
}
