import java.text.DecimalFormat;


public class karyawan {
    String idkaryawan,nama,usia,jabatan;
    double gaji_pokok;

    double getGajiPokok (){
         if (null == jabatan) {
            gaji_pokok = 4300000;
        }else switch (jabatan) {
            case "HRD":
                gaji_pokok = 7500000;
                break;
            case "Pemeliharaan":
                gaji_pokok = 6000000;
                break;
             case "Staff":
                gaji_pokok = 4800000;
                break;
              case "Cybersecurity":
                gaji_pokok = 12000000;
                break;
            default:
                gaji_pokok = 4000000;
                break;
        }
        return gaji_pokok;
    }


    void cetak () {
        DecimalFormat df = new DecimalFormat ("##0,000");

         System.out.println("------ Detil  Karyawan ------");
        System.out.println("ID Karyawan : "+ this.idkaryawan);
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Jabatan     : "+ this.jabatan);
        System.out.println("Gaji Pokok  : Rp."+ df.format(getGajiPokok()));
        System.out.println("Uang Makan  : Rp.100,000 ");

    }

    }
    