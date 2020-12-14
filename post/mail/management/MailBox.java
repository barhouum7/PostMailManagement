public class MailBox {

    Courier[] crr;

    public MailBox(int n) {
        crr = new Courier[n];
    }

    public double affranchir() {
        double totalCost = 0;
        for (int i = 0; i < crr.length; i++)
            totalCost += crr[i].affranchir();

        return totalCost;
    }

    public int CourierInvalide() {
        int nbr = 0;
        for (int i = 0; i < crr.length; i++) {
            if (!crr[i].estValide())
                nbr++;
        }
        return nbr;
    }

    public void display() {
        for (int i = 0; i < crr.length; i++) {
            if (!crr[i].estValide()) {
                System.out.println("\n**********Les Couriers Invalides:");
                crr[i].decrire();
            } else {
                System.out.println("\n**********Les Couriers Valides:");
                crr[i].decrire();
            }
        }
    }

    public static void main(String[] args) {
        Courier crr = new Courier(true, "47 Street MZH");
        if (crr.estValide())
            System.out.println("\nAddress est Valid.");
        else
            System.out.println("\nAddress non Valid.");

        crr.decrire();
        System.out.println(crr.affranchir());

        System.out.println("\n----------------------------------");

        Letter ltr = new Letter(true, "47 Street MZH", 50);
        ltr.setFormat("A4");
        ltr.decrire();
        System.out.println(ltr.affranchir());

        Pack Pack = new Pack(true, "47 Street Mz", 50, 10);
        Pack.decrire();
        System.out.println(Pack.affranchir());

        System.out.println("\n----------------------------------");

        MailBox boxCor = new MailBox(4);
        Courier c = new Letter(true, "47 Street MZH", 50);
        ((Letter) c).setFormat("A4");
        boxCor.crr[0] = c;
        Courier c1 = new Letter(true, "", 50);
        ((Letter) c1).setFormat("A4");
        boxCor.crr[1] = c1;
        Courier c2 = new Pack(true, "47 St MH", 50, 10);
        boxCor.crr[2] = c2;
        Courier c3 = new Pack(true, "", 50, 10);
        boxCor.crr[3] = c3;
        boxCor.display();
        System.out.println("\n---------\n Total Cost: " + boxCor.affranchir());
        System.out.println("\n---------\n Nombre de Courier Invalide: " + boxCor.CourierInvalide());
    }
}
