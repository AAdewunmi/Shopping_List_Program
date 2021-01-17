/**
 * Shopping List Program
 * Shopping_TextMenu_Tester class - A test class for Shopping.java
 * @author Adrian Adewunmi
 * @version 2021.01.17_Version_1
 */

public class Shopping_TextMenu_Tester {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         Shopping weeklyShoppingList = new Shopping();
         System.out.println("*** Shopping List Program ***\n");
         System.out.println("========");
         System.out.println("\nList of shopping items\n");
         weeklyShoppingList.addItem("Milk");
         weeklyShoppingList.addItem("Sugar");
         weeklyShoppingList.addItem("Butter");
         weeklyShoppingList.addItem("Eggs");
         weeklyShoppingList.addItem("Bacon");
         weeklyShoppingList.addItem("Bags of Yorkshire Tea");
         System.out.println("========"); weeklyShoppingList.listItems();
         System.out.println("\n*******\n"); weeklyShoppingList.showItem(5);
         System.out.println("\n=======");
    }
}
