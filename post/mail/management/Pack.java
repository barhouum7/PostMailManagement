public class Pack extends Courier {

    private double weight;
    private double volume;

    public Pack(boolean modeDexpedition, String destinationAddress, double weight, double volume) {
        super(modeDexpedition, destinationAddress);
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public void decrire() {
        System.out.println("\n--------------\nFrom Pack Class:\n");
        super.decrire();
        System.out.println("\nWeight= " + this.weight + " | Volume= " + this.volume);
    }

    @Override
    public double affranchir() {
        if (estValide()) {
            // System.out.println("\nCost of a Pack =");
            return 0.25 * this.volume + (this.weight) * 1.0;
        }
        System.out.println("\nDestination Address undefined!");
        return 0;
    }

}
