package com.threemuskets.prithwi.tics.Others;

import com.threemuskets.prithwi.tics.Main_pvp;

import android.graphics.Color;


public class Board_pvp {

	public static void paint(Integer id) {
		switch (id) {
		case 0: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid11.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid11.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 1: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid12.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid12.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 2:
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid13.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid13.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
		}
			break;
		case 3: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid21.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid21.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 4: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid22.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid22.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 5: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid23.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid23.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 6: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid31.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid31.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 7: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid32.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid32.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
		case 8: 
			if(Main_pvp.turn == 'R' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid33.setBackgroundColor(Color.parseColor("#70D70000"));
				//Main_pvp.turn = 'B';
				Main_pvp.status[id] = Main_pvp.RED;
			}
			else if(Main_pvp.turn == 'B' && Main_pvp.status[id] == Main_pvp.NULL) {
				Main_pvp.btn_grid33.setBackgroundColor(Color.parseColor("#70008ED7"));
				//Main_pvp.turn = 'R';
				Main_pvp.status[id] = Main_pvp.BLUE;
			}
			break;
			default: break;
		}
	}
}