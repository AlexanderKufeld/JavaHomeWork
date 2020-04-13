package com.wordtransformer;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class WordsTransformerTest {

    @Test
    public void testWordsTransformer() {
        String input = "aaa BC de FGH bce EF";
        WordsTransformer wt = new WordsTransformer();
        WordsChecker wc1 = new ToUpperCaseChecker();
        String expected = wt.transform(input, wc1);//"AAA BC de FGH BCE EF";
        assertEquals(expected.length(), input.length());


    }

    @Test
    public void testWordTransformer1() {
        WordsTransformer wt = new WordsTransformer();
        WordsChecker wc2 = new ToLowerCaseChecker();
        String actual = "aaa BC de FGH bce EF";
        String expected = wt.transform(actual, wc2);//"aaa bc de FGH bce ef"
        assertEquals(expected.length(), actual.length());
    }
}


