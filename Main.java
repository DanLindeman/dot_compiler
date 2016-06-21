
import dot.lexer.Lexer;
import dot.node.*;
import dot.parser.Parser;
import dot.analysis.DepthFirstAdapter;
import java.io.*;
import java.util.LinkedList;
import java.util.List;


public class Main
{
    public static void main(String[] arguments)
    {
        try
        {

            InputStream ips = new FileInputStream(arguments[0]);
            InputStreamReader isr = new InputStreamReader(ips);
            PushbackReader pbr = new PushbackReader(isr, 1024);
            Lexer lexer = new Lexer(pbr);
//            while(lexer.next() != null)
//            {
//                System.out.println(lexer.peek());
//            }
            Parser p = new Parser(lexer);
            Start s = p.parse();
            s.apply(new DotEvaluator());
            System.out.println(s);
        }
        catch(Exception e)
        {
          System.out.println(e.getMessage());
        }
    }
}