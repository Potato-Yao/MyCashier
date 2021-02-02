package com.potato;

/**
 * @author 碳烤黄蜂
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

}

enum Kinds
{
	// 蔬菜
	VEGETABLE,
	// 水果
	FRUIT,
	// 零食
	SNACK,
	// 日用品
	NECESSARY,
	// 文具
	STATIONERY,
	// TODO 加入更多种类
}
