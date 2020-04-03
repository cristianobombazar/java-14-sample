package com.features.textblocks;

class Delimiters {

    public static void main(String[] args) {
        // Using text blocks you can use " inside of text, even if they are right after the opening delimiter or
        // right before the closing delimiter
        String text = """
                    Feel free to use the " as you want.
                    "The only rule is that you can't put three " after each other."
                    You can use use "" but not three.
                    If you want to see how you can put three " right after each, see the example below.
                    """;
        System.out.println(text);

        //to use three " right after each other, you will need to scape one ".
        // This example produces a text block inside a text block.
        String text2 = """
                  String story = \"""
                    Feel free to use the " as you want.
                    "The only rule is that you can't put three " after each other."
                    You can use use "" but not three.
                    If you want to see how you can put three " right after each, see the example below.
                  \"""; """;
        System.out.println(text2);


        //before text blocks,  it is common practice to split very long string literals into concatenations of smaller substrings,
        // and then hard wrap the resulting string expression onto multiple lines
        String longTextBefore = "Lorem ipsum dolor sit amet, consectetur adipiscing " +
                         "elit, sed do eiusmod tempor incididunt ut labore " +
                         "et dolore magna aliqua.";
        System.out.println(longTextBefore);

        //After text blocks, you can use a delimiter (\) to tell the compiler that the string should not be splited.
        String longTextAfter = """
                Lorem ipsum dolor sit amet, consectetur adipiscing \
                elit, sed do eiusmod tempor incididunt ut labore \
                et dolore magna aliqua.\
                """;
        //the results are equal.
        System.out.println(longTextAfter);


        //The compiler ignores all trailing spaces in text blocks, so if we need to put some spaces in the right we need to use
        // a character to scape. We need to use \s.
        String textWithTrailingSpaces = """
                    My text with trailing spaces     \s is cool.
                """;
        System.out.println(textWithTrailingSpaces);

        // the first "line 1"  will not have trailing spaces, but the second "line 2" will have trailing spaces.
        String anotherExampleTrailingSpaces =  """
            line 1
            line 2       \s
            """;
        System.out.println(anotherExampleTrailingSpaces);
    }
}
