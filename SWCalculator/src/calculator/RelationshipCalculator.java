package calculator;
//张凯鑫 2017111478
import java.awt.event.*;
import java.awt.*;
import java.awt.Window.Type;

public class RelationshipCalculator extends WindowAdapter{

	private Frame Relation_Frame;
	private Panel title_Panel,input_key_Panel,output_Panel,key_Panel;
	private Panel relation_Panel,common_Panel;//放置亲属关系按键和=、del、C按键
	private TextArea input_TextField;//输入框
	private TextField output_TextField;//输出框
	private Label Label_1,Label_2,Label_3,Label_4;//提示文字
    private Button baba_Button,mama_Button,erzi_Button,nver_Button,gege_Button,didi_Button,jiejie_Button,meimei_Button,zhangfu_Button,qizi_Button;//亲属关系按键
    private Button equal_Button,del_Button,C_Button,back_Button;//等于、删除、清空、返回按键
    
    private String[][] relationshipData = {
    		 {"我", "爸爸", "妈妈", "哥哥", "弟弟", "姐姐", "妹妹", "儿子", "女儿", "妻子", "丈夫", "未知亲戚"},
    	     {"爸爸", "爷爷", "奶奶", "伯父", "叔叔", "姑妈", "姑妈", "我", "妹妹", "妈妈", "不存在该种关系", "未知亲戚"},
    		 {"妈妈", "外公", "外婆", "大舅", "小舅", "大姨妈", "小姨妈", "我", "妹妹", "不存在该种关系", "爸爸", "未知亲戚"},
    		 {"哥哥", "爸爸", "妈妈", "哥哥", "我", "姐姐", "妹妹", "侄儿", "侄女", "嫂子", "不存在该种关系", "未知亲戚"},
    		 {"弟弟", "爸爸", "妈妈", "我", "弟弟", "姐姐", "妹妹", "侄儿", "侄女", "弟妹", "不存在该种关系", "未知亲戚"},
    		 {"姐姐", "爸爸", "妈妈", "哥哥", "我", "姐姐", "妹妹", "外甥", "外甥女", "不存在该种关系", "姐夫", "未知亲戚"},
    		 {"妹妹", "爸爸", "妈妈", "我", "弟弟", "姐姐", "妹妹", "外甥", "外甥女", "不存在该种关系", "妹夫", "未知亲戚"},
    		 {"儿子", "我", "妻子", "哥哥", "弟弟", "姐姐", "妹妹", "孙子", "孙女", "儿媳", "不存在该种关系", "未知亲戚"},
    		 {"女儿", "我", "妻子", "哥哥", "弟弟", "姐姐", "妹妹", "外孙", "外孙女", "不存在该种关系", "女婿", "未知亲戚"},
    		 {"妻子", "岳父", "岳母", "大舅子", "小舅子", "大姨子", "小姨子", "儿子", "女儿", "不存在该种关系", "我", "未知亲戚"},
    		 {"丈夫", "不存在该种关系", "不存在该种关系", "不存在该种关系", "不存在该种关系", "不存在该种关系", "不存在该种关系", "不存在该种关系", "不存在该种关系","不存在该种关系", "不存在该种关系", "未知亲戚"},
    		 {"爷爷", "曾祖父", "曾祖母", "伯祖父", "伯祖父", "姑奶奶", "姑奶奶", "爸爸", "姑妈", "奶奶", "不存在该种关系", "未知亲戚"},
    		 {"奶奶", "曾外祖父", "曾外祖母", "舅公", "舅公", "姨奶奶", "姨奶奶", "爸爸", "姑妈", "不存在该种关系", "爷爷", "未知亲戚"},
    		 {"伯父", "爷爷", "奶奶", "伯父", "叔叔", "姑妈", "姑妈", "堂哥", "堂姐", "伯母", "不存在该种关系", "未知亲戚"},
    		 {"叔叔", "爷爷", "奶奶", "伯父", "叔叔", "姑妈", "姑妈", "堂弟", "堂妹", "婶婶", "不存在该种关系", "未知亲戚"},
    		 {"姑妈", "爷爷", "奶奶", "伯父", "叔叔", "姑妈", "姑妈", "姑表哥", "姑表姐", "不存在该种关系", "姑丈", "未知亲戚"},
    		 {"外公", "外曾祖父", "外曾祖母", "伯外祖父", "叔外祖父", "姑姥姥", "姑姥姥", "舅舅", "妈妈", "外婆", "不存在该种关系", "未知亲戚"},
    		 {"外婆", "外曾外祖父", "外曾外祖母", "外舅公", "外舅公", "姨姥姥", "姨姥姥", "舅舅", "妈妈", "不存在该种关系", "外公", "未知亲戚"},
    		 {"大舅", "外公", "外婆", "大舅", "舅舅", "大姨", "妈妈", "舅表哥", "舅表姐", "大舅妈", "不存在该种关系", "未知亲戚"},
    		 {"小舅", "外公", "外婆", "舅舅", "小舅", "妈妈", "小姨", "舅表弟", "舅表妹", "小舅妈", "不存在该种关系", "未知亲戚"},
    		 {"大姨妈", "外公", "外婆", "大舅", "舅舅", "大姨", "妈妈", "姨表哥", "姨表姐", "不存在该种关系", "大姨父", "未知亲戚"},
    		 {"小姨妈", "外公", "外婆", "舅舅", "小舅", "妈妈", "小姨", "姨表弟", "姨表妹", "不存在该种关系", "小姨父", "未知亲戚"},
    		 {"侄儿", "哥哥", "嫂子", "侄儿", "侄儿", "侄女", "侄女", "侄孙子", "侄孙女", "侄媳", "不存在该种关系", "未知亲戚"},
    		 {"侄女", "哥哥", "嫂子", "侄儿", "侄儿", "侄女", "侄女", "外侄孙", "外侄孙女", "不存在该种关系", "侄女婿", "未知亲戚"},
    		 {"嫂子", "姻伯父", "姻伯母", "姻兄", "姻弟", "姻姐", "姻妹", "侄儿", "侄女", "不存在该种关系", "哥哥", "未知亲戚"},
    		 {"弟妹", "姻叔父", "姻叔母", "姻兄", "姻弟", "姻姐", "姻妹", "侄儿", "侄女", "不存在该种关系", "弟弟", "未知亲戚"},
    		 {"外甥", "姐夫", "姐姐", "外甥", "外甥", "外甥女", "外甥女", "外甥孙", "外甥孙女", "外甥媳妇", "不存在该种关系", "未知亲戚"},
    		 {"外甥女", "姐夫", "姐姐", "外甥", "外甥", "外甥女", "外甥女", "外甥孙", "外甥孙女", "不存在该种关系", "外甥女婿", "未知亲戚"},
    		 {"姐夫", "姻世伯", "姻伯母", "姻兄", "姻弟", "姻姐", "姻妹", "外甥", "外甥女", "姐姐", "不存在该种关系", "未知亲戚"},
    		 {"妹夫", "姻世伯", "姻伯母", "姻兄", "姻弟", "姻姐", "姻妹", "外甥", "外甥女", "妹妹", "不存在该种关系", "未知亲戚"},
    		 {"孙子", "儿子", "儿媳", "孙子", "孙子", "孙女", "孙女", "曾孙", "曾孙女", "孙媳", "不存在该种关系", "未知亲戚"},
    		 {"孙女", "儿子", "儿媳", "孙子", "孙子", "孙女", "孙女", "曾外孙", "曾外孙女", "不存在该种关系", "孙女婿", "未知亲戚"},
    		 {"儿媳", "亲家公", "亲家母", "姻侄", "姻侄", "姻侄女", "姻侄女", "孙子", "孙女", "不存在该种关系", "儿子", "未知亲戚"},
    		 {"外孙女", "女婿", "女儿", "外孙", "外孙", "外孙女", "外孙女", "外曾外孙", "外曾外孙女", "不存在该种关系", "外孙女婿", "未知亲戚"},
    		 {"外孙", "女婿", "女儿", "外孙", "外孙", "外孙女", "外孙女", "外曾孙", "外曾孙女", "外孙媳", "不存在该种关系", "未知亲戚"},
    		 {"女婿", "亲家公", "亲家母", "姻侄", "姻侄", "姻侄女", "姻侄女", "外孙", "外孙女", "女儿", "不存在该种关系", "未知亲戚"},
    		 {"岳父", "太岳父", "太岳母", "伯岳", "叔岳", "姑岳母", "姑岳母", "大舅子", "大姨子", "岳母", "不存在该种关系", "未知亲戚"},
    		 {"岳母", "外太岳父", "外太岳母", "舅岳父", "舅岳父", "姨岳母", "姨岳母", "小舅子", "小姨子", "不存在该种关系", "岳父", "未知亲戚"},
    		 {"大舅子", "岳父", "岳母", "大舅子", "小舅子", "大姨子", "小姨子", "内侄", "内侄女", "舅嫂", "不存在该种关系", "未知亲戚"},
    		 {"小舅子", "岳父", "岳母", "大舅子", "小舅子", "老婆", "小姨子", "内侄", "内侄女", "舅弟媳", "不存在该种关系", "未知亲戚"},
    		 {"大姨子", "岳父", "岳母", "大舅子", "小舅子", "大姨子", "老婆", "内甥", "姨甥女", "不存在该种关系", "大姨夫", "未知亲戚"},
    		 {"小姨子", "岳父", "岳母", "大舅子", "小舅子", "老婆", "小姨子", "内甥", "姨甥女", "不存在该种关系", "小姨夫", "未知亲戚"},
    		 {"曾祖父", "高祖父", "高祖母", "曾伯祖父", "曾叔祖父", "曾姑奶奶", "曾姑奶奶", "爷爷", "姑奶奶", "曾祖母", "不存在该种关系", "未知亲戚"},
    		 {"曾祖母", "高外祖父", "高外祖母", "舅曾祖父", "舅曾祖父", "姨曾祖母", "姨曾祖母", "爷爷", "姑奶奶", "不存在该种关系", "曾祖父", "未知亲戚"},
    		 {"伯祖父", "曾祖父", "曾祖母", "伯祖父", "爷爷", "姑奶奶", "姑奶奶", "堂伯", "堂姑", "伯祖母", "不存在该种关系", "未知亲戚"},
    		 {"姑奶奶", "曾祖父", "曾祖母", "爷爷", "叔祖父", "姑奶奶", "姑奶奶", "姑表伯父", "姑表姑母", "不存在该种关系", "姑爷爷", "未知亲戚"},
    		 {"曾外祖父", "曾外曾祖父", "曾外曾祖母", "伯曾外祖父", "叔曾外祖父", "姑曾外祖母", "姑曾外祖母", "舅公", "奶奶", "曾外祖母", "不存在该种关系", "未知亲戚"},
    		 {"曾外祖母", "曾外曾外祖父", "曾外曾外祖母", "舅曾外祖父", "舅曾外祖父", "姨曾外祖母", "姨曾外祖母", "舅公", "奶奶", "不存在该种关系", "曾外祖父", "未知亲戚"},
    		 {"舅公", "曾外祖父", "曾外祖母", "舅公", "舅公", "姨奶奶", "奶奶", "舅表伯父", "舅表姑母", "舅婆", "不存在该种关系", "未知亲戚"},
    		 {"姨奶奶", "曾外祖父", "曾外祖母", "舅公", "舅公", "姨奶奶", "奶奶", "姨表伯父", "姨表姑母", "不存在该种关系", "姨爷爷", "未知亲戚"},
    		 {"堂哥", "伯父", "伯母", "堂哥", "堂弟", "堂姐", "堂妹", "堂侄", "堂侄女", "堂嫂", "不存在该种关系", "未知亲戚"},
    		 {"堂弟", "叔叔", "婶婶", "堂哥", "堂弟", "堂姐", "堂妹", "堂侄", "堂侄女", "堂弟媳", "不存在该种关系", "未知亲戚"},
    		 {"堂姐", "伯父", "伯母", "堂哥", "堂弟", "堂姐", "堂妹", "堂外甥", "堂外甥女", "不存在该种关系", "堂姐夫", "未知亲戚"},
    		 {"堂妹", "叔叔", "婶婶", "堂哥", "堂弟", "堂姐", "堂妹", "堂外甥", "堂外甥女", "不存在该种关系", "堂妹夫", "未知亲戚"},
    		 {"伯母", "姻伯公", "姻伯婆", "姻世伯", "姻世伯", "姻伯母", "姻伯母", "堂哥", "堂姐", "不存在该种关系", "伯父", "未知亲戚"},
    		 {"婶婶", "姻伯公", "姻伯婆", "姻世伯", "姻世伯", "姻伯母", "姻伯母", "堂弟", "堂妹", "不存在该种关系", "叔叔", "未知亲戚"},
    		 {"舅表伯父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨表伯父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅表姑母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨表姑母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅婆", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨爷爷", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂侄", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂侄儿", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂嫂", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂弟媳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂外甥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂外甥女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂姐夫", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂妹夫", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻世伯", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻伯母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑表哥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑表姐", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑丈", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外曾祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外曾祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"伯外祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"叔外祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑姥姥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅舅", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外舅公", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨姥姥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅表哥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅表姐", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"大舅妈", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"小舅妈", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅表弟", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅表妹", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"大姨", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"小姨", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨表哥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨表弟", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨表姐", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨表妹", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"大姨父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"小姨父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"侄孙子", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外侄孙", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"侄孙女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外侄孙女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"侄媳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"侄女婿", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻伯父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻叔父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻伯母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻叔母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻兄", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻弟", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻姐", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻妹", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"叔祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂伯", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"堂姑", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑表伯父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑表姑母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"伯祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑爷爷", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾外曾祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾外曾祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"伯曾外祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"叔曾外祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅曾外祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑曾外祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨曾外祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外甥孙女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外甥孙", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外甥媳妇", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外甥女婿", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻师伯", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻伯母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾孙", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾外孙", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾孙女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾外孙女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"孙媳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"孙女婿", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"亲家公", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"亲家母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻侄", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姻侄女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外曾外孙", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外曾外孙女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外孙女婿", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外孙媳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"太岳父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外太岳父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"太岳母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"外太岳母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"伯岳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"叔岳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅岳父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姑岳母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨岳母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"内侄", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"内侄女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"内甥", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨甥女", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅嫂", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅弟媳", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"大姨夫", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"小姨夫", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"高祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"高祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"高外祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"高外祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅伯祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅叔祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"舅曾祖父", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"曾姑奶奶", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"姨曾祖母", "", "", "", "", "", "", "", "", "", "", ""},
    		 {"未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚", "未知亲戚"}
    		 };
	/**
	 * Create the frame.
	 */
	public void Relationship() {
		Relation_Frame=new Frame("亲戚关系计算器");
		Relation_Frame.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Relation_Frame.setType(Type.UTILITY);
		Relation_Frame.setForeground(SystemColor.desktop);
		Relation_Frame.setSize(780, 480);
		Relation_Frame.setLocationRelativeTo(null);
		Relation_Frame.setBackground(Color.LIGHT_GRAY);
		Relation_Frame.setResizable(true);
		Relation_Frame.setLayout(new BorderLayout(3,1));
		
		title_Panel=new Panel(new GridLayout(2,1));
		title_Panel.setPreferredSize(new Dimension(780, 60));
		Label_1=new Label("我的性别为 男");
		Label_2=new Label("我对对方的称呼");
	    title_Panel.add(Label_1);
	    title_Panel.add(Label_2);
		
		relation_Panel=new Panel(new GridLayout(1,10));
		relation_Panel.setPreferredSize(new Dimension(760, 65));
		baba_Button=new Button("爸爸");
		mama_Button=new Button("妈妈");
		erzi_Button=new Button("儿子");
		nver_Button=new Button("女儿");
		gege_Button=new Button("哥哥");
		didi_Button=new Button("弟弟");
		jiejie_Button=new Button("姐姐");
		meimei_Button=new Button("妹妹");
		zhangfu_Button=new Button("丈夫");
		qizi_Button=new Button("妻子");
		relation_Panel.add(baba_Button);
		relation_Panel.add(mama_Button);
		relation_Panel.add(erzi_Button);
		relation_Panel.add(nver_Button);
		relation_Panel.add(gege_Button);
		relation_Panel.add(didi_Button);
		relation_Panel.add(jiejie_Button);
		relation_Panel.add(meimei_Button);
		relation_Panel.add(zhangfu_Button);
		relation_Panel.add(qizi_Button);
		
		common_Panel=new Panel(new GridLayout(1,5));
		common_Panel.setPreferredSize(new Dimension(750, 55));
		equal_Button=new Button("计算");
		equal_Button.setForeground(Color.RED);
		del_Button=new Button("删除");
		del_Button.setForeground(Color.RED);
		C_Button=new Button("清空");
		C_Button.setForeground(Color.RED);
		back_Button=new Button("返回");
		back_Button.setForeground(new Color(0, 0, 0));
		back_Button.setBackground(new Color(219, 112, 147));
		common_Panel.add(equal_Button);
		common_Panel.add(del_Button);
		common_Panel.add(C_Button);
		common_Panel.add(back_Button);
		
		key_Panel=new Panel(new BorderLayout(2,1));
		key_Panel.setPreferredSize(new Dimension(760, 135));
		key_Panel.add(relation_Panel,BorderLayout.NORTH);
		key_Panel.add(common_Panel,BorderLayout.SOUTH);
		
		input_key_Panel=new Panel(new FlowLayout());
		input_key_Panel.setPreferredSize(new Dimension(780, 100));
		Label_3=new Label("关系：");
		Label_3.setPreferredSize(new Dimension(760, 20));
		input_TextField=new TextArea();
		input_TextField.setText("我");
		input_TextField.setPreferredSize(new Dimension(700, 90));
		input_key_Panel.add(Label_3,BorderLayout.NORTH);
		input_key_Panel.add(input_TextField,BorderLayout.CENTER);
		input_key_Panel.add(key_Panel,BorderLayout.SOUTH);
		
		output_Panel=new Panel(new FlowLayout());
		output_Panel.setPreferredSize(new Dimension(780, 120));
		Label_4=new Label("结果：");
		Label_4.setPreferredSize(new Dimension(760, 20));
		output_TextField=new TextField();
		output_TextField.setPreferredSize(new Dimension(700, 80));
		output_Panel.add(Label_4,BorderLayout.NORTH);
		output_Panel.add(output_TextField,BorderLayout.SOUTH);
		
		baba_Button.addActionListener(new Listener_baba());
		mama_Button.addActionListener(new Listener_mama());
		erzi_Button.addActionListener(new Listener_erzi());
		nver_Button.addActionListener(new Listener_nver());
		gege_Button.addActionListener(new Listener_gege());
		didi_Button.addActionListener(new Listener_didi());
		jiejie_Button.addActionListener(new Listener_jiejie());
		meimei_Button.addActionListener(new Listener_meimei());
		zhangfu_Button.addActionListener(new Listener_zhangfu());
		qizi_Button.addActionListener(new Listener_qizi());
	    equal_Button.addActionListener(new Listener_equal());
	    del_Button.addActionListener(new Listener_del());
	    C_Button.addActionListener(new Listener_C());
	    back_Button.addActionListener(new Listener_back());
		
		Relation_Frame.add(title_Panel,BorderLayout.NORTH);
		Relation_Frame.add(input_key_Panel,BorderLayout.CENTER);
		Relation_Frame.add(output_Panel,BorderLayout.SOUTH);
		Relation_Frame.setVisible(true);
		Relation_Frame.addWindowListener(this);
	}
	public boolean isExist(String value, String[][] array,int Length)
	{
		boolean flag=false; 
		for (int i = 0; i < Length; i++) 
		 {
			 if (value.equals(array[i][0]))
			 {
				 flag=true;
			 }
		 }
		 return flag;
    }
	class Listener_baba implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("爸爸");
			}
			else
			{
				input_TextField.setText(str+"的爸爸");
			}
		}	
	}
	class Listener_mama implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("妈妈");
			}
			else
			{
				input_TextField.setText(str+"的妈妈");
			}
		}	
	}
	class Listener_erzi implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("儿子");
			}
			else
			{
				input_TextField.setText(str+"的儿子");
			}
		}	
	}
	class Listener_nver implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("女儿");
			}
			else
			{
				input_TextField.setText(str+"的女儿");
			}
		}	
	}
	class Listener_gege implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("哥哥");
			}
			else
			{
				input_TextField.setText(str+"的哥哥");
			}
		}	
	}
	class Listener_didi implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("弟弟");
			}
			else
			{
				input_TextField.setText(str+"的弟弟");
			}
		}	
	}
	class Listener_jiejie implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("姐姐");
			}
			else
			{
				input_TextField.setText(str+"的姐姐");
			}
		}	
	}
	class Listener_meimei implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("妹妹");
			}
			else
			{
				input_TextField.setText(str+"的妹妹");
			}
		}	
	}
	class Listener_zhangfu implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("丈夫");
			}
			else
			{
				input_TextField.setText(str+"的丈夫");
			}
		}	
	}
	class Listener_qizi implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str=="")
			{
				input_TextField.setText("妻子");
			}
			else
			{
				input_TextField.setText(str+"的妻子");
			}
		}	
	}
	class Listener_equal implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String[] array=input_TextField.getText().split("的");
			for(int j=0; j<array.length;j++) System.out.println(array[j]+"\n");
			int column=0, row=0;
			String resultvalue=array[0];
			for(int i=1;i<array.length;i++)
			{
				for(int m=0;m<relationshipData.length;m++)
				{
					if(relationshipData[m][0].equals(resultvalue))
					{
						row=m;
					}
				}
				for(int n=0;n<relationshipData[0].length;n++)
				{
					if(relationshipData[0][n].equals(array[i]))
					{
						column=n;
					}
				}
				resultvalue = relationshipData[row][column];
				if(isExist(resultvalue,relationshipData,relationshipData.length)==false)
				{
					resultvalue="未知亲戚";
					break;
				}
			}
			output_TextField.setText(resultvalue);
		}	
	}
	class Listener_del implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String str = input_TextField.getText();
			if(str.length()<4)
			{
				input_TextField.setText("我");
			}
			else
			{
				str=str.substring(0,str.length()-3);
				input_TextField.setText(str);
			}
		}	
	}
	class Listener_C implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			input_TextField.setText("我");
			output_TextField.setText("");
		}	
	}
	class Listener_back implements ActionListener{		 
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}	
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		RelationshipCalculator new_rel = new RelationshipCalculator();
		new_rel.Relationship();
	}
}
