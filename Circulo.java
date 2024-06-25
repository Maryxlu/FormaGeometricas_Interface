
/**
 * Write a description of class Circulo here.
 *
 * @Maryxlu
 * @25/06/2024
 */
public class Circulo implements FormaGeometrica
{
    double raio;
    static double pi = 3.14;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    double getRaio(){
        return this.raio;
    }
    
    public String getNome(){
        return "Circulo";
    }
    
    public double getArea(){
        return this.raio*pi*this.raio;
    }
    
    public double getPerimetro(){
        return pi*this.raio*2;
    }
}
