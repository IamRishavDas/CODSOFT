package src.java;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CalculationLogic {
    public static void calculate(){
        if(calculateTotal() == Integer.MIN_VALUE || calculatePercentage() == null) return;
        setPercentage(calculatePercentage(), 2);
        JOptionPane.showMessageDialog(Frame.getFrame(), "The Sum is: " + calculateTotal());
    }
    public static int calculateTotal(){
        int sum = 0;
        List<Object> values = Frame.getFrame().getColumnData(1);
        try {
            for(Object obj: values){
                int integerValue = Integer.parseInt(String.valueOf(obj));
                if(integerValue > 100 || integerValue < 0){                    
                    JOptionPane.showMessageDialog(Frame.getFrame(), "invalid marks: " + integerValue, "Invalid Marks Error", JOptionPane.ERROR_MESSAGE);
                    return Integer.MIN_VALUE;
                }
                sum += integerValue;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Frame.getFrame(), "Only the numbers allowed check the marks column carefully!!", "Invalid Marks Entry", JOptionPane.ERROR_MESSAGE);
            return Integer.MIN_VALUE;
        }
        return sum;
    }
    public static List<String> calculatePercentage(){
        List<String> percentages = new ArrayList<>();
        List<Object> values     = Frame.getFrame().getColumnData(1);
        for(Object obj: values){
            int integerValue = Integer.parseInt(String.valueOf(obj));
                if(integerValue > 100 || integerValue < 0){                    
                    return null;
                }
                percentages.add(integerValue + "%");
        }
        return percentages;
    }
    public static void setPercentage(List<String> percentages, int col){
        for(int i=0; i<percentages.size(); i++){
            Frame.getFrame().setCellData(percentages.get(i), i, col);
        }
    }
}
