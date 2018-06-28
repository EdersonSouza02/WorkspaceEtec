package br.com.sp.gov.OO;


 public class Ex58OO {
   
    
        public static void calculaAumentoSalario(double salario){
      
            salario = 0;
        double salariofim;
        
        
        if (salario <= 600.00) {
        salariofim = (salario * 0.30) + salario;

                System.out.println("O seu novo salario ser de : " + salariofim + " R$ ");

        }
        
        if (salario >= 600.01 && salario <= 1100) {

                salariofim = (salario * 0.25) + salario;

                System.out.println("O seu novo salario ser de : " + salariofim + " R$ ");
            
    
    }
        if (salario >= 1100 && salario <= 2400) {
            

                salariofim = (salario * 0.20) + salario;

                System.out.println("O seu novo salario ser de : " + salariofim + " R$ ");
            }
            
            if (salario >= 2400 && salario <= 3550) {

                salariofim = (salario * 0.15) + salario;

                System.out.println("O seu novo salario ser de : " + salariofim + " R$ ");

            }
            
            if (salario > 3550) {

                salariofim = (salario * 0.10) + salario;

                System.out.println("O seu novo salario ser de : " + salariofim + " R$ ");

            }
       
            
            
    
    
}
}
            
       
        
        
        
        
    


        
        
        
        
     
        
    
    
    
        
        
    
    
    
    

