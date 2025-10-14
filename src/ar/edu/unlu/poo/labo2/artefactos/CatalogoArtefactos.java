package ar.edu.unlu.poo.labo2.artefactos;


import java.util.*;

public class CatalogoArtefactos {

	public CatalogoArtefactos(){

	}

	Set<EstrategiaDeMejora> conjuntoDeEstrategias = new HashSet<>();
	//constructor
	public CatalogoArtefactos(EstrategiaDeMejora estrategia){
		agregarEstrategia(estrategia);
	}
	//metodo
	public void agregarEstrategia(EstrategiaDeMejora estrategia) {
    conjuntoDeEstrategias.add(estrategia);
	}

	void aplicarMejoras(){
		for (EstrategiaDeMejora estrategia : conjuntoDeEstrategias){
			for (Artefacto artefacto : conjuntoDeArtefactos) {
				estrategia.mejorar(artefacto);
			}
		}
	}

