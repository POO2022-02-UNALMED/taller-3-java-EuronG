package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;
        numTV += 1;
    }
    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public Marca getMarca(){
        return this.marca;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return this.control;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return this.precio;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public int getCanal(){
        return this.canal;
    }
    public int getNumTV(){
        return numTV;
    }
    public void turnOn(){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void canalUp(){
        if ((canal < 120 ) && (estado)){
            this.canal += 1;
        }
    }
    public void canalDown(){
        if ((canal > 1 ) && (estado)){
            this.canal -= 1;
        }
    }
    public void volumenUp(){
        if ((volumen < 7) && (estado)){
            this.volumen += 1;
        }
    }
    public void volumenDown(){
        if ((volumen > 0) && (estado)){
            this.volumen -= 1;
        }
    }

}
