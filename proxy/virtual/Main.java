package proxy.virtual;
public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage("highres_photo.jpg");

        // RealImage ainda não foi carregada
        System.out.println("Image created, not loaded yet.");

        // Agora o objeto real será criado e exibido
        img.display();

        // Da próxima vez, será exibido diretamente (sem carregar de novo)
        img.display();
    }
}
