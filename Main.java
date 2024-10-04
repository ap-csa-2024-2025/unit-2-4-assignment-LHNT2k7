public class Main
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN(cream,butter,3));
  }
  public static String firstLastN(String word, String word2, int n)
  {
      String output = new String();
      String FirstN = word2.substring(0,n);
      int indexOfNthtoLast = word.length() - n;
      String LastN = word.substring(indexOfNthtoLast);
      return FirstN + LastN;
  }
}