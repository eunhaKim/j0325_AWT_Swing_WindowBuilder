package t3_event;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T1_MouseEvent  extends Frame implements WindowListener, MouseListener{
	
	public T1_MouseEvent() {
		super("마우스 이벤트 연습!");
		setBounds(300,250,300,300);
		
		setVisible(true);		
		addWindowListener(this);
		addMouseListener(this);
	}
	
	public static void main(String[] args) {
		new T1_MouseEvent();
	}
	
	// 윈도우 리스터를 위한 메소드 7개(핸들러)
	public void actionPerformed(ActionEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) { System.exit(0);}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}

	// 마우스 리스너늘 위한 5개 메소드(핸들러)
	// 마우스 클릭했을때 
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		System.out.println("마우스 클릭했을때 ");
	}
	// 마우스 클릭하는 순간
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("마우스 클릭하는 순간");		
	}
	// 마우스 클릭하고 놓는순간
	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		System.out.println("마우스 클릭하고 놓는순간");		
		
	}
	// 마우스가 객체 안으로 들어갈때(진입할때)
	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("마우스가 객체 안으로 들어갈때(진입할때)");		
	}
	// 마우스가 객체 안에서 밖으로 나갈때
	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("마우스가 객체 안에서 밖으로 나갈때");		
	}
}
