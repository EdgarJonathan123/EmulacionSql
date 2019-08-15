/*-----------1ra Area: Codigo de Usuario-------------------------------*/

//--------------> Paquetes, importaciones
package Analisis.Datos;
import java_cup.runtime.*;
import Analisis.TablaError;

/*-----------2da Area: Opciones y Declaraciones-------------------------------*/
%%  

%{
    //--------->Codigo de Usuario en sintaxis Java
    public TablaError tablaEL = TablaError.getInstance();
%}

//------------>Directivas de JFlex
%public
%class ALDatos
%cupsym simDatos
%cup
%char
%column
%full
%ignorecase
%line
%unicode
%8bit


//-----> simDatos
//simDatos

/* COMA   = ","
PTCOMA = ";" */

//------------------>Expresiones Regulares

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

//letra    = [A-Za-zñÑ]

digito  = [0-9]+
entero = "-"? {digito}+

decimal = "-"? {digito}+ "." {digito}+

//identificador = {letra}({letra}|{entero}|"_")*


//identificador =  [A-Za-zñÑ]

cadena = "\""~"\""
comentS = "//" ~(\n|\r)     //Comentario simple
comentM = "/*"~ "*/"        //Comentario Multilinea


//------------------> Estados
%%
/*-----------3ra Area: Reglas Lexicas-------------------------------*/



//------------------->simDatos

<YYINITIAL>     "," {System.out.println("Simbolo: ["+yytext()+"] coma");
                    return new Symbol(simDatos.coma,yyline,yychar, yytext());}                     

<YYINITIAL>     "=" {System.out.println("Simbolo: ["+yytext()+"] igual"); 
                    return new Symbol(simDatos.igual,yyline,yychar, yytext());}

<YYINITIAL>     "[" {System.out.println("Simbolo: ["+yytext()+"] corchetes Abrierto"); 
                    return new Symbol(simDatos.corA,yyline,yychar, yytext());}
                    
<YYINITIAL>     "]" {System.out.println("Simbolo: ["+yytext()+"] corchetes Cerrado"); 
                    return new Symbol(simDatos.corC,yyline,yychar, yytext());}  

<YYINITIAL>     "{" {System.out.println("Simbolo: ["+yytext()+"] llave abierta"); 
                    return new Symbol(simDatos.llaveA,yyline,yychar, yytext());}
                    
<YYINITIAL>     "}" {System.out.println("Simbolo: ["+yytext()+"] llave Cerrada"); 
                    return new Symbol(simDatos.llaveC,yyline,yychar, yytext());}  


//------------------------> Palabras reservadas---------------------

<YYINITIAL> "registros" {System.out.println("Palabra Reservada: ["+yytext()+"]"); 
                    return new Symbol(simDatos.PSRegistro,yyline,yychar, yytext());}
                    
<YYINITIAL> "claves" {System.out.println("Palabra Reservada: ["+yytext()+"]"); 
                    return new Symbol(simDatos.PSClaves,yyline,yychar, yytext());}





//----------------------->simDatos Expresiones regulares
<YYINITIAL>     {cadena} {System.out.println("Encontro: ["+yytext()+"] Cadena de Texto"); 
                         return new Symbol(simDatos.cadena,yyline,yychar, yytext().replace("\"", "") );} 
                         
<YYINITIAL>     {entero} {System.out.println("Encontro: ["+yytext()+"] Numero entero"); 
                         return new Symbol(simDatos.entero,yyline,yychar, yytext());} 
                         
<YYINITIAL>     {decimal} {System.out.println("Encontro: ["+yytext()+"] Numero decimal"); 
                         return new Symbol(simDatos.decimal,yyline,yychar, yytext());}  




//---------------->Espacios
<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     {yychar =0;}
<YYINITIAL> {comentM} {}
<YYINITIAL> {comentS} {}




 //--------------->Errores Lexicos
<YYINITIAL> .   {
                    System.out.println("Error Lexico: "+yytext()+", Linea: "+yyline+", Col"+yycolumn);
                    tablaEL.setError(yytext(),yyline,yycolumn,"Error Lexico","Simbolo no existe en el lenguaje");
                }





