package com.peter.study.annotation.method;

import java.lang.reflect.InvocationTargetException;

/**
 * 水果处理中心
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午2:27:15
 */
public class FruitHandle {
	public static void main(String[] args) {
		try {
			Apple apple = new Apple();
			FruitInitUtil.initFruitInfo(apple);
			System.out.println("fruit name:" + apple.getFruitName()
					+ ",fruit num:" + apple.getNum());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
