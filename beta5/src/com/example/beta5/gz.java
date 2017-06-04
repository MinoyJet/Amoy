package com.example.beta5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.polites.android.GestureImageView;
import com.zijunlin.Zxing.Demo.CaptureActivity;

public class gz  extends Activity{
	private GestureImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gz);
		
	}
	public void saoma(View v) {  
		
      	Intent intent = new Intent();
	intent.setClass(gz.this,CaptureActivity.class);
		startActivity(intent);
	 
		//this.finish();
      } 
	 public void sorry(View v) {     //标题栏 返回按钮
		 Toast toast =Toast.makeText(this, "SORRY，正在施工中。。。。。",Toast.LENGTH_LONG);
	        toast.show();
	      }
}








