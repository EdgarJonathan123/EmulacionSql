/*-----------1ra Area: Codigo de Usuario-------------------------------*/

//--------------> Paquetes, importaciones
package Analisis.reportes;
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
%class ALReportes
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

<YYINITIAL>     ";" {System.out.println("SImbolo: ["+yytext()+"] punto y coma"); 
                    return new Symbol(simbolos.ptcoma,yyline,yychar, yytext());} 

<YYINITIAL>     "=" {System.out.println("Simbolo: ["+yytext()+"] igual"); 
                    return new Symbol(simbolos.igual,yyline,yychar, yytext());}

<YYINITIAL>     "(" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Abrierto"); 
                    return new Symbol(simbolos.parA,yyline,yychar, yytext());}
                    
<YYINITIAL>     ")" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.parC,yyline,yychar, yytext());}  

<YYINITIAL>     ">" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.mayorque,yyline,yychar, yytext());}  

<YYINITIAL>     "<" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.menorque,yyline,yychar, yytext());}  

<YYINITIAL>     ">=" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.mayorigual,yyline,yychar, yytext());}  

<YYINITIAL>     "<=" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.menorigual,yyline,yychar, yytext());}  

<YYINITIAL>     "==" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.dobleigual,yyline,yychar, yytext());} 

<YYINITIAL>     "!=" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simbolos.negacion,yyline,yychar, yytext());} 


//------------------------> Palabras reservadas---------------------

<YYINITIAL> "Archivo" {System.out.println("Palabra Reservada: ["+yytext()+"]"); 
                    return new Symbol(simbolos.PSArchivo,yyline,yychar, yytext());}

<YYINITIAL> "sumar" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSSumar,yyline,yychar, yytext());}

<YYINITIAL> "leerarchivo" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSLeerArchivo,yyline,yychar, yytext());}

<YYINITIAL> "contar" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSContar,yyline,yychar, yytext());}   

<YYINITIAL> "contarsi" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSContarsi,yyline,yychar, yytext());} 

<YYINITIAL> "obtnersi" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSObtenersi,yyline,yychar, yytext());} 

<YYINITIAL> "imprimir" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSImprimir,yyline,yychar, yytext());} 

<YYINITIAL> "graficar" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSGraficar,yyline,yychar, yytext());} 

<YYINITIAL> "numerico" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSNumerico,yyline,yychar, yytext());} 

<YYINITIAL> "cadena" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSCadena,yyline,yychar, yytext());} 


<YYINITIAL> "promedio" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simbolos.PSPromedio,yyline,yychar, yytext());}                    



//------------------------> Operacion Aritmeticas



//----------------------->Simbolos Expresiones regulares
<YYINITIAL>     {cadena} {System.out.println("Encontro: ["+yytext()+"] Cadena de Texto"); 
                         return new Symbol(simbolos.cadena,yyline,yychar, yytext().replace("\"", "") );} 
                         
<YYINITIAL>     {entero} {System.out.println("Encontro: ["+yytext()+"] Numero entero"); 
                         return new Symbol(simbolos.entero,yyline,yychar, yytext());} 
                         
<YYINITIAL>     {decimal} {System.out.println("Encontro: ["+yytext()+"] Numero decimal"); 
                         return new Symbol(simbolos.decimal,yyline,yychar, yytext());}  

<YYINITIAL>     {identificador} {System.out.println("Encontro: ["+yytext()+"] token id"); 
                         return new Symbol(simbolos.identificador,yyline,yychar, yytext());} 

//---------------->Espacios
<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}
<YYINITIAL> {comentM} {}
<YYINITIAL> {comentS} {}



 //--------------->Errores Lexicos
<YYINITIAL> .                   {System.out.println("Error Lexico: "+yytext()+", Linea: "+yyline+", Col"+yycolumn);
                     TError datos = new TError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
                     tablaEL.add(datos);}



