package kakeru_201510;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class searchSystem extends JFrame implements ActionListener{
	private JButton btnSelect;
	
	private searchSystem(String title){
		setTitle(title);
		setSize(1050,700); 
		this.setMaximumSize(new Dimension(1050,700));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(0));
		
		//contentPane , panel
		Container cont = this.getContentPane();
		JPanel leftPanel = new JPanel();
		JPanel rightPanel = new JPanel();
		leftPanel.setPreferredSize(new Dimension(200,getMaximumSize().height));
		rightPanel.setPreferredSize(new Dimension(800,getMaximumSize().height));
		//leftPanel.setBackground(Color.darkGray);
		//rightPanel.setBackground(Color.GRAY);
		leftPanel.setLayout(new GridLayout(20,1));
		
		//button
		btnSelect = new JButton("查询学生成绩");
		btnSelect.setActionCommand("select");
		btnSelect.addActionListener(this);
		//add
		
		leftPanel.add(btnSelect);
		cont.add(leftPanel);
		cont.add(rightPanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
	}
	
	public static void main(String[] args){
		searchSystem window = new searchSystem("学生成绩管理系统");
		window.setVisible(true);
	}
}
