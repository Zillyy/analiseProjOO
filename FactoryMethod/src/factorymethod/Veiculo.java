/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Zilly
 */
public abstract class Veiculo {
    
    protected int numeroRodas;
    protected int numeroEixos;
    protected int ano;
    protected String marca;
    protected String modelo;
    protected String cor;
    protected String placa;
    protected String chassi;

    public Veiculo(int numeroRodas, int numeroEixos, int ano, String marca, String modelo, String cor, String placa, String chassi) {
        this.numeroRodas = numeroRodas;
        this.numeroEixos = numeroEixos;
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.chassi = chassi;
    }
    
    public void getInfo() {
        System.out.println("Este veículo é um(a) " + this.modelo + " " + this.cor + " com " + this.numeroRodas + " rodas.");
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getChassi() {
        return chassi;
    }
    
}
