import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class grade extends Frame implements ActionListener
{
	Button grade,exit;
	TextField tf1, tf2,tf3,tf4,tf5,textg,ave,tm;
public grade()
{
Label l=new Label("Enter marks out of 100");
l.setBounds(50,50,200,30);
Label l1=new Label("Enter marks of Science 1");
l1.setBounds(50,50,200,30);
Label l2=new Label("Enter marks of Algebra");
l2.setBounds(50,50,200,30);
Label l3=new Label("Enter marks of Geometry");
l3.setBounds(50,50,200,30);
Label l4=new Label("Enter marks of History");
l4.setBounds(50,50,200,30);
Label l5=new Label("Enter marks of Science 2");
l5.setBounds(50,50,200,30);
Label l6=new Label("Total marks");
l6.setBounds(50,50,200,30);
Label l7=new Label("Average percentage");
l7.setBounds(50,50,200,30);
Label l8=new Label("Your grade: ");
l8.setBounds(50,50,200,30);
tf1=new TextField(10);
tf2=new TextField(10);
tf3=new TextField(10);
tf4=new TextField(10);
tf5=new TextField(10);
textg=new TextField(10);
ave=new TextField(10);
tm=new TextField(10);

grade=new Button("grade");
exit=new Button("exit");

grade.addActionListener(this);
exit.addActionListener(this);
add(l);
add(l1);
add(tf1);
add(l2);
add(tf2);
add(l3);
add(tf3);
add(l4);
add(tf4);
add(l5);
add(tf5);
add(l6);
add(tm);
add(l7);
add(ave);
add(l8);
add(textg);
add(grade);
add(exit);

setSize(400,450);
setLayout(new FlowLayout(FlowLayout.CENTER));
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
Double s1=Double.parseDouble(tf1.getText());
Double s2=Double.parseDouble(tf2.getText());
Double s3=Double.parseDouble(tf3.getText());
Double s4=Double.parseDouble(tf4.getText());
Double s5=Double.parseDouble(tf5.getText());
Double total=s1+s2+s3+s4+s5;
double avg=total/5;
String loc="";
String lac="";
Button btn=(Button)e.getSource();
if(btn==grade)
{
    loc=total+"/500";
    tm.setText(loc);
    lac=avg+"%";
    ave.setText(lac);

    if(avg>90)
        {
            textg.setText("A");
        }
    else if(avg>=80 && avg<90)
        {
             textg.setText("B");
        }
    else if(avg>=70 && avg<80)
        {
              textg.setText("C");
        }
            
     else if(avg>=50 && avg<70)
        {
             textg.setText("D");
        } 
            
     else if(avg>=35 && avg<50)
        {
            textg.setText("E");
        } 
    else{
             textg.setText("Fail");
        }
}
}

public static void main(String args[])
{
new grade();
}
}

