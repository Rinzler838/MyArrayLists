package list.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
	}
	
	public void start()
	{
		firstWords.add("deguauhuguerahsuigbhusadfuad");
		firstWords.add("bababababababaabababababababababababababababababababababababababaababababababababababababababababababababababababababababababababaabbaabbabababababababababababaa");
		showList();
	}	
	
	private void showList()
	{
		for(int spot = 0; spot < firstWords.size(); spot++)
		{
			JOptionPane.showMessageDialog(null, firstWords.get(spot) + " is at spot# "+ spot);
		}
	}
}
