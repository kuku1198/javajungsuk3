package ch13;

class ThreadEx12 {
    public static void main(String args[]) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2();

        th1.start();
        th2.start();

//        try {
//            ThreadEx12_1.sleep(2000);
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//        }

        System.out.println();
        System.out.println("<<main 종료>>");
    }
}

class ThreadEx12_1 extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);

            for (int i = 0; i < 300; i++) {
                System.out.print("-");
            }

            System.out.println();
            System.out.println("<<th1 종료>>");
        } catch (InterruptedException e) {
        }
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }

        System.out.println();
        System.out.println("<<th2 종료>>");
    }
}
