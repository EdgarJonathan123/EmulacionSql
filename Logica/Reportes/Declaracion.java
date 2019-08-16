/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Reportes;

import Analisis.TablaError;
import Logica.Datos.Archivo;
import Logica.Entorno;
import Logica.Simbolo;
import Logica.TipoDato;

/**
 *
 * @author jonathan
 */
public class Declaracion extends Instruccion {

    TipoDato tipo;
    String nombre;
    Expresion expresion;

    /**
     * @param tipo Tipo de la variable que se quiere declarar
     * @param nombre Nombre de la variable que se quiere declarar
     * @param expresion Expresión que se le quiere asignar a la variable
     */
    public Declaracion(TipoDato tipo, String nombre, Expresion expresion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.expresion = expresion;
    }

    @Override
    public void Ejecutar(Entorno ent) {
        Expresion resultado = expresion.obtenerValor(ent); //Resuelvo la expresión que le quiero asignar a la variable

        System.out.println("Ejecutando la instrucción Declaración --> Tipo: " + tipo + ", Nombre: " + nombre + ", Valor: " + resultado.valor);

        //verficar los tipos else semantico
        //utilizar tipo para seleccionar accion
        if (tipo.compareTo(resultado.tipo) == 0) {
            Simbolo sim;

            switch (resultado.tipo) {
                case archivo:
                    Archivo arch = (Archivo) resultado.valor;
                    sim = new Simbolo(resultado.tipo, arch);
                    ent.insertar(nombre, sim, resultado.linea, resultado.columna);
                    break;
                case numerico:  
                case cadena:
                    sim = new Simbolo(resultado.tipo, resultado.valor);
                    ent.insertar(nombre, sim, resultado.linea, resultado.columna);
                    break;
         
            }

        } else {
            TablaError er = TablaError.getInstance();
            String descripcion = "Se esperaba una funcion que devuelva un tipo " + this.tipo.name() + "como resultado ";
            System.out.println(descripcion);
            er.setError(resultado.tipo.name(), resultado.linea, resultado.columna, "Reporte: Semantico", descripcion);

        }

    }

}
