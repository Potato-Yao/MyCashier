package com.potato;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Potato Yao
 * @version 1.0.0
 */
public class MyCashier
{
	public static void main(String[] args)
	{
		System.out.println("欢迎使用本收银台");
		Output.showCommodity();  // 显示商品
		Input.purchasedItemsInput();  // 输入要购买的物品
		MoneyManager.manager();  // 结算总额
		Output.billPlease(MoneyManager.lumpSum);  // 结账
	}
}

/**
 * 储存商品信息
 */
class Map
{
	// 商品信息
	public static HashMap<Integer, Commodity> commodity = new HashMap<>();
	// 要买的物品信息
	public static HashMap<Commodity, Integer> shoppingCart = new HashMap<>();
	// 商品id
	static int id = 0;

	/*
	 这里放蔬菜类
	 */
	static
	{
		commodity.put(id++, new Commodity("Potato", 2, Kinds.VEGETABLE));
		commodity.put(id++, new Commodity("Tomato", 2, Kinds.VEGETABLE));
	}

	/*
	 这里放肉类
	 */
	static
	{
		commodity.put(id++, new Commodity("Beef", 20, Kinds.MEAT));
		commodity.put(id++, new Commodity("Chicken", 20, Kinds.MEAT));
	}

	/*
	 这里放水果类
	 */
	static
	{
		commodity.put(id++, new Commodity("Apple", 5, Kinds.FRUIT));
		commodity.put(id++, new Commodity("Banana", 5, Kinds.FRUIT));
	}

	/*
	 这里放饮料类
	 */
	static
	{
		commodity.put(id++, new Commodity("Milk", 5, Kinds.DRINK));
		commodity.put(id++, new Commodity("Coffee", 5, Kinds.DRINK));
	}

	/*
	 这里放零食类
	 */
	static
	{
		commodity.put(id++, new Commodity("Potato chips", 10, Kinds.SNACK));
		commodity.put(id++, new Commodity("Apple pie", 10, Kinds.SNACK));
	}

	/*
	 这里放文具类
	 */
	static
	{
		commodity.put(id++, new Commodity("Notebook", 10, Kinds.STATIONERY));
		commodity.put(id++, new Commodity("Pen", 1, Kinds.STATIONERY));
	}

	/*
	 这里放日用品类
	 */
	static
	{
		commodity.put(id++, new Commodity("Teeth blush", 10, Kinds.NECESSARY));
		commodity.put(id++, new Commodity("Towel", 20, Kinds.NECESSARY));
	}
}

/**
 * 输入模块
 */
class Input
{
	/**
	 * 输入购买的商品和数量
	 */
	public static void purchasedItemsInput()
	{
		while (true)
		{
			System.out.println("请根据id号码输入需要买的物品以及数量,id输入负整数表示完成");
			Scanner scanner = new Scanner(System.in);
			System.out.println("-");
			int index = scanner.nextInt();
			if (index < 0)
			{
				return;
			}
			System.out.println("请输入个数");
			int number = scanner.nextInt();
			Map.shoppingCart.put(Map.commodity.get(index), number);
		}
	}
}

/**
 * 输出类
 */
class Output
{
	/**
	 * 展示所有货物
	 */
	static public void showCommodity()
	{
		var map = Map.commodity;

		Collection<Commodity> values = map.values();

		int times = 0;

		for (var i : values)
		{
			System.out.println(times + " " + i.getName() + "\t" + i.getPrice() + "\t" + i.getKind());
			times++;
		}
	}

	/**
	 * 结账页面
	 * @param lumpSum 总金额
	 */
	public static void billPlease(float lumpSum)
	{
		String detail = "d";  // 查看详情使用
		String settleAccounts = "s";  // 结账使用
		String again = "a";  // 重复查看

		System.out.println("您的总金额为：");
		System.out.println(lumpSum + "￥");

		Scanner scanner = new Scanner(System.in);
		System.out.println("输入d查看详情，输入s结账");
		String choose = scanner.nextLine();
		choose = choose.toLowerCase();
		flag:
		while (true)
		{
			showCheckoutDetails();
			System.out.println("重复查看输入a，结账输入s");
			choose = scanner.nextLine();
			if (choose.equals(again))
			{
				showCheckoutDetails();
			}
			else if (choose.equals(settleAccounts))
			{
				System.out.println("支付成功");
				break;
			}
			else
			{
				System.out.println("请输入正经的东西！");
				break flag;
			}
		}
		scanner.close();
	}

	/**
	 * 显示订单详情
	 */
	public static void showCheckoutDetails()
	{
		System.out.println("您购买的物品如下");
		var keys = MoneyManager.keys;

		System.out.println("名词\t数量\t单价");
		for (var key : keys)
		{
			System.out.println(key.getName() + "\t" + Map.shoppingCart.get(key) + "\t" + key.getPrice() + "￥");
		}
	}
}

/**
 * 商品定义类
 */
class Commodity
{
	String name;
	float price;
	Kinds kind;

	/**
	 * 构造器
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

/**
 * 商品种类
 */
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
	// FIXME 加入更多种类
}

/**
 * 结账使用
 */
class MoneyManager
{
	static float lumpSum;
	static Collection<Commodity> keys = com.potato.Map.shoppingCart.keySet();

	/**
	 * 结算总额
	 */
	public static void manager()
	{
		for (var key : keys)
		{
			lumpSum += key.getPrice() * Map.shoppingCart.get(key);
		}
	}
}