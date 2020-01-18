package enumtipovi;

public enum VrstaGoriva {
    BENZIN, DIZEL, GAS, ELEKTRICNA_ENERGIJA;

    @Override
    public String toString() {
        String gorivo = "";

        switch (this) {
            case BENZIN:
                gorivo = "benzin";
                break;
            case DIZEL:
                gorivo = "dizel";
                break;
            case GAS:
                gorivo = "gas";
                break;
            case ELEKTRICNA_ENERGIJA:
                gorivo = "elektricna energija";
                break;
            default:
                System.out.println("Greska u unosu");
                break;

        }
        return gorivo;
    }

    public static VrstaGoriva fromSkracenica(String skracenica) {
        VrstaGoriva vrstaGoriva = null;
        switch (skracenica.toUpperCase().trim()) {
            case "B":
                vrstaGoriva = BENZIN;
                break;
            case "D":
                vrstaGoriva = DIZEL;
                break;
            case "G":
                vrstaGoriva = GAS;
                break;
            case "E":
                vrstaGoriva = ELEKTRICNA_ENERGIJA;
                break;

        }
        return vrstaGoriva;
    }

}
