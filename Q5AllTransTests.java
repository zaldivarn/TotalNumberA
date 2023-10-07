import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Q5AllTransTests {

    /*
    Test Name: T1 Setup
    Test Case ID: TotalA-SysTest-04
    Purpose: To start the process and to be sure that total starts at 0
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“A”);
    Expected Output: Total = 1
     */
    @Test
    public void TotalA_SysTest_04() {
        Q5Class q5 = new Q5Class();
        q5.processString("A");
        assertEquals(1, q5.getTotalAs());
    }

    /*
    Test Name: T2 [processString()]
    Test Case ID: TotalA-SysTest-05
    Purpose: To cover that the process begins with a String found
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“ABC”);
    Expected Output: Total = 1
     */
    @Test
    public void TotalA_SysTest_05(){
        Q5Class q5 = new Q5Class();
        q5.processString("ABC");
        assertEquals(1, q5.getTotalAs());
    }

    /*
    Test Name: T3 [if (charAt(i) == ‘A’ && I < length()]
    Test Case ID: TotalA-SysTest-06
    Purpose: To cover that the next character in the String is A
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“AABA”);
    Expected Output: Total = 3
     */
    @Test
    public void TotalA_SysTest_06(){
        Q5Class q5 = new Q5Class();
        q5.processString("AABA");
        assertEquals(3, q5.getTotalAs());
    }

    /*
    Test Name: T4 [incrTotalAs()]
    Test Case ID: TotalA-SysTest-07
    Purpose: To cover that only an A count will increment the total
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“AACAAA”);
    Expected Output: Total = 5
     */
    @Test
    public void TotalA_SysTest_07(){
        Q5Class q5 = new Q5Class();
        q5.processString("AACAAA");
        assertEquals(5, q5.getTotalAs());
    }

    /*
    Test Name: T5 [if (charAt(i) != ‘A’ && I < length()]
    Test Case ID: TotalA-SysTest-08
    Purpose: To cover that if the next character in the String is NOT an A then proceed to the following without incrementing to the total
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“BABBC”);
    Expected Output: Total = 1
     */
    @Test
    public void TotalA_SysTest_08(){
        Q5Class q5 = new Q5Class();
        q5.processString("BABBC");
        assertEquals(1, q5.getTotalAs());
    }

    /*
    Test Name: T6 [!(i < length)]
    Test Case ID: TotalA-SysTest-09
    Purpose: To cover that when the String runs out of characters that the process will end to get ready to return the total
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“ABCABC”);
    Expected Output: Total = 2
     */
    @Test
    public void TotalA_SysTest_09(){
        Q5Class q5 = new Q5Class();
        q5.processString("ABCABC");
        assertEquals(2, q5.getTotalAs());
    }

    /*
    Test Name: T7 [getTotalAs()]
    Test Case ID: TotalA-SysTest-10
    Purpose: To cover that the process ends successfully returning the total number of As in the list
    Test Case Setup: Q5Class q5 = new Q5Class();
    Input: q5.processString(“ABACAD”);
    Expected Output: Total = 3
     */
    @Test
    public void TotalA_SysTest_10(){
        Q5Class q5 = new Q5Class();
        q5.processString("ABACAD");
        assertEquals(3, q5.getTotalAs());
    }
}