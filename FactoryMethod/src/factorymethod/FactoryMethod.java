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
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estacionamento
        VeiculoFactory factory = new CarroFactory();
        
        Veiculo uno = factory.criaVeiculo(0, 0, 1996, "Fiat", "Uno", "Bordô", "ABC1234", "F983U2ISFGDFO34", 0f);
        uno.getInfo();
    }
    
}
