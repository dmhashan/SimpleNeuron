/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMH Hirosh
 */
public class InterConnector {

    boolean h1[] = {true, false, true};
    boolean h2[] = {true, true, true};
    boolean h3[] = {true, false, true};
    boolean t1[] = {true, true, true};
    boolean t2[] = {false, true, false};
    boolean t3[] = {false, true, false};

    SimpleNeuron hNeuron1 = new SimpleNeuron(h1);
    SimpleNeuron hNeuron2 = new SimpleNeuron(h2);
    SimpleNeuron hNeuron3 = new SimpleNeuron(h3);
    SimpleNeuron tNeuron1 = new SimpleNeuron(t1);
    SimpleNeuron tNeuron2 = new SimpleNeuron(t2);
    SimpleNeuron tNeuron3 = new SimpleNeuron(t3);

    public int disH, disT;
    public int preH, preT;

    public int calH(boolean user1[], boolean user2[], boolean user3[]) {
        disH = hNeuron1.distance(user1) + hNeuron2.distance(user2) + hNeuron3.distance(user3);
        return preH = 100 - (disH * 100 / 9);
    }

    public int calT(boolean user1[], boolean user2[], boolean user3[]) {
        disT = tNeuron1.distance(user1) + tNeuron2.distance(user2) + tNeuron3.distance(user3);
        return preT = 100 - (disT * 100 / 9);
    }

    public String prediction() {
        if (preH == 100) {
            return "H (100% accurated result)";
        } else if (preT == 100) {
            return "T (100% accurated result)";
        } else if (preH > preT) {
            return "<html>It's most probability H uder " + preH + "% accurate percentage, " + (100 - preH) + "% error percentage, " + (preH - preT) + "% differentiate percentage.<html>";
        } else if (preH < preT) {
            return "<html>It's most probability T uder " + preT + "% accurate percentage, " + (100 - preT) + "% error percentage, " + (preT - preH) + "% differentiate percentage.<html>";
        } else {
            return "<html>H/T (Both the H and T have same, " + preH + "% accurate percentage)<html>";
        }
    }

    public static void main(String[] args) {
        boolean org[] = {true, true, true};
        boolean in[] = {false, false, false};
        SimpleNeuron simpleNeuron = new SimpleNeuron(org);
        System.out.println("Distance = " + simpleNeuron.distance(in));
    }
}
