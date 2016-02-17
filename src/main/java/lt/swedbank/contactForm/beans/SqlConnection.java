package lt.swedbank.contactForm.beans;

/**
 * Created by BN on 2/17/2016.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by BN on 2/16/2016.
 */
public class SqlConnection {

    // parameters for php m adin in server
    /*private String url = "jdbc:mysql://contactform-swedbank.rhcloud.com:3306/";
    private String dbName = "swedContactUs";
    private String userName = "Program";
    private String password = "program123";
    /**/

    //parameters for localhost / my pc
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbName = "mydb";
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "root";
    private String password = "matematikas";
    /**/
    // connection and statement;
    private Connection conn;
    private Statement st;

    public boolean connect()
    {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName/**/,userName,password);
            st = conn.createStatement();

            //Read more: http://mrbool.com/how-to-connect-with-mysql-database-using-java/25440#ixzz40FfeIIAe

            return true;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void closeConnection()
    {
        try{
            conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectClient(String query){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
            query = "SELECT * FROM client";

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("client_id");
                String name = res.getString("name");
                String surname = res.getString("surname");
                String phone = res.getString("phone_number");
                String email = res.getString("email");
                line = String.valueOf(id) + " | " + name + " | " + surname + " | " +
                        phone + " | " + email;
                result.add(line);
//                System.out.println(id + "\t" + name + "\t" + surname + "\t" + phone+ "\t" + email);
            }
        }
        catch(Exception e)
        {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void insertClient(int id, String name, String surname, String phone, String email){
        String query = String.format("INSERT into client(client_id, name, surname, phone_number, email) VALUES(%d,\"%s\", \"%s\" ,\"%s\" ,\"%s\")", id, name, surname, phone, email);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully inserted value");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectContactUs(String query){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
            query = "SELECT * FROM Contactus";

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("contactUs_id");
                String contactBy = res.getString("contact_by");
                String message = res.getString("message");
                String client_id = res.getString("Client_client_id");
                line = String.valueOf(id) + " | " + contactBy + " | " + message + " | " +
                        client_id;
                result.add(line);
//                System.out.println(id + "\t" + name + "\t" + surname + "\t" + phone+ "\t" + email);
            }
        }
        catch(Exception e)
        {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void insertIContactUs(int id, String contactBy, String message, int clientId){
        String query = String.format("INSERT into ContactUs(contactUs_id, contact_by, message, Client_client_id) VALUES(%d,\"%s\", \"%s\" ,\"%d\")", id, contactBy, message, clientId);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully inserted value");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectRegistations(String query){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
            query = "SELECT * FROM Registrations";

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("registration_id");
                String date = res.getString("date");
                String subject = res.getString("subject");
                String comments = res.getString("comments");
                String client_id = res.getString("Client_client_id");
                String branch_id = res.getString("Branch_branch_id");
                line = String.valueOf(id) + " | " + date + " | " + subject + " | " +
                        comments + " | " + client_id + " | " + branch_id;
                result.add(line);
//                System.out.println(id + "\t" + name + "\t" + surname + "\t" + phone+ "\t" + email);
            }
        }
        catch(Exception e)
        {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void insertRegistraions(int id, String date, String subject, String comments, int clientId, int branchId){
        String query = String.format("insert into registrations(registration_id, date, subject, comments, Client_client_id, Branch_branch_id)" +
                "values(%d, \"%s\", \"%s\", \"%s\", %d, %d);", id, date, subject, comments, clientId, branchId);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully inserted value");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectBranch(String query){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
            query = "SELECT * FROM Branch";

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("branch_id");
                String contactBy = res.getString("adress");
                String message = res.getString("workHours");
                String client_id = res.getString("workHoursInWeekends");
                line = String.valueOf(id) + " | " + contactBy + " | " + message + " | " +
                        client_id;
                result.add(line);
//                System.out.println(id + "\t" + name + "\t" + surname + "\t" + phone+ "\t" + email);
            }
        }
        catch(Exception e)
        {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void insertBranch(int id, String adress, String workHours, String workHoursInWeekends){
        String query = String.format("insert into branch(branch_id, adress, workHours, workHoursInWeekends)" +
                "values(%d, \"%s\", \"%s\", \"%s\");\n", id, adress, workHours, workHoursInWeekends);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully inserted value");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> specialSelect(String query, String columnName){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
        {
            query = "select max(client_id) from Client;";
            columnName = "max(client_id)";
        }

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                line = res.getString(columnName);
                result.add(line);
            }
        }
        catch(Exception e)
        {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void delete(String tableName, int id){
        String query = String.format("delete from %s where %s_id = %d;", tableName, tableName.toLowerCase(), id);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully deleted value");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

