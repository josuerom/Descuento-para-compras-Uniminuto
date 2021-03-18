package controlador;
/*EJERCICIO: Hacer un programa que calcule el 20% de descuento en almacenes Alkosto, si la compra es mayor a 20.000mil se le da descuento
* pero si es menor, NO se le debe dar.
*-------------------------------------------*
* #Universidad Minuto de Dios.
* GitHub: @JosueRomeroJ
* Date: 17/Marzo/2021
*/
import javax.swing.JOptionPane;

public class Alkosto
{
    public static void main(String[] args)
    { //Declaro los atributos a utilizar:
        int compra, descuento;
        
      //Le pido al usuario el dinero gastado en la compra:
        compra = Integer.parseInt(JOptionPane.showInputDialog("De cuánto fue tu compra?"));
        
      /*Acá se debe multiplicar el valor de la compra por el porcentaje de descuento, en este caso es 20%.
        Para luego dividir el resultado entre 100;
        Supongamos que la compra fue de $50.000mil, eso lo multiplicamos x20 = 1.000.000 y lo dividimos / 100 = $10.000*/
        descuento = compra*20 /100;
  
      //Condicional (if) es para saber si la compra es mayor o igual a $20mil pesos.
        if (compra >= 20000){//Si la compra es mayor a 20mil, obtendá el descuento por pantalla.
            JOptionPane.showMessageDialog(null, "Tu compra fue de $" + compra + ". Por lo tanto el 20% de descuento es $" + descuento + " mil pesos");
        }else if (compra <= 19999){//Pero si la compra es menor, no tendrás ningun descuento:
            JOptionPane.showMessageDialog(null, "Tu compra fue de $" + compra + ". Por lo tanto NO tienes descuento");
        }
    }
}
