package com.example.beta5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class zhuce extends Activity {
	private EditText mUser; // �ʺű༭��
	private EditText mPassword; // ����༭��

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zhuce);
        
     
}
    
    
    
    public void zhucu_back(View v) {     //������ ���ذ�ť
      	this.finish();
      }  
    
    public void zhucu_in(View v) {     //������ ���ذ�ť
    	Intent intent = new Intent();
		 intent.putExtra("msg", "              ���С�������\nһ����������죡(*^__^*) ��������");

        intent.setClass(zhuce.this,MainActivity.class);
        startActivity(intent);
      }  
}
