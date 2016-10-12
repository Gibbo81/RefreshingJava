/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroducingDataTypesandOperators_02;

/**
 *
 * @author cpsistemi
 */
public class LightningSound {
    private final double LightSpeed = 1100;
    
    public double Distance(double time)
    {
        return time * LightSpeed;
    }
}
