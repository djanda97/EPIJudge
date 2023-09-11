package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class CountBits {
  @EpiTest(testDataFile = "count_bits.tsv")
  public static short countBits(int x) {
    char[] binary = Integer.toBinaryString(x).toCharArray();
    short count = 0;
    for (char c : binary) {
      if (c == '1') {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args, "CountBits.java", new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
