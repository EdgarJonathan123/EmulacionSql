
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analisis.Datos;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import Logica.Simbolo;
import Logica.Datos.Archivo;
import Logica.Datos.Registro;
import Logica.TipoDato;
import Analisis.TablaError;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ASDatos extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return simDatos.class;
}

  /** Default constructor. */
  @Deprecated
  public ASDatos() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ASDatos(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ASDatos(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\014\000\002\002\004\000\002\002\003\000\002\003" +
    "\014\000\002\005\005\000\002\005\003\000\002\006\006" +
    "\000\002\006\005\000\002\004\005\000\002\004\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\004\013\004\001\002\000\004\005\010\001" +
    "\002\000\004\002\007\001\002\000\004\002\000\001\002" +
    "\000\004\002\001\001\002\000\004\006\011\001\002\000" +
    "\004\014\012\001\002\000\006\004\ufffd\007\ufffd\001\002" +
    "\000\006\004\015\007\014\001\002\000\004\012\017\001" +
    "\002\000\004\014\016\001\002\000\006\004\ufffe\007\ufffe" +
    "\001\002\000\004\005\020\001\002\000\004\006\021\001" +
    "\002\000\004\010\023\001\002\000\006\007\034\010\035" +
    "\001\002\000\010\014\026\015\025\016\024\001\002\000" +
    "\006\004\ufff7\011\ufff7\001\002\000\006\004\ufff6\011\ufff6" +
    "\001\002\000\006\004\ufff8\011\ufff8\001\002\000\006\004" +
    "\ufff9\011\ufff9\001\002\000\006\004\032\011\031\001\002" +
    "\000\006\007\ufffb\010\ufffb\001\002\000\010\014\026\015" +
    "\025\016\024\001\002\000\006\004\ufffa\011\ufffa\001\002" +
    "\000\004\002\uffff\001\002\000\010\014\026\015\025\016" +
    "\024\001\002\000\006\004\032\011\037\001\002\000\006" +
    "\007\ufffc\010\ufffc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\006\002\004\003\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\021\001\001\000\002\001\001\000\006\004\027" +
    "\007\026\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\007\032\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\004\035\007\026\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ASDatos$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ASDatos$actions(this);
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
    return action_obj.CUP$ASDatos$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  

    public Archivo raiz;
    private Registro aux = null;
    private int indexR=0;


     public TablaError tablaES = TablaError.getInstance();
    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {
        String lexema = s.value.toString();
        int fila=s.right;
        int col = s.left;

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
class CUP$ASDatos$actions {




  private final ASDatos parser;

  /** Constructor */
  CUP$ASDatos$actions(ASDatos parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ASDatos$do_action_part00000000(
    int                        CUP$ASDatos$act_num,
    java_cup.runtime.lr_parser CUP$ASDatos$parser,
    java.util.Stack            CUP$ASDatos$stack,
    int                        CUP$ASDatos$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ASDatos$result;

      /* select the action based on the action number */
      switch (CUP$ASDatos$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).value;
		RESULT = start_val;
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ASDatos$parser.done_parsing();
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= CUERPO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		Archivo a = (Archivo)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		
            parser.raiz = a;
        
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CUERPO ::= PSClaves igual corA LCADENA corC PSRegistro igual corA LREGISTRO corC 
            {
              Archivo RESULT =null;
		int clavesleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-6)).left;
		int clavesright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-6)).right;
		LinkedList<String> claves = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-6)).value;
		int registrosleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).left;
		int registrosright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).right;
		LinkedList<Registro> registros = (LinkedList<Registro>)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).value;
		 
               RESULT = new Archivo(claves,registros);
            
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-9)), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LCADENA ::= LCADENA coma cadena 
            {
              LinkedList<String> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)).right;
		LinkedList<String> a = (LinkedList<String>)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		 
                RESULT =a;
                RESULT.add(b);
        
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("LCADENA",3, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // LCADENA ::= cadena 
            {
              LinkedList<String> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		 
                RESULT = new LinkedList<String>();
                RESULT.add(a);
               
            
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("LCADENA",3, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // LREGISTRO ::= LREGISTRO llaveA REGISTRO llaveC 
            {
              LinkedList<Registro> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-3)).right;
		LinkedList<Registro> a = (LinkedList<Registro>)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).right;
		Registro b = (Registro)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).value;
		 
               if(aux.size()==a.size()){
                    RESULT =a;
                    RESULT.add(b);
                    System.out.println("");
                }else{
                
                }
                
            
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("LREGISTRO",4, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-3)), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // LREGISTRO ::= llaveA REGISTRO llaveC 
            {
              LinkedList<Registro> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).right;
		Registro a = (Registro)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-1)).value;
		
            
                    RESULT = new LinkedList<Registro>();
                    RESULT.add(a);
                    aux = a;

            
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("LREGISTRO",4, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // REGISTRO ::= REGISTRO coma DATO 
            {
              Registro RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)).right;
		Registro a = (Registro)((java_cup.runtime.Symbol) CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		Simbolo b = (Simbolo)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		
            
                indexR++;
                if(aux!=null){

                    if(indexR<aux.size()){

                        Simbolo  t1 = aux.get(indexR);

                        if(t1.compararTipo(b)==0){
                            RESULT = a; 
                            RESULT.add(b);
                            System.out.println("indexR = "+indexR);
                            System.out.println("aux.size = "+aux.size());

                        }else{
                            //error semantico
                            System.out.println("Error Semantico");
                        }

                    }else{

                        //error semantico
                        System.out.println("Error Semantico");
                    }
                  

                }else{
                    RESULT = a; 
                    RESULT.add(b);
                    System.out.println("Primera ves indexR = "+indexR);
                }

            
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("REGISTRO",2, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.elementAt(CUP$ASDatos$top-2)), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // REGISTRO ::= DATO 
            {
              Registro RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		Simbolo a = (Simbolo)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		
        
                indexR=0;
                if(aux!=null){


                    Simbolo  t1 = aux.get(0);
                
                    if(t1.compararTipo(a)==0){
                        RESULT = new Registro();
                        RESULT.add(a);
                        System.out.println("indexR = "+indexR);
                    }else{
                        //error semantico
                        System.out.println("Error Semantico");
                    }

                }else{
                    RESULT = new Registro();
                    RESULT.add(a);
                    System.out.println("Primera ves indexR = "+indexR);
                }
   

              
            
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("REGISTRO",2, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DATO ::= cadena 
            {
              Simbolo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		 RESULT  = new Simbolo(TipoDato.cadena,a); 
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("DATO",5, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DATO ::= decimal 
            {
              Simbolo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		RESULT = new Simbolo(TipoDato.decimal,a);
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("DATO",5, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // DATO ::= entero 
            {
              Simbolo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ASDatos$stack.peek()).value;
		RESULT  = new Simbolo(TipoDato.entero,a);
              CUP$ASDatos$result = parser.getSymbolFactory().newSymbol("DATO",5, ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), ((java_cup.runtime.Symbol)CUP$ASDatos$stack.peek()), RESULT);
            }
          return CUP$ASDatos$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ASDatos$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ASDatos$do_action(
    int                        CUP$ASDatos$act_num,
    java_cup.runtime.lr_parser CUP$ASDatos$parser,
    java.util.Stack            CUP$ASDatos$stack,
    int                        CUP$ASDatos$top)
    throws java.lang.Exception
    {
              return CUP$ASDatos$do_action_part00000000(
                               CUP$ASDatos$act_num,
                               CUP$ASDatos$parser,
                               CUP$ASDatos$stack,
                               CUP$ASDatos$top);
    }
}

}