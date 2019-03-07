package site.gaoyisheng.testExtends;

public class StaticSonA extends StaticFatherB {

    static
    {
        System.out.println("Load A");
    }
    public StaticSonA()
    {
        System.out.println("Create A");
    }


}
