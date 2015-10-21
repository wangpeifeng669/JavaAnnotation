package com.peter.study.annotation.field;

import com.peter.study.annotation.field.FruitColor.Color;

/**
 * 香蕉
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午2:24:36
 */
public class Banana {
	@FruitName(getFruitName = "香蕉")
	private String fruitName;
	@FruitColor(getFruitColor = Color.YELLOW)
	private String fruitColor;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
}
