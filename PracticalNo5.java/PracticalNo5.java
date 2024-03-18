c/*Aim: PracticalNo5
  Author: Anisha Bobade
  Version: 5.0
  Date: 27/02/2024
*/


class Emerging_Technologie {
    void forum() {
        System.out.println("Forum: General Emerging Technologies Forum");
    }
}

class AIML extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President: Aishwarya Tekade");
        System.out.println("Forum Vice President: Avanti Thakre");
        System.out.println("Forum Secretary: Gehana Pandiya");
        System.out.println("Forum Treasurer: Vishant Hakande");
        System.out.println("Event Head: Arsh Tarare");
    }
}

class AIDS extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President: Anisha Bobade");
        System.out.println("Forum Vice President: Vishranti Meshra");
        System.out.println("Forum Secretary: Rutika Joge");
        System.out.println("Forum Treasurer: Khushi Dhomane");
        System.out.println("Event Head: Mitanshi Bokade");
    }
}

class CSE extends Emerging_Technologie {
    @Override
    void forum() {
        System.out.println("Forum President: Kuldeep Tiwari");
        System.out.println("Forum Vice President: Dhanashree Supratkar");
        System.out.println("Forum Secretary: Preeti Gudadhe");
        System.out.println("Forum Treasurer: Kartik Mohod");
        System.out.println("Event Head: Himanshi Nandeshwar");
    }
}

public class PracticalNo5 {
    public static void main(String[] args) {
        AIML aimlForum = new AIML();
        AIDS aidsForum = new AIDS();
        CSE cseForum = new CSE();

        System.out.println("AIML Forum Details:");
        aimlForum.forum();
        System.out.println();

        System.out.println("AIDS Forum Details:");
        aidsForum.forum();
        System.out.println();

        System.out.println("CSE Forum Details:");
        cseForum.forum();
    }
}
