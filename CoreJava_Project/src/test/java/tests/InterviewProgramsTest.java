package tests;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InterviewProgramsTest {

    @Test
    public void testCompareLists() {
        interview.CompareLists.main(new String[]{});
    }

    @Test
    public void testFactorial() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            interview.Factorial.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testFibonacci() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("7\n".getBytes()));
            interview.Fibonacci.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testPrimeNumber() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("7\n".getBytes()));
            interview.PrimeNumber.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testEpsilonIdentityMatrix() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("3\n".getBytes()));
            interview.Epsilon_IdentityMatrix.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testFISPrintEighttable() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("8\n".getBytes()));
            interview.FIS_PrintEighttable.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testReverseofNumber() {
        interview.ReverseofNumber.main(new String[]{});
    }

    @Test
    public void testSapiens() {
        interview.Sapiens.main(new String[]{});
    }

    @Test
    public void testSapiensHashMap() {
        interview.Sapiens_HashMap.main(new String[]{});
    }

    @Test
    public void testTest() {
        interview.Test.main(new String[]{});
    }
}
