import static org.junit.Assert.*;
import org.junit.*;

public class JournalTest{
  Journal journal;
  Burger burger;

  @Before 
  public void before() {
    burger = new Burger();
    journal = new Journal();
  }

  @Test
  public void canAddEntry(){
    journal.add(burger, "Monday");
    journal.add(burger, "Tuesday");
    assertEquals(2, journal.numberOfEntries());
  }

  @Test
  public void entriesKeyincrementcorrectly(){
    journal.add(burger, "Monday");
    journal.add(burger, "Tuesday");
    journal.add(burger, "Wednesday");
    assertEquals(4, journal.nextEntryIndex());
  }

  @Test 
  public void entriesIncrementAfterOneHasbeenRemoved(){
    journal.add(burger, "Monday");
    journal.add(burger, "Tuesday");
    journal.add(burger, "Wednesday");
    journal.remove(1);
    assertEquals(2, journal.numberOfEntries());
    assertEquals(4, journal.nextEntryIndex());
  }

  @Test
  public void checkCanCountFoodsForDay(){
    journal.add(burger, "Monday");
    journal.add(burger, "Tuesday");
    journal.add(burger, "Tuesday");    
    journal.add(burger, "Tuesday");
    assertEquals(1, journal.getFoodCountByDay("Monday"));
    assertEquals(3, journal.getFoodCountByDay("Tuesday"));
  }

  @Test
  public void checkCanNotCountWrongDays(){
    journal.add(burger, "Monday");
    journal.add(burger, "Tuesday");
    assertEquals(0, journal.getFoodCountByDay("Wednesday"));
  }


}