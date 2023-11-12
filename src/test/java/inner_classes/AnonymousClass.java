package inner_classes;

public class AnonymousClass {
    interface MonitoringSystem {
        void startMonitoring();
    }

//    class NewMonSystem implements MonitoringSystem {
//        @Override
//        public void startMonitoring() {
//            // ...
//        }
//    }

    public static void main(String[] args) {
        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring started!");
            }
        };

        generalModule.startMonitoring();
    }
}