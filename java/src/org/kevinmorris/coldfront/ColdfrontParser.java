// $ANTLR 3.4 /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g 2011-10-22 14:18:00

  package org.kevinmorris.coldfront;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ColdfrontParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDRESS", "ALPHA", "COORDINATE", "DATE", "TIME", "' '", "'('", "')'", "','", "'@{'", "'^'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ColdfrontParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ColdfrontParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return ColdfrontParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g"; }


    protected static class statement_scope {
        ColdfrontEngine engine;
    }
    protected Stack statement_stack = new Stack();



    // $ANTLR start "statement"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:15:1: statement[Engine inEngine] returns [Engine retEngine] : location data_description ;
    public final ColdfrontEngine statement(ColdfrontEngine inEngine) throws RecognitionException {
        statement_stack.push(new statement_scope());
        ColdfrontEngine retEngine = null;



          ((statement_scope)statement_stack.peek()).engine = (inEngine == null) ? new ColdfrontEngine() : inEngine;

        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:25:3: ( location data_description )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:25:3: location data_description
            {
            pushFollow(FOLLOW_location_in_statement59);
            location();

            state._fsp--;


            pushFollow(FOLLOW_data_description_in_statement61);
            data_description();

            state._fsp--;


            }


              retEngine = ((statement_scope)statement_stack.peek()).engine;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            statement_stack.pop();
        }
        return retEngine;
    }
    // $ANTLR end "statement"



    // $ANTLR start "location"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:27:1: location : '(' ( latlon | address ) ')' ;
    public final void location() throws RecognitionException {
        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:27:10: ( '(' ( latlon | address ) ')' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:27:12: '(' ( latlon | address ) ')'
            {
            match(input,10,FOLLOW_10_in_location69); 

            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:27:16: ( latlon | address )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==COORDINATE) ) {
                alt1=1;
            }
            else if ( (LA1_0==ADDRESS) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:27:17: latlon
                    {
                    pushFollow(FOLLOW_latlon_in_location72);
                    latlon();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:27:26: address
                    {
                    pushFollow(FOLLOW_address_in_location76);
                    address();

                    state._fsp--;


                    }
                    break;

            }


            match(input,11,FOLLOW_11_in_location79); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "location"



    // $ANTLR start "address"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:28:1: address : ADDRESS ;
    public final void address() throws RecognitionException {
        Token ADDRESS1=null;

        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:28:9: ( ADDRESS )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:28:11: ADDRESS
            {
            ADDRESS1=(Token)match(input,ADDRESS,FOLLOW_ADDRESS_in_address89); 

             ((statement_scope)statement_stack.peek()).engine.setLocation(ADDRESS1.getText().substring(1, ADDRESS1.getText().length() - 1)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "address"


    public static class latlon_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "latlon"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:1: latlon : ( COORDINATE ',' ( ' ' )* COORDINATE ) ;
    public final ColdfrontParser.latlon_return latlon() throws RecognitionException {
        ColdfrontParser.latlon_return retval = new ColdfrontParser.latlon_return();
        retval.start = input.LT(1);


        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:8: ( ( COORDINATE ',' ( ' ' )* COORDINATE ) )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:10: ( COORDINATE ',' ( ' ' )* COORDINATE )
            {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:10: ( COORDINATE ',' ( ' ' )* COORDINATE )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:11: COORDINATE ',' ( ' ' )* COORDINATE
            {
            match(input,COORDINATE,FOLLOW_COORDINATE_in_latlon100); 

            match(input,12,FOLLOW_12_in_latlon102); 

            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:26: ( ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==9) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:29:26: ' '
            	    {
            	    match(input,9,FOLLOW_9_in_latlon104); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,COORDINATE,FOLLOW_COORDINATE_in_latlon107); 

            }


             ((statement_scope)statement_stack.peek()).engine.setLocation(input.toString(retval.start,input.LT(-1))); 

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "latlon"



    // $ANTLR start "data_description"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:31:1: data_description : ( ( datetime datatype ) | ( datatype datetime ) );
    public final void data_description() throws RecognitionException {
        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:31:18: ( ( datetime datatype ) | ( datatype datetime ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:32:3: ( datetime datatype )
                    {
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:32:3: ( datetime datatype )
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:32:4: datetime datatype
                    {
                    pushFollow(FOLLOW_datetime_in_data_description122);
                    datetime();

                    state._fsp--;


                    pushFollow(FOLLOW_datatype_in_data_description124);
                    datatype();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:33:3: ( datatype datetime )
                    {
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:33:3: ( datatype datetime )
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:33:4: datatype datetime
                    {
                    pushFollow(FOLLOW_datatype_in_data_description130);
                    datatype();

                    state._fsp--;


                    pushFollow(FOLLOW_datetime_in_data_description132);
                    datetime();

                    state._fsp--;


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "data_description"



    // $ANTLR start "datetime"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:1: datetime : '@{' DATE ( ( ' ' )+ TIME )? '}' ;
    public final void datetime() throws RecognitionException {
        Token DATE2=null;
        Token TIME3=null;

        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:9: ( '@{' DATE ( ( ' ' )+ TIME )? '}' )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:11: '@{' DATE ( ( ' ' )+ TIME )? '}'
            {
            match(input,13,FOLLOW_13_in_datetime142); 

            DATE2=(Token)match(input,DATE,FOLLOW_DATE_in_datetime144); 

            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:21: ( ( ' ' )+ TIME )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==9) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:22: ( ' ' )+ TIME
                    {
                    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:22: ( ' ' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==9) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:36:22: ' '
                    	    {
                    	    match(input,9,FOLLOW_9_in_datetime147); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    TIME3=(Token)match(input,TIME,FOLLOW_TIME_in_datetime150); 

                    }
                    break;

            }


            match(input,15,FOLLOW_15_in_datetime154); 

             ((statement_scope)statement_stack.peek()).engine.setDateTime((DATE2!=null?DATE2.getText():null), (TIME3!=null?TIME3.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "datetime"



    // $ANTLR start "datatype"
    // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:37:1: datatype : '^' atom= ALPHA ;
    public final void datatype() throws RecognitionException {
        Token atom=null;

        try {
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:37:9: ( '^' atom= ALPHA )
            // /Users/kmorris511/Dropbox/apps/coldfront/java/src/org/kevinmorris/coldfront/Coldfront.g:37:11: '^' atom= ALPHA
            {
            match(input,14,FOLLOW_14_in_datatype162); 

            atom=(Token)match(input,ALPHA,FOLLOW_ALPHA_in_datatype166); 

             ((statement_scope)statement_stack.peek()).engine.setDataType((atom!=null?atom.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "datatype"

    // Delegated rules


 

    public static final BitSet FOLLOW_location_in_statement59 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_data_description_in_statement61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_location69 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_latlon_in_location72 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_address_in_location76 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_location79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADDRESS_in_address89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COORDINATE_in_latlon100 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_latlon102 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_9_in_latlon104 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COORDINATE_in_latlon107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datetime_in_data_description122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_datatype_in_data_description124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_data_description130 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_datetime_in_data_description132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_datetime142 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_DATE_in_datetime144 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_9_in_datetime147 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_TIME_in_datetime150 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_datetime154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_datatype162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ALPHA_in_datatype166 = new BitSet(new long[]{0x0000000000000002L});

}