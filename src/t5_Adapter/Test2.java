package t5_Adapter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Test2 extends Frame {
	Button btnPlayStop, btnExit;
	public Test2() {
		super("어뎁터를 연습...");
		setLayout(new FlowLayout());
		setBounds(300, 350, 300, 280);
		
		btnPlayStop = new Button("Play");
		btnExit = new Button("Exit");
		this.add(btnPlayStop);
		this.add(btnExit);
		
		setVisible(true);
		
		// btnPlayStop
		btnPlayStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Button btnLabel = (Button) e.getSource();
				if(btnLabel.getLabel().equals("Play")) {
					btnLabel.setLabel("Stop");
					System.out.println("출발~~~");
				}
				else if(btnLabel.getLabel().equals("Stop")) {
					btnLabel.setLabel("Play");
					System.out.println("정지~~~");
				}
			}
		});
		
		// 어뎁터를 이용한 원도우 종료(익명 이너 클래스)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		// 버튼 클릭시 익명 클래스를 이용한 종료...
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
