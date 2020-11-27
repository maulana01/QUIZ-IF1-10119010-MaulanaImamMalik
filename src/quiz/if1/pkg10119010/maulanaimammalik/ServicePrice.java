/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119010.maulanaimammalik;

/**
 *
 * @author MIM
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF-1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan aktivitas seseorang dengan 
 *                     berbasis objek
 */
public class ServicePrice implements ServiceItem {
    private float priceService, discount;
    
    public float getPriceService() {
        return this.priceService;
    }
    
    public void setPrice (float priceService) {
        this.priceService = priceService;
    }
    
    @Override
    public void displayService() {
        System.out.println("#*************************#");
        System.out.println("#***Rock n Roll Haircut***#");
        System.out.println("#*******Service List******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*************************#");
    }
    
    @Override
    public float getPrice(int serviceItem) {
        
    }
    
    @Override
    public boolean checkMemberStatus(String statusMember) {
        if(statusMember.equals("yes")) {
            
        } else {
            
        }
    }
    
    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        
    }
    
    public float getTotalPay(float priceService, float discount) {
        
    }
    
}
