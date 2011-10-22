// $ANTLR 3.4 /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g 2011-10-22 14:18:01

  package org.kevinmorris.coldfront;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ColdfrontLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int ADDRESS=4;
    public static final int ALPHA=5;
    public static final int COORDINATE=6;
    public static final int DATE=7;
    public static final int TIME=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ColdfrontLexer() {} 
    public ColdfrontLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ColdfrontLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g"; }

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:11:6: ( ' ' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:11:8: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:12:7: ( '(' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:13:7: ( ')' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:14:7: ( ',' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:15:7: ( '@{' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:15:9: '@{'
            {
            match("@{"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:16:7: ( '^' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:16:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:17:7: ( '}' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:39:6: ( ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) '\\.' ( '0' .. '1' ) ( '0' .. '9' ) '\\.' ( '0' .. '3' ) ( '0' .. '9' ) )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:39:8: ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) ( '0' .. '9' ) '\\.' ( '0' .. '1' ) ( '0' .. '9' ) '\\.' ( '0' .. '3' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('.'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('.'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "TIME"
    public final void mTIME() throws RecognitionException {
        try {
            int _type = TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:40:6: ( ( '0' .. '2' ) ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' ) )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:40:8: ( '0' .. '2' ) ( '0' .. '9' ) ':' ( '0' .. '5' ) ( '0' .. '9' )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '2') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match(':'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '5') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIME"

    // $ANTLR start "COORDINATE"
    public final void mCOORDINATE() throws RecognitionException {
        try {
            int _type = COORDINATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:11: ( ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:13: ( '-' )? ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:13: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:13: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:18: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:30: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:31: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:43:35: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COORDINATE"

    // $ANTLR start "ADDRESS"
    public final void mADDRESS() throws RecognitionException {
        try {
            int _type = ADDRESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:44:9: ( '{' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | ',' )+ '}' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:44:11: '{' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | ',' )+ '}'
            {
            match('{'); 

            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:44:15: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ' ' | ',' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==' '||LA5_0==','||(LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:
            	    {
            	    if ( input.LA(1)==' '||input.LA(1)==','||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADDRESS"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            int _type = ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:45:9: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:45:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:45:11: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA"

    public void mTokens() throws RecognitionException {
        // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | DATE | TIME | COORDINATE | ADDRESS | ALPHA )
        int alt7=12;
        switch ( input.LA(1) ) {
        case ' ':
            {
            alt7=1;
            }
            break;
        case '(':
            {
            alt7=2;
            }
            break;
        case ')':
            {
            alt7=3;
            }
            break;
        case ',':
            {
            alt7=4;
            }
            break;
        case '@':
            {
            alt7=5;
            }
            break;
        case '^':
            {
            alt7=6;
            }
            break;
        case '}':
            {
            alt7=7;
            }
            break;
        case '0':
        case '1':
        case '2':
            {
            int LA7_8 = input.LA(2);

            if ( ((LA7_8 >= '0' && LA7_8 <= '9')) ) {
                switch ( input.LA(3) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    int LA7_15 = input.LA(4);

                    if ( ((LA7_15 >= '0' && LA7_15 <= '9')) ) {
                        int LA7_17 = input.LA(5);

                        if ( (LA7_17=='.') ) {
                            int LA7_18 = input.LA(6);

                            if ( ((LA7_18 >= '0' && LA7_18 <= '1')) ) {
                                int LA7_19 = input.LA(7);

                                if ( ((LA7_19 >= '0' && LA7_19 <= '9')) ) {
                                    int LA7_20 = input.LA(8);

                                    if ( (LA7_20=='.') ) {
                                        alt7=8;
                                    }
                                    else {
                                        alt7=10;
                                    }
                                }
                                else {
                                    alt7=10;
                                }
                            }
                            else if ( ((LA7_18 >= '2' && LA7_18 <= '9')) ) {
                                alt7=10;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            alt7=10;
                        }
                    }
                    else {
                        alt7=10;
                    }
                    }
                    break;
                case ':':
                    {
                    alt7=9;
                    }
                    break;
                default:
                    alt7=10;
                }

            }
            else {
                alt7=10;
            }
            }
            break;
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            int LA7_9 = input.LA(2);

            if ( ((LA7_9 >= '0' && LA7_9 <= '9')) ) {
                int LA7_14 = input.LA(3);

                if ( ((LA7_14 >= '0' && LA7_14 <= '9')) ) {
                    int LA7_15 = input.LA(4);

                    if ( ((LA7_15 >= '0' && LA7_15 <= '9')) ) {
                        int LA7_17 = input.LA(5);

                        if ( (LA7_17=='.') ) {
                            int LA7_18 = input.LA(6);

                            if ( ((LA7_18 >= '0' && LA7_18 <= '1')) ) {
                                int LA7_19 = input.LA(7);

                                if ( ((LA7_19 >= '0' && LA7_19 <= '9')) ) {
                                    int LA7_20 = input.LA(8);

                                    if ( (LA7_20=='.') ) {
                                        alt7=8;
                                    }
                                    else {
                                        alt7=10;
                                    }
                                }
                                else {
                                    alt7=10;
                                }
                            }
                            else if ( ((LA7_18 >= '2' && LA7_18 <= '9')) ) {
                                alt7=10;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 18, input);

                                throw nvae;

                            }
                        }
                        else {
                            alt7=10;
                        }
                    }
                    else {
                        alt7=10;
                    }
                }
                else {
                    alt7=10;
                }
            }
            else {
                alt7=10;
            }
            }
            break;
        case '-':
            {
            alt7=10;
            }
            break;
        case '{':
            {
            alt7=11;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt7=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:10: T__9
                {
                mT__9(); 


                }
                break;
            case 2 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:15: T__10
                {
                mT__10(); 


                }
                break;
            case 3 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:21: T__11
                {
                mT__11(); 


                }
                break;
            case 4 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:27: T__12
                {
                mT__12(); 


                }
                break;
            case 5 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:33: T__13
                {
                mT__13(); 


                }
                break;
            case 6 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:39: T__14
                {
                mT__14(); 


                }
                break;
            case 7 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:45: T__15
                {
                mT__15(); 


                }
                break;
            case 8 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:51: DATE
                {
                mDATE(); 


                }
                break;
            case 9 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:56: TIME
                {
                mTIME(); 


                }
                break;
            case 10 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:61: COORDINATE
                {
                mCOORDINATE(); 


                }
                break;
            case 11 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:72: ADDRESS
                {
                mADDRESS(); 


                }
                break;
            case 12 :
                // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:1:80: ALPHA
                {
                mALPHA(); 


                }
                break;

        }

    }


 

}