import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Cornflakes cornflakes;
  Burger burger;

  @Before 
  public void before() {
    bear = new Bear("Dave");
    salmon = new Salmon(); 
    cornflakes = new Cornflakes();
    burger = new Burger();
  }

  @Test
  public void hasName(){
    assertEquals( "Dave", bear.getName() ); 
  }

  @Test 
  public void canEat(){
    bear.eat(burger, "Monday");
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canAddToJournal(){
    bear.eat(burger, "Monday");
    assertEquals(1, bear.getJournal().getFoodCountByDay("Monday"));
  }

  @Test
  public void canAddMultipleEntriesToJournal(){
    bear.eat(burger, "Monday");
    bear.eat(salmon, "Monday");
    bear.eat(cornflakes, "Monday");
    bear.eat(burger, "Tuesday");
    assertEquals(3, bear.getJournal().getFoodCountByDay("Monday"));
  }

}