package br.com.sp.gov.TOO;


public class Telefone_Teste {
    public static void main(String[]args){
        Telefone t = new Telefone();
        
    t.setId(234);
    t.setTipo("Exemplo");
    
    t.setNumero(123);
    
        System.out.println("Id="+t.getId());
        System.out.println("Tipo="+t.getTipo());
        System.out.println("Numero="+t.getNumero());
               
    
    
    
    }
    
    
}
