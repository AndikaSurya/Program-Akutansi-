/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangun;

/**
 *
 * @author Asus
 */
public abstract  class abstrak {
    
    abstract  void luas();
    abstract  void keliling();
    
     String jelas;
    private double  panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double jari;
    private double sisi;
    private double sisi2;
    private double sisi3;
    private double sisi4;
    
   
    
    public abstrak(String jelas)
            {
                this.jelas=jelas;
            }
    public abstrak()
    {
        
    }

 

    /**
     * @return the panjang
     */
    public double getPanjang() {
        return panjang;
    }

    /**
     * @param panjang the panjang to set
     */
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    /**
     * @return the lebar
     */
    public double getLebar() {
        return lebar;
    }

    /**
     * @param lebar the lebar to set
     */
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    /**
     * @return the alas
     */
    public double getAlas() {
        return alas;
    }

    /**
     * @param alas the alas to set
     */
    public void setAlas(double alas) {
        this.alas = alas;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    /**
     * @return the jari
     */
    public double getJari() {
        return jari;
    }

    /**
     * @param jari the jari to set
     */
    public void setJari(double jari) {
        this.jari = jari;
    }

    /**
     * @return the sisi
     */
    public double getSisi() {
        return sisi;
    }

    /**
     * @param sisi the sisi to set
     */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /**
     * @return the sisi2
     */
    public double getSisi2() {
        return sisi2;
    }

    /**
     * @param sisi2 the sisi2 to set
     */
    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }
        public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double getSisi4() {
        return sisi4;
    }

    public void setSisi4(double sisi4) {
        this.sisi4 = sisi4;
    }

    /**
     * @return the jelas
     */
    public String getJelas() {
        return jelas;
    }

    /**
     * @param jelas the jelas to set
     */
    public void setJelas(String jelas) {
        this.jelas = jelas;
    }
    
    
    
}
