public class Mensagens {
    public Mensagens() {
    }

    public static String getMensagemAlimentar() {
        String[] mensagens = new String[]{"Humm... que delícia!", "Estou tão feliz por você ter me alimentado!", "Mais um petisco, por favor!", "Isso foi delicioso!", "Estou satisfeito agora!"};
        return mensagens[(int)(Math.random() * (double)mensagens.length)];
    }

    public static String getMensagemBrincar() {
        String[] mensagens = new String[]{"Isso é tão divertido!", "Estou adorando brincar com você!", "Vamos brincar mais!", "Uau, que legal!", "Me faça rir mais!"};
        return mensagens[(int)(Math.random() * (double)mensagens.length)];
    }

    public static String getMensagemSocializar() {
        String[] mensagens = new String[]{"Adoro conhecer novos amigos!", "A socialização é tão importante!", "Estou me sentindo amado!", "Vamos nos divertir juntos!", "Você é um ótimo amigo!"};
        return mensagens[(int)(Math.random() * (double)mensagens.length)];
    }

    public static String getMensagemLimpar() {
        String[] mensagens = new String[]{"Agora estou limpo, obrigado!", "Ah, isso é refrescante!", "Me sinto renovado!", "Estou tão limpo agora!", "Banho é bom!"};
        return mensagens[(int)(Math.random() * (double)mensagens.length)];
    }

    public static String getMensagemDescansar() {
        String[] mensagens = new String[]{"Estou descansando, obrigado!", "Isso é tão relaxante!", "Vou recuperar minha energia!", "Que sono bom!", "Sonhos doces!"};
        return mensagens[(int)(Math.random() * (double)mensagens.length)];
    }
}