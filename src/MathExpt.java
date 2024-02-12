import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A few simple experiments with our utilities.
 *
 * @author Samuel A. Rebelsky
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    for (int i = 2; i < 5; i++) {
      double root = MathUtils.squareRoot(i);
      double doubleRoot =  MathUtils.squareRoot((double) i);
      float floatRoot = (float) MathUtils.squareRoot((float) i);
      BigInteger bIntRoot = BigInteger.valueOf((int) MathUtils.squareRoot(i));
      BigDecimal bDecRoot = BigDecimal.valueOf(MathUtils.squareRoot(i));
      pen.println("The square root of " + i + " seems to be " + root);
      pen.println("The square root of " + i + " seems to be " + doubleRoot);
      pen.println("The square root of " + i + " seems to be " + floatRoot);
      pen.println("The square root of " + i + " seems to be " + bIntRoot);
      pen.println("The square root of " + i + " seems to be " + bDecRoot);
      pen.println(root + "^2 = " + (root * root));
    } // for i

    // We're done. Clean up.s
    pen.close();
  } // main(String[])
} // class MathExpt
