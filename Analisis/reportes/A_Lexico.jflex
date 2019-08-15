/*-----------1ra Area: Codigo de Usuario-------------------------------*/

//--------------> Paquetes, importaciones
package Analisis.reportes;
import java_cup.runtime.*;
import java.util.LinkedList;
import Analisis.TError;
import Analisis.TablaError;
/*-----------2da Area: Opciones y Declaraciones-------------------------------*/
%%  

%{    
    //--------->Codigo de Usuario en sintaxis Java
    public TablaError tablaEL = TablaError.getInstance();
%}

//------------>Directivas de JFlex
%public
%class ALReportes
%cupsym simReportes
%cup
%char
%column
%full
%ignorecase
%line
%unicode
%8bit


//-----> simReportes
//simReportes

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

//------------------->simReportes


<YYINITIAL>     "," {System.out.println("Simbolo: ["+yytext()+"] dos puntos");
                    return new Symbol(simReportes.coma,yyline,yychar, yytext());}                     

<YYINITIAL>     ";" {System.out.println("SImbolo: ["+yytext()+"] punto y coma"); 
                    return new Symbol(simReportes.ptcoma,yyline,yychar, yytext());} 

<YYINITIAL>     "=" {System.out.println("Simbolo: ["+yytext()+"] igual"); 
                    return new Symbol(simReportes.igual,yyline,yychar, yytext());}

<YYINITIAL>     "(" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Abrierto"); 
                    return new Symbol(simReportes.parA,yyline,yychar, yytext());}
                    
<YYINITIAL>     ")" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.parC,yyline,yychar, yytext());}  

<YYINITIAL>     ">" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.mayorque,yyline,yychar, yytext());}  

<YYINITIAL>     "<" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.menorque,yyline,yychar, yytext());}  

<YYINITIAL>     ">=" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.mayorigual,yyline,yychar, yytext());}  

<YYINITIAL>     "<=" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.menorigual,yyline,yychar, yytext());}  

<YYINITIAL>     "==" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.dobleigual,yyline,yychar, yytext());} 

<YYINITIAL>     "!=" {System.out.println("Simbolo: ["+yytext()+"] Parentesis Cerrado"); 
                    return new Symbol(simReportes.negacion,yyline,yychar, yytext());} 


//------------------------> Palabras reservadas---------------------

<YYINITIAL> "Archivo" {System.out.println("Palabra Reservada: ["+yytext()+"]"); 
                    return new Symbol(simReportes.PSArchivo,yyline,yychar, yytext());}

<YYINITIAL> "sumar" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSSumar,yyline,yychar, yytext());}

<YYINITIAL> "leerarchivo" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSLeerArchivo,yyline,yychar, yytext());}

<YYINITIAL> "contar" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSContar,yyline,yychar, yytext());}   

<YYINITIAL> "contarsi" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSContarsi,yyline,yychar, yytext());} 

<YYINITIAL> "ObtenerSi" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSObtenersi,yyline,yychar, yytext());} 

<YYINITIAL> "imprimir" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSImprimir,yyline,yychar, yytext());} 

<YYINITIAL> "graficar" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSGraficar,yyline,yychar, yytext());} 

<YYINITIAL> "numerico" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSNumerico,yyline,yychar, yytext());} 

<YYINITIAL> "cadena" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSCadena,yyline,yychar, yytext());} 


<YYINITIAL> "promedio" {System.out.println("Palabra Reservada: ["+yytext()+"] "); 
                    return new Symbol(simReportes.PSPromedio,yyline,yychar, yytext());}                    



//------------------------> Operacion Aritmeticas



//----------------------->simReportes Expresiones regulares
<YYINITIAL>     {cadena} {System.out.println("Encontro: ["+yytext()+"] Cadena de Texto"); 
                         return new Symbol(simReportes.cadena,yyline,yychar, yytext().replace("\"", "") );} 
                         
<YYINITIAL>     {entero} {System.out.println("Encontro: ["+yytext()+"] Numero entero"); 
                         return new Symbol(simReportes.entero,yyline,yychar, yytext());} 
                         
<YYINITIAL>     {decimal} {System.out.println("Encontro: ["+yytext()+"] Numero decimal"); 
                         return new Symbol(simReportes.decimal,yyline,yychar, yytext());}  

<YYINITIAL>     {identificador} {System.out.println("Encontro: ["+yytext()+"] token id"); 
                         return new Symbol(simReportes.identificador,yyline,yychar, yytext());} 

//---------------->Espacios
<YYINITIAL> {SPACE}     {  }
<YYINITIAL> {ENTER}     {yychar =0;}
<YYINITIAL> {comentM} { System.out.println("[Comentario multilinea]]"); }
<YYINITIAL> {comentS} { System.out.println("[Comentario de una linea]]"); }



 //--------------->Errores Lexicos
<YYINITIAL> .   {
                    System.out.println("Error Lexico: "+yytext()+", Linea: "+yyline+", Col"+yycolumn);
                    tablaEL.setError(yytext(),yyline,yycolumn,"Reportes: Error Lexico","Simbolo no existe en el lenguaje");
                }

