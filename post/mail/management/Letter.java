public class Letter extends Courier {
    private double weight;
    private String format;

    public Letter(boolean modeDexpedition, String destinationAddress, double weight) {
        super(modeDexpedition, destinationAddress);
        this.weight = weight;
        // this.format = format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void decrire() {
        System.out.println("\n--------------\nFrom Letter Class:\n");
        super.decrire();
        System.out.println("\nWeight= " + this.weight + " | Format= " + this.format);
    }

    @Override
    public double affranchir() {
        if (estValide()) {
            if (this.format.equals("A3")) {
                if (super.getModeDexpedition() == true) {
                    // System.out.println("\nExpress Mode. Cost of `A3` Format=");
                    return (3.50 + 0.5) * (this.weight) * 2;
                }
                // System.out.println("\nNormal Mode. Cost of `A3` Format=");
                return (3.50 + 0.5) * (this.weight);
            }
            if (this.format.equals("A4")) {
                if (super.getModeDexpedition() == true) {
                    // System.out.println("\nExpress Mode. Cost of `A4` Format=");
                    return (2.50 + 0.5) * (this.weight) * 2;
                }
                // System.out.println("\nNormal Mode. Cost of `A4` Format=");
                return (2.50 + 0.5) * (this.weight);
            }

        }
        System.out.println("\nDestination Address undefined!");
        return 0;
    }

}
