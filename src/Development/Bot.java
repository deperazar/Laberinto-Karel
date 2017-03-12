/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development;
import becker.robots.*;
/**
 *
 * @author PERSONAL
 */


public class Bot {
    private Robot beep;
    private City maz;
     
    public Bot(City n,int i,int f,Direction w){
        
       Robot beep=new Robot(n,i,f,w);  
    }
  
    public void moverte(){
        beep.move();
    }
   
    /*public void leftr(){
        beep.turnLeft();
    }
    public void rightr(){
        beep.turnLeft();
        beep.turnLeft();
        beep.turnLeft();
    }
    public void checkfront(){
        beep.frontIsClear();
    }
    
    public boolean leftclear(){
        beep.turnLeft();
        if(beep.frontIsClear()==false){
            beep.turnLeft();
            beep.turnLeft();
            beep.turnLeft();    
            return false;
        }
            beep.turnLeft();
            beep.turnLeft();
            beep.turnLeft();   
            return true;
    }
    public boolean rightclear(){
        beep.turnLeft();
        beep.turnLeft();
        beep.turnLeft();
        if(beep.frontIsClear()==false){
            beep.turnLeft();   
            return false;
        }
            beep.turnLeft();
            return true;
    }
    
    /*public Robot getRobot(){
        Robot beep=new Robot(maz,coory,coorx,dir);   
        return beep;
    }*/
}
