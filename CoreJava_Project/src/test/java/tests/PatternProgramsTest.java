package tests;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class PatternProgramsTest {

    @Test
    public void testFloyid_Triangle() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.Floyid_Triangle.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testInvertedPattern1() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.InvertedPattern1.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testInvertedPyramid() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.InvertedPyramid.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testPattern1() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.Pattern1.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testPattern3() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.Pattern3.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testPyramid() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.Pyramid.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testReverseTriangle() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("5\n".getBytes()));
            com.PatternBased.Programs.ReverseTriangle.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }
}
