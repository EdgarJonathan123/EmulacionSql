
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analisis.reportes;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import Analisis.TError;
import Analisis.TablaError;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ASReportes extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return simReportes.class;
}

  /** Default constructor. */
  @Deprecated
  public ASReportes() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ASReportes(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ASReportes(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\037\000\002\002\004\000\002\002\003\000\002\014" +
    "\004\000\002\014\003\000\002\003\004\000\002\003\004" +
    "\000\002\003\004\000\002\004\006\000\002\010\006\000" +
    "\002\010\010\000\002\010\006\000\002\010\010\000\002" +
    "\010\014\000\002\010\014\000\002\011\003\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\011\003" +
    "\000\002\011\003\000\002\006\003\000\002\006\003\000" +
    "\002\006\003\000\002\005\006\000\002\007\016\000\002" +
    "\012\005\000\002\012\003\000\002\013\003\000\002\013" +
    "\003\000\002\013\003\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\130\000\014\017\006\025\004\026\005\027\014\031" +
    "\007\001\002\000\004\007\125\001\002\000\004\007\112" +
    "\001\002\000\004\035\uffeb\001\002\000\004\035\uffed\001" +
    "\002\000\016\002\000\017\006\025\004\026\005\027\014" +
    "\031\007\001\002\000\004\005\110\001\002\000\004\002" +
    "\107\001\002\000\016\002\ufffe\017\ufffe\025\ufffe\026\ufffe" +
    "\027\ufffe\031\ufffe\001\002\000\004\035\uffec\001\002\000" +
    "\004\005\106\001\002\000\004\005\105\001\002\000\004" +
    "\035\020\001\002\000\004\006\021\001\002\000\016\020" +
    "\022\021\026\022\024\023\027\024\023\030\030\001\002" +
    "\000\004\007\100\001\002\000\004\007\067\001\002\000" +
    "\004\007\064\001\002\000\004\005\ufffa\001\002\000\004" +
    "\007\061\001\002\000\004\007\036\001\002\000\004\007" +
    "\031\001\002\000\004\035\032\001\002\000\004\004\033" +
    "\001\002\000\004\032\034\001\002\000\004\010\035\001" +
    "\002\000\004\005\ufff6\001\002\000\004\035\037\001\002" +
    "\000\004\004\040\001\002\000\004\032\041\001\002\000" +
    "\004\004\042\001\002\000\016\011\050\012\044\013\046" +
    "\014\045\015\051\016\043\001\002\000\004\004\uffef\001" +
    "\002\000\004\004\ufff3\001\002\000\004\004\ufff0\001\002" +
    "\000\004\004\ufff1\001\002\000\004\004\052\001\002\000" +
    "\004\004\ufff2\001\002\000\004\004\uffee\001\002\000\012" +
    "\032\054\033\055\034\053\035\057\001\002\000\006\004" +
    "\uffe4\010\uffe4\001\002\000\006\004\uffe6\010\uffe6\001\002" +
    "\000\006\004\uffe3\010\uffe3\001\002\000\004\010\060\001" +
    "\002\000\006\004\uffe5\010\uffe5\001\002\000\004\005\ufff5" +
    "\001\002\000\004\032\062\001\002\000\004\010\063\001" +
    "\002\000\004\005\ufff9\001\002\000\004\035\065\001\002" +
    "\000\004\010\066\001\002\000\004\005\ufff7\001\002\000" +
    "\004\035\070\001\002\000\004\004\071\001\002\000\004" +
    "\032\072\001\002\000\004\004\073\001\002\000\016\011" +
    "\050\012\044\013\046\014\045\015\051\016\043\001\002" +
    "\000\004\004\075\001\002\000\012\032\054\033\055\034" +
    "\053\035\057\001\002\000\004\010\077\001\002\000\004" +
    "\005\ufff4\001\002\000\004\035\101\001\002\000\004\004" +
    "\102\001\002\000\004\032\103\001\002\000\004\010\104" +
    "\001\002\000\004\005\ufff8\001\002\000\016\002\ufffb\017" +
    "\ufffb\025\ufffb\026\ufffb\027\ufffb\031\ufffb\001\002\000\016" +
    "\002\ufffc\017\ufffc\025\ufffc\026\ufffc\027\ufffc\031\ufffc\001" +
    "\002\000\004\002\001\001\002\000\016\002\ufffd\017\ufffd" +
    "\025\ufffd\026\ufffd\027\ufffd\031\ufffd\001\002\000\016\002" +
    "\uffff\017\uffff\025\uffff\026\uffff\027\uffff\031\uffff\001\002" +
    "\000\004\032\113\001\002\000\004\004\114\001\002\000" +
    "\004\032\115\001\002\000\004\004\116\001\002\000\004" +
    "\035\117\001\002\000\004\004\120\001\002\000\004\032" +
    "\121\001\002\000\004\004\122\001\002\000\004\032\123" +
    "\001\002\000\004\010\124\001\002\000\004\005\uffe9\001" +
    "\002\000\012\032\054\033\055\034\053\035\057\001\002" +
    "\000\006\004\uffe7\010\uffe7\001\002\000\006\004\130\010" +
    "\131\001\002\000\012\032\054\033\055\034\053\035\057" +
    "\001\002\000\004\005\uffea\001\002\000\006\004\uffe8\010" +
    "\uffe8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\130\000\020\002\011\003\012\004\010\005\014\006" +
    "\016\007\015\014\007\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\003" +
    "\110\004\010\005\014\006\016\007\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\024\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\011\046" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\013\055\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\011\073" +
    "\001\001\000\002\001\001\000\004\013\075\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\012\126\013\125\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\131\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ASReportes$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ASReportes$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ASReportes$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    
     public TablaError tablaES = TablaError.getInstance();
    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {
        String lexema = s.value.toString();
        int fila=s.left;
        int col = s.right;

        System.out.println("!!!!!!Error sintactico recuperado!!!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+col);
        
        tablaES.setError(lexema,fila,col,"Error sintactico","El caracter no esperado");

    }


    //Metodo al que se llama en el momento  en que ya no  es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        
        String lexema = s.value.toString();
        int fila = s.right;
        int col = s.left;
        
        System.out.println("!!!!!!Error sintactico, panic mode!!!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+col);

        tablaES.setError(lexema,fila,col,"Error sintactico","El caracter no esperado");

    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ASReportes$actions {






  private final ASReportes parser;

  /** Constructor */
  CUP$ASReportes$actions(ASReportes parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ASReportes$do_action_part00000000(
    int                        CUP$ASReportes$act_num,
    java_cup.runtime.lr_parser CUP$ASReportes$parser,
    java.util.Stack            CUP$ASReportes$stack,
    int                        CUP$ASReportes$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ASReportes$result;

      /* select the action based on the action number */
      switch (CUP$ASReportes$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)).value;
		RESULT = start_val;
              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ASReportes$parser.done_parsing();
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= LISTA_CUERPO 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LISTA_CUERPO ::= LISTA_CUERPO CUERPO 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("LISTA_CUERPO",10, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LISTA_CUERPO ::= CUERPO 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("LISTA_CUERPO",10, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO ::= DECLARACION ptcoma 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CUERPO ::= IMPRIMIR ptcoma 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUERPO ::= GRAFICAR ptcoma 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-1)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DECLARACION ::= TIPODATO identificador igual FUNCION 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-3)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // FUNCION ::= PSLeerArchivo parA cadena parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-3)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // FUNCION ::= PSSumar parA identificador coma cadena parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-5)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // FUNCION ::= PSContar parA identificador parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-3)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // FUNCION ::= PSPromedio parA identificador coma cadena parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-5)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // FUNCION ::= PSContarsi parA identificador coma cadena coma COMPARACION coma PARAMETRO parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-9)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // FUNCION ::= PSObtenersi parA identificador coma cadena coma COMPARACION coma PARAMETRO parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("FUNCION",6, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-9)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // COMPARACION ::= menorque 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("COMPARACION",7, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // COMPARACION ::= mayorque 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("COMPARACION",7, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // COMPARACION ::= mayorigual 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("COMPARACION",7, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // COMPARACION ::= menorigual 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("COMPARACION",7, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // COMPARACION ::= dobleigual 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("COMPARACION",7, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // COMPARACION ::= negacion 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("COMPARACION",7, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // TIPODATO ::= PSCadena 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASReportes$stack.peek()).value;
		 System.out.println("CAD: "+a); 
              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("TIPODATO",4, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // TIPODATO ::= PSNumerico 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASReportes$stack.peek()).value;
		 System.out.println("Num: "+a); 
              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("TIPODATO",4, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // TIPODATO ::= PSArchivo 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASReportes$stack.peek()).value;
		 System.out.println("ARCH: "+a); 
              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("TIPODATO",4, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // IMPRIMIR ::= PSImprimir parA LISTA_PARAMETROS parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("IMPRIMIR",3, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-3)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // GRAFICAR ::= PSGraficar parA cadena coma cadena coma identificador coma cadena coma cadena parC 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("GRAFICAR",5, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-11)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // LISTA_PARAMETROS ::= LISTA_PARAMETROS coma PARAMETRO 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("LISTA_PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.elementAt(CUP$ASReportes$top-2)), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // LISTA_PARAMETROS ::= PARAMETRO 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("LISTA_PARAMETROS",8, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // PARAMETRO ::= cadena 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("PARAMETRO",9, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // PARAMETRO ::= identificador 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("PARAMETRO",9, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // PARAMETRO ::= decimal 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("PARAMETRO",9, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // PARAMETRO ::= entero 
            {
              String RESULT =null;

              CUP$ASReportes$result = parser.getSymbolFactory().newSymbol("PARAMETRO",9, ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASReportes$stack.peek()), RESULT);
            }
          return CUP$ASReportes$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ASReportes$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ASReportes$do_action(
    int                        CUP$ASReportes$act_num,
    java_cup.runtime.lr_parser CUP$ASReportes$parser,
    java.util.Stack            CUP$ASReportes$stack,
    int                        CUP$ASReportes$top)
    throws java.lang.Exception
    {
              return CUP$ASReportes$do_action_part00000000(
                               CUP$ASReportes$act_num,
                               CUP$ASReportes$parser,
                               CUP$ASReportes$stack,
                               CUP$ASReportes$top);
    }
}

}
