public class Aula_03 {
    public static void main(String[] args) {

        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Bic Cristal";
        caneta1.cor = "Preto";
        caneta1.carga = 80;
        //caneta1.tampada =true;
        caneta1.status();
        caneta1.destampar();
        caneta1.rabiscar();
    }
}
