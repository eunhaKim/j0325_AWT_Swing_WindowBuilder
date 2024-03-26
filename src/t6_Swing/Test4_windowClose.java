package t6_Swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

// 스윙의 종룔를 어뎁터를 이용
public class Test4_windowClose extends JFrame {
	
	
	public Test4_windowClose() {
		super("스윙연습3");
		
		setBounds(300, 250, 300, 250);
		
		setVisible(true);
		
		// 윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Test4_windowClose();
	}	
}
