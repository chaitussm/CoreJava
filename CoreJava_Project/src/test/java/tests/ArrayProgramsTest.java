package tests;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ArrayProgramsTest {

    @Test
    public void testAddArrays() {
        com.arraybasedprograms.AddArrays.main(new String[]{});
    }

    @Test
    public void testAddarray() {
        com.arraybasedprograms.Addarray.main(new String[]{});
    }

    @Test
    public void testArrayDef() {
        com.arraybasedprograms.ArrayDef.main(new String[]{});
    }

    @Test
    public void testArrayIntialize() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("2\nAlice\nBob\n".getBytes()));
            com.arraybasedprograms.ArrayIntialize.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testDeleteDuplicateelementsinArray() {
        com.arraybasedprograms.DeleteDuplicateelementsinArray.main(new String[]{});
    }

    @Test
    public void testDuplicateElementsinArray() {
        com.arraybasedprograms.DuplicateElementsinArray.main(new String[]{});
    }

    @Test
    public void testFindSecondSmall_LargeNumberinArray() {
        com.arraybasedprograms.FindSecondSmall_LargeNumberinArray.main(new String[]{});
    }

    @Test
    public void testFindSecondSmallestNumberinArray() {
        com.arraybasedprograms.FindSecondSmallestNumberinArray.main(new String[]{});
    }

    @Test
    public void testLargestSmallestElementinArray() {
        com.arraybasedprograms.LargestSmallestElementinArray.main(new String[]{});
    }

    @Test
    public void testMaxDifference() {
        com.arraybasedprograms.MaxDifference.main(new String[]{});
    }

    @Test
    public void testMaximumSum() {
        com.arraybasedprograms.MaximumSum.main(new String[]{});
    }

    @Test
    public void testMergeTwoArrays() {
        com.arraybasedprograms.MergeTwoArrays.main(new String[]{});
    }

    @Test
    public void testMissingNumberInArray() {
        com.arraybasedprograms.MissingNumberInArray.main(new String[]{});
    }

    @Test
    public void testRemoveDuplicatelementsinArray() {
        com.arraybasedprograms.RemoveDuplicatelementsinArray.main(new String[]{});
    }

    @Test
    public void testRepeated_Char_Without_Collections() {
        com.arraybasedprograms.Repeated_Char_Without_Collections.main(new String[]{});
    }

    @Test
    public void testSortAnArray() {
        com.arraybasedprograms.SortAnArray.main(new String[]{});
    }

    @Test
    public void testSortArrayWithoutDS() {
        com.arraybasedprograms.SortArrayWithoutDS.main(new String[]{});
    }

    @Test
    public void testSortingArray() {
        com.arraybasedprograms.SortingArray.main(new String[]{});
    }

    @Test
    public void testSumOfElementsInArray() {
        com.arraybasedprograms.SumOfElementsInArray.main(new String[]{});
    }

    @Test
    public void testThirdLargest() {
        com.arraybasedprograms.ThirdLargest.main(new String[]{});
    }
}
