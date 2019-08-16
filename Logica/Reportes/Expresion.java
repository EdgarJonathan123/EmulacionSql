package Logica.Reportes;

import Logica.Entorno;
import Logica.TipoDato;

public abstract class Expresion {

    public TipoDato tipo;
    public Object valor;
    public int linea;
    public int columna;

    /**
     * @param ent Entorno en el que se está ejecutando la expresión
     * @return Retorna una expresión con el resultado de ejecutar la expresión
     */
    public abstract Expresion obtenerValor(Entorno ent);

    public abstract String Imprimir();

}
