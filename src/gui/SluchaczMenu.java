/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.plaf.metal.MetalBorders;


public class SluchaczMenu extends JPanel {
 JLabel label1 = new JLabel("imie: ");
    public SluchaczMenu() {
        Dimension size = getPreferredSize();
        size.width = 380;
        size.height = 300;
        setPreferredSize(size);
        Pasek paseek = new Pasek();
        setBorder(BorderFactory.createTitledBorder("dane"));

        JLabel label = new JLabel();
       
        JLabel label2 = new JLabel("Nazwisko: ");
        JLabel label3 = new JLabel("Marka: ");
        JLabel label4 = new JLabel("Tapicerka");
        JButton button5 = new JButton("czyść");
      
        JTextField field1 = new JTextField(10);
        JTextField field2 = new JTextField(10);

        String[] sList = new String[]{"Volvo", "BMW"};
        JComboBox<String> seasons = new JComboBox<>(sList);
  
        
        ButtonGroup tapicerka = new ButtonGroup();
        JRadioButton[] material = new JRadioButton[2];
        material[0] = new JRadioButton("skorzana");
        material[1] = new JRadioButton("materialowa");
        tapicerka.add((AbstractButton) material[0]);
        tapicerka.add((AbstractButton) material[1]);
        Box b1 = Box.createVerticalBox();

        b1.add(material[0]);
        b1.add(material[1]);
        ActionListener slActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AbstractButton aButton = (AbstractButton) e.getSource();
                label.setText(aButton.getText());
            }
        };
        material[0].addActionListener(slActionListener);
        material[1].addActionListener(slActionListener);
        
        JCheckBox jCheckBox1 = new JCheckBox("ABS");
          JCheckBox jCheckBox2 = new JCheckBox("Klima");
button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               field1.setText(null);
               field2.setText(null);
               jCheckBox1.setSelected(false);
               jCheckBox2.setSelected(false);
               b1.
               
            }
        });

        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        

        gc.anchor = GridBagConstraints.LINE_END;
        gc.weightx = 1.5;
        gc.weighty = 1.5;
//LABEL1
        gc.gridx = 0;
        gc.gridy = 0;

        add(label1, gc);
//LABEL2

        gc.gridx = 0;
        gc.gridy = 1;

        add(label2, gc);
        //LABEL3       
        
        gc.gridx = 0;
        gc.gridy = 2;

        add(label3, gc);

        //LABEL4      
        gc.gridx = 0;
        gc.gridy = 3;

        add(label4, gc);
        //checkBox1
       gc.anchor = GridBagConstraints.FIRST_LINE_START;
         gc.gridx = 0;
        gc.gridy = 4;

        add(jCheckBox1, gc);
       
        //checkBox2
        gc.weighty=0.1;
//        gc.anchor = GridBagConstraints.FIRST_LINE_START;
         gc.gridx = 1;
        gc.gridy = 4;

        add(jCheckBox2, gc);
//FIELD1
        gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 0;
        add(field1, gc);
//FIELD2
gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 1;
        add(field2, gc);
//FIELD3
gc.anchor = GridBagConstraints.LINE_START;
        gc.gridx = 1;
        gc.gridy = 2;
        add(seasons, gc);
 
        //FIELD4
        
        
        
        gc.gridx = 1;
        gc.gridy = 3;
        add(b1, gc);
//button eta clear
        gc.weighty=10;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.gridx =0;
        gc.gridy = 6;
        add(button5,gc);
        
        
        

    }
    
}
