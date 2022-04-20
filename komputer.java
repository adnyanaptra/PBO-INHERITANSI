class Komputer {
    String processor = "Intel Core i9";
    String merk = "Lenovo";
    String memory = "64 GB";

    String cekKomputer() {
        return "Ini berasal dari class Komputer";
    }
}

class Laptop extends Komputer {
    String storage = "SSD 1TB";

    String cekLaptop() {
        return "Ini berasal dari class Laptop";
    }
}

class Netbook extends Laptop {
    String lihatSpec() {
        return "Merk: " + merk + ", processor: "+ processor +
                ", jumlah memory: " + memory +
                ", storage: "+ storage;
    }
    String cekNetbook() {
        return "Ini berasal dari class Netbook";
    }
}

class BelajarJava {
    public static void main(String args[]){

        Netbook netbookAndi = new Netbook();

        System.out.println(netbookAndi.lihatSpec());
        System.out.println(netbookAndi.cekKomputer());
        System.out.println(netbookAndi.cekLaptop());
        System.out.println(netbookAndi.cekNetbook());

    }
}