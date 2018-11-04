package Formatec2018;

public class IMC {

    private double imc;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
       return edad;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public char getSexo() {
       return sexo;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public double getPeso() {
       return peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public double getAltura() {
       return altura;
    }
public void funcionIMC() {
        
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Está por debajo del peso ideal, su IMC es : "+String.format("%.02f", imc));
        } else if (imc >= 18.5 && imc <= 25) {
            System.out.println("Está en su peso ideal, su IMC es : "+String.format("%.02f", imc));
        } else {
            System.out.println("Está por encima del peso ideal, su IMC es : "+String.format("%.02f", imc));
        }

    }
public String toString() {
        return "{"+edad+","+sexo+","+peso+","+altura+"};";
    }


}