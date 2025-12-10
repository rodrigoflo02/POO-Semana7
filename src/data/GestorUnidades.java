package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;


public class GestorUnidades {
    private List<UnidadOperativa> ListaUnidadOperativa = new ArrayList<>();



    public void CargarInstancias(){
        PlantaProceso plantaproceso1 = new PlantaProceso("Planta Frutillar", "Frutillar", 6.5, 6);
        PlantaProceso plantaproceso2 = new PlantaProceso("Planta Puerto Montt", "Puerto Montt", 10.0, 10);
        CentroCultivo centrocultivo1 = new CentroCultivo("Centro Pichipelluco", "Pichipelluco", 4.0, 3);
        CentroCultivo centrocultivo2 = new CentroCultivo("Centro Mirasol", "Mirasol", 4.0, 3);
        PlantaProceso plantaproceso3 = new PlantaProceso("Planta Cochamo", "Cochamo", 14.0, 8);

        ListaUnidadOperativa.add(plantaproceso1);
        ListaUnidadOperativa.add(plantaproceso2);
        ListaUnidadOperativa.add(plantaproceso3);
        ListaUnidadOperativa.add(centrocultivo1);
        ListaUnidadOperativa.add(centrocultivo2);
    }

    //CREAMOS UN GETTER PARA FACILITAR LA OBTENCION DE INFORMACION DE LA LISTA
    public List<UnidadOperativa> getListaUnidadOperativa() {
        return ListaUnidadOperativa;
    }

    public void RecorrerLista(){
        for (UnidadOperativa UO : getListaUnidadOperativa()){
            UO.mostrarInformacion();
        }
    }


}
