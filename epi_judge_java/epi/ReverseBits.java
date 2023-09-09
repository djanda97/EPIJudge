package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class ReverseBits {
  @EpiTest(testDataFile = "reverse_bits.tsv")
  public static long reverseBits(long x) {
    char[] binary = Long.toBinaryString(x).toCharArray();
    int start = 0;
    int end = binary.length - 1;
    while (start < end) {
      char tmp = binary[start];
      binary[start] = binary[end];
      binary[end] = tmp;
      start++;
      end--;
    }
    if (String.valueOf(binary).contentEquals(new StringBuilder(Long.toBinaryString(x)).reverse())) {
      System.out.println("PASSED");
      System.out.println("Input: " + Long.toBinaryString(x));
      System.out.println("Output: " + String.valueOf(binary));
    }
    return Long.parseLong(String.valueOf(binary));
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args, "ReverseBits.java", new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
