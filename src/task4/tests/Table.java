package task4.tests;

import java.util.Vector;

public class Table {

    // points:
    public static Vector<Double> xNegative = new Vector<>();
    public static Vector<Double> xPositive = new Vector<>();

    // trigonometric:
    public static Stub sin;
    public static Stub cos;
    public static Stub tan;
    public static Stub csc;
    public static Stub sec;

    // logarithmic:
    public static Stub log;
    public static Stub log2;

    // big functions:
    public static Stub funLog;
    public static Stub funTrg;

    // main function:
    public static Stub fun;

    static {
        xNegative.add(-0.40);
        xNegative.add(-1.00);
        xNegative.add(-1.43);
        xNegative.add(-1.70);
        xNegative.add(-2.06);
        xNegative.add(-2.54);
        xNegative.add(-3.42);
        xNegative.add(-3.87);
        xNegative.add(-4.57);
        xNegative.add(-4.90);
        xNegative.add(-5.40);
        xNegative.add(-5.90);

        xPositive.add(0.1);
        xPositive.add(0.6);
        xPositive.add(1.4);
        xPositive.add(2.7);
        xPositive.add(7.3);
        xPositive.add(3.0);
        xPositive.add(5.0);
        xPositive.add(10.);

        // trigonometric:
        sin = new Stub();
        cos = new Stub();
        tan = new Stub();
        csc = new Stub();
        sec = new Stub();

        // logarithmic:
        log = new Stub();
        log2 = new Stub();

        //
        funLog = new Stub();
        funTrg = new Stub();
        fun = new Stub();
        //

        sin.addPair(-0.4, -0.3894183);
        sin.addPair(-1.0, -0.841470);
        sin.addPair(-1.43, -0.9901045603);
        sin.addPair(-1.7, -0.99166481);
        sin.addPair(-2.06, -0.882707);
        sin.addPair(-2.54, -0.5659562304);
        sin.addPair(-3.42, 0.2748246703);
        sin.addPair(-3.87, 0.665681);
        sin.addPair(-4.57, 0.989879);
        sin.addPair(-4.9, 0.982452);
        sin.addPair(-5.4, 0.772764);
        sin.addPair(-5.9, 0.3738766);

        cos.addPair(-0.4, 0.9210609);
        cos.addPair(-1.0, 0.5403023);
        cos.addPair(-1.43, 0.1403316058);
        cos.addPair(-1.7, -0.12884449);
        cos.addPair(-2.06, -0.469923);
        cos.addPair(-2.54, -0.8244352887);
        cos.addPair(-3.42, -0.961494358);
        cos.addPair(-3.87, -0.746235);
        cos.addPair(-4.57, -0.1419083);
        cos.addPair(-4.9, 0.1865123);
        cos.addPair(-5.4, 0.634692);
        cos.addPair(-5.9, 0.927478);

        csc.addPair(-0.4, -2.567932);
        csc.addPair(-1.0, -1.1883951);
        csc.addPair(-1.43, -1.009994);
        csc.addPair(-1.7, -1.008405);
        csc.addPair(-2.06, -1.132878);
        csc.addPair(-2.54, -1.766921);
        csc.addPair(-3.42, 3.63868);
        csc.addPair(-3.87, 1.502218);
        csc.addPair(-4.57, 1.0102236);
        csc.addPair(-4.9, 1.017860);
        csc.addPair(-5.4, 1.294055);
        csc.addPair(-5.9, 2.674678);

        sec.addPair(-0.4, 1.085704);
        sec.addPair(-1.0, 1.850815);
        sec.addPair(-1.43, 7.125978);
        sec.addPair(-1.7, -7.761293);
        sec.addPair(-2.06, -2.128007);
        sec.addPair(-2.54, -1.212951);
        sec.addPair(-3.42, -1.040047);
        sec.addPair(-3.87, -1.340059);
        sec.addPair(-4.57, -7.0468031);
        sec.addPair(-4.9, 5.361574);
        sec.addPair(-5.4, 1.575565);
        sec.addPair(-5.9, 1.078192);

        tan.addPair(-0.4, -0.42279);
        tan.addPair(-1.0, -1.557407);
        tan.addPair(-1.43, -7.055463);
        tan.addPair(-1.7, 7.696602);
        tan.addPair(-2.06, 1.878408);
        tan.addPair(-2.54, 0.6864774);
        tan.addPair(-3.42, -0.285830);
        tan.addPair(-3.87, -0.892053);
        tan.addPair(-4.57, -6.975488);
        tan.addPair(-4.9, 5.267493);
        tan.addPair(-5.4, 1.217540);
        tan.addPair(-5.9, 0.403110);

        log.addPair(0.1, -2.3025850);
        log.addPair(0.6, -0.5108256);
        log.addPair(1.4, 0.33647224);
        log.addPair(2.7, 0.99325177);
        log.addPair(7.3, 1.98787435);
        log.addPair(3.0, 1.098612288);
        log.addPair(5.0, 1.6094379124);
        log.addPair(10., 2.3025850929);
        log.addPair(2, 0.69314718056);

        log2.addPair(0.1, -3.321928095);
        log2.addPair(0.6, -0.736965594);
        log2.addPair(1.4, 0.485426827);
        log2.addPair(2.7, 1.432959407);
        log2.addPair(7.3, 2.867896464);
        log2.addPair(3.0, 1.584962501);
        log2.addPair(5.0, 2.321928095);
        log2.addPair(10.,3.3219280959);

        funTrg.addPair(-0.40, -3.425798214);
        funTrg.addPair(-1.00, -7.507493857);
        funTrg.addPair(-1.43, -107.2538497);
        funTrg.addPair(-1.70, -111.1467469);
        funTrg.addPair(-2.06, -5.11490974);
        funTrg.addPair(-2.54, 0.839274432);
        funTrg.addPair(-3.42, -3.568826041);
        funTrg.addPair(-3.87, -1.613417209);
        funTrg.addPair(-4.57, -6.621390175);
        funTrg.addPair(-4.90, 5.952911019);
        funTrg.addPair(-5.40, 2.474777798);
        funTrg.addPair(-5.90, 3.155950449);

        funLog.addPair(0.1, 3.3220106);
        funLog.addPair(0.6, 1.4292260);
        funLog.addPair(1.4, 7.9909474);
        funLog.addPair(2.7, -1.4201494);
        funLog.addPair(7.3, -2.8676971);
        funLog.addPair(3.0, -1.5779667);
        funLog.addPair(5.0, -2.3212204);
        funLog.addPair(10., -3.3218456);

        fun.addPair(-0.40, -3.425798214);
        fun.addPair(-1.00, -7.507493857);
        fun.addPair(-1.43, -107.2538497);
        fun.addPair(-1.70, -111.1467469);
        fun.addPair(-2.06, -5.11490974);
        fun.addPair(-2.54, 0.839274432);
        fun.addPair(-3.42, -3.568826041);
        fun.addPair(-3.87, -1.613417209);
        fun.addPair(-4.57, -6.621390175);
        fun.addPair(-4.90, 5.952911019);
        fun.addPair(-5.40, 2.474777798);
        fun.addPair(-5.90, 3.155950449);
        fun.addPair(0.1, 3.3220106);
        fun.addPair(0.6, 1.4292260);
        fun.addPair(1.4, 7.9909474);
        fun.addPair(2.7, -1.4201494);
        fun.addPair(7.3, -2.8676971);
        fun.addPair(3.0, -1.5779667);
        fun.addPair(5.0, -2.3212204);
        fun.addPair(10., -3.3218456);
    }
}
