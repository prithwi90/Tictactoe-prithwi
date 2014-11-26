package com.threemuskets.prithwi.tics.Others;

import java.util.Random;

import com.threemuskets.prithwi.tics.Main_pvc;

public class Checker_pvc {
	static Random random = new Random();
	static int winCond[][] = {{0,2},{3,5},{6,8},{0,6},{1,7},{2,8},{0,8},{2,6}};
	public static boolean won(char player) {
		for (int i=0; i<8; ++i)
			if (testWinCond(player, winCond[i][0], winCond[i][1])) {
				Main_pvc.a = winCond[i][0];
				Main_pvc.b = winCond[i][1];
				return true;
			}
		if(Main_pvc.turn == 'R') Main_pvc.turn = 'B';
		else if(Main_pvc.turn == 'B') Main_pvc.turn = 'R';
		return false;
	}

	static boolean testWinCond(char player, int a, int b) {
		return Main_pvc.status[a]==player && Main_pvc.status[b]==player && Main_pvc.status[(a+b)/2]==player;
	}
	
	public static void bot() {
		char you = 0;
		int think = easyWin(Main_pvc.turn);
		if (Main_pvc.turn == Main_pvc.RED) you = Main_pvc.BLUE;
		else if (Main_pvc.turn == Main_pvc.BLUE) you = Main_pvc.RED;
		if (think < 0)
			think = easyWin(you);
		if (think < 0) {
			do think = random.nextInt(9);
			while (Main_pvc.status[think] != Main_pvc.NULL);
		}
		Board_pvc.paint(think);
	}
	
	static int easyWin(char player) {
		for (int i=0; i<8; ++i) {
			int result=hardThinking(player, winCond[i][0], winCond[i][1]);
			if (result>=0) return result;
		}
		return -1;
	}
	
	static int hardThinking(char player, int a, int b) {
		int c=(a+b)/2; //m
		if (Main_pvc.status[a]==player && Main_pvc.status[b]==player && Main_pvc.status[c]==Main_pvc.NULL)
			return c;
		if (Main_pvc.status[a]==player && Main_pvc.status[c]==player && Main_pvc.status[b]==Main_pvc.NULL)
			return b;
		if (Main_pvc.status[b]==player && Main_pvc.status[c]==player && Main_pvc.status[a]==Main_pvc.NULL)
			return a;
		return -1;
	}
}