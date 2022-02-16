public class Currency
{
   private double exchange;
   
   public Currency(double exchange) {
      this.exchange = exchange;
   }
   
   private convert(double amount) {
      return amount * exchange;
   }
}
