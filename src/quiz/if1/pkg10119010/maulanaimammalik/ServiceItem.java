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
public interface ServiceItem {
    
    public void displayService();
    public float getPrice(int serviceItem);
    public boolean checkMemberStatus(String statusMember);
    public float getSale(boolean isMember, float parServicePrice);
}
