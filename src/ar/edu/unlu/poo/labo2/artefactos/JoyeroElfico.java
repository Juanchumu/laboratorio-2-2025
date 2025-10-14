package ar.edu.unlu.poo.labo2.artefactos;

public class JoyeroElfico implements EstrategiaDeMejora {
	int incremento;

	public void mejorar(Artefacto artefacto){
		if( artefacto.getTipo() == "Amuleto" ){
			if(artefacto.getNivelDePoder() < 50){
				incremento =  artefacto.getNivelDePoder() *2;
				artefacto.setPoder(incremento);
			}else{
				incremento = (int) (artefacto.getNivelDePoder() * 1.25);
				artefacto.setPoder(incremento);
			}
		}	
	}
}
