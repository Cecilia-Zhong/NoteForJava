/* March 1st Tuesday 

String name = (String) newStack;  // cast the name into string 
int number = (Integer) number.pop(); 
problem with cast: 2 --> 
ArrayList: API --> growable array 
can store any type of object 
no error message for different type in array 
ArrayList<Integer> = list of integrs --> 
ArrayList<Employee> = list of employees 
generic arraylist: connot contain other types 
char firstChar() = strList.get(0).charAt(0); // first char, no cast 
emPlist.get(0);  get 0 element 

interface ???????
implement ???????

//e.g. 
public interfaceComparable<T> {

}

import java.util.Array;
uf(ccompare(arr[0],arr[1]) > 0 // or >= 1, which means the left side is larger than the right 


March2: 
Topic 9 Swing 
- GUIs graphical User inteface
Outline 
1. basic , 
2. layout --> button 
3. components & actions 
4. graphics
5. mouse events& timers permits 

GUI 
- easy to figure out
- easy to make I/O
- prettier 
- 
line by line 
- force sequence ?
- lightweight
- easy to program often 
- easy to debug 
- better for visually 

March 4th 
- AWT abstract window toolkit -- textbox, button
- Swing: jbutton swings replacement -- from AWT; java API 
- need package below 

 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*; // doesn't matter about the order 
 
 // only use the standard packeage, which is java or javax 
 
 basic frame class:  JFrame 
 - main window for the program 
 - border, menu bar,title bar
 - right top:  minimiza, close, maximize, inner are for content 
 

public class BabySwing extends JFrame{
	public babySwing(){
		setDize(400,300);
		setTitle("my swing program");

		JButton helloUButton = new JButton("Hello"); // if only one, just at the entral as the whole button in the window
		Font bigFont = new Font("SanSerif", Font.PLAIN, 40);// set the font, font and point(size)
		helloButton.setFont(bigFont); 
		helloButton.setBackgound(Color RED);
		helloButton.setForegrounf(Color YELLOW);
		add.helloUButton(true); // add the butto into the window 
		setVisible(True);
	}
}

public class BabySwing{
	public static void main(String arg[]){
		JFrame myFrame = new JFrame();
		
		myFrame.setSize(400,300);
		myFrame.setTitle("my swing program");
		myFrame.setVisible(True);
	}
}
// two of them above are the same 

fonts 
- name ( "Serif", "Sanserif", "Monospaced") // monospace: like printing font; 
- type (content: PLAIN, ITALIC, BOLD)
- size (in points, like 8, 10, 12) 

 Color
- (red,bluc,black, etc. ) 
- setBackgount(Color c); setForegount(Color c)
- label and panal don'y have own backgrounf color 

IoptionPane(1)
- pop-up
JOptionPane.howMessageDialog(myFrame,""hello,world!");
null if don't have a frame 

// build from the joption
JOptionPane.YES_OPTION
JOptionPane.NO_OPTION
JOptionPane.CANCEL_OPTION

input dialog 
- if hit okay, return string, cancel return null 

March 8th tuesday 
B. Layout 
Loaction of the box 
- 5 position: NORTH, SOUTH, WEST, EAST, CENTER
setLayout(new BorderLayout());
add(northButton, BorderLayout.NORTH);
pack();
setVisial(True);

flow layout:
- never strag to teh component: the size is still for them
- if it is too narrow, the woudl be on the new line
- add the button would be on a line, from left to right by order 
- ????   break into multiple rows 

setLayout(new GridLayout(row,column)){

Grid Lyout:
- same width and same length 
- strage for expend and get small 
- 

gap
- the area between the button 
- ???????????
changing a prefer size:
Dimension size3 = btn.getPreferredSize();

btn.setPreferredSize(new Dimension(width,height));

button.getsize(); // get the size of the button 

Jpanel:
- like the chart for using 
Jpanel row1= new Jpanel(new GridLayout(1,0)); // row, column 

new Jpanel(new GridLayout(0,2));
new Jpanel; // default is FlowLayout 

Jpanel row1= new Jpanel(new FlowLayout(1,0))


March 9th Wednesday Component and actino 
import java.awt.event.*;
- use the panel and put the button into it, the button would flow layout in the middle/ make a arguement of left,right or center 
- ActionEvent 
Obect getSourse();
String getActionCommand(); // either one of them 

- 

public interface ActionListener(){
	
	}
+ Sequence of Events 
- Set up 
--> - create the button 
	- create listner 
	- resgister lisnter with the button 

---------
stopbutton.addActionListner(new ActionEvent());

private class StopListner implements ActionListner{
	public void actionPerformed(ActionEvent e){
		System.exit(0);}
}// end class Stoplistner 
-------- 
//or 
--------

stopbutton.addActionListner(
	new ActionEvent(){
		public void actionPerformed(ActionEvent e){
		System.exit(0);
		}
	}
);
-----------



























