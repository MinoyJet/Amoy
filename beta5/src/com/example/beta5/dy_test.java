//package com.example.beta5;
//
//import java.util.HashMap;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class dy_test extends Activity{
//	HashMap<String, String>map=new HashMap<String, String>();
////	ActivityReceiver ar;
////	static String str=new String();;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dy_image);
//        map.put("bddfhd","sdvds");
//    	map.put("sdvds", "fdvgdf");
//    	map.put("fdvgdf", "sdvds");
////        ar=new ActivityReceiver();
////        IntentFilter filter=new IntentFilter();
////        filter.addAction("imageMessage");
////         registerReceiver(ar, filter);
//         Intent it=getIntent();
//         String string=it.getStringExtra("image");
//         ImageView iv=(ImageView)findViewById(R.id.imageview);
//         TextView tx=(TextView)findViewById(R.id.textview);
//         tx.setText(string);
//         iv.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(string,"drawable", getPackageName())));
//    }
//    
//    
//  /*  public class ActivityReceiver extends BroadcastReceiver{
//    @Override
//    public void onReceive(Context ct, Intent it){
//  	int x=it.getIntExtra("image", -1);
//  	 TextView tx=(TextView)findViewById(R.id.textview);
//     tx.setText(x);;
//    
//    }
//    }*/
//    
//    
//    
//    
//}
