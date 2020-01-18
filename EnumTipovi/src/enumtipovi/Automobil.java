
package enumtipovi;


public class Automobil {
    private VrstaGoriva vrstaGoriva;
    private String model;

    public Automobil() {
    }

    public Automobil(VrstaGoriva vrstaGoriva, String model) {
        this.vrstaGoriva = vrstaGoriva;
        this.model = model;
    }

    Automobil(VrstaGoriva fromString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public VrstaGoriva getVrstaGoriva() {
        return vrstaGoriva;
    }

    public void setVrstaGoriva(VrstaGoriva vrstaGoriva) {
        this.vrstaGoriva = vrstaGoriva;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
}
