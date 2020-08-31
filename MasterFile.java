public class MasterFile implements PrintQuotient{

  public static void main(String[]args){
    new MasterFile();
  }

  MasterFile(){
    findQuotient(7.4f, 5.2f);
    PerfectSquare func = num -> {
      return Math.sqrt(num) % 1 == 0;
    };
    System.out.printf("" + func.checkPerfectSquare(27) + "\n");
  }

  public void findQuotient(float x, float y){
      float f = x/y;
      //printf("%.*f", 3, f);
      System.out.printf("%5.3f%n", f);
  }

  public interface PrintQuotient{
    public void findQuotient(float x, float y);
  }

  public interface PerfectSquare{
    public boolean checkPerfectSquare(int num);
  }

}
//Adi Swami -- I learned how to use lambdas (Saving a method as a Variable), so that was cool, so was learning how Git works in essence (with all the pushing and pulling).