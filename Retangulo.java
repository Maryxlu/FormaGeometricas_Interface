/**
 * Write a description of class CopyOfCirculo here.
 *
 * @Maryxlu
 * @25/06/2024
 */
public class Retangulo implements FormaGeometrica
{
    double base;
    double altura;
    //CONSTRUTOR PADRAO PARA ERRADICAR ERRO DE SUBCLASSES
    public Retangulo(){
        this.base = this.altura = 0;
    }
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    double getBase(){
        return this.base;
    }
    double getAltura(){
        return this.altura;
    }
    public String getNome(){
        return "Retangulo";
    }
    
    public double getArea(){
        return this.base*this.altura;
    }
    
    public double getPerimetro(){
        return 2*(this.base+this.altura);
    }
}