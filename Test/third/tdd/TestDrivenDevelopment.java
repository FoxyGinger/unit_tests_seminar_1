package third.tdd;

import org.junit.jupiter.api.Test;
import seminars.third.tdd.MoodAnalyser;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {

    //3.5. Red-Green-Refactor
    @Test
    void testMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Это грустное сообщение");

        assertThat(mood).isEqualTo("SAD");
    }

    @Test
    void testHappyMoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Это веселое сообщение");

        assertThat(mood).isEqualTo("HAPPY");
    }
}