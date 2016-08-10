public class JournalEntry {
  private String day;
  private Edible food;

  public JournalEntry(Edible food, String day){
    this.day = day;
    this.food = food;
  }

  public String getDay(){
    return day;
  }

  public Edible getFood(){
    return food;
  }
}