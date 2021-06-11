import animals.reptiles.Snake;
import animals.reptiles.Tortoise;
import org.junit.Before;
import org.junit.Test;
import zoo.Zoo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ZooTest {

    private Zoo zoo;
    private Tortoise tortoise;
    private Snake snake;

    @Before
    public void before(){
        zoo = new Zoo();
        tortoise = new Tortoise("Ella", 7, "Hermanns");
        snake = new Snake("Steve", 3, "python");
    }

    @Test
    public void zooStartsWithNoReptiles(){
        assertEquals(0,zoo.countReptiles());
    }

    @Test
    public void canAddReptileToReptileHouse(){
        zoo.addReptile(tortoise);
        assertEquals(1, zoo.countReptiles());
    }

    @Test
    public void canFindParticularReptileInReptileHouse(){
        zoo.addReptile(tortoise);
        zoo.addReptile(snake);
        assertTrue(zoo.isReptileInReptileHouse(tortoise));
    }

}
