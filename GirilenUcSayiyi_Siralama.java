import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class GirilenUcSayiyi_Siralama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen 1. sayiyi giriniz : ");
        int birinciSayi = scanner.nextInt();
        System.out.print("lütfen 2. sayiyi giriniz : ");
        int ikinciSayi = scanner.nextInt();
        System.out.print("lütfen 3. sayiyi giriniz : ");
        int ucuncusayi = scanner.nextInt();
        int enBuyuk=0;
        int ortanca=0;
        int enKucuk=0;
        if(birinciSayi>ikinciSayi&&birinciSayi>ucuncusayi){
            enBuyuk=birinciSayi;
        }
        else{
            enKucuk=birinciSayi;
        }
        if(ikinciSayi>birinciSayi&&ikinciSayi>ucuncusayi){
           enBuyuk=ikinciSayi;
        }
        else{
           enKucuk=ikinciSayi;
        }
        if(ucuncusayi>ikinciSayi&&ucuncusayi>birinciSayi){
            enBuyuk=ucuncusayi;
        }
        else{
            enKucuk=ucuncusayi;
        }
        if(birinciSayi==enBuyuk||ikinciSayi==enBuyuk){
            ortanca=ucuncusayi;
            
        }
        if(birinciSayi==enBuyuk||ucuncusayi==enBuyuk){
            ortanca=ikinciSayi;
            
        }
        if(ikinciSayi==enBuyuk||ucuncusayi==enBuyuk){
            ortanca=birinciSayi;
            
        }

System.out.print("sayıların sıralaması (büyükten küçüğe): "+enBuyuk+","+ortanca+","+enKucuk);
    }
}