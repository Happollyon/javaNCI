import javax.swing.*;
class ArrayInput{
	public static void main(String args[]){


		//declare and initilaize a string array with three elements
		String arr[] = new String[5];

    //create loop to gather input for each array elements
    for (int i = 0; i < 5; i++){
      arr[i] = JOptionPane.showInputDialog(null, "Please enter a word");
    }

    JOptionPane.showMessageDialog(null, "1st word is: "+arr[0]);
    JOptionPane.showMessageDialog(null, "last word is: "+arr[4]);

		//or output all using one output JOptionPane
    //JOptionPane.showMessageDialog(null, "1st word is: "+arr[0]+"\nlast word is "+arr[4]);
}



}
