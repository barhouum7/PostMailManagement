
public class Courier {
    private boolean modeDexpedition;
    private String destinationAddress;
    private final double basicTarif = 0.5;

    public Courier(boolean modeDexpedition, String destinationAddress) {
        this.modeDexpedition = modeDexpedition;
        this.destinationAddress = destinationAddress;
    }

    public boolean getModeDexpedition() {
        return this.modeDexpedition;
    }

    public boolean estValide() {
        return this.destinationAddress.length() > 0;
    }

    public void decrire() {
        System.out.println("Info of this Courier are: Address de destination= " + this.destinationAddress
                + " | Mode Dexpedition= " + this.modeDexpedition);
    }

    public double affranchir() {
        if (estValide()) {
            if (this.modeDexpedition == true) {
                System.out.println("\nExpress Mode. Cost=");
                return this.basicTarif * 2;
            }
            System.out.println("\nNormal Mode. Cost=");
            return this.basicTarif;

        }
        System.out.println("\nDestination Address undefined!");
        return 0;
    }
}