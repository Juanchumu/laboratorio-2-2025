package ar.edu.unlu.poo.labo2.artefactos;

public class EscribaArcano implements EstrategiaDeMejora {
	int incremento;

	public void mejorar(Artefacto artefacto){
		if( artefacto.getTipo() == "Pergamino" ){
			if(artefacto.getNivelDePoder() < 30){
				incremento =  artefacto.getNivelDePoder() +25;
				artefacto.setPoder(incremento);
			}else{
				incremento = (int) (artefacto.getNivelDePoder() - 10);
				artefacto.setPoder(incremento);
			}
		}
	
	}
}
