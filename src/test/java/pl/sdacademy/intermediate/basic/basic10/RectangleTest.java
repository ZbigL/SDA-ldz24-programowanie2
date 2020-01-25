package pl.sdacademy.intermediate.basic.basic10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    private static final int DEFAULT_WIDTH = 3;
    private static final int DEFAULT_HEIGTH = 4;
    private static final int DEFAULT_AREA = 12;
    private static final int DEFAULT_PERIMETER = 14;
    
    private Rectangle rectangle;

    @Before
    public void setRectangle() {
        this.rectangle = new Rectangle(DEFAULT_WIDTH, DEFAULT_HEIGTH);
    }

    @After
    public void statement() {
        System.out.println("After single test case" + this.getClass());
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(DEFAULT_AREA, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(DEFAULT_PERIMETER, rectangle.calculatePerimeter());
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(1, 0);
    }

}