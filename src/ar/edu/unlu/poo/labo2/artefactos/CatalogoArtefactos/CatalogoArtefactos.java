package ar.edu.unlu.poo.labo2.artefactos.CatalogoArtefactos;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;
import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

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


//parte vieja
  Set<Artefacto> conjuntoDeArtefactos = new HashSet<>();

  public void agregarArtefacto(Artefacto unArtefactoNuevo) {
    conjuntoDeArtefactos.add(unArtefactoNuevo);
  }

  public Set<Artefacto> obtenerArtefactosUnicos() {
    return conjuntoDeArtefactos;
  }

  public List<Artefacto> buscarArtefactosPorTipo(String unTipo) {
    List<Artefacto> listaPorTipo =  new ArrayList<>();
    for (Artefacto artefacto : conjuntoDeArtefactos) {
      if (artefacto.getTipo().equals(unTipo)) {
        listaPorTipo.add(artefacto);
      }
    }
    listaPorTipo.sort((arti1, arti2) -> Integer.compare(arti2.getPoder(), arti1.getPoder()));
    return listaPorTipo;
  }

  public Map<String, Integer> contarArtefactosPorTipo() {
    Map<String, Integer> cantidadArtefactosPorTipo = new HashMap<>();
    for (Artefacto artefacto : conjuntoDeArtefactos) {
      cantidadArtefactosPorTipo.merge(artefacto.getTipo(), 1, Integer::sum);
    }
    return cantidadArtefactosPorTipo;
  }

  public Artefacto obtenerArtefactoMasPoderoso() {
    if (conjuntoDeArtefactos == null || conjuntoDeArtefactos.isEmpty()) {
      return null;
    }
    return Collections.max(conjuntoDeArtefactos, Comparator.comparing(Artefacto::getPoder));
  }
}

