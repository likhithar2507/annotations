package com.harman.Annotations;

public class RBI {
    public int getInterestRate() {
        return 1;
    }

}
class SBI extends RBI {
    @Override
    public int getInterestRate() {
        super.getInterestRate();
        return 2;
    }

}
@Deprecated
class axis extends RBI {
    @Override
    public int  getInterestRate() {
        super.getInterestRate();
        return 3;
    }

}
class ICICI extends RBI {
    @Override
    public int  getInterestRate() {
        super.getInterestRate();
        return 4 ;
    }

    public static void main(String args[]) {
        @SuppressWarnings("unused")
        int y;
        RBI rbi=new RBI();
        RBI sbi=new SBI();
        RBI ax=new axis();
        RBI ic=new ICICI();
        int Rbi=rbi.getInterestRate();
        int Sbi=sbi.getInterestRate();
        int Axis=ax.getInterestRate();
        int Icici=ic.getInterestRate();
        System.out.println(Rbi);
        System.out.println(Sbi);
        System.out.println(Axis);
        System.out.println(Icici);
    }

}