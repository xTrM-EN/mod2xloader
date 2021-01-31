package me.xtrm.mod2xloader.test.util;

import me.xtrm.mod2xloader.util.SemVersion;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Tests related to the {@link SemVersion} utility class.
 *
 * @author github.com/brianguertin
 * See <a href="https://gist.github.com/brianguertin/ada4b65c6d1c4f6d3eee3c12b6ce021b">source</a>
 */
public class VersionTest {
    @Test
    public void newInstance_withTwoDotRelease_isParsedCorrectly() {
        final SemVersion version = new SemVersion("1.26.6");
        assertThat(version.numbers, is(new int[]{1, 26, 6}));
    }

    @Test
    public void newInstance_withTwoDotReleaseAndPreReleaseName_isParsedCorrectly() {
        final SemVersion version = new SemVersion("1.26.6-DEBUG");
        assertThat(version.numbers, is(new int[]{1, 26, 6}));
    }

    @Test
    public void compareTo_withEarlierVersion_isGreaterThan() {
        assertThat(new SemVersion("2.0.0").compareTo(new SemVersion("1.0.0")), is(1));
    }

    @Test
    public void compareTo_withSameVersion_isEqual() {
        assertThat(new SemVersion("2.0.0").compareTo(new SemVersion("2.0.0")), is(0));
    }

    @Test
    public void compareTo_withLaterVersion_isLessThan() {
        assertThat(new SemVersion("1.0.0").compareTo(new SemVersion("2.0.0")), is(-1));
    }

    @Test
    public void compareTo_withMorePreciseSameVersion_isFalse() {
        assertThat(new SemVersion("1").compareTo(new SemVersion("1.0.0")), is(0));
    }

    @Test
    public void compareTo_withMorePreciseEarlierVersion_isFalse() {
        assertThat(new SemVersion("2").compareTo(new SemVersion("1.0.0")), is(1));
    }

    @Test
    public void compareTo_withMorePreciseLaterVersion_isLessThan() {
        assertThat(new SemVersion("1").compareTo(new SemVersion("1.0.1")), is(-1));
    }
}