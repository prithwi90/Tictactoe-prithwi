package com.threemuskets.prithwi.tics.Others;

import com.threemuskets.prithwi.tics.Main_pvc;

import android.graphics.Color;


public class Board_pvc {

	public static void paint(int id) {
		switch (id) {
		case 0: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid11.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid11.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid11.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid11.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 1: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid12.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid12.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid12.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid12.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 2:
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid13.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid13.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid13.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid13.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
		}
			break;
		case 3: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid21.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid21.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid21.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid21.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 4: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid22.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid22.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid22.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid22.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 5: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid23.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid23.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid23.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid23.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 6: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid31.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid31.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid31.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid31.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 7: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid32.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid32.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid32.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid32.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
		case 8: 
			if(Main_pvc.turn == 'R' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid33.setBackgroundColor(Color.parseColor("#70D70000"));
				Main_pvc.btn_grid33.setEnabled(false);
				//Main_pvp.turn = 'B';
				Main_pvc.status[id] = Main_pvc.RED;
			}
			else if(Main_pvc.turn == 'B' && Main_pvc.status[id] == Main_pvc.NULL) {
				Main_pvc.btn_grid33.setBackgroundColor(Color.parseColor("#70008ED7"));
				Main_pvc.btn_grid33.setEnabled(false);
				//Main_pvp.turn = 'R';
				Main_pvc.status[id] = Main_pvc.BLUE;
			}
			break;
			default: break;
		}
	}
}