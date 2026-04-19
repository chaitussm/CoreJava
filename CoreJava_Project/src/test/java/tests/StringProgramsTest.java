package tests;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class StringProgramsTest {

    @Test
    public void testAddNumbersInString() {
        com.StringBased.Programs.AddNumbersInString.main(new String[]{});
    }

    @Test
    public void testAnagrams() {
        com.StringBased.Programs.Anagrams.main(new String[]{});
    }

    @Test
    public void testAppliedmaterials_SubstringCount() {
        com.StringBased.Programs.Appliedmaterials_SubstringCount.main(new String[]{});
    }

    @Test
    public void testBasicsOfString() {
        com.StringBased.Programs.BasicsOfString.main(new String[]{});
    }

    @Test
    public void testChangeSequenceOfString() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("Hello\n".getBytes()));
            com.StringBased.Programs.ChangeSequenceOfString.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testCharacterPatterninString() {
        com.StringBased.Programs.CharacterPatterninString.main(new String[]{});
    }

    @Test
    public void testCountEachWordinString() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("hello world hello\n".getBytes()));
            com.StringBased.Programs.CountEachWordinString.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testCountStringUsingMap() {
        com.StringBased.Programs.CountStringUsingMap.main(new String[]{});
    }

    @Test
    public void testCounteachcharinString() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("hello\n".getBytes()));
            com.StringBased.Programs.CounteachcharinString.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testCountnumbersinString() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("abc123\n".getBytes()));
            com.StringBased.Programs.CountnumbersinString.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testDeleteDuplicateCharactersinString() {
        com.StringBased.Programs.DeleteDuplicateCharactersinString.main(new String[]{});
    }

    @Test
    public void testDiscoveryInterview_Anagram() {
        com.StringBased.Programs.DiscoveryInterview_Anagram.main(new String[]{});
    }

    @Test
    public void testDuplicateCharacter_Addnumbers() {
        com.StringBased.Programs.DuplicateCharacter_Addnumbers.main(new String[]{});
    }

    @Test
    public void testHoneywell_Compressstring() {
        com.StringBased.Programs.Honeywell_Compressstring.main(new String[]{});
    }

    @Test
    public void testImmutability() {
        com.StringBased.Programs.Immutability.main(new String[]{});
    }

    @Test
    public void testNeudesic_PrintSubstring() {
        com.StringBased.Programs.Neudesic_PrintSubstring.main(new String[]{});
    }

    @Test
    public void testRemoveSpecialCharactersInString() {
        com.StringBased.Programs.RemoveSpecialCharactersInString.main(new String[]{});
    }

    @Test
    public void testRemoveSpecificCharacters() {
        com.StringBased.Programs.RemoveSpecificCharacters.main(new String[]{});
    }

    @Test
    public void testReverseEachCharacterInReversedString() {
        com.StringBased.Programs.ReverseEachCharacterInReversedString.main(new String[]{});
    }

    @Test
    public void testReverseEachWordInString() {
        com.StringBased.Programs.ReverseEachWordInString.main(new String[]{});
    }

    @Test
    public void testReverseString() {
        InputStream stdin = System.in;
        try {
            System.setIn(new ByteArrayInputStream("Hello World\n".getBytes()));
            com.StringBased.Programs.ReverseString.main(new String[]{});
        } finally {
            System.setIn(stdin);
        }
    }

    @Test
    public void testStringDefinitionType() {
        com.StringBased.Programs.StringDefinitionType.main(new String[]{});
    }

    @Test
    public void testStringFormatter() {
        com.StringBased.Programs.StringFormatter.main(new String[]{});
    }

    @Test
    public void testStringMethods() {
        com.StringBased.Programs.StringMethods.main(new String[]{});
    }

    @Test
    public void testStringRegularExp() {
        com.StringBased.Programs.StringRegularExp.main(new String[]{});
    }
}
