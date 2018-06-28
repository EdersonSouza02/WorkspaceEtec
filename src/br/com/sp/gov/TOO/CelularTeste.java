package br.com.sp.gov.TOO;

public class CelularTeste {

    public static void main(String[] args) {
        Celular c = new Celular();
        c.setImei("123");
        c.setModelo("K4");
        c.setMarca("LG");
        c.setVersao("1.6");
        c.setAno(2016);
        c.setSistemaOperacional("Android");
        c.setCor("Preto");
        c.setConvenio("Não Possui");

        System.out.println("Imei=" + c.getImei());
        System.out.println("Modelo=" + c.getModelo());
        System.out.println("Marca=" + c.getMarca());
        System.out.println("Versao=" + c.getVersao());
        System.out.println("Ano=" + c.getAno());
        System.out.println("SistemaOperacional=" + c.getSistemaOperacional());
        System.out.println("Cor=" + c.getCor());
        System.out.println("Convenio=" + c.getConvenio());

        c.Entreter();

    }

}
        
        
