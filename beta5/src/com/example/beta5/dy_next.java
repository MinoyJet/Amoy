package com.example.beta5;

import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class dy_next extends Activity{

    String string=new String();
    int index;
    getresourse getre=new getresourse();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dy_image);

         Intent it=getIntent();
         string=it.getStringExtra("image");
         
		 for(int i=0;i<getre.re.ima1.size();i++){
		    	if(string.equals(getre.re.ima1.get(i)))
		    	index=i;
		    	
		    }
	      
         ImageView iv=(ImageView)findViewById(R.id.imageview);    
         iv.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(string,"drawable", getPackageName())));     
         TextView t1=(TextView)findViewById(R.id.daoyoutx1);
         TextView t2=(TextView)findViewById(R.id.daoyoutx2);
         TextView t3=(TextView)findViewById(R.id.daoyoutx3);
         TextView t5=(TextView)findViewById(R.id.daoyoutx5);
         t1.setText(getre.re.text1.get(index));
         t2.setText(getre.re.text2.get(index));
         t3.setText(getre.re.text3.get(index));
         t5.setText(getre.re.text5.get(index));
        
         
         
         
        ListView list=(ListView)findViewById(R.id.tiezilistinbuju);
        BaseAdapter ba=new BaseAdapter() {
			
			@Override
			public View getView(int arg0, View arg1, ViewGroup arg2) {
				// TODO Auto-generated method stub
				View view = View.inflate(dy_next.this, R.layout.tiezilist, null);   	
				LinearLayout li=(LinearLayout)view.findViewById(R.id.li);
				RelativeLayout re=(RelativeLayout)view.findViewById(R.id.tiezilistre);
				TextView t1=(TextView)view.findViewById(R.id.tiezilisttx);
				TextView t2=(TextView)view.findViewById(R.id.tiezilisttx2);
			    ImageView i1=(ImageView)view.findViewById(R.id.tiezilistimage);
	
			    i1.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(getre.re.tz.get(index).get(arg0).image,"drawable", getPackageName())));
				t1.setText(getre.re.tz.get(index).get(arg0).person+":");
				t2.setText(getre.re.tz.get(index).get(arg0).text);
				
				return re;
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
				return 5;
			}
		};
     	
     	list.setAdapter(ba);
         iv.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent inten=new Intent();
			      inten.putExtra("image", string);
			      inten.setClass(dy_next.this, GalleryActivity.class);
			      startActivity(inten);
				
			}
		});
    
    
    
    }
    public void end(View v) {     //������ ���ذ�ť
    	finish();
      }     
}
