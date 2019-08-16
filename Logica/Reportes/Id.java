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
public class Id extends Expresion {

    String id;

    /**
     * @param id Nombre de la variable que se está buscando
     * @param linea Línea donde está el id que se busca
     * @param columna Columna donde está el id que se busca
     */
    public Id(String id, int linea, int columna) {
        this.id = id;
        this.linea = linea;
        this.columna = columna;
    }

    @Override
    public Expresion obtenerValor(Entorno ent) {
        Simbolo sim = ent.buscar(id, linea, columna);

        if (sim != null) { //Si la variable existe
            switch (sim.tipo) {
                case archivo:
                    this.tipo = TipoDato.archivo;
                    this.valor = sim.valor;
                    break;
                case numerico:
                    this.tipo = TipoDato.numerico;
                    this.valor = sim.valor;
                    break;
                case cadena:
                    this.tipo = TipoDato.cadena;
                    this.valor = sim.valor;
                    break;
            }
        } else {
            // Si la variable NO existe ya se marcó el error y devuelvo una
            // expresión de tipo error para no tener null

            TablaError er = TablaError.getInstance();
            String descripcion = "No existe una declaracion de " + id;
            er.setError(id, linea, columna, "Reporte: Semantico", descripcion);

            this.tipo = TipoDato.error;
            this.valor = null;

        }

        return this;
    }

    @Override
    public String Imprimir() {

        String result = "";
        switch (this.tipo) {
            case archivo:
                Archivo arch = (Archivo) this.valor;
                result = arch.Imprimir();
                break;
            case numerico:
            case cadena:
                result = this.valor.toString();
                break;
        }

        return result;
    }

}
