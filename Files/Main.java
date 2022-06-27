import java.io.*;

public class Main {

  @SuppressWarnings("deprecation")
  public static void main(String argv[]) {
    for (int i = 0; i < argv.length; i++) {
      try {
        System.out.println("Scanning And Parsing File [" + argv[i] + "]");
        Lexer s = new Lexer(new FileReader(argv[i]));
        Parser p = new Parser(s);
        p.parse();
        System.out.println("Parse successful.");
      } catch (Exception e) {
        e.printStackTrace(System.err);
        System.exit(1);
      }
    }
  }
}
