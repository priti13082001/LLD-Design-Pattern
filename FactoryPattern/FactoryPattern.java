package FactoryPattern;
//factory desing pattarn 
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class FactoryPattern
{
	public static void main(String[] args) {
	    shapeFactory shapeobj=new shapeFactory();
	   shape s=shapeobj.getShape("SQUARE");
	    s.draw();
	
	}
}
interface shape{
   public void draw();
}
 class circle implements shape{
    @Override
    public void draw(){
        System.out.println("circle object is create");
    }
}
 class square implements shape{
    @Override
    public void draw(){
        System.out.println("square object is create");
    }
}
 class rectangle implements shape{
    @Override
    public void draw(){
        System.out.println("rectangle object is create");
    }
}
class shapeFactory{
    
        shape getShape(String input){
            switch(input){
            case "CIRCLE":
               return new circle();
            case "SQUARE":
               return new square();
            default:
            return null;
            }
        }
         
}

