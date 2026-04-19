package tests;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CollectionProgramsTest {

    @Test
    public void testAddTwoLists() {
        com.CollectionBased.examples.AddTwoLists.main(new String[]{});
    }

    @Test
    public void testCountEvenNumInArrayList() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("3\n2\n5\n8\n".getBytes()));
            com.CollectionBased.examples.CountEvenNumInArrayList.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testHashMapDemo() {
        com.CollectionBased.examples.HashMapDemo.main(new String[]{});
    }

    @Test
    public void testQueueInterface() {
        com.CollectionBased.examples.QueueInterface.main(new String[]{});
    }

    @Test
    public void testReverseArrayList() {
        com.CollectionBased.examples.ReverseArrayList.main(new String[]{});
    }

    @Test
    public void testStackClass() {
        com.CollectionBased.examples.StackClass.main(new String[]{});
    }

    @Test
    public void testVectorClass() {
        com.CollectionBased.examples.VectorClass.main(new String[]{});
    }

    @Test
    public void testCollectionmethods() {
        colllection.Collectionmethods.main(new String[]{});
    }

    @Test
    public void testIteratorinterface() {
        colllection.Iteratorinterface.main(new String[]{});
    }

    @Test
    public void testMainComparator() {
        colllection.MainComparator.main(new String[]{});
    }

    @Test
    public void testMaincomparable() {
        colllection.Maincomparable.main(new String[]{});
    }
}
