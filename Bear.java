import java.util.*;

public class Bear{

  private String name;
  private ArrayList<Edible> belly;
  private Journal journal;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
    this.journal = new Journal();
  }

  public String getName(){
    return name;
  }

  public void eat(Edible food, String day){
    belly.add(food);
    journal.add(food, day);
  }

  public int foodCount(){
    return belly.size();
  }

  public Journal getJournal(){
    return journal;
  }

}