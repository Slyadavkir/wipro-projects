package WiproProject2.WiproProject2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    AdditionTest.class,
    EvenOddTest.class,
    PrimeTest.class,
    VowelTest.class,
    ReverseTest.class,
    MaxArrayTest.class
})
public class AllTest {
}
