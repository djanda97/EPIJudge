package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class IsNumberPalindromic {
  @EpiTest(testDataFile = "is_number_palindromic.tsv")
  public static boolean isPalindromeNumber(int x) {
    char[] c = String.valueOf(x).toCharArray();
    int start = 0;
    int end = c.length - 1;
    while (start < end) {
      if (c[start] != c[end]) {
        return false;
      }
      start++;
      end--;
    }
    return true;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest.runFromAnnotations(
                args, "IsNumberPalindromic.java", new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
