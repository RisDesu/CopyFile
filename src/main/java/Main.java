
import controller.Manager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        String title = "============ Copy Program =========";
        String[] s = new String[]{"readFileConfig", "Exit"};
        Menu<String> menu = new Manager(title, s);
        menu.run();
    }
}
