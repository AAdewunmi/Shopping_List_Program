import javax.swing.*;
import java.util.ArrayList;

/**
 * Shopping List Program
 * Shopping.class - It is required to store a collection of items (as Strings)
 * that you need to buy at the shops.
 * @author Adrian Adewunmi
 * @version 2021.01.17_Version_1
 */

class Shopping {

	// Storage for an arbitrary number of shopping items.
	private final ArrayList<String> shoppingList;
	// An array of strings
	private final String[] alternatives = {"Print List", "Add to List", "Show List", "Exit Program"};

     // Constructor: so shoppingList  references a new ArrayList object
	public Shopping() {
		super();
		this.shoppingList = new ArrayList<>();
	}
	
	// addItem(String celeb): to add an item to the shopping list
	public void addItem(String celeb) {
		shoppingList.add(celeb);
	}

	//numberOfItems(): to return number of items on the list
	public int numberOfItems() {
		return shoppingList.size();
	}

	//showItem(int): display item in a given index
	public void showItem(int shoppingListNumber) {
		if (shoppingListNumber < 0) {
			System.err.println();
		} else if (shoppingListNumber < numberOfItems()){
			System.out.println("Item in given index: " + shoppingListNumber + " is "
					+ shoppingList.get(shoppingListNumber));
		}else {
			System.err.println();
		}
	}

	//listItems(): display items in the shopping list
	public void listItems() {
		for (String s : shoppingList) {
			System.out.println(s);
		}
	}
	// Method to display GUI menu
	 public void runMenu()
     {
        
        int option = getChoice();
        while (option != 3)
        {
          //Action depending on choice
          if (option == 0)//List items
          {
           if (numberOfItems() >0 )
           { 
        	   listItems();
           }
           else System.out.println("No item in list");
          }
          else if (option == 1) //Add item
          {
           String newNote= JOptionPane.showInputDialog(null,"Enter a new Item","New Item", JOptionPane.PLAIN_MESSAGE);
           addItem(newNote) ; 
         
          }
          else if (option == 2) // Show item
          {
            if (numberOfItems() >0 )
            {
              String strNum= JOptionPane.showInputDialog(null,"Enter a Item Number","Show Item", JOptionPane.PLAIN_MESSAGE);
              int num = Integer.parseInt(strNum); 
              if (num <= numberOfItems())
              {
            	  showItem(num) ;
              }
              else System.out.println("Invalid number");
            }
            else System.out.println("No item in list");
          }
           else JOptionPane.showMessageDialog(null, "No Comprendo " +option);
         //Prompt again
         option = getChoice();
        }//End while
     }
	 
	// Alternative choices menu
		public int getChoice() {
			return JOptionPane.showOptionDialog(null, "Select from ..","Shopping List Menu",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alternatives, alternatives[0]);
		}
}
