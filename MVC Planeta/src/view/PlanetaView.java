package view;

import java.util.List;

import model.Planeta;

public class PlanetaView {
    public void exibirListaDePlaneta(List<Planeta> planeta) {
    	
        System.out.println("==== Lista de Pa�ses ====");
        System.out.println("--------------------");
        
        
        for (Planeta planetas : planeta) {
            System.out.println("Planeta: " + planetas.getNome()) ;
            				   
        }
        
        System.out.println("--------------------");
    }
    
    public void removerPlaneta(boolean planetaRemovido) {
    	
        if (planetaRemovido) {
        	System.out.println("Planeta removido com sucesso!\n");
        } else {
        	System.out.println("Planeta n�o encontrado na lista.\n");
        }
    }
    
        public void limparListaDePlaneta() {
        System.out.println("Lista de pa�ses foi limpa!\n");
    }
    
    public void exibirPlaneta(Planeta planeta) {
    	System.out.println("Pa�s: " + planeta.getNome());
				   		
    }
    
       public void exibirMensagem(String msg) {
    	System.out.println(msg);
    }
}
