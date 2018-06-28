package br.com.sp.gov.TOO;


public class ContatoTeste {
  public static void main(String[]args){
      Contato c= new Contato();
      
      c.setNome("Ederson");
      c.setEmail("Edersonfulano@gmail.com");
      
      c.setTelefone("3423423");
      c.setId(1);
      
      System.out.println("Nome="+c.getNome());
      System.out.println("Email="+c.getEmail());
      System.out.println("Telefone="+c.getTelefone());
      System.out.println("Id="+c.getId());
      
      
      
      
      
      
  }
    
    
}
