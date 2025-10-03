package Shape;
// Kelas induk
class Bentuk {
    // Method tanpa parameter
    public double luas() {
        System.out.println("Menghitung luas default...");
        return 0;
    }

    // Method overloading dengan parameter
    public double luas(double jariJari) {
        return 3.14 * jariJari * jariJari;
    }
}

// Kelas Lingkaran (overriding)
class Lingkaran extends Bentuk {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return 3.14 * jariJari * jariJari;
    }
}

// Kelas PersegiPanjang (overriding)
class PersegiPanjang extends Bentuk {
    private double lebar;
    private double tinggi;

    public PersegiPanjang(double lebar, double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double luas() {
        return lebar * tinggi;
    }
}

// Main Program
public class Polymorphism {
    public static void main(String[] args) {
        Bentuk b = new Bentuk();
        System.out.println("Overloading luas(5) = " + b.luas(5));

        Bentuk lingkaran = new Lingkaran(7);
        System.out.println("Overriding Lingkaran: " + lingkaran.luas());

        Bentuk persegi = new PersegiPanjang(4, 6);
        System.out.println("Overriding Persegi Panjang: " + persegi.luas());
    }
}
