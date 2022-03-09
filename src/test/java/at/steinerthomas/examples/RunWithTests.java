package at.steinerthomas.examples;

import org.junit.Assert;
import org.junit.Test;

public class RunWithTests {
  @Test
  public void testPass() {
    Assert.assertTrue(true);
    System.out.println("");
  }

  @Test
  public void testFail() {
    System.out.println("");
    Assert.assertTrue(false);
  }
}
