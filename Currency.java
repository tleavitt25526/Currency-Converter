
public class Currency
{
   private double exchange;
   private String name;
   
   public Currency(String name, double exchange) {
      this.exchange = exchange;
      this.name = name;
   }
   
   public double convert(double amount) {
      return amount * exchange;
   }
   
   public String getName() {
      return this.name;
   }
}
