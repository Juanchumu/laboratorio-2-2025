package ar.edu.unlu.poo.labo2.estrategias;


import ar.edu.unlu.poo.labo2.artefactos.Artefacto;
public class ForjadorDeRunas implements EstrategiaDeMejora {
	int incremento;

	public void mejorar(Artefacto artefacto){
		if(artefacto.getTipo() == "Varita" ){
			incremento =  artefacto.getNivelDePoder() + 15;
			artefacto.setPoder(incremento);
		}
	}
}
