/*-----------1ra Area: Codigo de Usuario-------------------------------*/

//--------------> Paquetes, importaciones
package Analisis.Datos;
import java_cup.runtime.*;
import java.util.LinkedList;
import Analisis.TError;

/*-----------2da Area: Opciones y Declaraciones-------------------------------*/
%%  

%{
    //--------->Codigo de Usuario en sintaxis Java
    
    public static LinkedList<TError> tablaEL = new LinkedList<TError>();
%}

//------------>Directivas de JFlex
%public
%class ALDatos
%cupsym simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode
%8bit


//-----> Simbolos
//simbolos

/* COMA   = ","
PTCOMA = ";" */

//------------------>Expresiones Regulares

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

letra    = [A-Za-zñÑ]

digito  = [0-9]+
entero = "-"? {digito}+

decimal = "-"? {digito}+ "." {digito}+

identificador = {letra}({letra}|{entero}|"_")*


//identificador =  [A-Za-zñÑ]

cadena = "\""~"\""
comentS = "//" ~(\n|\r)     //Comentario simple
comentM = "/*"~ "*/"        //Comentario Multilinea


//------------------> Estados
%%
/*-----------3ra Area: Reglas Lexicas-------------------------------*/

//------------------->Simbolos

<YYINITIAL>     "," {System.out.println("Simbolo: ["+yytext()+"] dos puntos");
                    return new Symbol(simbolos.coma,yyline,yychar, yytext());}                     

<YYINITIAL>     "=" {System.out.println("Simbolo: ["+yytext()+"] igual"); 
                    return new Symbol(simbolos.igual,yyline,yychar, yytext());}

<YYINITIAL>     "[" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Abrierto"); 
                    return new Symbol(simbolos.corA,yyline,yychar, yytext());}
                    
<YYINITIAL>     "]" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.corC,yyline,yychar, yytext());}  

<YYINITIAL>     "{" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Abrierto"); 
                    return new Symbol(simbolos.llaveA,yyline,yychar, yytext());}
                    
<YYINITIAL>     "}" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.llaveC,yyline,yychar, yytext());}  


//------------------------> Palabras reservadas---------------------

<YYINITIAL> "registros" {System.out.println("Palabra Reservada: ["+yytext()+"]"); 
                    return new Symbol(simbolos.PSRegistro,yyline,yychar, yytext());}
                    
<YYINITIAL> "claves" {System.out.println("Palabra Reservada: ["+yytext()+"]"); 
                    return new Symbol(simbolos.PSClaves,yyline,yychar, yytext());}



//----------------------->Simbolos Expresiones regulares
<YYINITIAL>     {cadena} {System.out.println("Encontro: ["+yytext()+"] Cadena de Texto"); 
                         return new Symbol(simbolos.cadena,yyline,yychar, yytext().replace("\"", "") );} 
                         
<YYINITIAL>     {entero} {System.out.println("Encontro: ["+yytext()+"] Numero entero"); 
                         return new Symbol(simbolos.entero,yyline,yychar, yytext());} 
                         
<YYINITIAL>     {decimal} {System.out.println("Encontro: ["+yytext()+"] Numero decimal"); 
                         return new Symbol(simbolos.decimal,yyline,yychar, yytext());}  


//---------------->Espacios
<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}
<YYINITIAL> {comentM} {}
<YYINITIAL> {comentS} {}



 //--------------->Errores Lexicos
<YYINITIAL> .                   {System.out.println("Error Lexico: "+yytext()+", Linea: "+yyline+", Col"+yycolumn);
                     TError datos = new TError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
                     tablaEL.add(datos);}



