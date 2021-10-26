import gui.EmployeeAdd;

import javax.swing.*;

public class App {
    public static void main(String[] args){
        EmployeeAdd emploeeAdd = new EmployeeAdd();
        JFrame frame = new JFrame( "EmploeeFormTest");
        frame.setContentPane(emploeeAdd.getEmploeeAddPanel());
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.pack();
        frame.setVisible(true);
    }
}
