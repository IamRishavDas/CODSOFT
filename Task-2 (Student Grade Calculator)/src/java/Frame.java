package src.java;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Frame extends JFrame {

	private JTable 			  table;
	private DefaultTableModel model;
	private JButton 		  addButton;
	private JButton 		  submitButton;
	private JButton 		  clearButton;
	private JScrollPane 	  scrollPane;
	private JPanel 			  buttonPanel;

	private Frame() {
		super("Student Grade Calculator");

		String[] columns = { "Subject Name", "Marks", "Percentage(%)" };
		model = new DefaultTableModel(columns, 0);
		table = new JTable(model);
		table.setRowHeight(25);
		table.setFont(new Font("Arial", Font.PLAIN, 18));
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
		

		scrollPane = new JScrollPane(table);

		addButton = new JButton("Add Row");
		submitButton = new JButton("Calculate");
		clearButton = new JButton("Clear Rows");

		addButton.addActionListener(e -> addRow());
		clearButton.addActionListener(e -> clearRows());
		submitButton.addActionListener(e -> CalculationLogic.calculate());

		buttonPanel = new JPanel();
		buttonPanel.add(addButton);
		buttonPanel.add(submitButton);
		buttonPanel.add(clearButton);

		add(scrollPane, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public int getTableRowCount(){
		return model.getRowCount();
	}

	public int getTableColumnCount(){
		return model.getColumnCount();
	}

	public List<Object> getColumnData(int colIndex){
		List<Object> colData = new ArrayList<>();
		int rows = model.getRowCount();
		for(int i=0; i<rows; i++){
			Object value = model.getValueAt(i, colIndex);
			colData.add(value);
		}
		return colData;
	}

	public void setCellData(String newValue, int row, int col){
		if(this.getTableRowCount() >= row || this.getTableColumnCount() >= col) return;
		table.setValueAt(newValue, row, col);
		table.updateUI();
		this.repaint();
	}

	private void addRow() {
		model.addRow(new Object[] { "", "", "" });
	}

	private void clearRows() {
		int rowCount = model.getRowCount();
		for (int i = rowCount - 1; i >= 0; i--) {
			model.removeRow(i);
		}
	}

	private static Frame frame = new Frame();
	public static Frame getFrame(){
		return frame;
	}
}
