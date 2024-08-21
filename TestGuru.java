import java.util.Scanner;

//Driver Class
public class TestGuru {

    public static void main(String[] args) {
        java.util.Scanner in = new Scanner(System.in);

        System.out.println("Nama :");
        String nama = in.nextLine();
        System.out.println("Mapel :");
        String mapel = in.nextLine();
        System.out.println("Alamat :");
        String alamat = in.nextLine();
        System.out.println("ID :");
        String id = in.nextLine();



        //membuat obyek
        Guru aulia = new Guru();
        Guru pasha = new Guru();
        Guru nasikin = new Guru();
        Guru rahmad = new Guru();
        Guru diaur = new Guru();



        
    

        aulia.id = 1;
        aulia.nama = "Aulia";
        aulia.mapel = "Produktif";
        aulia.alamat = "Malang";

            System.out.println("ini data Aulia");
            System.out.println(aulia.id);
            System.out.println(aulia.nama);
            System.out.println(aulia.mapel);
            System.out.println(aulia.alamat);


        pasha.id = 2;
        pasha.nama = "Pasha";
        pasha.mapel = "Produktif";
        pasha.alamat = "Malang";
            System.out.println("ini data Pasha");
            System.out.println(pasha.id);
            System.out.println(pasha.nama);
            System.out.println(pasha.mapel);
            System.out.println(pasha.alamat);


        nasikin.id = 3;
        nasikin.nama = "Nasikin";
        nasikin.mapel = "Bk";
        nasikin.alamat = "Malang";
            System.out.println("ini data Nasikin");
            System.out.println(nasikin.id);
            System.out.println(nasikin.nama);
            System.out.println(nasikin.mapel);
            System.out.println(nasikin.alamat);

        rahmad.id = 4;
        rahmad.nama = "Rahmad";
        rahmad.mapel = "Ipas";
        rahmad.alamat = "Malang";
            System.out.println("ini data Rahmad");
            System.out.println(rahmad.id);
            System.out.println(rahmad.nama);
            System.out.println(rahmad.mapel);
            System.out.println(rahmad.alamat);


        diaur.id = 5;
        diaur.nama = "Diaur";
        diaur.mapel = "Pjok";
        diaur.alamat = "Malang";
            System.out.println("ini data Diaur");
            System.out.println(diaur.id);
            System.out.println(diaur.nama);
            System.out.println(diaur.mapel);
            System.out.println(diaur.alamat);

        aulia.print();
        pasha.print();
        nasikin.print();
        rahmad.print();
        diaur.print();

    }
}


        
            
