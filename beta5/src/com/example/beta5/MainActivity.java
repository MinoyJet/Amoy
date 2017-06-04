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
	    private static final String gaizhang= "盖章";    
	    private static final String daohang= "导航";    
	    private static final String daoyou = "导游";  
	    private static final String shequ = "社区";      
	    //内容Intent  
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
	

//与数据库交互的类
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
		
		tiezi z1=new tiezi("y1", "王力宏", "鼓浪屿真好");
		ti.add(z1);
		z1=new tiezi("y2", "魏照昊", "啊哈哈哈");
		ti.add(z1);
		z1=new tiezi("y3", "田林", "好漂亮的小岛啊");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "我是来看海的");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "哆啦A梦");
		ti.add(z1);		
		t1="鼓浪屿";t2="一杯午后的茶，一缕海的风";t3="跟着心走，一起去寻找鼓浪屿";t4="30";t5="下辖的一个街道。原名圆沙洲别名圆州仔.明朝改称鼓浪屿。因岛西南一方海滩上有一块两米多高，中有洞穴的礁石，每当涨潮水涌，浪击礁石，声似鼓浪，人们称鼓浪石，鼓浪屿因而出名。鼓浪屿街道短小，纵横交错，是厦门最大的一个卫星岛，岛上石岩峥嵘，挺拔雄秀，因常年受海浪扑打，形成许多幽谷和峭崖，沙滩，礁石，峭壁，岩峰。";im1="gly";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y4", "wlt", "起个大早登日光岩看海上日出");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "日光岩人文好多啊");
		ti.add(z1);	
		z1=new tiezi("y1", "王力宏", "日光岩总要来看一下的");
		ti.add(z1);
		z1=new tiezi("y2", "魏照昊", "日光岩怎么8点才开门");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "可以看到鼓浪屿全景啦");
		ti.add(z1);					
		t1="日光岩";t2="晨曦,一如初生般的温暖";t3="一方小岛，寻一处世外桃源";t4="40";
		t5="站在日光岩山门处，看到一块高40多米的巨岩，凌空而立，在那巨岩峭壁上，有1915年许世英题刻的“天风海涛”四字横书；其下还有两行大字题刻，右侧为“鼓浪洞天”，系明万历元年（公元1573年）江苏丹阳人丁一中所书，这是日光岩最早的题刻。左侧为“鹭江第一”，是清道光年间福建长乐人林铖所写，两者靠近，字迹相当，林铖署名特别大，游人常误为二者皆是林铖所题，其实后者比前者晚刻二百多年。上述三大崖刻，可说是对日光岩的风光作了形象性的概括，给游人留下深刻的印象。这就是日光岩的第一景。进入山门，便是日光岩寺，重修于明万历年间，至今有400多年的历史。日光岩寺是一块巨岩覆盖的山洞，称“一片瓦”，因每天凌晨，朝阳从厦门五老峰冉冉升起，该寺首先沐浴在金色的阳光下，因而得名，后来日光寺又改名为“莲花庵”。这是明正德年间建尼姑庵而更名的。";
		im1="sdvds";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y2", "魏照昊", "鼓浪屿上音乐多、音乐家也多。");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "浪和音乐是绝配");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "声色交融，音影动人");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "我想学钢琴了");
		ti.add(z1);	
		z1=new tiezi("y1", "王力宏", "只想静静地弹一首钢琴曲");
		ti.add(z1);			
		t1="钢琴博物馆";t2="临海听涛，琴声依然";t3="听见海的声音";t4="20";t5="鼓浪屿钢琴博物馆陈列了从澳大利亚运回鼓浪屿的胡友义先生收藏的70多架古钢琴。这里的钢琴不仅历史悠久、种类多样，而且奇特。克莱门蒂19世纪初制造四角钢琴身为世界最大，音响最为洪亮；钢琴制造大师舒楠1906年制作的双键盘的古钢琴有4套琴弦，8个踏板，两层琴键，且黑白琴键颠倒，另外，博物馆里还有琴内镶有三个皇冠的皇室御用钢琴；勃德制于1878年，琴腿为「S」形的钢琴；街头艺人卖艺的手摇街头钢琴以及世界上零件最复杂的风琴。许多钢琴经历两次大战岁月，作为装饰物的烛台灯饰也有百年以上历史，参观一次钢琴博物馆，等于浏览了一遍世界钢琴发展史。一台1928年美国制造、价值昂贵的全自动「海那斯」名琴，用一卷卷打孔的古琴谱逼真地弹奏出贝多芬、肖邦、勃拉姆斯的作品，成为博物馆的背景音乐，与鼓浪屿的拍岸涛声相伴。其中还有一台钢琴，曾被大火烧成两截，又被衔接起来，成了钢琴博物馆中唯一一台不能弹奏的钢琴。2003年10月31日，鼓浪屿迎来了第一台管风琴。这台1872年的巨型管风琴共有80个音栓、近3000根音管、4层键，全部组件竟需四个货柜才能运完。这台管风琴的安装工程巨大，要使每一个音管都发出美妙的音乐竟要一年半之久。现在我们也可以到鼓浪屿倾听那美妙的琴声。";im1="gqbwg";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
	    
		z1=new tiezi("y5", "dada", "向英雄致敬！");
		ti.add(z1);	
		z1=new tiezi("y2", "魏照昊", "感受到了庄严的气氛");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "历史书上见过的");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "英雄已逝，青史留名");
		ti.add(z1);
		z1=new tiezi("y1", "王力宏", "他是我心目中的英雄");
		ti.add(z1);			
		t1="郑成功纪念馆";t2="仰望伟大，感受渺小";t3="纪念英雄一生的丰功伟绩";t4="20";t5="1962年，为纪念郑成功复台三百周年，南安县人民政府假石井西角郑氏宗祠设石井郑成功纪念馆，搜集、展出有关郑成功生平、业绩的实物、照片资料，以进行爱国主义教育。1978年旅港同胞余先生独资于原址重修，搜集展出大批珍贵实物、图片资料。经省文化厅同意，县编委正式批准建制。";im1="zcg";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);

		z1=new tiezi("y2", "魏照昊", "第一次看海底世界，好激动");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "内地的孩子伤不起啊");
		ti.add(z1);		
		z1=new tiezi("y4", "wlt", "海豚真可爱");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "感觉那鱼要吃了我..");
		ti.add(z1);	
		z1=new tiezi("y1", "王力宏", "这个海底世界好小啊");
		ti.add(z1);			
		t1="海底世界";t2="与海的亲密接触";t3="看一眼海底的世界";t4="20";t5="鼓浪屿钢琴博物馆陈列了从澳大利亚运回鼓浪屿的胡友义先生收藏的70多架古钢琴。这里的钢琴不仅历史悠久、种类多样，而且奇特。克莱门蒂19世纪初制造四角钢琴身为世界最大，音响最为洪亮；钢琴制造大师舒楠1906年制作的双键盘的古钢琴有4套琴弦，8个踏板，两层琴键，且黑白琴键颠倒，另外，博物馆里还有琴内镶有三个皇冠的皇室御用钢琴；勃德制于1878年，琴腿为「S」形的钢琴；街头艺人卖艺的手摇街头钢琴以及世界上零件最复杂的风琴。许多钢琴经历两次大战岁月，作为装饰物的烛台灯饰也有百年以上历史，参观一次钢琴博物馆，等于浏览了一遍世界钢琴发展史。一台1928年美国制造、价值昂贵的全自动「海那斯」名琴，用一卷卷打孔的古琴谱逼真地弹奏出贝多芬、肖邦、勃拉姆斯的作品，成为博物馆的背景音乐，与鼓浪屿的拍岸涛声相伴。其中还有一台钢琴，曾被大火烧成两截，又被衔接起来，成了钢琴博物馆中唯一一台不能弹奏的钢琴。2003年10月31日，鼓浪屿迎来了第一台管风琴。这台1872年的巨型管风琴共有80个音栓、近3000根音管、4层键，全部组件竟需四个货柜才能运完。这台管风琴的安装工程巨大，要使每一个音管都发出美妙的音乐竟要一年半之久。现在我们也可以到鼓浪屿倾听那美妙的琴声。";im1="hdsj";im2="aixin";
		re.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y4", "wlt", "没有三亚的海滩好");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "第一次看见海，呜呜");
		ti.add(z1);	
		z1=new tiezi("y1", "王力宏", "这里的沙子好细啊");
		ti.add(z1);
		z1=new tiezi("y2", "魏照昊", "很有一种椰岛的风情");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "沿海的孩子真幸福");
		ti.add(z1);					
		t1="田林";t2="躺在鼓浪屿的沙滩上";t3="让时光从指间,留走";t4="40";
		t5="鼓浪屿的沙滩比较大，比较多。\n沙滩的沙子好细，建议大家还是穿拖鞋前往。如果没有洗脚的地方，等水干掉，就自然没有了，但是那自然需要半个小时左右的时间。\n海水感觉好冷，但是泡久了就还好啦！岸边的垃圾好多，有很多是冲上岸的！\n这个时候肯定不会缺少游泳的朋友，首当其冲的就是老年人，三五成群。\n游客们摆着各种POSE照相，写下各种字迹留恋。 ";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y1", "王力宏", "那里看的见台湾吗");
		ti.add(z1);
		z1=new tiezi("y4", "wlt", "上去好像要门票吧");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "我上去过，风景真美");
		ti.add(z1);	
		z1=new tiezi("y2", "魏照昊", "晚上有灯光的 时候更美");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "可以看到鼓浪屿全景啦");
		ti.add(z1);					
		t1="wlt";t2="在日光岩上，看整个厦门";t3="寻一处桃源";t4="40";
		t5=" 日光岩又称“龙头山”，与厦门的虎头山隔海相望，一龙一虎把守厦门港叫“龙虎守江”。 \n 上山途中，不乏名家题写的摩崖石刻。\n 如黄仲训所题，署名“铁彝”所题的“九夏生寒”；\n  清代大书法家何绍基所写的“脚力尽时山更好”； \n 民国十九路军军长蔡延锴将军到此处见景生情写下的七绝“心存只手补天工，八闽屯兵今古同。当年古垒依然在，日光岩下忆英雄”； \n 原北大校长、中国著名教肓家蔡元培先生所题刻的七绝“叱咤天风镇海涛，指挥若定阵云高。虫沙猿鹤有时尽，正气觥觥不可淘。”； \n 蒋鼎文题写的《日光岩铭》：“日光岩，石磊磊，环海梯田成玉垒，上有浩浩之天风，下有泱泱之大海。天围古屿作汤池，风鼓浪声助奏凯。天柱不倾海不飞，我铭其崖视亿载。”";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y5", "dada", "妹子好勇敢");
		ti.add(z1);	
		z1=new tiezi("y2", "魏照昊", "不错，说走就走的旅行");
		ti.add(z1);	
		z1=new tiezi("y4", "wlt", "我也是今年毕业");
		ti.add(z1);
		z1=new tiezi("y1", "王力宏", "你是哪个大学的呢");
		ti.add(z1);
		z1=new tiezi("y3", "田林", "鼓浪屿的夏天是最美的");
		ti.add(z1);					
		t1="dada";t2="再见鼓浪屿碧蓝的海";t3="美丽一厦";t4="40";
		t5="旅行让人见多识广，对女孩子来说更是如此，所以女孩子一定到旅行一次。一个女孩子的认识很重要，你见识的多了，自然就会心胸豁达视野宽广，会影响到你对很多事情的看法。它让你更有信心，不会在精神的世界里迷失方向；它让你有眼界，不会在物质的世界里迷失自己。一辈子是场修行，短的是旅途，长的是人生。旅行，能让你遇到那个更好的自己。一个人只有旅行的时候，才能听见自己的声音。它会告诉你，这世界比你想象中宽阔。你的人生不会没有出口，你会发现自己有一双翅膀，不必经过任何人同意就能飞翔。上路吧，寻找那个更可爱、更勇敢、更真实的自己。";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y4", "wlt", "这里的海鲜好棒");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "我从小吃到大的");
		ti.add(z1);	
		z1=new tiezi("y1", "王力宏", "其实不是很合我的口味");
		ti.add(z1);
		z1=new tiezi("y2", "魏照昊", "哈哈我也是吃货");
		ti.add(z1);	
		z1=new tiezi("y3", "田林", "我海鲜过敏。。");
		ti.add(z1);					
		t1="魏照昊";t2="好棒的小吃一条街";t3="吃货快来";t4="40";
		t5="靠海吃海，到鼓浪屿旅游，最不可错过的是海鲜。这里海鲜一年四季都新鲜美味，无论你什么时候来，都可以品尝到可口的虾鱼蟹贝。与其他海滨城市不同，这里的海鲜做法大多喜欢白灼，简单的烹饪过后，色香味俱全，同时保留了海鲜特有的鲜味，让人停不了口。";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
		z1=new tiezi("y2", "魏照昊", "以后有机会再来");
		ti.add(z1);	
		z1=new tiezi("y4", "wlt", "好文艺的赶脚");
		ti.add(z1);
		z1=new tiezi("y5", "dada", "文艺范");
		ti.add(z1);	
		z1=new tiezi("y1", "王力宏", "很浪漫的小岛");
		ti.add(z1);
		z1=new tiezi("y3", "田林", "帮帮哒 ");
		ti.add(z1);					
		t1="小米很幸福";t2="一座小岛，一座城";t3="感受一段静止的时光";t4="40";
		t5="到了鼓浪屿，眼花缭乱是必须的，但是鼓浪屿的小店，再乱你也要去看看！她们甜美静谧，她们活泼可爱，她们时而热烈，时而安静，她们是你和鼓浪屿淡淡的午后，美好的享受，久久的回忆..\n一个人，可以很发呆\n两个人，可以很甜蜜\n不管你是一个人，还是两个人\n你都可以找到最真最美的自己\n漂流的日子里，心有所依\n某年某月的某一天\n我在，鼓浪屿";
		im1="sdvds";im2="aixin";
		re2.add(t1, t2, t3, t4, t5,im1,im2,"no",ti);
		
	}
}

