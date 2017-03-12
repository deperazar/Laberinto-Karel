/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Development;
import becker.robots.*;
import java.util.Random;
/**
 *
 * DANIEL EDUARDO PERAZA RIVERA
 * UNIVERSIDAD NACIONAL DE COLOMBIA
 */
public class Executor {
    
    
    public static void main(String [] args){
       
        City a;
        
        Maze laberinto=new Maze();
        
        a=laberinto.getCity();
        Thing food=new Thing(a,1,9);
        
        Runner luke=new Runner(a,7,1,Direction.EAST);
        
        while(!luke.finish()){
            if(luke.leftclear()){
                luke.leftr();
                luke.mover();
            }
            else if(luke.checkfront()){
                luke.mover();
            }
            else{
                luke.leftr();
                luke.leftr();
                if(luke.leftclear()){
                    luke.leftr();
                }
            }
        }
       
    }  
       

}
