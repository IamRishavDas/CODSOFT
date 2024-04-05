package src.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CalculationLogic {
    public static void calculate(){
        if(calculateTotal() == Integer.MIN_VALUE || calculateTotal() == 0) return;
        else JOptionPane.showMessageDialog(Frame.getFrame(), "Total: " + calculateTotal() + "\nPercentage: " + calculateTotalPercentage() + "\nGrade: " + calculateGrade(calculateTotalPercentage()), "Result", JOptionPane.INFORMATION_MESSAGE);
    }
    public static float calculateTotal(){
        float sum = 0;
        List<Object> values = Frame.getFrame().getColumnData(1);
        try {
            for(Object obj: values){
                float integerValue = Float.parseFloat(String.valueOf(obj));
                if(integerValue > 100 || integerValue < 0){                    
                    JOptionPane.showMessageDialog(Frame.getFrame(), "invalid marks: " + integerValue, "Invalid Marks Error", JOptionPane.ERROR_MESSAGE);
                    return Integer.MIN_VALUE;
                }
                sum += integerValue;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(Frame.getFrame(), "Only the numbers allowed, check the marks column carefully!!", "Invalid Marks Entry", JOptionPane.ERROR_MESSAGE);
            return Integer.MIN_VALUE;
        }
        return Float.parseFloat(new DecimalFormat("#.##").format(sum));
    }

    public static float calculateTotalPercentage(){
        DecimalFormat format = new DecimalFormat("#.##");
        return Float.parseFloat(format.format((float)calculateTotal()/(float)Frame.getFrame().getTableRowCount()));
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

    public static String calculateGrade(float percentage){
        if     (percentage >= 90f && percentage <= 100f)    return "A+";
        else if(percentage >= 80f && percentage < 90f)      return "A";
        else if(percentage >= 70f && percentage < 80f)      return "B+";
        else if(percentage >= 60f && percentage < 70f)      return "B";
        else if(percentage >= 50f && percentage < 60f)      return "C";
        else if(percentage >= 40f && percentage < 50f)      return "D";
        else if(percentage >= 30f && percentage < 40f)      return "E";
        else                                                return "F";
    }
}
