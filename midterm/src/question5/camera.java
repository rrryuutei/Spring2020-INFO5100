package question5;

public class camera {


        private static camera bigCamera;
        private static Object obj = new Object();
        private String cameraName = "";

        private camera() {
        }

        public String getCameraName() {
            return this.cameraName;
        }

        public void setCameraName(String cameraName) {
            this.cameraName = cameraName;
        }

        public static camera getInstance() {
            synchronized(obj) {
                if (bigCamera == null) {
                    bigCamera = new camera();
                }
            }

            return bigCamera;
        }
    }


