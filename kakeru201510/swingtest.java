package kakeru_201510;

import java.awt.*;
import java.util.*;
import java.io.*;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class swingtest {
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				MyFrame frame = new MyFrame("Test Application");
				frame.setVisible(true);
			}
		});
	}
}

class MyFrame extends JFrame implements ActionListener{
	private JPanel cardPanel;
	private JTextField stuBumber;
	private CardLayout cl;
	private DefaultTableModel tableModel;
	public MyFrame(String title){
		setTitle(title);
		setSize(800, 600);
		setMinimumSize(new Dimension(800,600));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		JButton button01 = new JButton("添加学生成绩");
		button01.addActionListener(this);
		button01.setActionCommand(button01.getName());
		button01.setBackground(Color.WHITE);

		JButton button02 = new JButton("查询学生成绩");
		button02.addActionListener(this);
		button02.setActionCommand(button02.getName());
		button02.setBackground(Color.WHITE);
		JButton button03 = new JButton("更改学生成绩");
		button03.addActionListener(this);
		button03.setActionCommand(button03.getName());
		button03.setBackground(Color.WHITE);
		//card panel
		cardPanel = new JPanel();
		//left panel
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(Color.WHITE);
		//card01,card02,card03
		JPanel insertPanel = new JPanel();
		insertPanel.setBackground(Color.CYAN);
		JPanel selectPanel = new JPanel();
		selectPanel.setBackground(Color.BLACK);
		JPanel deletePanel = new JPanel();
		deletePanel.setBackground(Color.MAGENTA);
		
		//seletPanel
		JLabel stuNumberLabel = new JLabel("请输入查询对象的学生号码:");
		stuNumberLabel.setOpaque(false);
		
		stuBumber = new JTextField(10);
		
		JButton select = new JButton("查询");
		select.addActionListener(this);
		select.setActionCommand("查询学生成绩_查询");
		select.setBackground(Color.WHITE);
		JButton selectAll = new JButton("查询所有学生成绩");
		selectAll.addActionListener(this);
		selectAll.setActionCommand("查询学生成绩_查询所有");
		selectAll.setBackground(Color.WHITE);
		
		JPanel selectTop = new JPanel();
		selectTop.setBackground(Color.WHITE);
		selectTop.setLayout(new FlowLayout());
		selectTop.add(stuNumberLabel);
		selectTop.add(stuBumber);
		selectTop.add(select);
		selectTop.add(selectAll);
		
		String[] columns = {"学号","姓名","班级","语文","数学","英语","物理","化学","政治","地理","历史"};
		//Create a empty table with specified column name.
		tableModel = new DefaultTableModel(columns,0){
			@Override
			//Override the isCellEditable method to disable editing for all cells
			public boolean isCellEditable(int row,int column){
				return false;
			}
		};
		JTable selectTable = new JTable(tableModel);
		JScrollPane scrollSelect = new JScrollPane(selectTable);
		
		JPanel selectBottom = new JPanel();
		selectBottom.setBackground(Color.WHITE);
		selectBottom.setLayout(new GridLayout(1,1));
		selectBottom.add(scrollSelect);
		
		selectPanel.setLayout(new BorderLayout());
		selectPanel.add(selectTop,BorderLayout.NORTH);
		selectPanel.add(selectBottom,BorderLayout.CENTER);
		
		//cardPanel add
		cardPanel.setLayout(new CardLayout());
		cardPanel.add("insert",insertPanel);
		cardPanel.add("select",selectPanel);
		cardPanel.add("delete",deletePanel);
		cl = (CardLayout)(cardPanel.getLayout());
		
		panelLeft.setLayout(new BoxLayout(panelLeft,BoxLayout.Y_AXIS));
		setLayout(new BorderLayout());
		
		panelLeft.add(button01);
		panelLeft.add(button02);
		panelLeft.add(button03);
		contentPane.add(panelLeft,BorderLayout.WEST);
		contentPane.add(cardPanel,BorderLayout.CENTER);
		
	}
	@Override
	public void actionPerformed(ActionEvent e){
		
		switch(e.getActionCommand()){
		case "添加学生成绩":
			{cl.show(cardPanel, "insert");
				break;}
		case "查询学生成绩":
			{cl.show(cardPanel, "select");
				break;}
		case "更改学生成绩":
			{cl.show(cardPanel, "delete");
				break;}
		case "查询学生成绩_查询":
		{java.util.List<String[]> resultListAll = selectSQL(stuBumber.getText(),"select one");
		try{
			if(tableModel.getRowCount()>0){
				for(int i=tableModel.getRowCount()-1;i>=0;i--){
					tableModel.removeRow(i);
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			//Exception
		}
		if(resultListAll != null){
			for(String[] i:resultListAll){
				tableModel.addRow(i);
			}
		}
			break;}
		case "查询学生成绩_查询所有":
		{java.util.List<String[]> resultListAll = selectSQL(null,"select all");
		try{
			if(tableModel.getRowCount()>0){
				for(int i=tableModel.getRowCount()-1;i>=0;i--){
					tableModel.removeRow(i);
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			//Exception
		}
		if(resultListAll != null){
			for(String[] i:resultListAll){
				tableModel.addRow(i);
			}
		}
			break;}
		default:
		}
	}
	
	@SuppressWarnings("finally")
	private java.util.List<String[]> selectSQL(String stuNumber,String control){
		java.util.List<String[]> resultListAll = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(ClassNotFoundException e){
		}
		Connection con=null;
		try{
		con=DriverManager.getConnection("jdbc:mysql://localhost/mysql","root","Zn246246");
		PreparedStatement pstmt = null;
		switch(control){
			case "select one":{
				pstmt = con.prepareStatement("SELECT * FROM USER WHERE USER = ?");
				pstmt.setString(1,stuNumber);
				break;
			}
			case "select all":{
				pstmt = con.prepareStatement("SELECT * FROM USER");
				break;
			}
		}
		if(pstmt != null){
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columns = rsmd.getColumnCount();
		
		resultListAll = new LinkedList<String[]>();
			if(!(rs.next())){
				resultListAll = null;
			}else{
				do{
					String[] resultRow = new String[columns];
					for(int i=0;i<columns;i++){
						resultRow[i] = rs.getString(i+1);
					}
					resultListAll.add(resultRow);
				}while(rs.next());
			}
		}
		}
		catch(SQLException e){}
		finally{
			if(con != null){
				try{
					con.close();
				}
				catch(SQLException e){}
			}
			return resultListAll;
		}
		}
}
 
