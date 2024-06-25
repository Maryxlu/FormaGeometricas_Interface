
/**
 * Testa os elementos da forma geometrica
 *
 * @Maryxlu
 * @25/06/2024
 **/
public class Test
{
    public static void teste(){
        Circulo circ = new Circulo(2); // circulo de raio 2
        System.out.println(circ.getNome() + " de raio " + circ.getRaio() 
        + " com area igual a " + circ.getArea() 
        + " e perimetro igual a " + circ.getPerimetro() + ".");
        Retangulo rect = new Retangulo(2,3); // retangulo base 2 altura 3
        System.out.println(rect.getNome() + " " + rect.getBase() + " por " 
        + rect.getAltura() + " com area igual a " + rect.getArea() 
        + " e perimetro igual a " + rect.getPerimetro() + ".");
        Quadrado quad = new Quadrado(2);
        System.out.println(circ.getNome() + " de lado " + quad.getLado() 
        + " com area igual a " + quad.getArea() 
        + " e perimetro igual a " + quad.getPerimetro() + ".");
    }
}
