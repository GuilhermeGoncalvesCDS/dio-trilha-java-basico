public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? R: " + smartTv.ligada);
        System.out.println("Canal Atual? R: " + smartTv.canal);
        System.out.println("Volume Atual? R: " + smartTv.volume);

        smartTv.ligar();




    }
}
