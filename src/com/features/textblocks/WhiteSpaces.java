package com.features.textblocks;

class WhiteSpaces {

    public static void main(String[] args) {
        // The position of the opening """ characters has no effect on the algorithm,
        // but the position of the closing """ characters does have an effect if placed on its own line.

        //the example below will produce empty spaces before each tag, because the closing delimiters
        //are positioned before the text, so the compiler understand that the white spaces should be included.
        String whiteSpace = """
                    <h1>Java 14</h1>
                    <p>Hello World!</p>
                """;
        System.out.println(whiteSpace);

        //but if you move the closing delimiters to after the first text, the compiler will understand
        //that you don't want any white space before the tags.
        String withoutSpace = """
                    <h1>Java 14</h1>
                    <p>Hello World!</p>
                        """;
        System.out.println(withoutSpace);


        //you also can put some external values inside the text blocks.
        double value = 10.0;

        //you can use the new method String.formatted.
        String withValueFormatted = """
                           The value is %s """.formatted(value);
        System.out.println(withValueFormatted);

        //or you can use the old way.
        // Note: Since the compiler ignore all the trailing spaces, we need to put the character space \s to tell
        //the compiler to not ignore the white space. If we do not use the \s the result will look like 'The value is10.0'
        String withValue = """
                              The value is\s"""+ value +"""
                           """;
        System.out.println(withValue);
    }

}
