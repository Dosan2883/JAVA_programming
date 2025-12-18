package panels;

import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import ingame.CookieImg;

public class LobbyPanel extends JPanel{
	private JButton StartBtn;
	
	private JButton SelectBtn;
	
	private ImageIcon start = new ImageIcon("img/lobby/GameStartBtn.png");
	
	private ImageIcon select = new ImageIcon("img/lobby/SelectBtn.png");
	
	private CookieImg ci;
	
	public LobbyPanel(Object o){
		
		StartBtn = new JButton(start);
		StartBtn.setName("StartBtn");
		StartBtn.addMouseListener((MouseListener) o);
		StartBtn.setBounds(550, 380, 205, 65);
		add(StartBtn);
		StartBtn.setBorderPainted(false);
		StartBtn.setContentAreaFilled(false);
		StartBtn.setFocusPainted(false);
		
		SelectBtn = new JButton(select);
		SelectBtn.setName("SelectBtn");
		SelectBtn.addMouseListener((MouseListener) o);
		SelectBtn.setBounds(20, 380, 210, 55);
		add(SelectBtn);
		SelectBtn.setBorderPainted(false);
		SelectBtn.setContentAreaFilled(false);
		SelectBtn.setFocusPainted(false);
		
		JLabel selectBg = new JLabel("");
		selectBg.setForeground(Color.ORANGE);
		selectBg.setHorizontalAlignment(SwingConstants.CENTER);
		selectBg.setIcon(new ImageIcon("img/lobby/lobbyBg.png"));
		selectBg.setBounds(0, 0, 784, 461);
		add(selectBg);
	}
}
