package kakeru_201510;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener{
	JButton[] btns_num = new JButton[10];
	JButton[] btns_ope = new JButton[4];
	JButton eq = new JButton("=");
	JButton res = new JButton("Reset");
	JButton dot = new JButton(".");
	
	private String num01 = new String("");
	private String num02 = new String("");
	private String ope=new String("");
	private boolean flag = false;
	private JLabel label = new JLabel(String.valueOf(0));
	
	public calculator(String title){
		this.setTitle(title);
		this.setBounds(400,400,400,400);
		this.setSize(500,240);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container content = this.getContentPane();
		
		label.setFont(new Font("Century",Font.BOLD,48));
		label.setHorizontalAlignment(JLabel.RIGHT);
		JPanel panel_4 = new JPanel();
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		panel_1.setLayout(new GridLayout(1,2));
		panel_2.setLayout(new GridLayout(4,3));
		panel_3.setLayout(new GridLayout(4,2));
		panel_4.setLayout(new GridLayout(1,1));
		
		for(int i=0;i<btns_num.length;i++){
			btns_num[i]=new JButton(String.valueOf(i));
			btns_num[i].addActionListener(this);
			btns_num[i].setActionCommand(btns_num[i].getText());
			panel_2.add(btns_num[i]);
		}
		
		dot.addActionListener(this);
		dot.setActionCommand(".");
		panel_2.add(dot);
		panel_2.add(new JButton());

		for(int i=0;i<btns_ope.length;i++){
			btns_ope[i]=new JButton();
			btns_ope[i].addActionListener(this);
			btns_ope[i].setActionCommand("Ope" + i);
			panel_3.add(btns_ope[i]);
		}
		
		eq.addActionListener(this);
		eq.setActionCommand("=");
		res.addActionListener(this);
		res.setActionCommand("reset");
		panel_3.add(res);
		panel_3.add(eq);
		btns_ope[0].setText("+");
		btns_ope[1].setText("-");
		btns_ope[2].setText("x");
		btns_ope[3].setText("/");
		
		panel_1.add(panel_2);
		panel_1.add(panel_3);
		panel_4.add(label);
		content.add(panel_4,BorderLayout.NORTH);
		content.add(panel_1,BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		String cmd = e.getActionCommand();
		if(!cmd.equals("Ope0") && !cmd.equals("Ope1") && !cmd.equals("Ope2") && !cmd.equals("Ope3") && !cmd.equals("res") && !cmd.equals("=") ){
			if(ope.equals("") && flag == false){
				num01=num01.concat(cmd);
				label.setText(num01);
			}
			else if(!ope.equals("")){
				num02=num02.concat(cmd);
				label.setText(num02);
			}
		}
		if(!num01.equals("") && num02.equals("")){
			switch(cmd){
				case "Ope0":
					ope = "+";
					label.setText("+");
					break;
				case "Ope1":
					ope = "-";
					label.setText("-");
					break;
				case "Ope2":
					ope = "x";
					label.setText("x");
					break;
				case "Ope3":
					ope = "/";
					label.setText("/");
					break;
				default:
					break;
			}
		}
		if(cmd.equals("=") && !num01.equals("") && !num02.equals("") && !ope.equals("")){
			double res=0.0;
			switch(ope){
			case"+":
				res = (double)Double.parseDouble(num01)+(double)Double.parseDouble(num02);
				break;
			case"-":
				res = (double)Double.parseDouble(num01)-(double)Double.parseDouble(num02);
				break;
			case"x":
				res = (double)Double.parseDouble(num01)*(double)Double.parseDouble(num02);
				break;
			case"/":
				res = (double)Double.parseDouble(num01)/(double)Double.parseDouble(num02);
				break;
			default:
				break;
			}
			num02="";
			ope="";
			num01=String.valueOf(res);
			flag = true;
			label.setText(String.valueOf(res));
		}
		
		if(cmd.equals("reset")){
			num01="";
			num02="";
			ope="";
			flag=false;
			label.setText(String.valueOf(0));
			
		}
	}
	
	public static void main(String[] args){
		calculator ob01 = new calculator("¼ÆËãÆ÷");
	}
}
