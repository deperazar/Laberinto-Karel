/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development;
import becker.robots.*;
/**
 *
 * DANIEL EDUARDO PERAZA RIVERA
 * UNIVERSIDAD NACIONAL DE COLOMBIA
 */
public class Runner {
    private Robot juni;
    private City mars;
    
    public Runner(City n,int i,int f,Direction w){
       
        juni=new Robot(n,i,f,w);
    }
    public void mover(){
        juni.move();
    }
    public void leftr(){
        juni.turnLeft();
    }
    public void rightr(){
        juni.setSpeed(1000);
        juni.turnLeft();
        juni.turnLeft();
        juni.turnLeft();
        juni.setSpeed(3);
    }
    public boolean checkfront(){
        if(juni.frontIsClear()==true){
            return true;
        }
        return false;
    }
    
    public boolean leftclear(){
        juni.setSpeed(1000);
        juni.turnLeft();
        if(juni.frontIsClear()==false){
            juni.turnLeft();
            juni.turnLeft();
            juni.turnLeft();
            juni.setSpeed(3);
            return false;
        }
            juni.turnLeft();
            juni.turnLeft();
            juni.turnLeft();
            juni.setSpeed(3);
            return true;
    }
    public boolean rightclear(){
        juni.setSpeed(1000);
        juni.turnLeft();
        juni.turnLeft();
        juni.turnLeft();
        
        if(juni.frontIsClear()==false){
            juni.turnLeft();   
            juni.setSpeed(3);
            return false;
        }
            juni.turnLeft();
            juni.setSpeed(3);
            
            
            return true;
    }
    public boolean finish(){
        if(juni.canPickThing()==true){
            return true;
        }
        return false;
    }
}
