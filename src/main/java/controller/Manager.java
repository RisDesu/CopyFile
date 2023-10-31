/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import model.CopyFile;
import view.Menu;
/**
 *
 * @author HP
 */
public class Manager extends Menu<String>{
    private CopyFile list= new CopyFile();
    
    public Manager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
           
            case 1:
               list.readFileConfig();
                break;
            
            case 2:
                System.exit(0);        
        }
    }
}
