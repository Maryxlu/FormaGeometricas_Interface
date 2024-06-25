/**
 * Write a description of class CopyOfCirculo here.
 *
 * @Maryxlu
 * @25/06/2024
 */
public class Quadrado extends Retangulo
{
    double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return this.lado;
    }
    
    @Override
    public String getNome(){
        return "Quadrado";
    }
    
    @Override
    public double getArea(){
        return this.lado*this.lado;
    }
    
    @Override
    public double getPerimetro(){
        return 4*this.lado;
    }
}