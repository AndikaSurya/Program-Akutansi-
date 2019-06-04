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
public abstract class Inisial {
     abstract void volume();
    abstract void luas();
   private double jari;
   private double sisi1;
   private double sisi2;
   private String jelas;
   private double sisi;
   private double tinggi;
   
  public Inisial()
  {
      
  }
  public Inisial(String jelas)
  {
      this.jelas = jelas;
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
     * @return the sisi1
     */
    public double getSisi1() {
        return sisi1;
    }

    /**
     * @param sisi1 the sisi1 to set
     */
    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
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
}
