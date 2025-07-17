public class Boxweight extends Box {
   double weight;

   public Boxweight(double var1, double var3, double var5, double var7) {
      super(var1, var3, var5);
      this.weight = var7;
   }

   public void showdetails() {
      System.out.println("length:" + this.length);
      System.out.println("width:" + this.width);
      System.out.println("height:" + this.height);
      System.out.println("volume:" + this.volume());
      System.out.println("weight:" + this.weight);
   }
}