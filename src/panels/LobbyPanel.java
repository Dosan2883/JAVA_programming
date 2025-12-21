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
	
	private ImageIcon lobbyIc = new ImageIcon();
	private CookieImg ci;
	private JLabel selectCi;
	
	private void initCookieImg(CookieImg ci) {
		lobbyIc = ci.getLobbyIc();
	}
	
	public void setLobby(CookieImg ci) {
		initCookieImg(ci);
		selectCi.setIcon(this.lobbyIc);
	}
	
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
		
		selectCi = new JLabel("");
		selectCi.setBounds(300, 150, 160, 210);
		add(selectCi);
		
		JLabel selectBg = new JLabel("");
		selectBg.setForeground(Color.ORANGE);
		selectBg.setHorizontalAlignment(SwingConstants.CENTER);
		selectBg.setIcon(new ImageIcon("img/lobby/lobbyBg.png"));
		selectBg.setBounds(0, 0, 800, 500);
		add(selectBg);
	}
}
