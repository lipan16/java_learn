// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Game.java

import java.io.PrintStream;
import java.util.Scanner;

class Game
{

	private Player player;

	public Game(Player player1)
	{
		player = player1;
	}

	public boolean filter(String s)
	{
		return "剪刀".equals(s) || "石头".equals(s) || "布".equals(s) || "exit".equals(s);
	}

	public int rule(String s, String s1)
	{
		if (s.equals(s1))
			return 0;
		if (s.equals("剪刀"))
		{
			if (s1.equals("石头"))
				return -1;
			if (s1.equals("布"))
				return 1;
		}
		if (s.equals("石头"))
		{
			if (s1.equals("剪刀"))
				return 1;
			if (s1.equals("布"))
				return -1;
		}
		if (s.equals("布"))
		{
			if (s1.equals("剪刀"))
				return -1;
			if (s1.equals("石头"))
				return 1;
		}
		return 0;
	}

	public void start()
	{
		System.out.println("开始游戏");
		System.out.println((new StringBuilder()).append(player.getName()).append("进入游戏，初始积分为：").append(player.getScore()).toString());
		String as[] = {
			"剪刀", "石头", "布"
		};
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("请输入剪刀、石头、布其中之一");
			String s = scanner.next();
			if (!filter(s))
				System.out.println("你输入的命令有误，请重新输入");
			else
			if (!s.equals("exit"))
			{
				int i = (int)(Math.random() * 3D);
				String s1 = as[i];
				int j = rule(s, s1);
				System.out.println((new StringBuilder()).append("你出的是：").append(s).append("\t系统出的是：").append(s1).toString());
				if (j > 0)
				{
					System.out.println((new StringBuilder()).append("恭喜").append(player.getName()).append("赢了，奖励10积分").toString());
					player.setScore(player.getScore() + 10);
				} else
				if (j < 0)
				{
					System.out.println((new StringBuilder()).append("对不起").append(player.getName()).append("输了，扣除10积分").toString());
					player.setScore(player.getScore() - 10);
				} else
				{
					System.out.println("打平了");
				}
				System.out.println(player.toString());
			} else
			{
				System.out.println((new StringBuilder()).append(player.getName()).append("退出了游戏，当前积分为：").append(player.getScore()).toString());
				return;
			}
		} while (true);
	}

	public static void main(String args[])
	{
		Player player1 = new Player("李伟", 100);
		Game game = new Game(player1);
		game.start();
	}
}
