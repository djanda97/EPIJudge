package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class ReverseDigits {
  @EpiTest(testDataFile = "reverse_digits.tsv")
  public static long reverse(int x) {
    String s = String.valueOf(x);
    StringBuilder sb = new StringBuilder();
    boolean isNegative = s.charAt(0) == '-';
    if (isNegative) {
      sb.append(s.substring(1).toCharArray());
      return Long.parseLong("-" + sb.reverse());
    }
    sb.append(s.toCharArray());
    return Long.parseLong(sb.reverse().toString());
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args, "ReverseDigits.java", new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
