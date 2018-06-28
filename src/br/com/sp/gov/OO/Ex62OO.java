
package br.com.sp.gov.OO;


public class Ex62OO {
    public static void getCategoria(int idade){
        
        if(idade>= 5 && idade<=10){
            System.out.println("Categoria infantil");
            
            
        }else if(idade>=11 && idade<=15){
            
            System.out.println("Categoria Juvenil");
        
        }else if(idade>=16 && idade<=20){
            
            System.out.println("Categoria Junior");
            
        }else if(idade>=21 && idade<=25){
            
            System.out.println("Categoria Profissional");
       
        }else{
            System.out.println("Categoria inválida");
            
        }
        
        
        
    }
    
    
}
