
package becker;

import becker.robots.*;

/**
 *
 * @author Camilo
 */
public class Parqueadero {
    
     public static void main(String[] args)
   {
      City bogota = new City();
      Robot karel = new Robot(bogota, 8, 13, Direction.WEST);
      Robot karel1 = new Robot(bogota, 1, 2, Direction.EAST);
      int calle = 8;
      int muro = 2;
      int muro1 = 4;
      int muro2 = 6;
      int muro3 = 3;
     
     //Parqueaderos
     for(int a = 1; a < 6; a++){
      Wall wall1 = new Wall(bogota, a, muro, Direction.EAST);
      Wall wall2 = new Wall(bogota, a, muro, Direction.SOUTH);
      Wall wall3 = new Wall(bogota, a, muro1, Direction.EAST);
      Wall wall4 = new Wall(bogota, a, muro1, Direction.SOUTH);
      Wall wall5 = new Wall(bogota, a, muro2, Direction.EAST);
      Wall wall6 = new Wall(bogota, a, muro2, Direction.SOUTH);
     }
      Wall wall7 = new Wall(bogota, 1, muro, Direction.NORTH);
      Wall wall8 = new Wall(bogota, 1, muro1, Direction.NORTH);
      Wall wall9 = new Wall(bogota, 1, muro2, Direction.NORTH);
     
     //Parqueadero temporal
     for(int b = 9; b < 13; b++){
      Wall wall10 = new Wall(bogota, muro3, b, Direction.NORTH);
      Wall wall11 = new Wall(bogota, muro3, b, Direction.WEST);
     }
      Wall wall12 = new Wall(bogota, muro3, 12, Direction.EAST);
     
     // calle
     for (int i = 1; i < 15; i++){  
      Wall wall13 = new Wall(bogota, calle, i, Direction.SOUTH);
      }
     
     //Movimiento
     
     while(karel.getAvenue() != 1)
         karel.move();
     
     
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     while(karel.getStreet() != 1){
         karel.move();
     }
     karel.turnLeft();
     karel.turnLeft();
     karel.turnLeft();
     if(karel.equals(karel1)){
         karel.move();
     }
     else
     {
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
     }    
         
   }   
}
