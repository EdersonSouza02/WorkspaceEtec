
package br.com.sp.gov.TOO;


public class Projeto_Teste {
    
    public static void main(String[]args){
        Projeto p = new Projeto();
        
    p.setId(123);
    p.setTitulo("Projeto 123");
    p.setInicio("Iniciando..");
    p.setTermino("Terminando");
    p.setFinanciadora("Financiando");
    p.setValor(13.5);
    p.setObejtivo("O obejetivo é sla");
    p.setDescricao("Descricão prefiro Netbeans");
    
        System.out.println("Id="+p.getId());
        System.out.println("Titulo="+p.getTitulo());
        System.out.println("inicio="+p.getInicio());
        System.out.println("Termino="+p.getTermino());
        System.out.println("Financiadora="+p.getFinanciadora());
        System.out.println("Valor="+p.getValor());
        System.out.println("Objetivo="+p.getObjetivo());
        System.out.println("Descricao="+p.getDescricao());
        
    
    
    
    }
    
    
}
 
