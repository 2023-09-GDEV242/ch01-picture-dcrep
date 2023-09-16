/**
 * This class draws a simple picture of a house, sun, and a  person.
 * It can be set to black-and-white display and back to colors.
 *
 * 
 * @author  Daniel Corritore
 *          (modified from code by Michael Kšlling and David J. Barnes)
 * @version 2023.09.15
 */
public class Picture
{
    private Square grassArray[];
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
        grassArray = new Square[4];
        for (int i = 0; i < grassArray.length; i++) {
            grassArray[i] = new Square();
        }
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
            int horizDist = -160;
            for (Square s: grassArray) {
                s.changeColor("green");
                s.changeSize(40);
                // move vertically BEFORE showing
                s.moveVertical(140);
                s.makeVisible();
                // This makes it uber annoying:
                //s.slowMoveVertical(140);
                s.slowMoveHorizontal(horizDist);
                horizDist += 40;
            }
            wall.changeSize(120);
            wall.moveHorizontal(-140);
            wall.moveVertical(-100);    // fall from above
            wall.makeVisible();
            //wall.slowMoveHorizontal(-140);
            wall.slowMoveVertical(100 + 20);
            
            door.changeColor("blue");
            door.changeSize(35);
            door.moveVertical(105);
            door.makeVisible();
            door.slowMoveHorizontal(-70);
            //door.slowMoveVertical(105);            
            
            window.changeColor("black");
            window.changeSize(30);
            window.moveVertical(40);
            window.makeVisible();
            window.slowMoveHorizontal(-120);
            //window.slowMoveVertical(40);            
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.makeVisible();
            //roof.slowMoveHorizontal(20);
            roof.slowMoveVertical(-60);
            
            sun.changeColor("yellow");
            sun.changeSize(80);
            sun.moveHorizontal(100);
            sun.moveVertical(120);  // make it "rise"
            sun.makeVisible();
            //sun.slowMoveHorizontal(100);
            sun.slowMoveVertical(-120 + -40);            
            
            personA.changeColor("orange");
            personA.changeSize(60,30);
            personA.moveHorizontal(-50);
            personA.makeVisible();
            //personA.slowMoveHorizontal(-50);
            personA.slowMoveVertical(60);
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        for (Square s: grassArray) {
            s.changeColor("black");
        }
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
        for (Square s: grassArray) {
            s.changeColor("green");
        }
        wall.changeColor("red");
        door.changeColor("blue");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        personA.changeColor("orange");
    }
}
