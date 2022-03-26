package question5;

public class main {

    public main() {
    }

    public static void main(String[] args) {
        camera cam1 = camera.getInstance();
        cam1.setCameraName("Sony");
        camera cam2 = camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());
        cam2.setCameraName("Benq");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());
    }
    }

