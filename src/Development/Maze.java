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
public class Maze {
    private City maze;
    private Wall [] wall;
    
    public Maze(){
        maze=new City(9,11);
        Wall [] wall=new Wall[75];
        for(int i=0;i<8;i++){
            wall[i]=new Wall(maze,7,1+i,Direction.SOUTH);
        }
        
        for(int i=0;i<7;i++){
            wall[i+8]=new Wall(maze,1+i,1,Direction.WEST);
        }
        
        for(int i=0;i<8;i++){
            wall[i+15]=new Wall(maze,1,1+i,Direction.NORTH);
        
        }
            
        for(int i=0;i<6;i++){
            wall[i+23]=new Wall(maze,2+i,8,Direction.EAST);
        }
        wall[29]=new Wall(maze,7,1,Direction.EAST);
        wall[30]=new Wall(maze,6,1,Direction.EAST);
        wall[31]=new Wall(maze,5,1,Direction.NORTH);
        wall[32]=new Wall(maze,5,2,Direction.EAST);
        wall[33]=new Wall(maze,6,2,Direction.EAST);
        wall[34]=new Wall(maze,7,4,Direction.EAST);
        wall[35]=new Wall(maze,6,3,Direction.NORTH);
        wall[36]=new Wall(maze,5,4,Direction.NORTH);
        wall[37]=new Wall(maze,4,2,Direction.EAST);
        wall[38]=new Wall(maze,4,3,Direction.NORTH);
        wall[39]=new Wall(maze,5,4,Direction.EAST);
        wall[41]=new Wall(maze,4,4,Direction.EAST);
        wall[42]=new Wall(maze,4,4,Direction.NORTH);
        wall[43]=new Wall(maze,4,5,Direction.NORTH);
        wall[44]=new Wall(maze,5,5,Direction.NORTH);
        wall[45]=new Wall(maze,4,6,Direction.NORTH);
        wall[46]=new Wall(maze,4,6,Direction.EAST);
        wall[47]=new Wall(maze,5,6,Direction.EAST);
        wall[48]=new Wall(maze,6,5,Direction.EAST);
        wall[49]=new Wall(maze,6,6,Direction.NORTH);
        wall[50]=new Wall(maze,7,6,Direction.NORTH);
        wall[51]=new Wall(maze,7,7,Direction.NORTH);
        wall[52]=new Wall(maze,6,7,Direction.EAST);
        wall[53]=new Wall(maze,5,7,Direction.EAST);
        //wall[54]=new Wall(maze,5,8,Direction.NORTH);
        wall[55]=new Wall(maze,7,4,Direction.NORTH);
        wall[56]=new Wall(maze,5,1,Direction.NORTH);
        wall[57]=new Wall(maze,4,1,Direction.NORTH);
        wall[58]=new Wall(maze,4,1,Direction.EAST);
        wall[59]=new Wall(maze,1,1,Direction.EAST);
        wall[60]=new Wall(maze,2,1,Direction.EAST);
        wall[61]=new Wall(maze,3,2,Direction.NORTH);
        wall[62]=new Wall(maze,2,3,Direction.EAST);
        wall[63]=new Wall(maze,2,3,Direction.NORTH);
        wall[64]=new Wall(maze,2,4,Direction.NORTH);
        wall[65]=new Wall(maze,2,5,Direction.NORTH);
        wall[66]=new Wall(maze,2,5,Direction.EAST);
        wall[66]=new Wall(maze,2,6,Direction.EAST);
        wall[67]=new Wall(maze,3,6,Direction.NORTH);
        wall[68]=new Wall(maze,1,7,Direction.EAST);
        wall[69]=new Wall(maze,3,7,Direction.EAST);
        wall[69]=new Wall(maze,1,6,Direction.EAST);
        wall[70]=new Wall(maze,3,8,Direction.NORTH);
        wall[71]=new Wall(maze,3,4,Direction.EAST);
        wall[72]=new Wall(maze,5,7,Direction.NORTH);
        wall[73]=new Wall(maze,6,3,Direction.EAST);
        

       
    }

    public City getCity(){
        return maze;
    }
}
