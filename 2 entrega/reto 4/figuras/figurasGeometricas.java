package figuras;

public class figurasGeometricas {

    private double area;
    private double perimetro;

    public figurasGeometricas(){

    }

    public figurasGeometricas(double area,double perimetro){

        this.area=area;
        this.perimetro=perimetro;

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    
    
}
