/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DMH Hirosh
 */
public class SimpleNeuron {

    boolean org[];
    
    public SimpleNeuron(boolean[] org) {
        this.org = org;
    }

    public int distance(boolean[] in) {
        int distance = 0;
        int i = 0;
        for (boolean n : org) {
            if (org[i] != in[i]) {
                ++distance;
            }
            //System.out.println(i);
            i++;
            
        }
        return distance;
    }

    public static void main(String[] args) {
        boolean org[] = {true, true, true};
        boolean in[] = {false, false, false};
        SimpleNeuron simpleNeuron = new SimpleNeuron(org);
        System.out.println(simpleNeuron.distance(in));
        boolean in2[] = {true, false, false};
        System.out.println(simpleNeuron.distance(in2));
    }

}
