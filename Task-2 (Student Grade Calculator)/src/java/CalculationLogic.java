package src.java;

import java.text.DecimalFormat;
import java.util.List;

import javax.swing.JOptionPane;

public class CalculationLogic {
    public static void calculate(){
        if(calculateTotal() == Integer.MIN_VALUE || calculateTotal() == 0) return;
        else JOptionPane.showMessageDialog(Frame.getFrame(), "Total: " + calculateTotal() + " / " + Frame.getFrame().getTableRowCount()*100 + "\nPercentage: " + calculateTotalPercentage() + "\nGrade: " + calculateGrade(calculateTotalPercentage()), "Result", JOptionPane.INFORMATION_MESSAGE);
    }
    private static float calculateTotal(){
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

    private static float calculateTotalPercentage(){
        DecimalFormat format = new DecimalFormat("#.##");
        return Float.parseFloat(format.format((float)calculateTotal()/(float)Frame.getFrame().getTableRowCount()));
    }

    private static String calculateGrade(float percentage){
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
