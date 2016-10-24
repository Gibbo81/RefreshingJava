/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C03ProgramControlStatements;

import java.io.IOException;

/**
 *
 * @author cpsistemi
 */
public class Main03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //ReadChar();
        System.out.println("Read: " + ReadString());
        
        System.out.println("--------------------------------------------------");
        System.out.println("eIfLadder");
        IfElseIfLadder(2);
        IfElseIfLadder(20);
        IfElseIfLadder(11);
        IfElseIfLadder(25);
        IfElseIfLadder(34);
        
        System.out.println("--------------------------------------------------");
        System.out.println("switch test");
        Switch(3,8);
        
        System.out.println("--------------------------------------------------");
        System.out.println("switch Stacking test");
        SwitchStackingCases(2);
        SwitchStackingCases(2);
        SwitchStackingCases(4);
        SwitchStackingCases(6);
        SwitchStackingCases(8);
        SwitchStackingCases(10);
    }
    
    private static void ReadChar() throws IOException   //TODO: REMEMBER!!!
    {                       //If in java we do not catch an exception
        char ch;            //The method must signal it to the upper method in the signature
        
        ch = (char)System.in.read();
        System.out.print("the char read is: " + ch);
        
    }
    
    private static String ReadString() throws IOException
    {
        byte[] buffer = new byte[100];
        String result= "";
        
        int count = System.in.read(buffer);

        for (int x=0; x<count; x++)
            result= result + (char)buffer[x];
        return result;
    }
    
    private static void IfElseIfLadder(int value)
    {//TODO: REMEMBER!!!
        System.out.println("as soon as one condition is meet the toher one are not evalueted");
        if (value<5)
            System.out.println("value " + value + ": <5");
        else if (value<10)
            System.out.println("value " + value + ": >=5 and <10");
        else if (value<20)
            System.out.println("value " + value + ": >=10 and <20");
        else if (value<30)
            System.out.println("value " + value + ": >=20 and <30");
        else
            System.out.println("value " + value + ": >=30");
    }
    
    private static void Switch(int start, int end)
    {//TODO: REMEMBER!!!
        for(int x=start; x<=end; x++)
            switch (x)
            {
                case 0:
                    System.out.println("value 0");
                    break;
                case 1:
                    System.out.println("value 1");
                    break;
                case 2:
                    System.out.println("value 2");
                    break;
                case 3:
                    System.out.println("value 3");
                    break;
                case 4:
                    System.out.println("value 4");
                    break;
                case 5:
                    System.out.println("value 5");
                    break;
                case 6:
                    System.out.println("value 6");
                    break;                
                default:
                    System.out.println("default >6");
            }
    }
    private static void SwitchStackingCases(int x)
    {
        switch(x)
        {
            case 0:
            case 1:
            case 2:
            case 3:
                System.out.println("value beetween 0-3");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("value beetween 6-7");
                break;
            default:
                System.out.println("default >7");
        }
        
    }
}
