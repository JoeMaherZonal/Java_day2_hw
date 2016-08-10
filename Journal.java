import java.util.*;

public class Journal {

  private HashMap<Integer, JournalEntry> entries;

  public Journal(){
    this.entries = new HashMap<Integer, JournalEntry>();
  }

  public void add(Edible food, String day){
    JournalEntry newEntry = new JournalEntry(food, day);
    int nextKey = nextEntryIndex();
    entries.put(nextKey, newEntry);
  }

  public void remove(int index){
    entries.remove(index);
  }

  public int numberOfEntries(){
    return entries.size();
  }

  public int nextEntryIndex(){
    int largestKey = 0;
    for (int key : entries.keySet()) {
      if(key > largestKey){
        largestKey = key;
      }
    }
    return largestKey + 1;
  }

  public int getFoodCountByDay(String day){
    int count = 0;
    for (JournalEntry entry : entries.values()) {
        if(entry.getDay() == day){
          count++;
        }
    }
    return count;
  }
}