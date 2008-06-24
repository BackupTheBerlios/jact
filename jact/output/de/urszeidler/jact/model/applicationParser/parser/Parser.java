/* This file was generated by SableCC (http://www.sablecc.org/). */

package de.urszeidler.jact.model.applicationParser.parser;

import de.urszeidler.jact.model.applicationParser.lexer.*;
import de.urszeidler.jact.model.applicationParser.node.*;
import de.urszeidler.jact.model.applicationParser.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList nodeList;

    private final Lexer lexer;
    private final ListIterator stack = new LinkedList().listIterator();
    private int last_shift;
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(Lexer lexer)
    {
        this.lexer = lexer;

        if(actionTable == null)
        {
            try
            {
                DataInputStream s = new DataInputStream(
                    new BufferedInputStream(
                    Parser.class.getResourceAsStream("parser.dat")));

                // read actionTable
                int length = s.readInt();
                actionTable = new int[length][][];
                for(int i = 0; i < actionTable.length; i++)
                {
                    length = s.readInt();
                    actionTable[i] = new int[length][3];
                    for(int j = 0; j < actionTable[i].length; j++)
                    {
                        for(int k = 0; k < 3; k++)
                        {
                            actionTable[i][j][k] = s.readInt();
                        }
                    }
                }

                // read gotoTable
                length = s.readInt();
                gotoTable = new int[length][][];
                for(int i = 0; i < gotoTable.length; i++)
                {
                    length = s.readInt();
                    gotoTable[i] = new int[length][2];
                    for(int j = 0; j < gotoTable[i].length; j++)
                    {
                        for(int k = 0; k < 2; k++)
                        {
                            gotoTable[i][j][k] = s.readInt();
                        }
                    }
                }

                // read errorMessages
                length = s.readInt();
                errorMessages = new String[length];
                for(int i = 0; i < errorMessages.length; i++)
                {
                    length = s.readInt();
                    StringBuffer buffer = new StringBuffer();

                    for(int j = 0; j < length; j++)
                    {
                        buffer.append(s.readChar());
                    }
                    errorMessages[i] = buffer.toString();
                }

                // read errors
                length = s.readInt();
                errors = new int[length];
                for(int i = 0; i < errors.length; i++)
                {
                    errors[i] = s.readInt();
                }

                s.close();
            }
            catch(Exception e)
            {
                throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
            }
        }
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private void push(int numstate, ArrayList listNode) throws ParserException, LexerException, IOException
    {
	this.nodeList = listNode;

        if(!stack.hasNext())
        {
            stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int state()
    {
        State s = (State) stack.previous();
        stack.next();
        return s.state;
    }

    private ArrayList pop()
    {
        return (ArrayList) ((State) stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        converter.index = -1;
        token.apply(converter);
        return converter.index;
    }

    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null);

        List ign = null;
        while(true)
        {
            while(index(lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new TypedLinkedList(NodeCast.instance);
                }

                ign.add(lexer.next());
            }

            if(ign != null)
            {
                ignoredTokens.setIn(lexer.peek(), ign);
                ign = null;
            }

            last_pos = lexer.peek().getPos();
            last_line = lexer.peek().getLine();
            last_token = lexer.peek();

            int index = index(lexer.peek());
            action[0] = actionTable[state()][0][1];
            action[1] = actionTable[state()][0][2];

            int low = 1;
            int high = actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    action[0] = actionTable[state()][middle][1];
                    action[1] = actionTable[state()][middle][2];
                    break;
                }
            }

            switch(action[0])
            {
                case SHIFT:
		    {
		        ArrayList list = new ArrayList();
		        list.add(lexer.next());
                        push(action[1], list);
                        last_shift = action[1];
                    }
		    break;
                case REDUCE:
                    switch(action[1])
                    {

                    case 0:
		    {
			ArrayList list = new0();
			push(goTo(0), list);
		    }
		    break;


                    case 1:
		    {
			ArrayList list = new1();
			push(goTo(1), list);
		    }
		    break;


                    case 2:
		    {
			ArrayList list = new2();
			push(goTo(1), list);
		    }
		    break;


                    case 3:
		    {
			ArrayList list = new3();
			push(goTo(1), list);
		    }
		    break;


                    case 4:
		    {
			ArrayList list = new4();
			push(goTo(2), list);
		    }
		    break;


                    case 5:
		    {
			ArrayList list = new5();
			push(goTo(3), list);
		    }
		    break;


                    case 6:
		    {
			ArrayList list = new6();
			push(goTo(4), list);
		    }
		    break;


                    case 7:
		    {
			ArrayList list = new7();
			push(goTo(4), list);
		    }
		    break;


                    case 8:
		    {
			ArrayList list = new8();
			push(goTo(4), list);
		    }
		    break;


                    case 9:
		    {
			ArrayList list = new9();
			push(goTo(4), list);
		    }
		    break;


                    case 10:
		    {
			ArrayList list = new10();
			push(goTo(5), list);
		    }
		    break;


                    case 11:
		    {
			ArrayList list = new11();
			push(goTo(6), list);
		    }
		    break;


                    case 12:
		    {
			ArrayList list = new12();
			push(goTo(7), list);
		    }
		    break;


                    case 13:
		    {
			ArrayList list = new13();
			push(goTo(7), list);
		    }
		    break;


                    case 14:
		    {
			ArrayList list = new14();
			push(goTo(7), list);
		    }
		    break;


                    case 15:
		    {
			ArrayList list = new15();
			push(goTo(7), list);
		    }
		    break;


                    case 16:
		    {
			ArrayList list = new16();
			push(goTo(7), list);
		    }
		    break;


                    case 17:
		    {
			ArrayList list = new17();
			push(goTo(8), list);
		    }
		    break;


                    case 18:
		    {
			ArrayList list = new18();
			push(goTo(8), list);
		    }
		    break;

                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) lexer.next();
                        PApp node1 = (PApp) ((ArrayList)pop()).get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(last_token,
                        "[" + last_line + "," + last_pos + "] " +
                        errorMessages[errors[action[1]]]);
            }
        }
    }



    ArrayList new0()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PApp pappNode1;
        {
        TIdentifier tidentifierNode2;
        PParalist pparalistNode3;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);
        pparalistNode3 = (PParalist)nodeArrayList2.get(0);

        pappNode1 = new AApp(tidentifierNode2, pparalistNode3);
        }
	nodeList.add(pappNode1);
        return nodeList;
    }



    ArrayList new1()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PParalist pparalistNode1;
        {
        PCommaparalist pcommaparalistNode2;
        pcommaparalistNode2 = (PCommaparalist)nodeArrayList1.get(0);

        pparalistNode1 = new ACommaparalistParalist(pcommaparalistNode2);
        }
	nodeList.add(pparalistNode1);
        return nodeList;
    }



    ArrayList new2()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PParalist pparalistNode1;
        {
        PCurrparalist pcurrparalistNode2;
        pcurrparalistNode2 = (PCurrparalist)nodeArrayList1.get(0);

        pparalistNode1 = new ACurrparalistParalist(pcurrparalistNode2);
        }
	nodeList.add(pparalistNode1);
        return nodeList;
    }



    ArrayList new3()
    {
        ArrayList nodeList = new ArrayList();

        PParalist pparalistNode1;
        {

        pparalistNode1 = new AEmptyParalist();
        }
	nodeList.add(pparalistNode1);
        return nodeList;
    }



    ArrayList new4()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PCommaparalist pcommaparalistNode1;
        {
        TComma tcommaNode2;
        TypedLinkedList listNode4 = new TypedLinkedList();
        tcommaNode2 = (TComma)nodeArrayList1.get(0);
        {
        TypedLinkedList listNode3 = new TypedLinkedList();
        listNode3 = (TypedLinkedList)nodeArrayList2.get(0);
	if(listNode3 != null)
	{
	  listNode4.addAll(listNode3);
	}
        }

        pcommaparalistNode1 = new ACommaparalist(tcommaNode2, listNode4);
        }
	nodeList.add(pcommaparalistNode1);
        return nodeList;
    }



    ArrayList new5()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList3 = (ArrayList) pop();
        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PCurrparalist pcurrparalistNode1;
        {
        TLPar tlparNode2;
        TypedLinkedList listNode4 = new TypedLinkedList();
        TRPar trparNode5;
        tlparNode2 = (TLPar)nodeArrayList1.get(0);
        {
        TypedLinkedList listNode3 = new TypedLinkedList();
        listNode3 = (TypedLinkedList)nodeArrayList2.get(0);
	if(listNode3 != null)
	{
	  listNode4.addAll(listNode3);
	}
        }
        trparNode5 = (TRPar)nodeArrayList3.get(0);

        pcurrparalistNode1 = new ACurrparalist(tlparNode2, listNode4, trparNode5);
        }
	nodeList.add(pcurrparalistNode1);
        return nodeList;
    }



    ArrayList new6()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PSpara psparaNode1;
        {
        PPara pparaNode2;
        TSep tsepNode3;
        pparaNode2 = (PPara)nodeArrayList1.get(0);
        tsepNode3 = (TSep)nodeArrayList2.get(0);

        psparaNode1 = new ASpara(pparaNode2, tsepNode3);
        }
	nodeList.add(psparaNode1);
        return nodeList;
    }



    ArrayList new7()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PSpara psparaNode1;
        {
        PCpara pcparaNode2;
        pcparaNode2 = (PCpara)nodeArrayList1.get(0);

        psparaNode1 = new ACparaSpara(pcparaNode2);
        }
	nodeList.add(psparaNode1);
        return nodeList;
    }



    ArrayList new8()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PSpara psparaNode1;
        {
        PDpara pdparaNode2;
        pdparaNode2 = (PDpara)nodeArrayList1.get(0);

        psparaNode1 = new ADparaSpara(pdparaNode2);
        }
	nodeList.add(psparaNode1);
        return nodeList;
    }



    ArrayList new9()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PSpara psparaNode1;
        {
        PPara pparaNode2;
        pparaNode2 = (PPara)nodeArrayList1.get(0);

        psparaNode1 = new AParaSpara(pparaNode2);
        }
	nodeList.add(psparaNode1);
        return nodeList;
    }



    ArrayList new10()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PCpara pcparaNode1;
        {
        PPara pparaNode2;
        TComma tcommaNode3;
        pparaNode2 = (PPara)nodeArrayList1.get(0);
        tcommaNode3 = (TComma)nodeArrayList2.get(0);

        pcparaNode1 = new ACpara(pparaNode2, tcommaNode3);
        }
	nodeList.add(pcparaNode1);
        return nodeList;
    }



    ArrayList new11()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        PDpara pdparaNode1;
        {
        PPara pparaNode2;
        TDoublep tdoublepNode3;
        pparaNode2 = (PPara)nodeArrayList1.get(0);
        tdoublepNode3 = (TDoublep)nodeArrayList2.get(0);

        pdparaNode1 = new ADpara(pparaNode2, tdoublepNode3);
        }
	nodeList.add(pdparaNode1);
        return nodeList;
    }



    ArrayList new12()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PPara pparaNode1;
        {
        TStringLit tstringlitNode2;
        tstringlitNode2 = (TStringLit)nodeArrayList1.get(0);

        pparaNode1 = new AStringLitPara(tstringlitNode2);
        }
	nodeList.add(pparaNode1);
        return nodeList;
    }



    ArrayList new13()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PPara pparaNode1;
        {
        TUrl turlNode2;
        turlNode2 = (TUrl)nodeArrayList1.get(0);

        pparaNode1 = new AUrlPara(turlNode2);
        }
	nodeList.add(pparaNode1);
        return nodeList;
    }



    ArrayList new14()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PPara pparaNode1;
        {
        TDialstr tdialstrNode2;
        tdialstrNode2 = (TDialstr)nodeArrayList1.get(0);

        pparaNode1 = new ADialstrPara(tdialstrNode2);
        }
	nodeList.add(pparaNode1);
        return nodeList;
    }



    ArrayList new15()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PPara pparaNode1;
        {
        TIdentifier tidentifierNode2;
        tidentifierNode2 = (TIdentifier)nodeArrayList1.get(0);

        pparaNode1 = new APara(tidentifierNode2);
        }
	nodeList.add(pparaNode1);
        return nodeList;
    }



    ArrayList new16()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        PPara pparaNode1;
        {
        TNumber tnumberNode2;
        tnumberNode2 = (TNumber)nodeArrayList1.get(0);

        pparaNode1 = new ANumberPara(tnumberNode2);
        }
	nodeList.add(pparaNode1);
        return nodeList;
    }



    ArrayList new17()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode2 = new TypedLinkedList();
        {
        PSpara psparaNode1;
        psparaNode1 = (PSpara)nodeArrayList1.get(0);
	if(psparaNode1 != null)
	{
	  listNode2.add(psparaNode1);
	}
        }
	nodeList.add(listNode2);
        return nodeList;
    }



    ArrayList new18()
    {
        ArrayList nodeList = new ArrayList();

        ArrayList nodeArrayList2 = (ArrayList) pop();
        ArrayList nodeArrayList1 = (ArrayList) pop();
        TypedLinkedList listNode3 = new TypedLinkedList();
        {
        TypedLinkedList listNode1 = new TypedLinkedList();
        PSpara psparaNode2;
        listNode1 = (TypedLinkedList)nodeArrayList1.get(0);
        psparaNode2 = (PSpara)nodeArrayList2.get(0);
	if(listNode1 != null)
	{
	  listNode3.addAll(listNode1);
	}
	if(psparaNode2 != null)
	{
	  listNode3.add(psparaNode2);
	}
        }
	nodeList.add(listNode3);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {2, SHIFT, 1}, },
			{{-1, REDUCE, 3}, {6, SHIFT, 3}, {10, SHIFT, 4}, },
			{{-1, ERROR, 2}, {13, ACCEPT, -1}, },
			{{-1, ERROR, 3}, {0, SHIFT, 8}, {1, SHIFT, 9}, {2, SHIFT, 10}, {3, SHIFT, 11}, {4, SHIFT, 12}, },
			{{-1, ERROR, 4}, {0, SHIFT, 8}, {1, SHIFT, 9}, {2, SHIFT, 10}, {3, SHIFT, 11}, {4, SHIFT, 12}, },
			{{-1, REDUCE, 0}, },
			{{-1, REDUCE, 1}, },
			{{-1, REDUCE, 2}, },
			{{-1, REDUCE, 13}, },
			{{-1, REDUCE, 14}, },
			{{-1, REDUCE, 15}, },
			{{-1, REDUCE, 16}, },
			{{-1, REDUCE, 12}, },
			{{-1, REDUCE, 17}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 8}, },
			{{-1, REDUCE, 9}, {10, SHIFT, 19}, {11, SHIFT, 20}, {12, SHIFT, 21}, },
			{{-1, ERROR, 17}, {0, SHIFT, 8}, {1, SHIFT, 9}, {2, SHIFT, 10}, {3, SHIFT, 11}, {4, SHIFT, 12}, {5, SHIFT, 22}, },
			{{-1, REDUCE, 4}, {0, SHIFT, 8}, {1, SHIFT, 9}, {2, SHIFT, 10}, {3, SHIFT, 11}, {4, SHIFT, 12}, },
			{{-1, REDUCE, 10}, },
			{{-1, REDUCE, 11}, },
			{{-1, REDUCE, 6}, },
			{{-1, REDUCE, 5}, },
			{{-1, REDUCE, 18}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 2}, },
			{{-1, 5}, },
			{{-1, 6}, },
			{{-1, 7}, },
			{{-1, 13}, {17, 23}, {18, 23}, },
			{{-1, 14}, },
			{{-1, 15}, },
			{{-1, 16}, },
			{{-1, 17}, {4, 18}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: identifier",
			"expecting: '(', ',', EOF",
			"expecting: EOF",
			"expecting: url, dialstr, identifier, number, string lit",
			"expecting: url, dialstr, identifier, number, string lit, ')', ',', ':', sep, EOF",
			"expecting: url, dialstr, identifier, number, string lit, ')', EOF",
			"expecting: url, dialstr, identifier, number, string lit, ')'",
			"expecting: url, dialstr, identifier, number, string lit, EOF",
        };*/
    private static int[] errors;
/*      {
			0, 1, 2, 3, 3, 2, 2, 2, 4, 4, 4, 4, 4, 5, 5, 5, 4, 6, 7, 5, 5, 5, 2, 5, 
        };*/
}