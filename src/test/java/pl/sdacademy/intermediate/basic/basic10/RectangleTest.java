package pl.sdacademy.intermediate.basic.basic10;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RectangleTest {
    private Rectangle rectangle;

    @Before
    public void setRectangle() {
        this.rectangle = new Rectangle(3, 4);
    }

    @After
    public void statement() {
        System.out.println("After single test case" + this.getClass());
    }

    @Test
    public void testCalculateArea() {
        Assert.assertEquals(12, rectangle.calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        Assert.assertEquals(14, rectangle.calculatePerimeter());
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnIncorrectValuesInConstructor() {
        new Rectangle(1, 0);
    }

}