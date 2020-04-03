package com.features.textblocks;

class Differences {

    public static void main(String[] args) {
        //before the text blocks
        String html = "<html>\n" +
                      "    <body>\n" +
                      "        <p>Hello, world</p>\n" +
                      "    </body>\n" +
                      "</html>\n";
        System.out.println(html);

        //after the text blocks
        String htmlNew = """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
        //the results are equal.
        System.out.println(htmlNew);

        //before the text blocks
        String sql = "SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`\n" +
                     "WHERE `CITY` = 'BRACO_DO_NORTE'\n" +
                     "ORDER BY `EMP_ID`, `LAST_NAME`;\n";

        System.out.println(sql);

        //after the text blocks
        String sqlNew = """
               SELECT `EMP_ID`, `LAST_NAME` FROM `EMPLOYEE_TB`
               WHERE `CITY` = 'BRACO_DO_NORTE'
               ORDER BY `EMP_ID`, `LAST_NAME`;

               """;

        //the results are equal.
        System.out.println(sqlNew);

        //before the text blocks
        String linesOld = "\nline1\nline2\nline3\n";
        System.out.println(linesOld);

        String concatOld = "line 1\n" +
                           "line 2\n" +
                           "line 3\n";
        System.out.println(concatOld);

        //after the text blocks
        String linesNew = """
                   line1
                   line2
                   line3 """;

        //the results are equal.
        System.out.println(linesNew);

        //before text block, to insert a empty line at the end of the text you used to need to use a delimiter.
        String insertLineOld = "My text here My text here My text here My text here.\n";
        System.out.println(insertLineOld);

        //after text block, you just need to closing delimiter a line after the text.
        String insertLineNew = """
                    My text here My text here My text here.
                        """;
        System.out.println(insertLineNew);

        //if you don't want to insert a empty line at the end of the text, just close the delimiter after the text.
        String noEmptyLine = """
                    My text here My text here My text here.""";
        System.out.println(noEmptyLine);
    }
}
