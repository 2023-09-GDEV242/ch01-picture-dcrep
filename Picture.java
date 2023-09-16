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
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            door.changeColor("blue");
            door.moveHorizontal(-70);
            door.moveVertical(105);
            door.changeSize(35);
            door.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(30);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            personA.changeColor("orange");
            personA.moveHorizontal(-50);
            personA.moveVertical(60);
            personA.changeSize(60,30);
            personA.makeVisible();
            
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
