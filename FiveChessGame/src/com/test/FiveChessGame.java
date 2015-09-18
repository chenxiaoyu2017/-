package com.test;
//提供用于颜色空间的类
import java.awt.Color;
//提供与字体相关的类和接口
import java.awt.Font;
//提供与图形相关的类和接口
import java.awt.Graphics;
//提供工具包
import java.awt.Toolkit;
//导入鼠标事件接口
import java.awt.event.MouseEvent;
//导入鼠标事件监听接口
import java.awt.event.MouseListener;
//导入类
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//类的继承
public class FiveChessGame extends JFrame implements MouseListener{
	//定义宽度
	int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	//定义高度
	int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	//初始化x和y为整型
	int x=0;
	int y=0;
	//定义一个二维整型数组
	 int[][] allChess = new int[15][15];
	 //定义布尔类型
	  boolean isBlack = true;
	  
	  boolean jixu=true;
	  
	  
//	  BufferedImage bpImage = null;
	  
	 //设定工程名为FiveChessGame
	public FiveChessGame(){
		//Title为“五子棋”
		this.setTitle("五子棋");
		
		//页面尺寸大小为（550,550）
		this.setSize(550,550);
		
		//设定位置计算为如下计算方法
		
		this.setLocation((width-550)/2,(height-550)/2);
		
		//设置开关键
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//设置为可见为真
		this.setVisible(true);
		
		//设置为不可见为假
		this.setResizable(false);	
		
		//鼠标监听
		this.addMouseListener(this);
		
		//点击开始游戏，游戏开始
//		 Button start=new Button("开始游戏");
		
		
		//启动事件监听器
////		start.addMouseListener(this);
		
		//页面面板打开
		
//		Panel panel = new Panel();
		
		
		//开始游戏
//		panel.add(start);
		
		//面板开始启动
//		this.add(panel);	
		
		
		
		
		
//		   try {
//			bpImage = ImageIO.read(new File("e:/beijing.png"));
		
		
//		} catch (IOException e) {
		
//			// TODO Auto-generated catch block
		
//			e.printStackTrace();
		
//		}
		
	}
	//定义无返回值的paint类
	public void paint(Graphics g){
		
	 
		//进行for循环操作，初始化i为int型，i=0,循环15次.
		for(int i=0;i<15;i++){
			
			//定义30,100+30*i为起点坐标，450,100+30*i为重点坐标.
			g.drawLine(30, 100+30*i, 450, 100+30*i);
			
			
			//同上
			g.drawLine(30+30*i, 100, 30+30*i, 520);
			
			
			
//			g.fillOval(x, y, 10, 10);
			
			
//			g.fillOval(x, y, 10, 10);
			
			//初始化k为int型，初始值为1，循环15次
			for(int k = 0;k<15;k++){
				
				//初始化j为int型，初始值为1，循环15次
	               for(int j =0;j<15;j++){
	            	   
	            	   //如果[k][j] == 1进行下面的循环
	                      if(allChess[k][j] == 1){
	                    	  
	                    	  
	                           //黑子
	                    	//10为左上点横坐标
	                           int tempX = k*30+30;
	                           
	                           //Y的值 为j*30+100
	                           int tempY = j*30+100;
	                           
	                           
	                           g.fillOval(tempX-10,tempY-10,20,20);
	                           
	                      }
	                      if(allChess[k][j] == 2){
	                    	  
	                      //白子
	                    	  
	                    	//10为左上点横坐标
	                           int tempX = k*30+30;
	                           
	                         //Y的值 为j*30+100
	                           int tempY = j*30+100;
	                           
	                           //白子
	                           g.setColor(Color.WHITE);
	                           
	                           //坐标计算
	                           g.fillOval(tempX-10,tempY-10,20,20);
	                           
	                           //黑子
	                           g.setColor(Color.BLACK);
	                           
	                           
	                           //坐标计算
	                           g.drawOval(tempX-10,tempY-10,20,20);
	                           
	                      }
	                      
	                      
	                }
			}
			
			
		}
		
		
	}
	
	//定义一个私有的字体的类型为字符串类型，字符串类型，整型粗体，整型
	private Font newFont(String string, int bold, int i) {
		
		
		// TODO Auto-generated method stub
		//返回值为空
		return null;
		
	}
	
	@Override
	
	//定义点击鼠标类型为mouseClicked 鼠标事件为e
	public void mouseClicked(MouseEvent e) {
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	
	
	@Override
	//定义点击鼠标类型为mouseClicked 鼠标事件为e
	public void mousePressed(MouseEvent e) {
		
		
		
		// TODO Auto-generated method stub
		
		//如果jixu为真，则进行下面的循环
		if(jixu==true){
			
			//x赋值为e中的getX
		 x=e.getX();
		 
		//y赋值为e中的getY
		 y=e.getY();
		 
			//如果x>=30，x<=450，y>=100和y<=520同时成立，则进行下面的循环
			if(x>=30&&x<=450&&y>=100&&y<=520){
				
				//x赋值为(x-30)/30 
				 x = (x-30)/30 ;
				 
				 ////y赋值为(y-30)/30 
	              y = (y-100)/30 ;
	              
	              //如果allChess[x][y]==0成立，则进行下面的循环
	              
	              if(allChess[x][y]==0){
	            	  
	            	  
	            	//以下也是一个循环  ，所以整体是双重循环
	            	  
	              //判断是否可下
	            	  //如果isBlack为真，则进行下面循环
	                       if(isBlack == true){
	                    	   
	                    	   //把1赋值给allChess[x][y]这个数组
	                              allChess[x][y] = 1;
	                              //赋值allChess[x][y]
	                              isBlack = false;
	                             //否则 
	                        }else{
	                        	
	                        	//把2赋值给allChess[x][y] 
	                               allChess[x][y] = 2;
	                               //另isBlack为真
	                               isBlack = true;
	                               
	                        }
	                       //布尔型的
	                       boolean canplay=this.checkwin();
	                       
	                       //循环
	                       if(canplay==true){
	                    	   
	                    	   //赋值
	                    	   JOptionPane.showMessageDialog(this,"game over"+(allChess[x][y]==1?"黑方":"白方")+"获胜");
	                    	   
	                    	   //赋值
	                    	   jixu=false;
	                    	   
	                    	   
	                    	   
	                       }
	                //条件不成立       
	              }else{
	            	  
	            	  //重新赋值
	                    JOptionPane.showMessageDialog(this,"当前位置已经有棋子，请重新下棋！");
	                    
	              }
	              
	            //表示重新执行一次paint()
	              this.repaint();
	            
			}
			
			
			}
	}
	@Override
	
	//定义鼠标释放
	public void mouseReleased(MouseEvent e) {
		
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	
	//定义鼠标进入
	public void mouseEntered(MouseEvent e) {
		
		
		
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	//鼠标退出
	public void mouseExited(MouseEvent e) {
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	//布尔型的checkwin
	public boolean checkwin(){
		
		//初始化标志
		boolean flag=false;
		
		//初始化颜色
		int color=allChess[x][y];
		
		//计数初始化为1
		int count=1;
		
		
//		int c=1;
		
		
//		while(color==allChess[x+c][y]){
		
		
//			count++;
		
		
//			c++;
		
//		}
		
//		c=1;
		
//		while(color==allChess[x-c][y]){
		
//			count++;
		
//			c++;
		
//		}
		
//		if(count>=5){
		
//			flag=true;
//		}
		
		
		
//		int b=1;
		
		
//		int county=1;
		
		
//		while(color==allChess[x][y+b]){
		
//			county++;
		
//			b++;
		
//		}
//		b=1;
		
//		while(color==allChess[x][y-b]){
//			county++;
		
//			b++;
		
//		}
//		if(county>=5){
		
//			flag=true;
		
//		}
//		int countx1=1;
		
//		int m=1;
//		while(color==allChess[x+m][y-m]){
//			countx1++;
		
		
//			m++;
//		}
//		m=1;
		
//		while(color==allChess[x-m][y+m]){
//			countx1++;
//			m++;
		
//		}
//		if(countx1>=5){
		
//			flag=true;
		
//		}
//		int countx2=1;
//		int n=1;
		
//		while(color==allChess[x-n][y-n]){
//			countx2++;
//			n++;
		
//		}
//		n=1;
//		while(color==allChess[x+n][y+n]){
//			countx2++;
		
//			n++;
//		}
//		if(countx2>=5){
//			flag=true;
//		}
		count=this.checkCount(1, 0, color);
		//如果count>=5，进行下面循环
		if(count>=5){
			flag=true;
			//否则进行下面循环
		}else{
			
			count=this.checkCount(0, 1, color);
			//再循环
			if(count>=5){
				
				flag=true;
			}else{
				
				count=this.checkCount(1, -1, color);
				//循环
				if(count>=5){
					
					flag=true;
					
			}else{
				count=this.checkCount(1, 1, color);
				//if循环
				if(count>=5){
					
					
					flag=true;
			}
		}
		
	}
		}
		//返回flag
		return flag;
	}
	//定义私有的int型的checkCount
	private int checkCount(int xchenge,int ychenge,int color){
		//c初始化
		int count=1;
		
		int tempx=xchenge;
		
		int tempy=ychenge;
		//满足()里面的条件，进行while循环
		while(color==allChess[x+xchenge][y+ychenge]){
			//计数加1
		count++;
		//如果xchenge不等于0
		if(xchenge!=0){
		//xchenge进行++操作	
		xchenge++;
		}
		
		//在ychenge不等于0时
		if(ychenge!=0){
			//在ychenge大于0时
		if(ychenge>0){
			
			//进行ychenge自加1操作
		ychenge++;
		//否则
		}else{
		//进行ychenge自减1操作	
		ychenge--;
		}
		}
		}
		xchenge=tempx;
		ychenge=tempy;
		//while循环
		while(color==allChess[x-xchenge][y-ychenge]){
		count++;	
		//if循环
		if(xchenge!=0){			
		xchenge++;
		
		}		
		if(ychenge!=0){			
		if(ychenge>0){			
		ychenge++;			
		}else{			
		ychenge--;		
		}		
		}		
		}
		return count;
		
		}
	public static void main(String[] args) {
		
		FiveChessGame ceshi=new FiveChessGame();
	}	
	}



