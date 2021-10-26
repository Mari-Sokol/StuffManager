package Controller;

import model.Database;

import  java.sql.SQLException;
import  java.util.List;

public class Controller {

    Database db = new Database();
    public  Controller() {
        try {
            db.connect();
            db.getFromDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  void addEmplyee(Employee employee) {
        db.addEmployeeDatabase(employee);
    }
    public List<Employee> getEmployes(){return db.getEmployees();
    }
}
