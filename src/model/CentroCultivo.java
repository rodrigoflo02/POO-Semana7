package model;

public class CentroCultivo  extends UnidadOperativa {

    private double toneladasproduccion;
    private int numerojaulas;


    public CentroCultivo(String nombre, String comuna, double toneladasproduccion, int numerojaulas) {
        super(nombre, comuna);
        this.toneladasproduccion = toneladasproduccion;
        this.numerojaulas = numerojaulas;

    }

    public double getToneladasproduccion() {
        return toneladasproduccion;
    }

    public int getNumerojaulas() {
        return numerojaulas;
    }


    @Override
    public void mostrarInformacion(){
        System.out.println("Centro de Cultivos: " + getNombre() + ", Comuna: " + getComuna() + ", Toneladas de produccion: " + toneladasproduccion + ", Numeros de jaulas: " + numerojaulas);
    }
}
