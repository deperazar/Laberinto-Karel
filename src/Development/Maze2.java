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
public class Maze2 {
    

    private City maze;
    private Wall [] wall;
    
    public Maze2(){
        maze=new City(15,16);
        Wall [] wall=new Wall[75];
        for(int i=0;i<9;i++){
            wall[i]=new Wall(maze,9,1+i,Direction.SOUTH);
        }
        
        for(int i=0;i<9;i++){
            wall[i+9]=new Wall(maze,1+i,1,Direction.WEST);
        }
        
        for(int i=0;i<9;i++){
            wall[i+18]=new Wall(maze,1,1+i,Direction.NORTH);
        
        }
            
        for(int i=0;i<8;i++){
            wall[i+26]=new Wall(maze,2+i,9,Direction.EAST);
        }
        wall[27]=new Wall(maze,9,1,Direction.NORTH);
        wall[28]=new Wall(maze,9,2,Direction.NORTH);
        wall[29]=new Wall(maze,9,4,Direction.NORTH);
        wall[30]=new Wall(maze,9,5,Direction.NORTH);
        wall[31]=new Wall(maze,8,6,Direction.NORTH);
        wall[32]=new Wall(maze,8,7,Direction.NORTH);
        wall[33]=new Wall(maze,8,8,Direction.NORTH);
        wall[34]=new Wall(maze,9,9,Direction.NORTH);
        wall[35]=new Wall(maze,5,1,Direction.EAST);
        wall[36]=new Wall(maze,6,1,Direction.EAST);
        wall[37]=new Wall(maze,7,1,Direction.EAST);
        wall[38]=new Wall(maze,5,3,Direction.EAST);
        wall[39]=new Wall(maze,6,3,Direction.EAST);
        wall[40]=new Wall(maze,7,4,Direction.EAST);
        wall[41]=new Wall(maze,8,4,Direction.EAST);
        wall[42]=new Wall(maze,6,5,Direction.EAST);
        wall[43]=new Wall(maze,7,5,Direction.EAST);
        wall[44]=new Wall(maze,8,5,Direction.EAST);
        wall[45]=new Wall(maze,6,7,Direction.EAST);
        wall[46]=new Wall(maze,7,7,Direction.EAST);
        wall[47]=new Wall(maze,4,6,Direction.EAST);
        wall[48]=new Wall(maze,5,6,Direction.EAST);
        wall[49]=new Wall(maze,4,4,Direction.EAST);
        wall[50]=new Wall(maze,7,2,Direction.NORTH);
        wall[51]=new Wall(maze,7,3,Direction.NORTH);
        wall[52]=new Wall(maze,7,4,Direction.NORTH);
        wall[53]=new Wall(maze,5,4,Direction.NORTH);
        wall[54]=new Wall(maze,4,5,Direction.NORTH);
        wall[55]=new Wall(maze,4,6,Direction.NORTH);
        wall[56]=new Wall(maze,4,7,Direction.NORTH);
        wall[57]=new Wall(maze,4,8,Direction.NORTH);
        wall[58]=new Wall(maze,4,9,Direction.NORTH);
        wall[59]=new Wall(maze,3,6,Direction.NORTH);
        wall[60]=new Wall(maze,4,1,Direction.NORTH);
        wall[61]=new Wall(maze,4,2,Direction.NORTH);
        wall[62]=new Wall(maze,2,1,Direction.NORTH);
        wall[63]=new Wall(maze,2,2,Direction.NORTH);
        wall[64]=new Wall(maze,2,3,Direction.NORTH);
        wall[65]=new Wall(maze,1,3,Direction.EAST);
        wall[66]=new Wall(maze,2,2,Direction.EAST);
        wall[67]=new Wall(maze,3,2,Direction.EAST);
        wall[68]=new Wall(maze,3,5,Direction.EAST);
        wall[69]=new Wall(maze,1,7,Direction.EAST);
        wall[70]=new Wall(maze,2,7,Direction.EAST);
        
          
    }
    public City getCity1(){
        return maze;
    }

    
}


