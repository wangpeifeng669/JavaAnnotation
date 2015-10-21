package com.peter.study.annotation.method;

/**
 * 苹果
 * 
 * @author peter_wang
 * @create-time 2015-10-20 下午3:54:07
 */
public class Apple {
	/**
	 * 水果名
	 */
	private String fruitName;
	/**
	 * 水果数
	 */
	private int num;

	public String getFruitName() {
		return fruitName;
	}

	@ValueBind(type = ValueBind.FiledType.STRING, value = "苹果")
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getNum() {
		return num;
	}

	@ValueBind(type = ValueBind.FiledType.INT, value = "2")
	public void setNum(int num) {
		this.num = num;
	}
}
