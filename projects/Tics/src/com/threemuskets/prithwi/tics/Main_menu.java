package com.threemuskets.prithwi.tics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main_menu extends Activity implements View.OnClickListener{
	
	Button btn_pvp, btn_pvc, btn_aboutme;
	TextView tv_aboutme;
	boolean me = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		tv_aboutme = (TextView) findViewById(R.id.tv_aboutme);
		tv_aboutme.setVisibility(View.INVISIBLE);
		btn_pvp = (Button) findViewById(R.id.btn_pvp);
		btn_pvc = (Button) findViewById(R.id.btn_pvc);
		btn_aboutme = (Button) findViewById(R.id.btn_aboutme);
		
		btn_pvp.setOnClickListener(this);
		btn_pvc.setOnClickListener(this);
		btn_aboutme.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_aboutme:
			if(!me) {
				me = true;
				btn_pvp.setVisibility(View.INVISIBLE);
				btn_pvc.setVisibility(View.INVISIBLE);
				tv_aboutme.setVisibility(View.VISIBLE);
				btn_aboutme.setText("Back");
			}
			else if(me) {
				me = false;
				btn_pvp.setVisibility(View.VISIBLE);
				btn_pvc.setVisibility(View.VISIBLE);
				tv_aboutme.setVisibility(View.INVISIBLE);
				btn_aboutme.setText("About the Dev");
			}
			break;
			
		case R.id.btn_pvc:
			Intent pvc = new Intent(Main_menu.this, Main_pvc.class);
			startActivity(pvc);
			break;
			
		case R.id.btn_pvp:
			Intent pvp = new Intent(Main_menu.this, Main_pvp.class);
			startActivity(pvp);
			break;
			
		default:
			break;
		}
	}
}
