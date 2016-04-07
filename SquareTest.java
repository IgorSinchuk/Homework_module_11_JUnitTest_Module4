import javafx.scene.shape.TriangleMesh;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class SquareTest {

    private Square square;

    @org.junit.Before
    public void setUp() throws Exception {
        square = new Square();

    }

    @org.junit.Test
    public void  testCircle() throws Exception {

        final double result = square.circle(7);

        Assert.assertEquals(153,(int) result);


    }

    @org.junit.Test
    public void testTriangle()throws Exception {

        final double result = square.triangle(10,5);

        Assert.assertEquals(25,(int) result);

    }

    @org.junit.Test
    public void testRectangle() throws Exception {

        final double result = square.rectangle(5,9);

        Assert.assertEquals(45,(int) result);

    }
}