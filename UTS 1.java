/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uts;

/**
 *
 * @author violin
 */
class Vehicle {
    
    private String maker;
    private int kmPerGallons;
    
    protected Vehicle(String maker, int kmPerGallons) {
        
        this.maker = maker;
        this.kmPerGallons = kmPerGallons;
    }
    
    protected void setMaker(String maker) {
        
        this.maker = maker;
    }
    protected String getMaker() {
        
        return this.maker;
    }
    protected void setKmPerGallons(int kmPerGallons) {
        
        this.kmPerGallons = kmPerGallons;
    }
    protected int getKmPerGallons() {
        
        return this.kmPerGallons;
    }
    protected int bandingVehicle(int vehicle1, int vehicle2) {
        
        if(vehicle1 < vehicle2) {
            
            return 1;
        }
        else {
            
            return -1;
        }
    }
    protected int getKmPerLiters() {
        
        int kmPerLiters = this.kmPerGallons * 3785;
        return kmPerLiters;
    }
}

class VehicleTest extends Vehicle {
    
    protected VehicleTest(String maker, int kmPerGallons) {
        
        super(maker, kmPerGallons);
    }
}
public class MainVehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehicleTest vehicle1 = new VehicleTest("Premium", 20);
        VehicleTest vehicle2 = new VehicleTest("Pertamax", 10);
        
        vehicle1.setMaker("Premium");
        vehicle1.setKmPerGallons(12);
        System.out.println("Nama pembuat dari objek vehicle 1 adalah " + vehicle1.getMaker());
        System.out.println("Jumlah konsumsi bahan bakar dari objek vehicle 1 adalah " + vehicle1.getKmPerGallons());
        System.out.println("=====================================================================================");
        vehicle2.setMaker("Solar");
        vehicle2.setKmPerGallons(15);
        System.out.println("Nama pembuat dari objek vehicle 2 adalah " + vehicle2.getMaker());
        System.out.println("Jumlah konsumsi bahan bakar dari objek vehicle 2 adalah " + vehicle2.getKmPerGallons());
        System.out.println("=====================================================================================");
        int bahanVehicle1 = vehicle1.getKmPerGallons();
        int bahanVehicle2 = vehicle2.getKmPerGallons();
        System.out.println("Hasil Perbandingan Bahan bakar Vehicle 1 dan Vehicle 2 adalah " + vehicle2.bandingVehicle(bahanVehicle1, bahanVehicle2));
        System.out.println("=====================================================================================");
        System.out.println("Hasil Konversi Konsumsi Bahan Bakar Vehicle 1 = " + vehicle1.getKmPerLiters());
        System.out.println("Hasil Konversi Konsumsi Bahan Bakar Vehicle 2 = " + vehicle2.getKmPerLiters());
        
       
    }
    
}