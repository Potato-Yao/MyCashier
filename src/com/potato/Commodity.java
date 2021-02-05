package com.potato;

/**
 * @author Potato Yao
 */

public class Commodity
{
	String name;
	float price;
	Kinds kind;

	/**
	 *
	 * @param name 商品名称
	 * @param price 商品价格，单位￥
	 * @param kind 商品种类
	 */
	public Commodity(String name, float price, Kinds kind)
	{
		this.name = name;
		this.price = price;
		this.kind = kind;
	}

	public String getName()
	{
		return name;
	}

	public float getPrice()
	{
		return price;
	}

	public Kinds getKind()
	{
		return kind;
	}

}

enum Kinds
{
	// 蔬菜
	VEGETABLE,
	// 肉类
	MEAT,
	// 水果
	FRUIT,
	// 饮料
	DRINK,
	// 零食
	SNACK,
	// 文具
	STATIONERY,
	// 日用品
	NECESSARY,
	// TODO 加入更多种类
}
