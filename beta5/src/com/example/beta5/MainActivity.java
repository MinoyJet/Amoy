package com.example.beta5;

import java.util.ArrayList;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	 private TabHost tabHost;  
	    private static final String gaizhang= "����";    
	    private static final String daohang= "����";    
	    private static final String daoyou = "����";  
	    private static final String shequ = "����";      
	    //����Intent  
	    private Intent gzIntent;  
	    private Intent dhIntent;  
	    private Intent dyIntent;  
	    private Intent sqIntent; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent=this.getIntent();
      		String strGetMsg=intent.getStringExtra("msg"); 		 
              Toast toast =Toast.makeText(this, strGetMsg,Toast.LENGTH_LONG);
              toast.setGravity(Gravity.CENTER, 0, 250);
              toast.show();
        setContentView(R.layout.tabhost);
        tabHost=this.getTabHost();
        tabHost.setFocusable(true);  
        prepareIntent();  
        setupIntent();       
     
    }
    private void setupIntent(){  
        tabHost.addTab(buildTabSpec(gaizhang,R.drawable.gaizhang, gzIntent));  
        tabHost.addTab(buildTabSpec(daohang,R.drawable.daohang, dhIntent));  
        tabHost.addTab(buildTabSpec(daoyou,R.drawable.daoyou, dyIntent));  
        tabHost.addTab(buildTabSpec(shequ,R.drawable.shequ, sqIntent));   
    }  
  
    private TabSpec buildTabSpec(String tag, int icon, Intent intent) {  
        View view = View.inflate(MainActivity.this, R.layout.tab, null);  
        ((ImageView)view.findViewById(R.id.tab_iv_icon)).setImageResource(icon);   
        return tabHost.newTabSpec(tag)  
                .setIndicator(view)  
                .setContent(intent);  
    }  
  
    private void prepareIntent() {  
        gzIntent=new Intent(MainActivity.this, gz.class);  
        dhIntent=new Intent(MainActivity.this, dh.class);  
        dyIntent=new Intent(MainActivity.this, dy.class);  
        sqIntent=new Intent(MainActivity.this,sq.class);  
         
    }  



}

class tiezi{
	String image=new String();
	String text=new String();
	String person=new String();
	tiezi(String ima,String ps,String tx){
		image=ima;
		person=ps;
		text=tx;
	}
}

class resourse{
	ArrayList<String> text1=new ArrayList<String>();
	ArrayList<String> text2=new ArrayList<String>();
	ArrayList<String> text3=new ArrayList<String>();
	ArrayList<String> text4=new ArrayList<String>();
	ArrayList<String> text5=new ArrayList<String>();
	ArrayList<String> ima1=new ArrayList<String>();
	ArrayList<String> ima2=new ArrayList<String>();
	ArrayList<String> in1=new ArrayList<String>();
	
	ArrayList<ArrayList<tiezi>> tz=new ArrayList<ArrayList<tiezi>>();

	public void add(String t1,String t2,String t3,String t4,String t5,String im1,String im2,String in,ArrayList<tiezi> ti){
	text1.add(t1);
	text2.add(t2);
	text3.add(t3);
	text4.add(t4);
	text5.add(t5);
	ima1.add(im1);
	ima2.add(im2);
	tz.add(ti);
	in1.add(in);
	}
}
	

//�����ݿ⽻������
class getresourse{
	 resourse re=new resourse();
	 resourse re2=new resourse();
	 
	
	 String t1=new String();
	 String t2=new String();
	 String t3=new String();
	 String t4=new String();
	 String t5=new String();
	 String im1=new String();
	 String im2=new String();
	 ArrayList<tiezi> ti=new ArrayList<tiezi>();
	 
	getresourse(){
		
		tiezi z1=new tiezi("y1", "������", "���������");
		ti.add(z1);
		z1=new tiezi("y2", "κ���", "��������");
		ti.add(z1);
		z1=new tiezi("y3", "����", "��Ư����С����");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "������������");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "����A��");
		ti.add(z1);		
		t1="������";t2="һ�����Ĳ裬һ�ƺ��ķ�";t3="�������ߣ�һ��ȥѰ�ҹ�����";t4="30";t5="��Ͻ��һ���ֵ���ԭ��Բɳ�ޱ���Բ����.�����ĳƹ����졣������һ����̲����һ�����׶�ߣ����ж�Ѩ�Ľ�ʯ��ÿ���ǳ�ˮӿ���˻���ʯ�����ƹ��ˣ����ǳƹ���ʯ�����������������������ֵ���С���ݺύ������������һ�����ǵ�������ʯ����ɣ�ͦ�����㣬�����ܺ����˴��γ�����ĹȺ����£�ɳ̲����ʯ���ͱڣ��ҷ塣";im1="gly";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y4", "wlt", "���������չ��ҿ������ճ�");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "�չ������ĺöడ");
		ti.add(z1);	
		z1=new tiezi("y1", "������", "�չ�����Ҫ����һ�µ�");
		ti.add(z1);
		z1=new tiezi("y2", "κ���", "�չ�����ô8��ſ���");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "���Կ���������ȫ����");
		ti.add(z1);					
		t1="�չ���";t2="����,һ����������ů";t3="һ��С����Ѱһ��������Դ";t4="40";
		t5="վ���չ���ɽ�Ŵ�������һ���40���׵ľ��ң���ն��������Ǿ����ͱ��ϣ���1915������Ӣ��̵ġ���纣�Ρ����ֺ��飻���»������д�����̣��Ҳ�Ϊ�����˶��족��ϵ������Ԫ�꣨��Ԫ1573�꣩���յ����˶�һ�����飬�����չ����������̡����Ϊ���ؽ���һ�������������丣��������������д�����߿������ּ��൱�����������ر�����˳���Ϊ���߽����������⣬��ʵ���߱�ǰ����̶��ٶ��ꡣ���������¿̣���˵�Ƕ��չ��ҵķ�����������Եĸ�����������������̵�ӡ��������չ��ҵĵ�һ��������ɽ�ţ������չ����£���������������䣬������400�������ʷ���չ�������һ����Ҹ��ǵ�ɽ�����ơ�һƬ�ߡ�����ÿ���賿���������������Ϸ�ȽȽ���𣬸���������ԡ�ڽ�ɫ�������£���������������չ����ָ���Ϊ�������֡���������������佨����ֶ������ġ�";
		im1="sdvds";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y2", "κ���", "�����������ֶࡢ���ּ�Ҳ�ࡣ");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "�˺������Ǿ���");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "��ɫ���ڣ���Ӱ����");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "����ѧ������");
		ti.add(z1);	
		z1=new tiezi("y1", "������", "ֻ�뾲���ص�һ�׸�����");
		ti.add(z1);			
		t1="���ٲ����";t2="�ٺ����Σ�������Ȼ";t3="������������";t4="20";t5="��������ٲ���ݳ����˴ӰĴ������˻ع�����ĺ����������ղص�70��ܹŸ��١�����ĸ��ٲ�����ʷ�ƾá�����������������ء������ŵ�19���ͳ������ĽǸ�����Ϊ�������������Ϊ���������������ʦ���1906��������˫���̵ĹŸ�����4�����ң�8��̤�壬�����ټ����Һڰ��ټ��ߵ������⣬������ﻹ���������������ʹڵĻ������ø��٣���������1878�꣬����Ϊ��S���εĸ��٣���ͷ�������յ���ҡ��ͷ�����Լ������������ӵķ��١������پ������δ�ս���£���Ϊװ�������̨����Ҳ�а���������ʷ���ι�һ�θ��ٲ���ݣ����������һ��������ٷ�չʷ��һ̨1928���������졢��ֵ�����ȫ�Զ�������˹�����٣���һ����׵Ĺ����ױ���ص��������ҡ�Ф�����ķ˹����Ʒ����Ϊ����ݵı������֣����������İ�������顣���л���һ̨���٣���������ճ����أ��ֱ��ν����������˸��ٲ������Ψһһ̨���ܵ���ĸ��١�2003��10��31�գ�������ӭ���˵�һ̨�ܷ��١���̨1872��ľ��͹ܷ��ٹ���80����˨����3000�����ܡ�4�����ȫ����������ĸ�����������ꡣ��̨�ܷ��ٵİ�װ���̾޴�Ҫʹÿһ�����ܶ�������������־�Ҫһ���֮�á���������Ҳ���Ե������������������������";im1="gqbwg";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
	    
		z1=new tiezi("y5", "dada", "��Ӣ���¾���");
		ti.add(z1);	
		z1=new tiezi("y2", "κ���", "���ܵ���ׯ�ϵ�����");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "��ʷ���ϼ�����");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "Ӣ�����ţ���ʷ����");
		ti.add(z1);
		z1=new tiezi("y1", "������", "��������Ŀ�е�Ӣ��");
		ti.add(z1);			
		t1="֣�ɹ������";t2="����ΰ�󣬸�����С";t3="����Ӣ��һ���ķṦΰ��";t4="20";t5="1962�꣬Ϊ����֣�ɹ���̨�������꣬�ϰ�������������ʯ������֣��������ʯ��֣�ɹ�����ݣ��Ѽ���չ���й�֣�ɹ���ƽ��ҵ����ʵ���Ƭ���ϣ��Խ��а������������1978���ø�ͬ��������������ԭַ���ޣ��Ѽ�չ���������ʵ�ͼƬ���ϡ���ʡ�Ļ���ͬ�⣬�ر�ί��ʽ��׼���ơ�";im1="zcg";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);

		z1=new tiezi("y2", "κ���", "��һ�ο��������磬�ü���");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "�ڵصĺ����˲���");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "������ɰ�");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "�о�����Ҫ������..");
		ti.add(z1);	
		z1=new tiezi("y1", "������", "������������С��");
		ti.add(z1);			
		t1="��������";t2="�뺣�����ܽӴ�";t3="��һ�ۺ��׵�����";t4="20";t5="��������ٲ���ݳ����˴ӰĴ������˻ع�����ĺ����������ղص�70��ܹŸ��١�����ĸ��ٲ�����ʷ�ƾá�����������������ء������ŵ�19���ͳ������ĽǸ�����Ϊ�������������Ϊ���������������ʦ���1906��������˫���̵ĹŸ�����4�����ң�8��̤�壬�����ټ����Һڰ��ټ��ߵ������⣬������ﻹ���������������ʹڵĻ������ø��٣���������1878�꣬����Ϊ��S���εĸ��٣���ͷ�������յ���ҡ��ͷ�����Լ������������ӵķ��١������پ������δ�ս���£���Ϊװ�������̨����Ҳ�а���������ʷ���ι�һ�θ��ٲ���ݣ����������һ��������ٷ�չʷ��һ̨1928���������졢��ֵ�����ȫ�Զ�������˹�����٣���һ����׵Ĺ����ױ���ص��������ҡ�Ф�����ķ˹����Ʒ����Ϊ����ݵı������֣����������İ�������顣���л���һ̨���٣���������ճ����أ��ֱ��ν����������˸��ٲ������Ψһһ̨���ܵ���ĸ��١�2003��10��31�գ�������ӭ���˵�һ̨�ܷ��١���̨1872��ľ��͹ܷ��ٹ���80����˨����3000�����ܡ�4�����ȫ����������ĸ�����������ꡣ��̨�ܷ��ٵİ�װ���̾޴�Ҫʹÿһ�����ܶ�������������־�Ҫһ���֮�á���������Ҳ���Ե������������������������";im1="hdsj";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y4", "wlt", "û�����ǵĺ�̲��");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "��һ�ο�����������");
		ti.add(z1);	
		z1=new tiezi("y1", "������", "�����ɳ�Ӻ�ϸ��");
		ti.add(z1);
		z1=new tiezi("y2", "κ���", "����һ��Ҭ���ķ���");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "�غ��ĺ������Ҹ�");
		ti.add(z1);					
		t1="����";t2="���ڹ������ɳ̲��";t3="��ʱ���ָ��,����";t4="40";
		t5="�������ɳ̲�Ƚϴ󣬱Ƚ϶ࡣ\nɳ̲��ɳ�Ӻ�ϸ�������һ��Ǵ���Ьǰ�������û��ϴ�ŵĵط�����ˮ�ɵ�������Ȼû���ˣ���������Ȼ��Ҫ���Сʱ���ҵ�ʱ�䡣\n��ˮ�о����䣬�����ݾ��˾ͻ����������ߵ������ö࣬�кܶ��ǳ��ϰ��ģ�\n���ʱ��϶�����ȱ����Ӿ�����ѣ��׵����ľ��������ˣ������Ⱥ��\n�ο��ǰ��Ÿ���POSE���࣬д�¸����ּ������� ";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y1", "������", "���￴�ļ�̨����");
		ti.add(z1);
		z1=new tiezi("y4", "wlt", "��ȥ����Ҫ��Ʊ��");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "����ȥ�����羰����");
		ti.add(z1);	
		z1=new tiezi("y2", "κ���", "�����еƹ�� ʱ�����");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "���Կ���������ȫ����");
		ti.add(z1);					
		t1="wlt";t2="���չ����ϣ�����������";t3="Ѱһ����Դ";t4="40";
		t5=" �չ����ֳơ���ͷɽ���������ŵĻ�ͷɽ����������һ��һ���������Ÿ۽С������ؽ����� \n ��ɽ;�У�����������д��Ħ��ʯ�̡�\n �����ѵ���⣬���������͡�����ġ�������������\n  ������鷨�Һ��ܻ���д�ġ�������ʱɽ���á��� \n ���ʮ��·�����������ǽ������˴���������д�µ��߾����Ĵ�ֻ�ֲ��칤�������ͱ����ͬ�����������Ȼ�ڣ��չ�������Ӣ�ۡ��� \n ԭ����У�����й����������Ҳ�Ԫ����������̵��߾���߳��������Σ�ָ���������Ƹߡ���ɳԳ����ʱ�����������������ԡ����� \n ��������д�ġ��չ������������չ��ң�ʯ���ڣ�������������ݣ����кƺ�֮��磬��������֮�󺣡���Χ���������أ�����������࿭���������㺣���ɣ��������������ء���";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y5", "dada", "���Ӻ��¸�");
		ti.add(z1);	
		z1=new tiezi("y2", "κ���", "����˵�߾��ߵ�����");
		ti.add(z1);	
		z1=new tiezi("y4", "wlt", "��Ҳ�ǽ����ҵ");
		ti.add(z1);
		z1=new tiezi("y1", "������", "�����ĸ���ѧ����");
		ti.add(z1);
		z1=new tiezi("y3", "����", "�������������������");
		ti.add(z1);					
		t1="dada";t2="�ټ�����������ĺ�";t3="����һ��";t4="40";
		t5="�������˼���ʶ�㣬��Ů������˵������ˣ�����Ů����һ��������һ�Ρ�һ��Ů���ӵ���ʶ����Ҫ�����ʶ�Ķ��ˣ���Ȼ�ͻ����ػ����Ұ��㣬��Ӱ�쵽��Ժܶ�����Ŀ�����������������ģ������ھ������������ʧ�������������۽磬���������ʵ���������ʧ�Լ���һ�����ǳ����У��̵�����;�����������������У������������Ǹ����õ��Լ���һ����ֻ�����е�ʱ�򣬲��������Լ�����������������㣬��������������п����������������û�г��ڣ���ᷢ���Լ���һ˫��򣬲��ؾ����κ���ͬ����ܷ��衣��·�ɣ�Ѱ���Ǹ����ɰ������¸ҡ�����ʵ���Լ���";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y4", "wlt", "����ĺ��ʺð�");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "�Ҵ�С�Ե����");
		ti.add(z1);	
		z1=new tiezi("y1", "������", "��ʵ���Ǻܺ��ҵĿ�ζ");
		ti.add(z1);
		z1=new tiezi("y2", "κ���", "������Ҳ�ǳԻ�");
		ti.add(z1);	
		z1=new tiezi("y3", "����", "�Һ��ʹ�������");
		ti.add(z1);					
		t1="κ���";t2="�ð���С��һ����";t3="�Ի�����";t4="40";
		t5="�����Ժ��������������Σ���ɴ�����Ǻ��ʡ����ﺣ��һ���ļ���������ζ��������ʲôʱ������������Ʒ�����ɿڵ�Ϻ��з�����������������в�ͬ������ĺ����������ϲ�����ƣ��򵥵���⿹���ɫ��ζ��ȫ��ͬʱ�����˺������е���ζ������ͣ���˿ڡ�";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y2", "κ���", "�Ժ��л�������");
		ti.add(z1);	
		z1=new tiezi("y4", "wlt", "�����յĸϽ�");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "���շ�");
		ti.add(z1);	
		z1=new tiezi("y1", "������", "��������С��");
		ti.add(z1);
		z1=new tiezi("y3", "����", "����� ");
		ti.add(z1);					
		t1="С�׺��Ҹ�";t2="һ��С����һ����";t3="����һ�ξ�ֹ��ʱ��";t4="40";
		t5="���˹����죬�ۻ������Ǳ���ģ����ǹ������С�꣬������ҲҪȥ�����������������ף����ǻ��ÿɰ�������ʱ�����ң�ʱ����������������͹����쵭����������õ����ܣ��þõĻ���..\nһ���ˣ����Ժܷ���\n�����ˣ����Ժ�����\n��������һ���ˣ�����������\n�㶼�����ҵ������������Լ�\nƯ�����������������\nĳ��ĳ�µ�ĳһ��\n���ڣ�������";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
	}
}

