package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	
	    public void run(){
	        move();
	        while(frontIsClear()){
	            checkBlock();
	            moveNextBlock();
	        }
	    }
	 
	    private void checkBlock(){
	        if(noBeepersPresent()){
	            clearBlock();
	        }
	    }
	 
	    private void clearBlock(){
	        moveNorthPart();
	        returnCenter();
	        moveSouthPart();
	        returnCenter();
	    }
	 
	   
	    private void moveSouthPart(){
	        turnRight();
	        move();
	        while(beepersPresent()){
	            pickBeeper();
	        }
	    }
	 
	    
	    private void moveNorthPart(){
	        turnLeft();
	        move();
	        while(beepersPresent()){
	            pickBeeper();
	        }
	    }
	 
	   
	    private void returnCenter(){
	        turnAround();
	        move();
	        turnEast();
	    }
	 
	    
	    private void turnEast(){
	        while(notFacingEast()){
	            turnLeft();
	        }
	    }
	 
	    
	    private void moveNextBlock(){
	        if(frontIsClear()){
	            move();
	          if(frontIsClear()){
	                move();
	            }
	        }
	    }
	}