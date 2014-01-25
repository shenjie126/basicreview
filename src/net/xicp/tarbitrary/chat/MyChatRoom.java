package net.xicp.tarbitrary.chat;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.Document;

public class MyChatRoom extends JFrame implements Runnable {
	private JTextField jtfIn = new JTextField();
	private JTextField jtfIp = new JTextField(15);
	private JTextArea jta = new JTextArea();
	private JScrollPane jsp = new JScrollPane();
	private DatagramSocket ds = null;
	//private Document doc = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new MyChatRoom().init();
	}

	private void init() {
		new Thread(this).start();
		JButton jb = new JButton("发送");
		jb.setMaximumSize(new Dimension(30, 25));

		MyActionListener mal = new MyActionListener();
		jb.addActionListener(mal);

		JPanel jpn = new JPanel();
		jpn.setLayout(new GridLayout(1, 3));
		jpn.add(jtfIp);
		jpn.add(jtfIn);
		jpn.add(jb);
		jsp.getViewport().add(jta);
		jta.setEditable(false);
		jta.setLineWrap(true);
		//doc = jta.getDocument();
		   


		jtfIn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

		Container con = getContentPane();
		con.add(jsp, "Center");
		con.add(jpn, "South");

		setTitle("tarbitrary");
		setBounds(200, 200, 380, 350);
		setResizable(false);
		setVisible(true);

		java.net.URL imgURL = this.getClass().getResource("/Image/main.png");
		ImageIcon img1 = new ImageIcon(imgURL);
		setIconImage(img1.getImage());

		/*
		 * System.out.println(this.getClass().getResource("/").getPath()+"a.png");
		 *  System.out.println(this.getClass().getResource("").getPath());
		 * setIconImage(new ImageIcon("src/Image/main.png").getImage());
		 * setIconImage(new
		 * ImageIcon(this.getClass().getResource("/").getPath()+
		 * "a.png").getImage());
		 * setIconImage(this.getToolkit().getImage("qq.jpg"));
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				ds.close();
			}
		});

	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			sendMessage();
		}

	}

	public void sendMessage() {
		System.out.println();
		byte[] buf = jtfIn.getText().getBytes();
		try {
			DatagramPacket dp = new DatagramPacket(buf, buf.length,
					InetAddress.getByName(jtfIp.getText().trim()), 8888);
			ds.send(dp);
			jta.append("我说：" + jtfIn.getText() + "\n");
			jtfIn.setText("");
		} catch (SocketException e) {
		    e.printStackTrace();
		} catch (UnknownHostException e) {
			 JOptionPane.showOptionDialog(this, JOptionPaneText.getInfo("请输入正确的域名或者ip地址！"), "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
					 JOptionPaneText.getEnsureobj(), JOptionPaneText.getEnsureobj()[0]);
			 return;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		byte[] buf = new byte[1024];
		try {
			ds = new DatagramSocket(8888);
			while (true) {
				DatagramPacket dp = new DatagramPacket(buf, buf.length);
				ds.receive(dp);
				String st = new String(buf, 0, dp.getLength());
				jta.append( dp.getAddress().getHostName()
						+ "说:" + st + "\n");
				//jta.select(doc.getLength(), doc.getLength()); 
				jta.setCaretPosition(jta.getDocument().getLength());
			}
		}catch (SocketException e) {
			if (null == ds) {
				JOptionPane.showOptionDialog(this, JOptionPaneText.getInfo("已经有一个聊天程序在运行！"), "", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
					 JOptionPaneText.getEnsureobj(), JOptionPaneText.getEnsureobj()[0]);
			 	this.dispose();
			} else if (!ds.isClosed()) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
