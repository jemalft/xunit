##### Unit test using TestNG as a testing framework

Hamcrest is a framework for software tests. Hamcrest allows checking for conditions in your code via existing matchers classes. It also allows you to define your custom matcher implementations.

To use Hamcrest matchers in JUnit you use the assertThat statement followed by one or several matchers.

Hamcrest is typically viewed as a third generation matcher framework. The first generation used assert(logical statement) but such tests were not easily readable. The second generation introduced special methods for assertions, e.g., assertEquals(). This approach leads to lots of assert methods. Hamcrest uses assertThat method with a matcher expression to determine if the test was succesful. See Wiki on Hamcrest for more details.

Hamcrest has the target to make tests as readable as possible. For example, the is method is a thin wrapper for equalTo(value).

To make all matchers available in your file add an static import. This also makes it easier to find matchers through code completion.
````
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
````
##### The following are the most important Hamcrest matchers:

- allOf - matches if all matchers match (short circuits)

- anyOf - matches if any matchers match (short circuits)

- not - matches if the wrapped matcher doesn’t match and vice

- equalTo - test object equality using the equals method

- is - decorator for equalTo to improve readability

- hasToString - test Object.toString

- instanceOf, isCompatibleType - test type

- notNullValue, nullValue - test for null

- sameInstance - test object identity

- hasEntry, hasKey, hasValue - test a map contains an entry, key or value

- hasItem, hasItems - test a collection contains elements

- hasItemInArray - test an array contains an element

- closeTo - test floating point values are close to a given value

- greaterThan, greaterThanOrEqualTo, lessThan, lessThanOrEqualTo

- equalToIgnoringCase - test string equality ignoring case

- equalToIgnoringWhiteSpace - test string equality ignoring differences in runs of whitespace

- containsString, endsWith, startsWith - test string matching