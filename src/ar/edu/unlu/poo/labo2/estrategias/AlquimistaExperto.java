package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora {
	int incremento;

	public void mejorar(Artefacto artefacto){
		if( artefacto.getTipo() == "Poción" ){
			if(artefacto.getNivelDePoder() < 80){
				incremento =  artefacto.getNivelDePoder() +20;
				artefacto.setPoder(incremento);
			}else{
				artefacto.setPoder(100);
			}

		}
	}
}
