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
		return "����".equals(s) || "ʯͷ".equals(s) || "��".equals(s) || "exit".equals(s);
	}

	public int rule(String s, String s1)
	{
		if (s.equals(s1))
			return 0;
		if (s.equals("����"))
		{
			if (s1.equals("ʯͷ"))
				return -1;
			if (s1.equals("��"))
				return 1;
		}
		if (s.equals("ʯͷ"))
		{
			if (s1.equals("����"))
				return 1;
			if (s1.equals("��"))
				return -1;
		}
		if (s.equals("��"))
		{
			if (s1.equals("����"))
				return -1;
			if (s1.equals("ʯͷ"))
				return 1;
		}
		return 0;
	}

	public void start()
	{
		System.out.println("��ʼ��Ϸ");
		System.out.println((new StringBuilder()).append(player.getName()).append("������Ϸ����ʼ����Ϊ��").append(player.getScore()).toString());
		String as[] = {
			"����", "ʯͷ", "��"
		};
		Scanner scanner = new Scanner(System.in);
		do
		{
			System.out.println("�����������ʯͷ��������֮һ");
			String s = scanner.next();
			if (!filter(s))
				System.out.println("�������������������������");
			else
			if (!s.equals("exit"))
			{
				int i = (int)(Math.random() * 3D);
				String s1 = as[i];
				int j = rule(s, s1);
				System.out.println((new StringBuilder()).append("������ǣ�").append(s).append("\tϵͳ�����ǣ�").append(s1).toString());
				if (j > 0)
				{
					System.out.println((new StringBuilder()).append("��ϲ").append(player.getName()).append("Ӯ�ˣ�����10����").toString());
					player.setScore(player.getScore() + 10);
				} else
				if (j < 0)
				{
					System.out.println((new StringBuilder()).append("�Բ���").append(player.getName()).append("���ˣ��۳�10����").toString());
					player.setScore(player.getScore() - 10);
				} else
				{
					System.out.println("��ƽ��");
				}
				System.out.println(player.toString());
			} else
			{
				System.out.println((new StringBuilder()).append(player.getName()).append("�˳�����Ϸ����ǰ����Ϊ��").append(player.getScore()).toString());
				return;
			}
		} while (true);
	}

	public static void main(String args[])
	{
		Player player1 = new Player("��ΰ", 100);
		Game game = new Game(player1);
		game.start();
	}
}
