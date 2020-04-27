/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina3_2020;

/**
 *
 * @author snowp
 */
public class MaquinaBebidas {
    private ContadorDeMonedas contador;
    private DispensadorDeBotes cola, limon, naranja, tonica, agua;
    private float precio;
    public void iniciarMaquinaDeBebidas (float m, int b, float pvp){
        contador.iniciarContadorDeMonedas(m);
        cola.iniciarDispensadorDeBotes(b);
        limon.iniciarDispensadorDeBotes(b);
        naranja.iniciarDispensadorDeBotes(b);
        tonica.iniciarDispensadorDeBotes(b);
        agua.iniciarDispensadorDeBotes(b);
        precio = pvp;
    }
    public void darOrden (char o){
        switch(o){
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
                ordenSeleccion(o);
            break;
            
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case'R':
                ordenMonedas(o);
            break;
            
            default:
                System.out.println("no te entiendo");
        }
    }
    public void visualizarMaquina (){
        System.out.println("---Botes en cada dispensador---");
        System.out.println("cola: "+cola.botesDisponibles());
        System.out.println("limon: "+limon.botesDisponibles());
        System.out.println("naranja: "+naranja.botesDisponibles());
        System.out.println("agua: "+agua.botesDisponibles());
        System.out.println("tonica: "+tonica.botesDisponibles());
        System.out.println("-------------------------------");
        System.out.println("Precio: "+precio);
        System.out.println("-------------------------------");
        System.out.println("Saldo: "+contador.saldo());
        System.out.println("-------------------------------");
    }
    private void ordenMonedas (char o){
        switch(o){
            case 'A':
                contador.insertarMoneda(0,05);
            break;
            
            case 'B':
                contador.insertarMoneda(0,1);
            break;
            
            case 'C':
                contador.insertarMoneda(0,2);
            break;
            
            case 'D':
                contador.insertarMoneda(0,5);
            break;
            
            case 'E':
                contador.insertarMoneda(1);
            break;
            
            case 'R':
                contador.retornar();
            break;
        }
    }
    private void ordenSeleccion (char o){
            
        switch(o){
        case '1':
                if(cola.pulsarBoton()){
                    System.out.println("BOTON PULSADO");
                }
                else{
                    System.out.println("BOTE NO DISPONIBLE");
                }
            break;
            
            case '2':
               if(limon.pulsarBoton()){
                    System.out.println("BOTON PULSADO");
                }
                else{
                    System.out.println("BOTE NO DISPONIBLE");
                }
            break;
            
            case '3':
                if(naranja.pulsarBoton()){
                    System.out.println("BOTON PULSADO");
                }
                else{
                    System.out.println("BOTE NO DISPONIBLE");
                }
            break;
            
            case '4':
                if(tonica.pulsarBoton()){
                    System.out.println("BOTON PULSADO");
                }
                else{
                    System.out.println("BOTE NO DISPONIBLE");
                }
            break;
            
            case '5':
                if(agua.pulsarBoton()){
                    System.out.println("BOTON PULSADO");
                }
                else{
                    System.out.println("BOTE NO DISPONIBLE");
                }
            break;
            
            
        }      
    }
}
