package com.example.beta5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class sq_zt extends Activity{
    int isClick[]={0,0,0};
    getresourse getre=new getresourse();
																				
	
	@Override
	public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sq_quanzi);
ListView list=(ListView)findViewById(R.id.list);
	BaseAdapter ba=new BaseAdapter() {
		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			View view = View.inflate(sq_zt.this, R.layout.dy_test, null);   	
			LinearLayout li=(LinearLayout)view.findViewById(R.id.li);
			TextView t1=(TextView)view.findViewById(R.id.menu_text);
			TextView t2=(TextView)view.findViewById(R.id.menu_text2);
			TextView t3=(TextView)view.findViewById(R.id.textView1);
            TextView t4=(TextView)view.findViewById(R.id.textView2);
			ImageView i1=(ImageView)view.findViewById(R.id.item_menu_line);
			ImageView i2=(ImageView)view.findViewById(R.id.ima2);
			i1.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(getre.re2.ima1.get(arg0),"drawable", getPackageName())));
			i2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(getre.re2.ima2.get(arg0),"drawable", getPackageName())));
			t1.setText(getre.re2.text1.get(arg0));t2.setText(getre.re2.text2.get(arg0));t3.setText(getre.re2.text3.get(arg0));t4.setText(getre.re2.text4.get(arg0));	
			
			return li;
		}
		
		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			
			return getre.re2.text1.size();
		}
	};
	list.setAdapter(ba);
	
	
	
	list.setOnItemClickListener(new OnItemClickListener()
	{int id;	
	
	 @Override
	 public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
	            long arg3)
	    {
	    	
	      TextView tx=(TextView)arg1.findViewById(R.id.textView2);
	      ImageView iv=(ImageView)arg1.findViewById(R.id.ima2);
	      ImageView iv2=(ImageView)arg1.findViewById(R.id.item_menu_line);
	      RelativeLayout rt=(RelativeLayout)arg1.findViewById(R.id.rt);
	      TextView t1=(TextView)arg1.findViewById(R.id.menu_text);
	      LinearLayout li2=(LinearLayout)arg1.findViewById(R.id.li2);
	      int x;
	      id=arg2;
	      
	      li2.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				if(getre.re2.ima2.get(id)=="aixin")
					getre.re2.ima2.set(id, "aixindianxiaqu");
				else getre.re2.ima2.set(id, "aixin");
				getre.re2.in1.set(id, "yes");
				return false;
			}
		});
	   if(getre.re2.in1.get(id).equals("yes")){
		   if(getre.re2.ima2.get(id).equals("aixin")){
	            x=Integer.parseInt(getre.re2.text4.get(arg2));	 
	            x--;
	      }
	      else{
	    	  x=Integer.parseInt(getre.re2.text4.get(arg2));	 
		      x++;
	      }
	      iv.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(getre.re2.ima2.get(id),"drawable", getPackageName())));
	      String y=Integer.toString(x);
	      getre.re2.text4.set(arg2, y);
	      tx.setText(getre.re2.text4.get(arg2)); 
//	      text1[arg2]=ima3[arg2];
//          t1.setText(text1[arg2]);

	      getre.re2.in1.set(id, "no");
	   }
	   else{
	      Intent inten=new Intent();
	      inten.putExtra("image", getre.re2.ima1.get(arg2));
	      inten.setClass(sq_zt.this, sq_zt_next.class);
	      startActivity(inten);
	   }
	   }	
	});
	}
	 public void fatie(View v) {     //������ ���ذ�ť
	    	Intent intent = new Intent();
			 intent.putExtra("msg", "              ���С�������\nһ����������죡(*^__^*) ��������");

	        intent.setClass(sq_zt.this,sq_fatie.class);
	        startActivity(intent);
	        this.finish();
	      } 
	 public void faxian(View v) {     //������ ���ذ�ť
	     
	        this.finish();
	      } 
}

