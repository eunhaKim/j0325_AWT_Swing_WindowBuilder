package t7_windowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

@SuppressWarnings("serial")
public class Test3_image  extends JFrame{
	JButton btnTotal, btnRandom, btn1, btn2, btn3, btn4, btnExit, btnClose ;
	JLabel lblImg1,lblImg2,lblImg3,lblImg4, lblCount;
	
	int img1Cnt =0, img2Cnt =0, img3Cnt =0, img4Cnt =0; 
	
	public Test3_image() {
		super("카드 횟수 맞추기");
		setSize(800,480);
		
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 735, 57);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		btnTotal = new JButton("모두보기");
		btnTotal.setBounds(4, 0, 89, 47);
		pn1.add(btnTotal);
		
		btn1 = new JButton("1번보기");
		btn1.setBounds(97, 0, 89, 47);
		pn1.add(btn1);
		
		btn2 = new JButton("2번보기");
		btn2.setBounds(190, 0, 89, 47);
		pn1.add(btn2);
		
		btn3 = new JButton("3번보기");
		btn3.setBounds(283, 0, 89, 47);
		pn1.add(btn3);
		
		btn4 = new JButton("4번보기");
		btn4.setBounds(376, 0, 89, 47);
		pn1.add(btn4);
		
		btnExit = new JButton("종료");
		btnExit.setBounds(655, 0, 75, 47);
		pn1.add(btnExit);
		
		btnRandom = new JButton("랜덤보기");
		btnRandom.setBounds(469, 0, 89, 47);
		pn1.add(btnRandom);
		
		btnClose = new JButton("모두닫기");
		btnClose.setBounds(562, 0, 89, 47);
		pn1.add(btnClose);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 67, 735, 304);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImg1 = new JLabel("New label");
		lblImg1.setIcon(new ImageIcon(Test3_image.class.getResource("/t7_windowBuilder/images/chun1.png")));
		lblImg1.setBounds(41, 10, 132, 284);
		lblImg1.setVisible(false);
		pn2.add(lblImg1);
		
		lblImg2 = new JLabel("New label");
		lblImg2.setIcon(new ImageIcon(Test3_image.class.getResource("/t7_windowBuilder/images/chun2.png")));
		lblImg2.setBounds(214, 10, 132, 284);
		lblImg2.setVisible(false);
		pn2.add(lblImg2);
		
		lblImg3 = new JLabel("New label");
		lblImg3.setIcon(new ImageIcon(Test3_image.class.getResource("/t7_windowBuilder/images/chun3.png")));
		lblImg3.setBounds(387, 10, 132, 284);
		lblImg3.setVisible(false);
		pn2.add(lblImg3);
		
		lblImg4 = new JLabel("New label");
		lblImg4.setIcon(new ImageIcon(Test3_image.class.getResource("/t7_windowBuilder/images/img1.jpg")));
		lblImg4.setBounds(560, 10, 132, 284);
		lblImg4.setVisible(false);
		pn2.add(lblImg4);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 384, 735, 57);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		lblCount = new JLabel("1번:0, 2번:0, 3번:0, 4번:0");
		lblCount.setForeground(new Color(255, 128, 64));
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setFont(new Font("굴림", Font.BOLD, 16));
		lblCount.setBounds(0, 10, 667, 37);
		pn3.add(lblCount);
		
		// ----------------------- 위쪽은 UI ----------------------------------------
		setVisible(true);
		setLocationRelativeTo(null); // 윈도우 창 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료 버튼 활성화
		
		// ----------------------- 아래쪽은 메소드 ------------------------------------
		
		// 모두보기
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDisPlay();
				img1Cnt++; img2Cnt++; img3Cnt++; img4Cnt++;
				dispCount();
			}
		});
		
		// 모두닫기
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
			}
		});
		
		// 종료
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
			
		// 랜덤보기
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ran = (int)(Math.random()*4)+1;
				System.out.println(ran);
				switch(ran) {
					case 1:
						lblImg1.setVisible(true);
						lblImg2.setVisible(false);
						lblImg3.setVisible(false);
						lblImg4.setVisible(false);
						img1Cnt++;
						break;
					case 2:
						lblImg1.setVisible(false);
						lblImg2.setVisible(true);
						lblImg3.setVisible(false);
						lblImg4.setVisible(false);
						img2Cnt++;
						break;
					case 3:
						lblImg1.setVisible(false);
						lblImg2.setVisible(false);
						lblImg3.setVisible(true);
						lblImg4.setVisible(false);
						img3Cnt++;
						break;
					case 4:
						lblImg1.setVisible(false);
						lblImg2.setVisible(false);
						lblImg3.setVisible(false);
						lblImg4.setVisible(true);
						img4Cnt++;
						break;
				}
				dispCount();
			}
		});
		
		// 1번보기
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				dispCount();
			}
		});
		// 2번보기
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				dispCount();
			}
		});
		// 3번보기
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				dispCount();
			}
		});
		// 4번보기
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				dispCount();
			}
		});
		
	}
	// 카운트 레이블에 표시하기
	protected void dispCount() {
		lblCount.setText("1번:"+img1Cnt+", 2번:"+img2Cnt+", 3번:"+img3Cnt+", 4번:"+img4Cnt);
	}
	// 모두닫기 처리
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);
	}
	
	// 모두보기 처리
	protected void allDisPlay() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}
	public static void main(String[] args) {
		new Test3_image();
	}
}
