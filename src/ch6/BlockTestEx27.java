package ch6;

public class BlockTestEx27 {
    static {
        System.out.println("static {}");
    }

    {
        System.out.println("{}");
    }

    public BlockTestEx27() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTestEx27 bt = new BlockTestEx27();");
        BlockTestEx27 bt = new BlockTestEx27();

        System.out.println("BlockTestEx27 bt2 = new BlockTestEx27();");
        BlockTestEx27 bt2 = new BlockTestEx27();
    }
}
