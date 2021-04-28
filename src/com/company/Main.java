package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        BigInteger[] v=new BigInteger[5];
        BigInteger n=new BigInteger(String.valueOf(267647363656758756L));
        BigInteger na=new BigInteger(String.valueOf(2737384656758756L));
        BigInteger nq=new BigInteger(String.valueOf(9568897556758756L));
        BigInteger njk=new BigInteger(String.valueOf(56877456758756L));
        BigInteger nl=new BigInteger(String.valueOf(12234566758756L));
        v[0]=n;
        v[1]=na;
        v[2]=njk;
        v[3]=nq;
        v[4]=nl;
        BigInteger[] t=new BigInteger[5];
        t=incertion.sort(v);
        for (int u=0;u<t.length;u++){
            System.out.println(t[u]);
        }
        }

}
