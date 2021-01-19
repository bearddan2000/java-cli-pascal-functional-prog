// Java program to find nth ugly number
class Main {

  static final int row(final int k, final int i, final int c) {
      if (k > i) return 0;
      System.out.print( c + ", ");
      final int a = c * (i-k)/(k+1);
      return row(k+1, i, a);
  }

  static final int col(final int i, final int n) {
      if (i > n) return 0;
      row(0, i, 1);
      System.out.println("");
      return col(i+1, n);
  }

  /* Driver program to test above
  functions */
  public static void main(String args[])
  {
    final int input = 10;
    System.out.println("[INPUT] "+ input);
    System.out.println("[OUTPUT] ");
    col(0, input);
  }
}
