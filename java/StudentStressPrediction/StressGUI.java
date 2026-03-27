import javax.swing.*;
import java.awt.event.*;

public class StressGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Stress Predictor");

        JLabel l1 = new JLabel("Study Hours:");
        l1.setBounds(50,50,120,30);

        JTextField t1 = new JTextField();
        t1.setBounds(180,50,120,30);

        JLabel l2 = new JLabel("Sleep Hours:");
        l2.setBounds(50,100,120,30);

        JTextField t2 = new JTextField();
        t2.setBounds(180,100,120,30);

        JLabel l3 = new JLabel("Exam Pressure (1-10):");
        l3.setBounds(50,150,150,30);

        JTextField t3 = new JTextField();
        t3.setBounds(200,150,120,30);

        JButton btn = new JButton("Predict Stress");
        btn.setBounds(120,220,150,40);

        JLabel result = new JLabel("");
        result.setBounds(120,280,200,30);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int study = Integer.parseInt(t1.getText());
                int sleep = Integer.parseInt(t2.getText());
                int pressure = Integer.parseInt(t3.getText());

                Student s = new Student(study, sleep, pressure);
                StressModel model = new StressModel();

                String res = model.predictStress(s);

                result.setText("Stress Level: " + res);
            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(btn);
        frame.add(result);

        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}