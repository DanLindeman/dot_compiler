/* This file was generated by SableCC (http://www.sablecc.org/). */

package dot.lexer;

import java.io.*;
import dot.node.*;

@SuppressWarnings("nls")
public class Lexer
{
    protected Token token;
    protected State state = State.INITIAL;

    private IPushbackReader in;
    private int line;
    private int pos;
    private boolean cr;
    private boolean eof;
    private final StringBuffer text = new StringBuffer();

    @SuppressWarnings("unused")
    protected void filter() throws LexerException, IOException
    {
        // Do nothing
    }

    public Lexer(@SuppressWarnings("hiding") final PushbackReader in)
    {
        this.in = new IPushbackReader() {

            private PushbackReader pushbackReader = in;
            
            @Override
            public void unread(int c) throws IOException {
                pushbackReader.unread(c);
            }
            
            @Override
            public int read() throws IOException {
                return pushbackReader.read();
            }
        };
    }
 
    public Lexer(@SuppressWarnings("hiding") IPushbackReader in)
    {
        this.in = in;
    }
 
    public Token peek() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        return this.token;
    }

    public Token next() throws LexerException, IOException
    {
        while(this.token == null)
        {
            this.token = getToken();
            filter();
        }

        Token result = this.token;
        this.token = null;
        return result;
    }

    protected Token getToken() throws IOException, LexerException
    {
        int dfa_state = 0;

        int start_pos = this.pos;
        int start_line = this.line;

        int accept_state = -1;
        int accept_token = -1;
        int accept_length = -1;
        int accept_pos = -1;
        int accept_line = -1;

        @SuppressWarnings("hiding") int[][][] gotoTable = Lexer.gotoTable[this.state.id()];
        @SuppressWarnings("hiding") int[] accept = Lexer.accept[this.state.id()];
        this.text.setLength(0);

        while(true)
        {
            int c = getChar();

            if(c != -1)
            {
                switch(c)
                {
                case 10:
                    if(this.cr)
                    {
                        this.cr = false;
                    }
                    else
                    {
                        this.line++;
                        this.pos = 0;
                    }
                    break;
                case 13:
                    this.line++;
                    this.pos = 0;
                    this.cr = true;
                    break;
                default:
                    this.pos++;
                    this.cr = false;
                    break;
                }

                this.text.append((char) c);

                do
                {
                    int oldState = (dfa_state < -1) ? (-2 -dfa_state) : dfa_state;

                    dfa_state = -1;

                    int[][] tmp1 =  gotoTable[oldState];
                    int low = 0;
                    int high = tmp1.length - 1;

                    while(low <= high)
                    {
                        // int middle = (low + high) / 2;
                        int middle = (low + high) >>> 1;
                        int[] tmp2 = tmp1[middle];

                        if(c < tmp2[0])
                        {
                            high = middle - 1;
                        }
                        else if(c > tmp2[1])
                        {
                            low = middle + 1;
                        }
                        else
                        {
                            dfa_state = tmp2[2];
                            break;
                        }
                    }
                }while(dfa_state < -1);
            }
            else
            {
                dfa_state = -1;
            }

            if(dfa_state >= 0)
            {
                if(accept[dfa_state] != -1)
                {
                    accept_state = dfa_state;
                    accept_token = accept[dfa_state];
                    accept_length = this.text.length();
                    accept_pos = this.pos;
                    accept_line = this.line;
                }
            }
            else
            {
                if(accept_state != -1)
                {
                    switch(accept_token)
                    {
                    case 0:
                        {
                            @SuppressWarnings("hiding") Token token = new0(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 1:
                        {
                            @SuppressWarnings("hiding") Token token = new1(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 2:
                        {
                            @SuppressWarnings("hiding") Token token = new2(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 3:
                        {
                            @SuppressWarnings("hiding") Token token = new3(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 4:
                        {
                            @SuppressWarnings("hiding") Token token = new4(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 5:
                        {
                            @SuppressWarnings("hiding") Token token = new5(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 6:
                        {
                            @SuppressWarnings("hiding") Token token = new6(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 7:
                        {
                            @SuppressWarnings("hiding") Token token = new7(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 8:
                        {
                            @SuppressWarnings("hiding") Token token = new8(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 9:
                        {
                            @SuppressWarnings("hiding") Token token = new9(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 10:
                        {
                            @SuppressWarnings("hiding") Token token = new10(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 11:
                        {
                            @SuppressWarnings("hiding") Token token = new11(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 12:
                        {
                            @SuppressWarnings("hiding") Token token = new12(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 13:
                        {
                            @SuppressWarnings("hiding") Token token = new13(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 14:
                        {
                            @SuppressWarnings("hiding") Token token = new14(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 15:
                        {
                            @SuppressWarnings("hiding") Token token = new15(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 16:
                        {
                            @SuppressWarnings("hiding") Token token = new16(
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 17:
                        {
                            @SuppressWarnings("hiding") Token token = new17(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 18:
                        {
                            @SuppressWarnings("hiding") Token token = new18(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 19:
                        {
                            @SuppressWarnings("hiding") Token token = new19(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 20:
                        {
                            @SuppressWarnings("hiding") Token token = new20(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    case 21:
                        {
                            @SuppressWarnings("hiding") Token token = new21(
                                getText(accept_length),
                                start_line + 1,
                                start_pos + 1);
                            pushBack(accept_length);
                            this.pos = accept_pos;
                            this.line = accept_line;
                            return token;
                        }
                    }
                }
                else
                {
                    if(this.text.length() > 0)
                    {
                        throw new LexerException(
                            new InvalidToken(this.text.substring(0, 1), start_line + 1, start_pos + 1),
                            "[" + (start_line + 1) + "," + (start_pos + 1) + "]" +
                            " Unknown token: " + this.text);
                    }

                    @SuppressWarnings("hiding") EOF token = new EOF(
                        start_line + 1,
                        start_pos + 1);
                    return token;
                }
            }
        }
    }

    Token new0(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEquals(line, pos); }
    Token new1(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSemicolon(line, pos); }
    Token new2(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TColon(line, pos); }
    Token new3(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComma(line, pos); }
    Token new4(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLCb(line, pos); }
    Token new5(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRCb(line, pos); }
    Token new6(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TLBr(line, pos); }
    Token new7(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TRBr(line, pos); }
    Token new8(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TQuote(line, pos); }
    Token new9(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDirectedEdge(line, pos); }
    Token new10(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TUndirectedEdge(line, pos); }
    Token new11(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TStrict(line, pos); }
    Token new12(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TDigraph(line, pos); }
    Token new13(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TSubgraph(line, pos); }
    Token new14(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TGraph(line, pos); }
    Token new15(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNode(line, pos); }
    Token new16(@SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEdge(line, pos); }
    Token new17(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TComment(text, line, pos); }
    Token new18(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TEol(text, line, pos); }
    Token new19(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TBlank(text, line, pos); }
    Token new20(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TNumber(text, line, pos); }
    Token new21(@SuppressWarnings("hiding") String text, @SuppressWarnings("hiding") int line, @SuppressWarnings("hiding") int pos) { return new TId(text, line, pos); }

    private int getChar() throws IOException
    {
        if(this.eof)
        {
            return -1;
        }

        int result = this.in.read();

        if(result == -1)
        {
            this.eof = true;
        }

        return result;
    }

    private void pushBack(int acceptLength) throws IOException
    {
        int length = this.text.length();
        for(int i = length - 1; i >= acceptLength; i--)
        {
            this.eof = false;

            this.in.unread(this.text.charAt(i));
        }
    }

    protected void unread(@SuppressWarnings("hiding") Token token) throws IOException
    {
        @SuppressWarnings("hiding") String text = token.getText();
        int length = text.length();

        for(int i = length - 1; i >= 0; i--)
        {
            this.eof = false;

            this.in.unread(text.charAt(i));
        }

        this.pos = token.getPos() - 1;
        this.line = token.getLine() - 1;
    }

    private String getText(int acceptLength)
    {
        StringBuffer s = new StringBuffer(acceptLength);
        for(int i = 0; i < acceptLength; i++)
        {
            s.append(this.text.charAt(i));
        }

        return s.toString();
    }

    private static int[][][][] gotoTable;
/*  {
        { // INITIAL
            {{9, 9, 1}, {10, 10, 2}, {13, 13, 3}, {32, 32, 4}, {34, 34, 5}, {44, 44, 6}, {45, 45, 7}, {47, 47, 8}, {48, 48, 9}, {49, 57, 10}, {58, 58, 11}, {59, 59, 12}, {61, 61, 13}, {65, 90, 14}, {91, 91, 15}, {93, 93, 16}, {95, 95, 17}, {97, 99, 18}, {100, 100, 19}, {101, 101, 20}, {102, 102, 18}, {103, 103, 21}, {104, 109, 18}, {110, 110, 22}, {111, 114, 18}, {115, 115, 23}, {116, 122, 18}, {123, 123, 24}, {125, 125, 25}, },
            {{9, 9, 1}, {10, 10, 26}, {13, 13, 27}, {32, 32, 4}, },
            {{9, 32, -3}, },
            {{9, 9, 1}, {10, 10, 28}, {13, 32, -3}, },
            {{9, 32, -3}, },
            {},
            {},
            {{45, 45, 29}, {62, 62, 30}, },
            {{42, 42, 31}, {47, 47, 32}, },
            {},
            {{48, 57, 33}, },
            {},
            {},
            {},
            {{48, 57, 34}, {65, 90, 35}, {95, 95, 36}, {97, 122, 37}, },
            {},
            {},
            {{48, 122, -16}, },
            {{48, 122, -16}, },
            {{48, 95, -16}, {97, 104, 37}, {105, 105, 38}, {106, 122, 37}, },
            {{48, 95, -16}, {97, 99, 37}, {100, 100, 39}, {101, 122, 37}, },
            {{48, 95, -16}, {97, 113, 37}, {114, 114, 40}, {115, 122, 37}, },
            {{48, 95, -16}, {97, 110, 37}, {111, 111, 41}, {112, 122, 37}, },
            {{48, 95, -16}, {97, 115, 37}, {116, 116, 42}, {117, 117, 43}, {118, 122, 37}, },
            {},
            {},
            {{9, 32, -3}, },
            {{9, 9, 1}, {10, 10, 44}, {13, 32, -3}, },
            {{9, 32, -3}, },
            {},
            {},
            {{0, 41, 45}, {42, 42, 46}, {43, 65535, 45}, },
            {{0, 9, 47}, {10, 10, 48}, {11, 12, 47}, {13, 13, 49}, {14, 65535, 47}, },
            {{48, 57, 33}, },
            {{48, 122, -16}, },
            {{48, 122, -16}, },
            {{48, 122, -16}, },
            {{48, 122, -16}, },
            {{48, 95, -16}, {97, 102, 37}, {103, 103, 50}, {104, 122, 37}, },
            {{48, 102, -40}, {103, 103, 51}, {104, 122, 37}, },
            {{48, 95, -16}, {97, 97, 52}, {98, 122, 37}, },
            {{48, 99, -22}, {100, 100, 53}, {101, 122, 37}, },
            {{48, 113, -23}, {114, 114, 54}, {115, 122, 37}, },
            {{48, 95, -16}, {97, 97, 37}, {98, 98, 55}, {99, 122, 37}, },
            {{9, 32, -3}, },
            {{0, 65535, -33}, },
            {{0, 41, 56}, {42, 42, 46}, {43, 46, 56}, {47, 47, 57}, {48, 65535, 56}, },
            {{0, 65535, -34}, },
            {},
            {{10, 10, 58}, },
            {{48, 113, -23}, {114, 114, 59}, {115, 122, 37}, },
            {{48, 95, -16}, {97, 100, 37}, {101, 101, 60}, {102, 122, 37}, },
            {{48, 95, -16}, {97, 111, 37}, {112, 112, 61}, {113, 122, 37}, },
            {{48, 100, -53}, {101, 101, 62}, {102, 122, 37}, },
            {{48, 104, -21}, {105, 105, 63}, {106, 122, 37}, },
            {{48, 102, -40}, {103, 103, 64}, {104, 122, 37}, },
            {{0, 41, 65}, {42, 42, 66}, {43, 65535, 65}, },
            {},
            {},
            {{48, 95, -16}, {97, 97, 67}, {98, 122, 37}, },
            {{48, 122, -16}, },
            {{48, 95, -16}, {97, 103, 37}, {104, 104, 68}, {105, 122, 37}, },
            {{48, 122, -16}, },
            {{48, 95, -16}, {97, 98, 37}, {99, 99, 69}, {100, 122, 37}, },
            {{48, 113, -23}, {114, 114, 70}, {115, 122, 37}, },
            {{0, 65535, -58}, },
            {{0, 41, 56}, {42, 42, 66}, {43, 65535, -48}, },
            {{48, 111, -54}, {112, 112, 71}, {113, 122, 37}, },
            {{48, 122, -16}, },
            {{48, 115, -25}, {116, 116, 72}, {117, 122, 37}, },
            {{48, 95, -16}, {97, 97, 73}, {98, 122, 37}, },
            {{48, 103, -63}, {104, 104, 74}, {105, 122, 37}, },
            {{48, 122, -16}, },
            {{48, 111, -54}, {112, 112, 75}, {113, 122, 37}, },
            {{48, 122, -16}, },
            {{48, 103, -63}, {104, 104, 76}, {105, 122, 37}, },
            {{48, 122, -16}, },
        }
    };*/

    private static int[][] accept;
/*  {
        // INITIAL
        {-1, 19, 18, 18, 19, 8, 3, -1, -1, 20, 20, 2, 1, 0, 21, 6, 7, 21, 21, 21, 21, 21, 21, 21, 4, 5, 19, 19, 18, 10, 9, -1, -1, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 19, -1, -1, -1, 17, 17, 21, 21, 21, 21, 21, 21, -1, 17, 17, 21, 16, 21, 15, 21, 21, -1, -1, 21, 14, 21, 21, 21, 11, 21, 12, 21, 13, },

    };*/

    public static class State
    {
        public final static State INITIAL = new State(0);

        private int id;

        private State(@SuppressWarnings("hiding") int id)
        {
            this.id = id;
        }

        public int id()
        {
            return this.id;
        }
    }

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Lexer.class.getResourceAsStream("lexer.dat")));

            // read gotoTable
            int length = s.readInt();
            gotoTable = new int[length][][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][][];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                    length = s.readInt();
                    gotoTable[i][j] = new int[length][3];
                    for(int k = 0; k < gotoTable[i][j].length; k++)
                    {
                        for(int l = 0; l < 3; l++)
                        {
                            gotoTable[i][j][k][l] = s.readInt();
                        }
                    }
                }
            }

            // read accept
            length = s.readInt();
            accept = new int[length][];
            for(int i = 0; i < accept.length; i++)
            {
                length = s.readInt();
                accept[i] = new int[length];
                for(int j = 0; j < accept[i].length; j++)
                {
                    accept[i][j] = s.readInt();
                }
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"lexer.dat\" is either missing or corrupted.");
        }
    }
}
