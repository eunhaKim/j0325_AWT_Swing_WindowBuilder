package t3_event;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T3_ButtonEvent2 extends Frame implements WindowListener, ActionListener{
	Button btnPlay, btnStop, btnExit, btnMessage;
	Label lblMessage;
	
	public T3_ButtonEvent2() {
		super("버튼 이벤트 연습!");
		setLayout(new FlowLayout());
		setBounds(300,350,500,300);
		
		// 버튼객체 생성 및 배치
		btnPlay = new Button("Start");
		btnStop = new Button("Stop");
		btnExit = new Button("Exit");
		btnMessage = new Button("Message");
		
		
		add(btnPlay);
		add(btnStop);
		add(btnExit);
		add(btnMessage);
		
		// 레이블 생성 및 배치
		lblMessage = new Label();
		lblMessage.setSize(150,50);
		lblMessage.setBackground(Color.YELLOW);
		add(lblMessage);
		
		setVisible(true);
		
		addWindowListener(this);
		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		btnExit.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new T3_ButtonEvent2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnTest = (Button) e.getSource();
		if(btnTest.getLabel().equals("Start")) {
			//System.out.println("시작버튼을 누르셨군요.");
			lblMessage.setText("start버튼클릭!!");
			btnMessage.setLabel("시작버튼 클릭!");
		}
		else if(btnTest.getLabel().equals("Stop")) {
//			System.out.println("스탑버튼을 누르셨군요.");
			lblMessage.setText("스탑버튼클릭!!");
		}
		else {
//			System.out.println("종료버튼을 누르셨군요.");
			System.exit(0);
		}
	}
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}
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
}
