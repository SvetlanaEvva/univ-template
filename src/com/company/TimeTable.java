package com.company;

import javax.swing.*;
import java.util.List;

public class TimeTable extends JFrame{
    private JPanel root;
    private JComboBox<Group> comboBox1;
    private JLabel groupLabel1;

    public TimeTable(List<Group> groupList) {
        setContentPane(root);
        for (Group group : groupList) {
            comboBox1.addItem(group);
        }
        comboBox1.addItemListener(e -> groupLabel1.setText(
            ((Group)comboBox1.getSelectedItem()).getId()
        ));
        setVisible(true);
        pack();
    }
}
