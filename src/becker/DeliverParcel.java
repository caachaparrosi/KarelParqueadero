package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      Robot karel = new Robot(prague, 6, 13, Direction.WEST);
      
      Wall wall = new Wall(prague, 1, 2, Direction.EAST);
      Wall wall2 = new Wall(prague, 1, 2, Direction.NORTH);
      Wall wall3 = new Wall(prague, 1, 2, Direction.SOUTH);
      Wall wall4 = new Wall(prague, 2, 2, Direction.EAST);
      Wall wall5 = new Wall(prague, 2, 2, Direction.SOUTH);
      Wall wall6 = new Wall(prague, 3, 2, Direction.EAST);
      Wall wall7 = new Wall(prague, 3, 2, Direction.SOUTH);
      Wall wall8 = new Wall(prague, 4, 2, Direction.EAST);
      Wall wall9 = new Wall(prague, 4, 2, Direction.SOUTH);
      Wall wall10 = new Wall(prague, 5, 2, Direction.EAST);
      Wall wall11 = new Wall(prague, 5, 2, Direction.SOUTH);
      
      Wall wall12 = new Wall(prague, 1, 4, Direction.EAST);
      Wall wall13 = new Wall(prague, 1, 4, Direction.NORTH);
      Wall wall14 = new Wall(prague, 1, 4, Direction.SOUTH);
      Wall wall15 = new Wall(prague, 2, 4, Direction.EAST);
      Wall wall16 = new Wall(prague, 2, 4, Direction.SOUTH);
      Wall wall17 = new Wall(prague, 3, 4, Direction.EAST);
      Wall wall18 = new Wall(prague, 3, 4, Direction.SOUTH);
      Wall wall19 = new Wall(prague, 4, 4, Direction.EAST);
      Wall wall20 = new Wall(prague, 4, 4, Direction.SOUTH);
      Wall wall21 = new Wall(prague, 5, 4, Direction.EAST);
      Wall wall22 = new Wall(prague, 5, 4, Direction.SOUTH);
      
      Wall wall23 = new Wall(prague, 1, 6, Direction.EAST);
      Wall wall24 = new Wall(prague, 1, 6, Direction.NORTH);
      Wall wall25 = new Wall(prague, 1, 6, Direction.SOUTH);
      Wall wall26 = new Wall(prague, 2, 6, Direction.EAST);
      Wall wall27 = new Wall(prague, 2, 6, Direction.SOUTH);
      Wall wall28 = new Wall(prague, 3, 6, Direction.EAST);
      Wall wall29 = new Wall(prague, 3, 6, Direction.SOUTH);
      Wall wall30 = new Wall(prague, 4, 6, Direction.EAST);
      Wall wall31 = new Wall(prague, 4, 6, Direction.SOUTH);
      Wall wall32 = new Wall(prague, 5, 6, Direction.EAST);
      Wall wall33 = new Wall(prague, 5, 6, Direction.SOUTH);
      
      Wall wall34 = new Wall(prague, 3, 9, Direction.WEST);
      Wall wall35 = new Wall(prague, 3, 9, Direction.NORTH);
      Wall wall36 = new Wall(prague, 3, 9, Direction.EAST);
      Wall wall37 = new Wall(prague, 3, 10, Direction.NORTH);
      Wall wall38 = new Wall(prague, 3, 10, Direction.EAST);
      Wall wall39 = new Wall(prague, 3, 11, Direction.NORTH);
      Wall wall40 = new Wall(prague, 3, 11, Direction.EAST);
      Wall wall41 = new Wall(prague, 3, 12, Direction.NORTH);
      Wall wall42 = new Wall(prague, 3, 12, Direction.EAST);
      
      // Direct the robot to the final situation
      karel.move();
      karel.move();   
      karel.move();
      karel.turnLeft();
      karel.turnLeft();
      karel.turnLeft();
      karel.move();
      karel.move();
      System.out.println(karel.countThingsInBackpack());
   }
}
