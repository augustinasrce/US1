package lt.swedbank.contactForm.beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SqlConnection {
    private String url = "jdbc:mysql://127.7.138.2:3306/";
    private String dbName = "FormContactUs";
    private String driver = "com.mysql.jdbc.Driver";
    private String userName = "Program123";
    private String password = "program123";

    private Connection conn;
    private Statement st;

    public boolean connect() {
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            st = conn.createStatement();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectContactUsBigTable(String query) {
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        if (query.equals(""))
            query = "SELECT * FROM ContactUs";

        try {
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("contactus_id");
                String subject = res.getString("subject");
                String message = res.getString("message");
                String contact_by = res.getString("contact_by");
                String client_name = res.getString("client_name");
                String client_surname = res.getString("client_surname");
                String client_phone_number = res.getString("client_phone_number");
                String client_email = res.getString("client_email");
                line = String.valueOf(id) + ";" + subject + ";" + message + ";" +
                        contact_by + ";" + client_name + ";" + client_surname + ";" + client_phone_number + ";" + client_email;
                result.add(line);
            }
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void insertContactUsbigTable(String subject, String message,
                                        String contact_by, String client_name,
                                        String client_surname, String client_phone_number, String client_email) {
        String query = String.format("insert into ContactUs(subject, message, contact_by, client_name, client_surname," +
                        "client_phone_number, client_email)" +
                        "values(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");\n",
                subject, message, contact_by, client_name, client_surname, client_phone_number, client_email);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully inserted value");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> selectRegistrationBigTable(String query) {
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        if (query.equals(""))
            query = "SELECT * FROM Registrations";

        try {
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                int id = res.getInt("registrations_id");
                String subject = res.getString("subject");
                String message = res.getString("comments");
                String date = res.getString("date");
                String bank_branch = res.getString("bank_branch");
                String client_name = res.getString("client_name");
                String client_surname = res.getString("client_surname");
                String client_phone_number = res.getString("client_phone_number");
                String client_email = res.getString("client_email");
                line = String.valueOf(id) + ";" + subject + ";" + message + ";" +
                        date + ";" + bank_branch + ";" + client_name + ";" + client_surname + ";" + client_phone_number + ";" + client_email;
                result.add(line);
            }
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void insertRegistrationBigTable(String name, String surname, String phoneNr, String email, String bankDivision, String date, String topic, String others) {
        String query = String.format(
                "insert into Registrations(client_name, client_surname, client_phone_number, client_email, bank_branch, date, subject, comments)" +
                        "values(\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\");\n",
                name, surname, phoneNr, email, bankDivision, date, topic, others);
            try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully inserted value");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<String> specialSelect(String query, String columnName) {
        ArrayList<String> result = new ArrayList<String>();
        String line = "";

        // default query
        if (query.equals("")) {
            query = "select max(client_id) from Client;";
            columnName = "max(client_id)";
        }

        //default: all columns
        int columnid = 0;
        if(columnName.equals("") && !query.equals(""))
        {
            columnid++;
        }

        try {
            ResultSet res = st.executeQuery(query);
            while (res.next()) {
                if(!columnName.equals(""))
                {
                    line = res.getString(columnName)+";";
                }
                else
                {
                    columnid++;
                    line += res.getString(columnid)+";";
                }
                result.add(line);
            }
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }

        return result;
    }

    public void delete(String tableName, int id) {
        String query = String.format("delete from %s where %s_id = %d;", tableName, tableName.toLowerCase(), id);
        try {
            int value = st.executeUpdate(query);
            if (value == 1)
                System.out.println("Successfully deleted value");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


