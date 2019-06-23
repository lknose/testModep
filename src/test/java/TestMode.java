

public class TestMode {
    public static void main(String[] args) throws Exception {

        po:for (int i = 0; i < 1000; i++) {
                    break po;
    }
        byte[] bytes = "小弟弟".getBytes("GBK");
        String string = new String(bytes, "GBK");
        System.out.println(string);

        System.out.println( Math.round(-18.6));
        System.out.println(Math.round(18.6));
    }
}
