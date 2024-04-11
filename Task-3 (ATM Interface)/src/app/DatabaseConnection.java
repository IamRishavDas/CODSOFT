package app;

import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    private static String url = "jdbc:mysql://localhost:3306/atm";
    private static String user = "root";
    private static String password = ""; // have to enter the actual connecton password for the specified user

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    private static void establishConnection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            ATM_Interface.getAtm_Interface().setMessageText("CONNECTION FAILED: " + e.getMessage());
        }
    }

    public static int getCardPinIfExists(String query) {
        establishConnection();
        int cardPin = Integer.MIN_VALUE;
        try {

            resultSet = statement.executeQuery(query);

            if (resultSet.next())
                cardPin = resultSet.getInt(1);

            statement.close();
            connection.close();

        } catch (SQLException e) {
            ATM_Interface.getAtm_Interface().setMessageText("CONNECTION EXCEPTION: " + e.getMessage());
        }
        return cardPin;
    }

    public static String getAccountHolderNameIfExists(String query) {
        establishConnection();
        String accountHolderName = "";
        try {
            resultSet = statement.executeQuery(query);

            if (resultSet.next())
                accountHolderName = resultSet.getString(1);

            statement.close();
            connection.close();
        } catch (SQLException e) {
            ATM_Interface.getAtm_Interface().setMessageText("CONNECTION EXCEPTION: " + e.getMessage());
        }
        return accountHolderName;
    }

    public static int getAccountBalance(String query) {
        establishConnection();
        int balance = Integer.MIN_VALUE;
        try {
            resultSet = statement.executeQuery(query);

            if (resultSet.next())
                balance = resultSet.getInt(1);

            statement.close();
            connection.close();
        } catch (SQLException e) {
            ATM_Interface.getAtm_Interface().setMessageText("CONNECTION EXCEPTION: " + e.getMessage());
        }
        return balance;
    }

    public static void deposit(int cardNo, int amount) {
        String query = "update atm.account_info set account_balance = account_balance + " + amount + " where card_no = " + cardNo;
        establishConnection();
        try {
            statement.executeUpdate(query);

            statement.close();
            connection.close();
        } catch (SQLException e) {
            ATM_Interface.getAtm_Interface().setMessageText("CONNECTION EXCEPTION: " + e.getMessage());
        }
    }

    public static void withdraw(int cardNo, int amount){
        String query = "update atm.account_info set account_balance = account_balance - " + amount + " where card_no = " + cardNo;
        String queryForSufficientBalance = "select account_balance from atm.account_info where card_no = " + cardNo;
        try {
            if(DatabaseConnection.getAccountBalance(queryForSufficientBalance) >= amount){
                establishConnection();
                statement.executeUpdate(query);
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.ERROR_MESSAGE);
            }

            statement.close();
            connection.close();
        } catch (SQLException e) {
            ATM_Interface.getAtm_Interface().setMessageText("CONNECTION EXCEPTION: " + e.getMessage());
        }
    }
}
