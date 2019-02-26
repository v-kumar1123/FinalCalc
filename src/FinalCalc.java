import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FinalCalc extends JFrame {
    ArrayList<JTextField> terms;
    JLabel totalWeightLabel=new JLabel("Total Term Weight: ");
    JTextField totalWeight=new JTextField();
    JLabel finalWeightLabel=new JLabel("Final Weight: ");
    JTextField finalWeight=new JTextField();
    JLabel gradeWantedLabel=new JLabel("Final Weight: ");
    JTextField gradeWanted=new JTextField();
    JTextField term1=new JTextField();
    JLabel term1Label=new JLabel("Term 1");
    JTextField term2=new JTextField();
    JLabel term2Label=new JLabel("Term 2");
    JTextField term3=new JTextField();
    JLabel term3Label=new JLabel("Term 3");
    JTextField term4=new JTextField();
    JLabel term4Label=new JLabel("Term 4");
    JTextField term5=new JTextField();
    JLabel term5Label=new JLabel("Term 5");
    Integer[] termNos={1,2,3,4,5};
    JComboBox termList;

    public FinalCalc() {
        super("K0904676");
        termList=new JComboBox(termNos);
        termList.setSelectedIndex(0);
        terms=new ArrayList<JTextField>(Arrays.asList(term1,term2,term3,term4,term5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLayout(null);


    }
}
