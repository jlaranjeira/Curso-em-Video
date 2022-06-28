public class Aula_02 {
    public static void main(String[] args) {

        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Esferográfica";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 100;

        caneta1.tampar();


        /*
        # Chamada do Método "status" do objeto caneta1
         */
        caneta1.status();
        caneta1.rabiscar();

        /*
        Objeto Caneta2
         */
        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Tinteiro";
        caneta2.cor = "Vermelho";
        caneta2.ponta = 0.7f;
        caneta2.carga = 80;

        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();



    }
}
