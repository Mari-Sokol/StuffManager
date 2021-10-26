package gui;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class EmployeeAdd extends Container {
    private JPanel emploeeAddPanel;
    private JTextField nametextField;
    private JTextField departmentTextField;
    private JTextField agetextField;
    private JTextField phonetextField;
    private JComboBox PositionComboBox;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JButton addButton;
    private JLabel depLabel;
    private JLabel ageLabel;
    private JLabel phoneLabel;
    private JLabel positionlabel;
    private JLabel genderLabel;
    private ButtonGroup genderGroup;

    public EmployeeAdd() {
        $$$setupUI$$$();
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean validInput = true;
                String errMessage = "Incorrect values in input fields: \n";

                String nameText = nametextField.getText();
                if (nameText.isEmpty()) {...}

                String depText = departmentTextField.getText();
                if (depText.isEmpty()) {...}

                int age = 0;
                try {...} catch (NumberFormatException ne) {...}

                String phone = phonetextField.getText();
                if (phone.isEmpty()) {...}

                String position = (String) positionComboBox.getSelectedItem();

                String gender = genderGroup.getSelection().getActionCommand();
                // errMessage = errMessage + "Gender" + gender;
                if (!validInput) {...}

                Employee employee = new Employee(nameText, depText, age, phone, position, gender);
                Controller.addEmplyee(employee);
                JOptionPane.showMessageDialog(new JFrame(), employee.toString(), "Input Information OK",
                        JOptionPane.INFORMATION_MESSAGE);


            }
        });
    }

    JPanel getEmploeeAddPanel() {

        return emploeeAddPanel;
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        emploeeAddPanel = new JPanel();
        emploeeAddPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(10, 2, new Insets(0, 0, 0, 0), -1, -1));
        final JLabel label1 = new JLabel();
        label1.setText("Name:");
        emploeeAddPanel.add(label1, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        nametextField = new JTextField();
        emploeeAddPanel.add(nametextField, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        depLabel = new JLabel();
        depLabel.setText("Department:");
        emploeeAddPanel.add(depLabel, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        departmentTextField = new JTextField();
        emploeeAddPanel.add(departmentTextField, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        ageLabel = new JLabel();
        ageLabel.setText("Age:");
        emploeeAddPanel.add(ageLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        agetextField = new JTextField();
        emploeeAddPanel.add(agetextField, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        phoneLabel = new JLabel();
        phoneLabel.setText("Phone:");
        emploeeAddPanel.add(phoneLabel, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        emploeeAddPanel.add(phonetextField, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        positionlabel = new JLabel();
        positionlabel.setText("Position:");
        emploeeAddPanel.add(positionlabel, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        genderLabel = new JLabel();
        genderLabel.setText("Gender:");
        emploeeAddPanel.add(genderLabel, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        femaleRadioButton = new JRadioButton();
        femaleRadioButton.setSelected(false);
        femaleRadioButton.setText("Female");
        emploeeAddPanel.add(femaleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        otherRadioButton = new JRadioButton();
        otherRadioButton.setText("Other");
        emploeeAddPanel.add(otherRadioButton, new com.intellij.uiDesigner.core.GridConstraints(7, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        addButton = new JButton();
        addButton.setText("Add");
        emploeeAddPanel.add(addButton, new com.intellij.uiDesigner.core.GridConstraints(9, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        emploeeAddPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        PositionComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("");
        defaultComboBoxModel1.addElement("Trainee");
        defaultComboBoxModel1.addElement("Junior");
        defaultComboBoxModel1.addElement("Middle");
        defaultComboBoxModel1.addElement("Senior");
        defaultComboBoxModel1.addElement("Lead");
        defaultComboBoxModel1.addElement("Head");
        defaultComboBoxModel1.addElement("PM");
        PositionComboBox.setModel(defaultComboBoxModel1);
        emploeeAddPanel.add(PositionComboBox, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        maleRadioButton = new JRadioButton();
        maleRadioButton.setSelected(true);
        maleRadioButton.setText("Male");
        emploeeAddPanel.add(maleRadioButton, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadioButton);
        buttonGroup.add(femaleRadioButton);
        buttonGroup.add(otherRadioButton);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return emploeeAddPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(0);
        nf.setMaximumFractionDigits(10);

        agetextField = new JFormattedTextField(nf);

        MaskFormatter phoneMask = null;
        try {
            phoneMask = new MaskFormatter("+7 (###) ###-####");
            phoneMask.setPlaceholderCharacter('_');
        } catch (ParseExeption e) {
            e.printStackTrace();
        }
        phonetextField = new JFormattedTextField(phoneMask);
    }
}
