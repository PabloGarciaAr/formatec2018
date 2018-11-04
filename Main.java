package Formatec2018;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        IMC usuario = new IMC();
        
        System.out.println("Ingresá tu edad: ");
        usuario.setEdad(scanner.nextInt()); 
        System.out.println("Ingresá tu sexo (M o F): ");
        usuario.setSexo(scanner.next().charAt(0)); 
        System.out.println("Ingresá tu peso: ");
        usuario.setPeso((float) scanner.nextDouble()); 
        System.out.println("Ingresá tu altura: ");
        usuario.setAltura((float) scanner.nextDouble());
        
        
        usuario.funcionIMC();
        
    }
}