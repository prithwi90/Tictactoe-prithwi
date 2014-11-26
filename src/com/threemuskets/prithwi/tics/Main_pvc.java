package com.threemuskets.prithwi.tics;

import com.threemuskets.prithwi.tics.Others.Board_pvc;
import com.threemuskets.prithwi.tics.Others.Checker_pvc;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main_pvc extends Activity implements View.OnClickListener{
	
	TextView tv_thinker;
	public static Button btn_menu, btn_restart;
	public static Button btn_grid11;
	public static Button btn_grid12;
	public static Button btn_grid13;
	public static Button btn_grid21;
	public static Button btn_grid22;
	public static Button btn_grid23;
	public static Button btn_grid31;
	public static Button btn_grid32;
	public static Button btn_grid33;
	public static char NULL = ' ';
	public static char RED = 'R';
	public static char BLUE = 'B';
	public static char status[] =  {NULL, NULL, NULL,
									NULL, NULL, NULL,
									NULL,NULL, NULL};
	public static char turn = 'R';
	boolean botPlay = true;
	Handler waiting = new Handler();
	final AnimatorSet startAnim = new AnimatorSet();
	ObjectAnimator winGlow = new ObjectAnimator();
	public static int a, b;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_pvc);
		tv_thinker = (TextView) findViewById(R.id.tv_thinker);
		btn_menu = (Button) findViewById(R.id.btn_menu);
		btn_restart = (Button) findViewById(R.id.btn_restart);
		btn_grid11 = (Button) findViewById(R.id.btn_grid11);
		btn_grid12 = (Button) findViewById(R.id.btn_grid12);
		btn_grid13 = (Button) findViewById(R.id.btn_grid13);
		btn_grid21 = (Button) findViewById(R.id.btn_grid21);
		btn_grid22 = (Button) findViewById(R.id.btn_grid22);
		btn_grid23 = (Button) findViewById(R.id.btn_grid23);
		btn_grid31 = (Button) findViewById(R.id.btn_grid31);
		btn_grid32 = (Button) findViewById(R.id.btn_grid32);
		btn_grid33 = (Button) findViewById(R.id.btn_grid33);
		
		btn_restart.setOnClickListener(this);
		btn_menu.setOnClickListener(this);
		btn_grid11.setOnClickListener(this);
		btn_grid12.setOnClickListener(this);
		btn_grid13.setOnClickListener(this);
		btn_grid21.setOnClickListener(this);
		btn_grid22.setOnClickListener(this);
		btn_grid23.setOnClickListener(this);
		btn_grid31.setOnClickListener(this);
		btn_grid32.setOnClickListener(this);
		btn_grid33.setOnClickListener(this);
		winGlow.setDuration(2000);
		startAnim.play(winGlow);
		/*mAnimationSet.addListener(new AnimatorListenerAdapter() {
		    @Override
		    public void onAnimationEnd(Animator animation) {
		        super.onAnimationEnd(animation);
		        mAnimationSet.start();
		    }
		});*/
	}
	
	public void isWin(char turn) {
		if(Checker_pvc.won(turn)) {
			if(turn == 'B') {
				botPlay = false;
				Toast.makeText(Main_pvc.this, "Blue Won", Toast.LENGTH_SHORT).show();
				for(int i = 0; i < 9; i++) status[i] = NULL;
				waiting.postDelayed(new Runnable() {
					public void run() {
						Intent restart = getIntent();
						finish();
						startActivity(restart);
					}
				}, 3000);
			}
			else if(turn == 'R'){
				botPlay = false;
				Toast.makeText(Main_pvc.this, "Red Won", Toast.LENGTH_SHORT).show();
				for(int i = 0; i < 9; i++) status[i] = NULL;
				waiting.postDelayed(new Runnable() {
					public void run() {
						Intent restart = getIntent();
						finish();
						startActivity(restart);
					}
				}, 3000);
			}
		}
	}
	
	public void isDraw() {
		int count = 0;
		for (int i=0; i<9; ++i) if (status[i] == NULL) count++;
		if(count == 0) {
			botPlay = false;
			Toast.makeText(Main_pvc.this, "DRAW", Toast.LENGTH_SHORT).show();
			for(int i = 0; i < 9; i++) status[i] = NULL;
			Intent restart = getIntent();
			finish();
			startActivity(restart);
		}
	}
	
	public void terminus(int get) {
		int set = get;
		Board_pvc.paint(set);
		isWin(turn);
		isDraw();
		if(botPlay) Checker_pvc.bot();
		isWin(turn);
		isDraw();
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.btn_menu:
			for(int i = 0; i < 9; i++) status[i] = NULL;
			finish();
			break;
		case R.id.btn_restart:
			for(int i = 0; i < 9; i++) status[i] = NULL;
			Intent restart = getIntent();
			finish();
			startActivity(restart);
			break;
		case R.id.btn_grid11: terminus(0);
			break;
		case R.id.btn_grid12: terminus(1);
			break;
		case R.id.btn_grid13: terminus(2);
			break;
		case R.id.btn_grid21: terminus(3);
			break;
		case R.id.btn_grid22: terminus(4);
			break;
		case R.id.btn_grid23: terminus(5);
			break;
		case R.id.btn_grid31: terminus(6);
			break;
		case R.id.btn_grid32: terminus(7);
			break;
		case R.id.btn_grid33: terminus(8);
			break;
		default:
			break;
		}
	}
}