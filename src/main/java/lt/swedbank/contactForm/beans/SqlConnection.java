
package lt.swedbank.contactForm.beans;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlConnection {

    // parameters for php m adin in server
    private String url = "jdbc:mysql://contactform-swedbank.rhcloud.com:3306/";
    private String dbName = "FormContactUs";
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "Program123";
    private String password = "program123";


    //parameters for localhost / my pc
//    private String url = "jdbc:mysql://localhost:3306/";
//    private String dbName = "mydb";
//    private String driver = "com.mysql.jdbc.Driver";
//    private String userName = "root";
//    private String password = "matematikas";

    // connection and statement;
    private Connection conn;
    private Statement st;

    public boolean connect()
    {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
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
                line = String.valueOf(id) + ";" + name + ";" + surname + ";" +
                        phone + ";" + email;
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
        String query = String.format("INSERT into Client(client_id, name, surname, phone_number, email) VALUES(%d, \"%s\", \"%s\" ,\"%s\" ,\"%s\")", id, name, surname, phone, email);
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
                String subject = res.getString("subject");
                line = String.valueOf(id) + ";" + contactBy + ";" + message + ";" +
                        client_id + ";" +  subject;
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

    public void insertIContactUs(int id, String contactBy, String message, int clientId, String subject){
        String query = String.format("INSERT into ContactUs(contactUs_id, contact_by, message, Client_client_id, subject) VALUES(%d, \"%s\", \"%s\" ,\"%d\", \"%s\")", id, contactBy, message, clientId, subject);
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
                line = String.valueOf(id) + ";" + date + ";" + subject + ";" +
                        comments + ";" + client_id + ";" + branch_id;
                result.add(line);
//                System.out.println(id + "\t" + name + "\t" + surname + "\t" + phone+ "\t" + email);
            }
        }
        catch(Exception e)
        {
            result.add(e.toString());
            System.out.printf(e.getMessage());
            return result;
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
                line = String.valueOf(id) + ";" + contactBy + ";" + message + ";" +
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

    public ArrayList<String> selectContactUsBigTable(String query){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
            query = "SELECT * FROM ContactUs";

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("contactUs_id");
                String subject = res.getString("subject");
                String message = res.getString("message");
                String contact_by = res.getString("contact_by");
                String client_name = res.getString("client_name");
                String client_surname = res.getString("client_surname");
                String client_phone_number = res.getString("client_phone_number");
                String client_email = res.getString("client_email");
                line = String.valueOf(id) + ";" + subject + ";" + message + ";" +
                        contact_by+ ";" + client_name+ ";" + client_surname+ ";" + client_phone_number + ";" + client_email;
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

    public void insertContactUsbigTable(String subject, String message,
                                        String contact_by, String client_name,
                                        String client_surname, String client_phone_number, String client_email){
        String query = String.format("insert into ContactUs(subject, message, contact_by, client_name, client_surname," +
                "client_phone_number, client_email)" +
                "values(%s, \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");\n", subject, message, contact_by, client_name, client_surname, client_phone_number, client_email );
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

    public ArrayList<String> selectRegistrationBigTable(String query){
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if(query.equals(""))
            query = "SELECT * FROM Registrations";

        try{
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("registration_id");
                String subject = res.getString("subject");
                String message = res.getString("comments");
                String date = res.getString("date");
                String bank_branch = res.getString("bank_branch");
                String client_name = res.getString("client_name");
                String client_surname = res.getString("client_surname");
                String client_phone_number = res.getString("client_phone_number");
                String client_email = res.getString("client_email");
                line = String.valueOf(id) + ";" + subject + ";" + message + ";" +
                        date+ ";" + bank_branch+ ";" + client_name+ ";" + client_surname+ ";" + client_phone_number + ";" + client_email;
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

    public void insertRegistrationBigTable(String subject, String message,
                                        String date, String bank_branch, String client_name,
                                        String client_surname, String client_phone_number, String client_email){
        String query = String.format("insert into ContactUs(subject, message, date, bank_branch, client_name, client_surname," +
                "client_phone_number, client_email)" +
                "values(%s, \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");\n", subject, message, date, bank_branch, client_name, client_surname, client_phone_number, client_email );
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


