package com.example.beta5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sq_fatie extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sq_fatie);
	}
	
	 public void end(View v) {     //������ ���ذ�ť
	    	 this.finish();
	      }  
	 public void quanzi(View v) {     //������ ���ذ�ť
	    	Intent intent = new Intent();
			 intent.putExtra("msg", "              ���С�������\nһ����������죡(*^__^*) ��������");

	        intent.setClass(sq_fatie.this,sq_zt.class);
	        startActivity(intent);
	        this.finish();
	      }  
}
