/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade_pattern;

/**
 *
 * @author fa20-bse-127
 */
public class Client {

public static void main(String[] args) {
ShopKeeper shopKeeper = new ShopKeeper();
shopKeeper.sellIPhone();

shopKeeper.sellSamsung();
shopKeeper.sellBlackberry();

}
}
