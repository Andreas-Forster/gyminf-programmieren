
import edu.illinois.cs.cs125.gradlegrader.annotations.Graded;
import edu.illinois.cs.cs125.gradlegrader.annotations.Tag;
import org.junit.Test;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CommentsTests {


    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "SimpleLineComments")
    public void testLineComments() {

        String program1 = "// System.out.println(\"hello world\"); ";
        assertProgramEquals("", Comments.removeComments(program1));

        String program2Expected = "System.out.println(\"hello world\"); ";
        String program2 = "System.out.println(\"hello world\"); // a comment";
        assertProgramEquals(program2Expected, Comments.removeComments(program2));

    }

    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "SimpleNestedComments")
    public void testMultilineComments() {
    
        String program1Expected = "System.out.println(\"hello world\")  ;";
        String program1 = "System.out.println(\"hello world\") /* a comment */ ;";

        String program2Expected = "System.out.println(\"hello world\"); \n ";
        String program2 = "System.out.println(\"hello world\"); \n /* System.out.println(\"line 2\"); \n System.out.println(\"line 3\");*/";

        assertProgramEquals(program1Expected, Comments.removeComments(program1));
        assertProgramEquals(program2Expected, Comments.removeComments(program2));
    }



    @Test(timeout = 1000)
    @Graded(points = 1)
    @Tag(name = "difficulty", value = "simple")
    @Tag(name = "function", value = "complexProgram")
    public void testComplexProgram() {

        try {
            String javaFileCommented = readFile("src/test/resources/TestProgram1Commented.java");
            String javaFile = readFile("src/test/resources/TestProgram1.java");
            assertProgramEquals(javaFile, Comments.removeComments(javaFileCommented));
        } catch (Exception e) { 
            System.err.println(e.getMessage());
        }
    }


    private void assertProgramEquals(String expectedOutput, String givenProgram) {
        

         assertEquals(removeAllWhitespace(expectedOutput), removeAllWhitespace(givenProgram));
         assertEquals(countNonEmptyLines(expectedOutput), countNonEmptyLines(givenProgram));
    }


    private static String removeAllWhitespace(String s) {
        return s.replaceAll("\\s+","");        
    }

    private static int countNonEmptyLines(String s) {
        int numLines = 0;
        Scanner scanner = new Scanner(s);
        
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            line = line.trim();
            if(line.length() > 0) {
                numLines += 1;
            }
        }
    
        return numLines;
    }
 

    static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded,  StandardCharsets.UTF_8);
    }
}
