package com.test;
//�ṩ������ɫ�ռ����
import java.awt.Color;
//�ṩ��������ص���ͽӿ�
import java.awt.Font;
//�ṩ��ͼ����ص���ͽӿ�
import java.awt.Graphics;
//�ṩ���߰�
import java.awt.Toolkit;
//��������¼��ӿ�
import java.awt.event.MouseEvent;
//��������¼������ӿ�
import java.awt.event.MouseListener;
//������
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//��ļ̳�
public class FiveChessGame extends JFrame implements MouseListener{
	//������
	int width=Toolkit.getDefaultToolkit().getScreenSize().width;
	//����߶�
	int height=Toolkit.getDefaultToolkit().getScreenSize().height;
	//��ʼ��x��yΪ����
	int x=0;
	int y=0;
	//����һ����ά��������
	 int[][] allChess = new int[15][15];
	 //���岼������
	  boolean isBlack = true;
	  
	  boolean jixu=true;
	  
	  
//	  BufferedImage bpImage = null;
	  
	 //�趨������ΪFiveChessGame
	public FiveChessGame(){
		//TitleΪ�������塱
		this.setTitle("������");
		
		//ҳ��ߴ��СΪ��550,550��
		this.setSize(550,550);
		
		//�趨λ�ü���Ϊ���¼��㷽��
		
		this.setLocation((width-550)/2,(height-550)/2);
		
		//���ÿ��ؼ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//����Ϊ�ɼ�Ϊ��
		this.setVisible(true);
		
		//����Ϊ���ɼ�Ϊ��
		this.setResizable(false);	
		
		//������
		this.addMouseListener(this);
		
		//�����ʼ��Ϸ����Ϸ��ʼ
//		 Button start=new Button("��ʼ��Ϸ");
		
		
		//�����¼�������
////		start.addMouseListener(this);
		
		//ҳ������
		
//		Panel panel = new Panel();
		
		
		//��ʼ��Ϸ
//		panel.add(start);
		
		//��忪ʼ����
//		this.add(panel);	
		
		
		
		
		
//		   try {
//			bpImage = ImageIO.read(new File("e:/beijing.png"));
		
		
//		} catch (IOException e) {
		
//			// TODO Auto-generated catch block
		
//			e.printStackTrace();
		
//		}
		
	}
	//�����޷���ֵ��paint��
	public void paint(Graphics g){
		
	 
		//����forѭ����������ʼ��iΪint�ͣ�i=0,ѭ��15��.
		for(int i=0;i<15;i++){
			
			//����30,100+30*iΪ������꣬450,100+30*iΪ�ص�����.
			g.drawLine(30, 100+30*i, 450, 100+30*i);
			
			
			//ͬ��
			g.drawLine(30+30*i, 100, 30+30*i, 520);
			
			
			
//			g.fillOval(x, y, 10, 10);
			
			
//			g.fillOval(x, y, 10, 10);
			
			//��ʼ��kΪint�ͣ���ʼֵΪ1��ѭ��15��
			for(int k = 0;k<15;k++){
				
				//��ʼ��jΪint�ͣ���ʼֵΪ1��ѭ��15��
	               for(int j =0;j<15;j++){
	            	   
	            	   //���[k][j] == 1���������ѭ��
	                      if(allChess[k][j] == 1){
	                    	  
	                    	  
	                           //����
	                    	//10Ϊ���ϵ������
	                           int tempX = k*30+30;
	                           
	                           //Y��ֵ Ϊj*30+100
	                           int tempY = j*30+100;
	                           
	                           
	                           g.fillOval(tempX-10,tempY-10,20,20);
	                           
	                      }
	                      if(allChess[k][j] == 2){
	                    	  
	                      //����
	                    	  
	                    	//10Ϊ���ϵ������
	                           int tempX = k*30+30;
	                           
	                         //Y��ֵ Ϊj*30+100
	                           int tempY = j*30+100;
	                           
	                           //����
	                           g.setColor(Color.WHITE);
	                           
	                           //�������
	                           g.fillOval(tempX-10,tempY-10,20,20);
	                           
	                           //����
	                           g.setColor(Color.BLACK);
	                           
	                           
	                           //�������
	                           g.drawOval(tempX-10,tempY-10,20,20);
	                           
	                      }
	                      
	                      
	                }
			}
			
			
		}
		
		
	}
	
	//����һ��˽�е����������Ϊ�ַ������ͣ��ַ������ͣ����ʹ��壬����
	private Font newFont(String string, int bold, int i) {
		
		
		// TODO Auto-generated method stub
		//����ֵΪ��
		return null;
		
	}
	
	@Override
	
	//�������������ΪmouseClicked ����¼�Ϊe
	public void mouseClicked(MouseEvent e) {
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	
	
	@Override
	//�������������ΪmouseClicked ����¼�Ϊe
	public void mousePressed(MouseEvent e) {
		
		
		
		// TODO Auto-generated method stub
		
		//���jixuΪ�棬����������ѭ��
		if(jixu==true){
			
			//x��ֵΪe�е�getX
		 x=e.getX();
		 
		//y��ֵΪe�е�getY
		 y=e.getY();
		 
			//���x>=30��x<=450��y>=100��y<=520ͬʱ����������������ѭ��
			if(x>=30&&x<=450&&y>=100&&y<=520){
				
				//x��ֵΪ(x-30)/30 
				 x = (x-30)/30 ;
				 
				 ////y��ֵΪ(y-30)/30 
	              y = (y-100)/30 ;
	              
	              //���allChess[x][y]==0����������������ѭ��
	              
	              if(allChess[x][y]==0){
	            	  
	            	  
	            	//����Ҳ��һ��ѭ��  ������������˫��ѭ��
	            	  
	              //�ж��Ƿ����
	            	  //���isBlackΪ�棬���������ѭ��
	                       if(isBlack == true){
	                    	   
	                    	   //��1��ֵ��allChess[x][y]�������
	                              allChess[x][y] = 1;
	                              //��ֵallChess[x][y]
	                              isBlack = false;
	                             //���� 
	                        }else{
	                        	
	                        	//��2��ֵ��allChess[x][y] 
	                               allChess[x][y] = 2;
	                               //��isBlackΪ��
	                               isBlack = true;
	                               
	                        }
	                       //�����͵�
	                       boolean canplay=this.checkwin();
	                       
	                       //ѭ��
	                       if(canplay==true){
	                    	   
	                    	   //��ֵ
	                    	   JOptionPane.showMessageDialog(this,"game over"+(allChess[x][y]==1?"�ڷ�":"�׷�")+"��ʤ");
	                    	   
	                    	   //��ֵ
	                    	   jixu=false;
	                    	   
	                    	   
	                    	   
	                       }
	                //����������       
	              }else{
	            	  
	            	  //���¸�ֵ
	                    JOptionPane.showMessageDialog(this,"��ǰλ���Ѿ������ӣ����������壡");
	                    
	              }
	              
	            //��ʾ����ִ��һ��paint()
	              this.repaint();
	            
			}
			
			
			}
	}
	@Override
	
	//��������ͷ�
	public void mouseReleased(MouseEvent e) {
		
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	@Override
	
	//����������
	public void mouseEntered(MouseEvent e) {
		
		
		
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	//����˳�
	public void mouseExited(MouseEvent e) {
		
		
		// TODO Auto-generated method stub
		
		
		
	}
	//�����͵�checkwin
	public boolean checkwin(){
		
		//��ʼ����־
		boolean flag=false;
		
		//��ʼ����ɫ
		int color=allChess[x][y];
		
		//������ʼ��Ϊ1
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
		//���count>=5����������ѭ��
		if(count>=5){
			flag=true;
			//�����������ѭ��
		}else{
			
			count=this.checkCount(0, 1, color);
			//��ѭ��
			if(count>=5){
				
				flag=true;
			}else{
				
				count=this.checkCount(1, -1, color);
				//ѭ��
				if(count>=5){
					
					flag=true;
					
			}else{
				count=this.checkCount(1, 1, color);
				//ifѭ��
				if(count>=5){
					
					
					flag=true;
			}
		}
		
	}
		}
		//����flag
		return flag;
	}
	//����˽�е�int�͵�checkCount
	private int checkCount(int xchenge,int ychenge,int color){
		//c��ʼ��
		int count=1;
		
		int tempx=xchenge;
		
		int tempy=ychenge;
		//����()���������������whileѭ��
		while(color==allChess[x+xchenge][y+ychenge]){
			//������1
		count++;
		//���xchenge������0
		if(xchenge!=0){
		//xchenge����++����	
		xchenge++;
		}
		
		//��ychenge������0ʱ
		if(ychenge!=0){
			//��ychenge����0ʱ
		if(ychenge>0){
			
			//����ychenge�Լ�1����
		ychenge++;
		//����
		}else{
		//����ychenge�Լ�1����	
		ychenge--;
		}
		}
		}
		xchenge=tempx;
		ychenge=tempy;
		//whileѭ��
		while(color==allChess[x-xchenge][y-ychenge]){
		count++;	
		//ifѭ��
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



