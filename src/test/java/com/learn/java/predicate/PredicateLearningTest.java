package com.learn.java.predicate;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.learn.java.predicate.ApplePredicates.GREEN_APPLE_PREDICATE;
import static org.junit.Assert.assertEquals;

public class PredicateLearningTest {

    private PredicateLearning service = new PredicateLearning();

    @Test
    public void shouldFilterGreenApples() {
        List<Apple> apples = Arrays.asList(
                new Apple(1, AppleColor.GREEN),
                new Apple(1, AppleColor.YELLOW),
                new Apple(1, AppleColor.GREEN)
        );

        List<Apple> filtered = service.filter(apples, GREEN_APPLE_PREDICATE);
        assertEquals(filtered.size(), 2L);
        assertEquals(filtered.get(0), new Apple(1, AppleColor.GREEN));
        // todo
        // implement equals
        // do dont duplicate apple object creation,just create it once and pass both
        // and use some list equals assert
    }

}