package Logica;

/**
 *
 * @author Nery Galvez
 */
public class Simbolo {

    public TipoDato tipo;
    public Object valor;

    /**
     * @param tipo Tipo del símbolo (Numerico, Cadena, Archivo)
     * @param valor valor que tiene el símbolo
     */
    
   
    public Simbolo(TipoDato tipo, Object valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public int compararTipo(Simbolo _tipo){
    
        return tipo.compareTo(_tipo.tipo);
    }


}
