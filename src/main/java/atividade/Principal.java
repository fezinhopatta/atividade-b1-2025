package atividade;

public class Principal{
    public static void main(String[] args){
        System.out.println("lalalaa");

        Notificacao not = new Notificacao("Primeiro exemplo");

        NotificacaoSMS sms = new NotificacaoSMS("Segundo exemplo");


        sms.enviar();
        not.enviar();
    }
}