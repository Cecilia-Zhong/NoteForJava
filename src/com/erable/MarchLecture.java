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
5. mouse events& timers

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
























