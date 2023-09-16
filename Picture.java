/**
 * This class draws a simple picture of a house, sun, and a  person.
 * It can be set to black-and-white display and back to colors.
 *
 * 
 * @author  Daniel Corritore
 *          (modified from code by Michael Kšlling and David J. Barnes)
 * @version 2023.09.12
 */
public class Picture
{
    private Square wall;
    private Square door;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person personA;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        door = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        personA = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.changeSize(120);
            wall.makeVisible();
            wall.slowMoveHorizontal(-140);
            wall.slowMoveVertical(20);
            
            door.changeColor("blue");
            door.changeSize(35);
            door.makeVisible();
            door.slowMoveHorizontal(-70);
            door.slowMoveVertical(105);            
            
            window.changeColor("black");
            window.changeSize(30);
            window.makeVisible();
            window.slowMoveHorizontal(-120);
            window.slowMoveVertical(40);            
    
            roof.changeSize(60, 180);
            roof.makeVisible();
            roof.slowMoveHorizontal(20);
            roof.slowMoveVertical(-60);
            
            sun.changeColor("yellow");
            sun.changeSize(80);
            sun.makeVisible();
            sun.slowMoveHorizontal(100);
            sun.slowMoveVertical(-40);            
            
            personA.changeColor("orange");
            personA.changeSize(60,30);
            personA.makeVisible();
            personA.slowMoveHorizontal(-50);
            personA.slowMoveVertical(60);
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        door.changeColor("white");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        personA.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        door.changeColor("blue");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        personA.changeColor("orange");
    }
}
