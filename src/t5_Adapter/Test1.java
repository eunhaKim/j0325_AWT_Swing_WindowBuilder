package t5_Adapter;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Test1 extends Frame {
	Button btnExit;
	public Test1() {
		super("어뎁터를 활용한 종료...");
		setBounds(300, 350, 300, 280);
		
		btnExit = new Button("Exit");
		this.add(btnExit);
		
		setVisible(true);
		
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
		new Test1();
	}
}
