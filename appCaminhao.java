package caminhao;
import java.util.Scanner;

public class appCaminhao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CaminhaoBau caminhao1 = new CaminhaoBau(011, "Volvo 123", 2020, 2000, 'T',
                10, 2.2F, 3.5F);
        CaminhaoBau caminhao2 = new CaminhaoBau(012, "WV Turbo", 2021, 1800, 'T',
                12, 2.2F, 3.5F);
        CaminhaoBau caminhao3 = new CaminhaoBau(013, "WV T1000", 2022,
                2200, 'T', 14, 2.2F, 3.8F);

        CaminhaoTanque caminhao4 = new CaminhaoTanque(021, "Iveco Day", 2019,
                300, 'L', "Água");
        CaminhaoTanque caminhao5 = new CaminhaoTanque(022, "MB 2000", 2021,
                2500, 'L', "Combustivel");


    }
}