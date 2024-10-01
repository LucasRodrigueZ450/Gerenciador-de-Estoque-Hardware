public class CpuStressTest {
    public static void main(String[] args) {
        // Cria várias threads para maximizar o uso da CPU
        int numThreads = Runtime.getRuntime().availableProcessors();
        for (int i = 0; i < numThreads; i++) {
            new Thread(new CpuTask()).start();
        }
    }

    static class CpuTask implements Runnable {
        @Override
        public void run() {
            // Loop infinito para manter a CPU ocupada
            while (true) {
                // Pode adicionar alguma operação simples aqui se necessário
            }
        }
    }
}