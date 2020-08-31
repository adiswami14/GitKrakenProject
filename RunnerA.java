public class RunnerA implements PrintQuotient{

  public static void main(String[]args){
    new RunnerA();
  }

  RunnerA(){
    findQuotient(7.4f, 5.2f);
  }

  public void findQuotient(float x, float y){
      float f = x/y;
      //printf("%.*f", 3, f);
      System.out.printf("%5.3f%n", f);
  }

}
