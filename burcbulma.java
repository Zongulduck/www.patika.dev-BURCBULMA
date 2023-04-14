import java.util.Scanner;
public class burcbulma {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int ay,gun;
        System.out.println("Hangi ayda doğdunuz (0-12)?");
        ay= inp.nextInt();
        System.out.println("Hangi gün doğdunuz (0-31)?");
        gun= inp.nextInt();

        if(ay==1){
            if(gun<=21 && gun>=1){
                System.out.println("Oğlak burcusunuz");
            }
            else if(gun>=22 && gun<=31){
                System.out.println("Kova burcusunuz.");
            }
        }
        else if(ay==2){
            if(gun<=19 && gun>=1){
                System.out.println("Kova burcusunuz.");
            }
            else if(gun>=20 && gun<=31){
                System.out.println("Balık burcusunuz.");
            }
        }
        else if(ay==3){
            if(gun<=20 && gun>=1){
                System.out.println("Balık burcusunuz.");
            }
            else if(gun>=21 && gun<=31){
                System.out.println("Koç burcusunuz.");
            }
        }
        else if(ay==4){
            if(gun<=20 && gun>=1){
                System.out.println("Koç burcusunuz.");
            }
            else if(gun>=21 && gun<=31){
                System.out.println("Boğa burcusunuz.");
            }
        }
        else if(ay==5){
            if(gun<=21 && gun>=1){
                System.out.println("Boğa burcusunuz.");
            }
            else if(gun>=22 && gun<=31){
                System.out.println("İkizler burcusunuz.");
            }
        }
        else if(ay==6){
            if(gun<=22 && gun>=1){
                System.out.println("İkizler burcusunuz.");
            }
            else if(gun>=23 && gun<=31){
                System.out.println("Yengeç burcusunuz.");
            }
        }
        else if(ay==7){
            if(gun<=22 && gun>=1){
                System.out.println("Yengeç burcusunuz.");
            }
            else if(gun>=23 && gun<=31){
                System.out.println("Aslan burcusunuz.");
            }
        }
        else if(ay==8){
            if(gun<=22 && gun>=1){
                System.out.println("Aslan burcusunuz.");
            }
            else if(gun>=23 && gun<=31){
                System.out.println("Başak burcusunuz.");
            }
        }
        else if(ay==9){
            if(gun<=22 && gun>=1){
                System.out.println("Başak burcusunuz.");
            }
            else if(gun>=23 && gun<=31){
                System.out.println("Terazi burcusunuz.");
            }
        }
        else if(ay==10){
            if(gun<=22 && gun>=1){
                System.out.println("Terazi burcusunuz.");
            }
            else if(gun>=23 && gun<=31){
                System.out.println("Akrep burcusunuz.");
            }
        }
        else if(ay==11){
            if(gun<=21 && gun>=1){
                System.out.println("Akrep burcusunuz.");
            }
            else if(gun>=22 && gun<=31){
                System.out.println("Yay burcusunuz.");
            }
        }
        else if(ay==12){
            if(gun<=21 && gun>=1){
                System.out.println("Yay burcusunuz.");
            }
            else if(gun>=22 && gun<=31){
                System.out.println("Oğlak burcusunuz.");
            }
        }
        else{
            System.out.println("yanlış bilgi girdiniz yeniden başlatın");
        }
        if(gun>31 || gun<1){
            System.out.println("yanlış bilgi girdiniz yeniden başlatın");
        }
    }
}
