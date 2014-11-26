package com.threemuskets.prithwi.tics.Others;

import com.threemuskets.prithwi.tics.Main_pvp;

public class Checker_pvp {
	static int winCond[][] = {{0,2},{3,5},{6,8},{0,6},{1,7},{2,8},{0,8},{2,6}};
	public static boolean won(char player) {
		for (int i=0; i<8; ++i)
			if (testWinCond(player, winCond[i][0], winCond[i][1]))
				return true;
		if(Main_pvp.turn == 'R') Main_pvp.turn = 'B';
		else if(Main_pvp.turn == 'B') Main_pvp.turn = 'R';
		return false;
	}

	static boolean testWinCond(char player, int a, int b) {
		return Main_pvp.status[a]==player && Main_pvp.status[b]==player && Main_pvp.status[(a+b)/2]==player;
	}
}