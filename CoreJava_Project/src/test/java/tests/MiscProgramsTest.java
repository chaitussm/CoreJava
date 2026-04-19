package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

public class MiscProgramsTest {

    @Test
    public void testLiterals() {
        javaBasics.Literals.main(new String[]{});
    }

    @Test
    public void testVARargMethod() {
        var_arg_methods.VARargnethod.main(new String[]{});
    }

    @Test
    public void testVarArg_Sumfunction() {
        var_arg_methods.VarArg_Sumfunction.main(new String[]{});
    }

    @Test
    public void testVARarg_replaceArrays() {
        var_arg_methods.VARarg_replaceArrays.main(new String[]{});
    }

    @Test
    public void testWrapperDatatypeValue() {
        com.WrapperClass.basics.WrapperDatatypeValue.main(new String[]{});
    }

    @Test
    public void testWrapperDefinition() {
        com.WrapperClass.basics.WrapperDefinition.main(new String[]{});
    }

    @Test
    public void testWrapperValueOfMethod() {
        com.WrapperClass.basics.WrapperValueOfMethod.main(new String[]{});
    }

    @Test
    public void testStringBufferConstructors() {
        com.StringBufferBased.StringBufferConstructors.main(new String[]{});
    }

    @Test
    public void testFetchPattern() {
        com.RegularExpressions.Programs.FetchPattern.main(new String[]{});
    }

    @Test
    public void testStringTokenIzer() {
        com.RegularExpressions.Programs.StringTokenIzer.main(new String[]{});
    }

    @Test
    public void testTreeMapNaturalSort() {
        com.MapComparator.Programs.TreeMapNaturalSort.main(new String[]{});
    }

    @Test
    public void testTreeMapUsingComparator() {
        com.MapComparator.Programs.TreeMapUsingComparator.main(new String[]{});
    }

    @Test
    public void testComparableBased() {
        com.SetComparatorBased.Programs.ComparableBased.main(new String[]{});
    }

    @Test
    public void testComparatorBased() {
        com.SetComparatorBased.Programs.ComparatorBased.main(new String[]{});
    }

    @Test
    public void testCustomizeComparator() {
        com.SetComparatorBased.Programs.CustomizeComparator.main(new String[]{});
    }

    @Test
    public void testArrBase() {
        com.InterviewProgram.Basics.ArrBase.main(new String[]{});
    }

    @Disabled("Requires browser - cannot run in headless CI")
    @Test
    public void testHandleWindows() {
        com.Assignment.Tests.HandleWindows.main(new String[]{});
    }
}
