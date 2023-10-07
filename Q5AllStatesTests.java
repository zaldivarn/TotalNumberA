import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Q5AllStatesTests {


    /*
    Test Name: S2 Processing String
    Test Case ID: TotalA-SysTest-01
    Purpose: To cover when the list is not empty and processes the list
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“AAB”);
    Expected Output: Total = 2
     */
    @Test
    public void TotalA_SysTest_01() {
        Q5Class q5 = new Q5Class();
        q5.processString("AAB");
        assertEquals(2, q5.getTotalAs());
    }

    /*
    Test Name: S3 Increment Total
    Test Case ID: TotalA-SysTest-02
    Purpose: To cover when A is found to make sure it increments to the total
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“AAA”);
    Expected Output: Total = 3
     */
    @Test
    public void TotalA_SysTest_02() {
        Q5Class q5 = new Q5Class();
        q5.processString("AAA");
        assertEquals(3, q5.getTotalAs());
    }

    /*
    Test Name: S4 Return Total
    Test Case ID: TotalA-SysTest-03
    Purpose: To cover that the list processes and returns a correct total
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“ABC”);
    Expected Output: Total = 1

     */
    @Test
    public void TotalA_SysTest_03(){
        Q5Class q5 = new Q5Class();
        q5.processString("ABC");
        assertEquals(1, q5.getTotalAs());
    }
}