package com.company;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GroupSelectionForm extends JFrame{
    private JPanel root;
    private JComboBox<Group> comboBox1;
    private JLabel groupLabel1;

    public GroupSelectionForm(List<Group> groupList, List<Lesson> timetableList) {
        setContentPane(root);
        for (Group group : groupList) {
            comboBox1.addItem(group);
        }
        comboBox1.addItemListener(e -> {
            groupLabel1.setText(((Group) comboBox1.getSelectedItem()).getId());
            timetableList.stream()
                    .filter(new Predicate<Lesson>() {
                        @Override
                        public boolean test(Lesson lesson) {
                            return lesson.dayDate.equals("10.01.2022");
                        }
                    })
                    .filter(new Predicate<Lesson>() {
                        @Override
                        public boolean test(Lesson lesson) {
                            return lesson.groupID.equals("0x" + ((Group) comboBox1.getSelectedItem()).getId());
                        }
                    })
                    .forEach(new Consumer<Lesson>() {
                        @Override
                        public void accept(Lesson lesson) {
                            System.out.println(lesson.getDiscipline()); //TODO: Добавить list в форму, вывести туда строки
                        }
                    });
        });
        setVisible(true);
        pack();
    }
}
