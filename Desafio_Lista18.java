import java.util.Scanner;


public class Desafio_Lista18 {
    public static void main(String[] args){

        System.out.println("\n  RECOMENDAÇÃO: Aumente o console de depuração para uma melhor experiência");
        System.out.println("               *Caprichei bastante* ALUNO : JOSEPH ALI");

        Scanner leitor = new Scanner(System.in);
        int opcao;

        System.out.printf("\n    -----------------------------------------------------------------");
        System.out.printf("\n    |            DESAFIO - 18 TIPOS DE GOLPES FINANCEIROS           |\n");
        System.out.println("    -----------------------------------------------------------------");
        System.out.printf("           GOLPES - Dicas para não cair em golpes financeiros \n");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 1 ↘ Atuação do Banco Central na prevenção de golpes e fraudes |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 2 ↘ Dicas gerais para evitar golpes                           |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 3 ↘ Vítima fez um Pix e caiu em um golpe                      |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 4 ↘ Vítima do golpe do \"presente\"                             |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 5 ↘ Vítima fez uma TED e caiu em um golpe                     |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 6 ↘ Vítima fez compra com cartão e caiu em golpe              |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 7 ↘ Vítima pagou um boleto e caiu em um golpe                 |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 8 ↘ Banco do golpista detecta não há dinheiro na conta dele   |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 9 ↘ Vítima não reconhece uma compra com seu cartão            |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 10 ↘ Vítima não reconhece uma compra em maquininha de cartão  |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 11 ↘ Vítima caiu no golpe do falso entregador/motoboy         |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 12 ↘ Cuidado com ligações de falsas centrais de atendimento   |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 13 ↘ Golpes envolvendo Valores a Receber                      |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 14 ↘ Medidas para evitar golpes envolvendo empréstimo         |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 15 ↘ Golpes envolvendo o nome do Banco Central                |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 16 ↘ Golpes envolvendo mensagem Swift ou títulos do Tesouro   |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 17 ↘ Golpes contra prefeituras                                |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    | 18 ↘ Golpes envolvendo o Meu BC                               |");
        System.out.println("    -----------------------------------------------------------------");
        System.out.println("    >      ESCOLHA UM DOS GOLPES ACIMA PARA VER SUA DESCRIÇÃO:      <");
        System.out.println("    -----------------------------------------------------------------\n");
        System.out.printf( "             DIGITE AQUI O NÚMERO PARA ACESSAR →    "); opcao = leitor.nextInt();
        System.out.println("\n    -----------------------------------------------------------------");

        switch (opcao) {
            case 1:
                System.out.println("    | 1 ↗ Atuação do Banco Central na prevenção de golpes e fraudes |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Na área logada do Meu BC você encontra os relatórios do Registrato,\n" +
                        "    o sistema Valores a Receber e muito mais. O acesso à área logada do\n" +
                        "    Meu BC é exclusivamente pela página https://www.bcb.gov.br/meubc.\n" +
                        "    Todos os serviços do Banco Central para a população são totalmente\n" +
                        "    gratuitos.\n");
                System.out.println("    O Banco Central não usa advogados nem outros intermediários, não\n" +
                        "    envia links e nem entra em contato para tratar sobre devolução de\n" +
                        "    valores ou para confirmar dados pessoais.\n");
                System.out.println("    Dicas:\n" +
                        "    NUNCA realize qualquer tipo de pagamento para ter acesso aos serviços\n" +
                        "    do Banco Central;\n" +
                        "    CUIDADO com páginas falsas, todos os serviços do Banco Central estão\n" +
                        "    no site oficial https://www.bcb.gov.br/;\n" +
                        "    NÃO clique em links suspeitos enviados por e-mail, SMS, WhatsApp ou\n" +
                        "    Telegram;");
                System.out.println("    -----------------------------------------------------------------");
                break;
            case 2:
                System.out.println("    | 2 ↗ Dicas gerais para evitar golpes                           |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    - Não transferir dinheiro a pedido de conhecidos enviado por\n" +
                        "    aplicativos de mensagens (WhatsApp ou Telegram, por exemplo),\n" +
                        "    principalmente para a conta de outra pessoa que não é conhecida.\n" +
                        "    É indicado telefonar antes ou encontrar a pessoa, confirmando se\n" +
                        "    ela realmente fez o pedido, pois também há vídeos e áudios feitos\n" +
                        "    com uso de inteligência artificial que simulam a voz e imagem de\n" +
                        "    pessoas;\n" +
                        "    - Não aceitar ajuda de estranhos para pagar contas, sacar dinheiro\n" +
                        "    ou fazer outra operação em caixa eletrônico. Pedir ajuda somente\n" +
                        "    a funcionários do banco, que devem estar identificados com crachá\n" +
                        "    e uniforme com o nome do banco;\n" +
                        "    - Desconfiar de promessas de herança, doação ou prêmios em moeda\n" +
                        "    estrangeira (dólar, por exemplo) e não transferir dinheiro para o\n" +
                        "    exterior para receber um valor prometido;\n" +
                        "    - Não fornecer o cartão ou senha a outras pessoas, mesmo que\n" +
                        "    conhecidas;\n" +
                        "    - Se ainda tiver dúvidas, consultar os canais oficiais do seu banco.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 3:
                System.out.println("    | 3 ↗ Vítima fez um Pix e caiu em um golpe                      |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Caso tenha sido vítima de um golpe, o primeiro passo é entrar em\n" +
                        "    contato com seu banco para relatar o caso e solicitar a devolução\n" +
                        "    dos valores transferidos para o suposto golpista. Em paralelo, é\n" +
                        "    recomendável registrar um Boletim de Ocorrência na autoridade\n" +
                        "    policial.\n");
                System.out.println("    Com base no relato:\n" +
                        "    - O banco da vítima registra imediatamente a notificação de\n" +
                        "    infração e instaura o Mecanismo Especial de Devolução (MED) do\n" +
                        "    Pix;\n" +
                        "    - O banco do suposto golpista bloqueia os valores;\n" +
                        "    - As duas instituições avaliam o caso em até 7 dias corridos e\n" +
                        "    verificam se há indícios de fraude ou golpe; e\n" +
                        "    - Comprovada a fraude, o banco do suposto golpista devolve os\n" +
                        "    recursos para a vítima em até 96 horas, a contar do término da\n" +
                        "    avaliação.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC: o banco para onde os recursos\n" +
                        "    foram transferidos será notificado e fará o monitoramento da\n" +
                        "    conta a fim de identificar transações suspeitas.\n");
                System.out.println("    Atenção! Caso alguém entre em contato com você, falando que fez um\n" +
                        "    Pix por engano na sua conta, mostrando um comprovante de\n" +
                        "    pagamento (inclusive se for verdadeiro, mas podendo também ser\n" +
                        "    falso) e pedindo a devolução, verifique primeiro seu extrato\n" +
                        "    bancário. Caso exista de fato um depósito feito na sua conta,\n" +
                        "    utilize a funcionalidade de devolução do Pix porque o dinheiro\n" +
                        "    retornará à mesma conta do pagador. Não aceite sugestões do\n" +
                        "    suposto pagador para devolver o dinheiro numa conta diferente da\n" +
                        "    que fez o depósito. Isso pode ser um golpe, pois ele tentará\n" +
                        "    utilizar o MED para conseguir dinheiro dobrado - o seu e o\n" +
                        "    devolvido pelo banco.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 4:
                System.out.println("    | 4 ↗ Vítima do golpe do \"presente\"                             |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Vítima recebeu uma oferta de um produto como, por exemplo, uma\n" +
                        "    cesta básica, uma renda extra de INSS ou um brinde ou um presente.\n" +
                        "    O golpista pede dados pessoais ou foto do seu rosto (selfie),\n" +
                        "    alegando que a informação serve para finalizar a entrega ou\n" +
                        "    confirmar um cadastro. Com esses dados, o golpista abre conta ou\n" +
                        "    contrata empréstimo por meio de reconhecimento facial.\n");
                System.out.println("    A vítima desse golpe deve entrar em contato imediatamente com o\n" +
                        "    banco no qual a conta foi aberta ou o empréstimo foi realizado\n" +
                        "    para pedir o cancelamento.\n");
                System.out.println("    Caso você desconheça o banco que foi utilizado para o golpe, você\n" +
                        "    pode solicitar a emissão do Relatório de Contas e Relacionamentos\n" +
                        "    em bancos (CCS), pelo Sistema Registrato.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.\n" +
                        "    Em paralelo, é recomendável registrar um Boletim de Ocorrência.\n");
                System.out.println("    Dicas:\n" +
                        "    - Desconfiar ao receber ligação com ofertas de produtos;\n" +
                        "    - Não receber presentes desconhecidos de entregadores em casa;\n" +
                        "    - Não permitir que tirem fotos ou façam vídeos;");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 5:
                System.out.println("    | 5 ↗ Vítima fez uma TED e caiu em um golpe                     |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Caso tenha sido vítima de um golpe, o primeiro passo é a vítima\n" +
                        "    imediatamente entrar em contato com seu banco para relatar o caso\n" +
                        "    e solicitar a devolução dos valores transferidos para o suposto\n" +
                        "    golpista.\n");
                System.out.println("    Em paralelo, é recomendável registrar um Boletim de Ocorrência,\n" +
                        "    informando os dados do comprovante da transação: ID da transação,\n" +
                        "    valor, data/hora da liquidação, descrição (caso preenchida), nome\n" +
                        "    do banco do recebedor, nome do recebedor, CPF ou CNPJ;\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 6:
                System.out.println("    | 6 ↗ Vítima fez compra com cartão e caiu em golpe              |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    O primeiro passo é a vítima imediatamente entrar em contato com\n" +
                        "    seu banco para relatar o caso e contestar a compra realizada com\n" +
                        "    cartão. Em paralelo, é recomendável registrar um Boletim de\n" +
                        "    Ocorrência.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.\n");
                System.out.println("    Dicas:\n" +
                        "    - Sempre que possível, é importante verificar o extrato de cartão,\n" +
                        "    garantindo que nada fora do habitual será cobrado indevidamente\n" +
                        "    na fatura;\n" +
                        "    - Ativar as notificações do aplicativo do cartão para ser avisado\n" +
                        "    sempre que uma nova compra é realizada;\n" +
                        "    - Nas compras pela internet, ter cuidado com sites e aplicativos\n" +
                        "    falsos, para fazer o pagamento em um estabelecimento confiável;\n" +
                        "    - Desconfiar de preços muito abaixo do mercado;\n" +
                        "    - Pesquisar se a loja ou a empresa de leilão realmente existe;\n" +
                        "    - Consultar se essas empresas possuem reclamações em sites\n" +
                        "    especializados ou no consumidor.gov.br.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 7:
                System.out.println("    | 7 ↗ Vítima pagou um boleto e caiu em um golpe                 |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Atualmente, todos os boletos emitidos por bancos são registrados\n" +
                        "    conforme convenção. Isso significa que os dados dos beneficiários\n" +
                        "    dos boletos sempre aparecem quando a pessoa vai pagar o boleto\n" +
                        "    e que os boletos podem ser pagos em qualquer banco.\n");
                System.out.println("    Por isso, é importante:\n" +
                        "    - ao pagar o boleto, que a pessoa verifique se o nome do\n" +
                        "    beneficiário do pagamento é uma pessoa física ou a empresa\n" +
                        "    contratada, e se o banco destinatário é o mesmo que consta no\n" +
                        "    boleto. Se tiver alguma informação diferente, é melhor não fazer\n" +
                        "    o pagamento;\n" +
                        "    - desconfiar de código de barras com falhas e evitar ligar no\n" +
                        "    telefone inscrito no boleto, porque pode ser do próprio\n" +
                        "    golpista, esperando para passar instruções para pagar diretamente\n" +
                        "    na conta dele;\n" +
                        "    - entrar em contato direto com a prestadora de serviços que\n" +
                        "    deveria gerar o boleto, encontrando seu contato em meios oficiais,\n" +
                        "    como sites, por exemplo;\n" +
                        "    - não imprimir o boleto fora do site ou e-mail oficial do serviço\n" +
                        "    que contratou.\n");
                System.out.println("    Se a vítima pagou um boleto indevidamente, o primeiro passo é\n" +
                        "    entrar em contato com seu banco para relatar o caso e contestar a\n" +
                        "    operação. Em paralelo, é recomendável registrar um Boletim de\n" +
                        "    Ocorrência.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.\n");
                System.out.println("    Atenção! Caso o documento apresente um QR Code, esse código é o\n" +
                        "    QR de Pix e o pagamento por meio dele é instantâneo na conta\n" +
                        "    destinatária, sem janelas de compensação de boletos (que ocorrem\n" +
                        "    em dias úteis). Na prática, pagar documento com QR Code é o mesmo\n" +
                        "    que fazer um Pix.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 8:
                System.out.println("    | 8 ↗ Banco do golpista detecta que não há dinheiro na conta dele |");
                System.out.println("    -------------------------------------------------------------------");
                System.out.println("    Após relatar o golpe sofrido, o banco da vítima instaura o\n" +
                        "    Mecanismo Especial de Devolução (MED) do Pix. Comprovada a fraude,\n" +
                        "    o banco do suposto golpista devolve os recursos para a vítima em\n" +
                        "    até 96 horas, a contar do término da avaliação.\n");
                System.out.println("    Se não houver saldo suficiente na conta do suposto golpista para\n" +
                        "    efetuar a devolução total dos valores, a instituição dele deve\n" +
                        "    monitorar a conta e, surgindo recursos na conta, efetuar devoluções\n" +
                        "    parciais (em até 90 dias). O banco da vítima não é obrigado a\n" +
                        "    utilizar recursos próprios para devolver o montante transferido\n" +
                        "    na transação original.\n");
                System.out.println("    Após o prazo de 90 dias sem que haja recursos na conta do suposto\n" +
                        "    golpista, não há devolução de recursos à vítima por meio do MED.\n");
                System.out.println("    Nessas situações, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 9:
                System.out.println("    | 9 ↗ Vítima não reconhece uma compra com seu cartão            |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    O primeiro passo é a vítima imediatamente entrar em contato com\n" +
                        "    seu banco para relatar o caso e contestar a compra realizada com\n" +
                        "    cartão. Em paralelo, é recomendável registrar um Boletim de\n" +
                        "    Ocorrência. Em alguns casos, os bancos permitem a contestação da\n" +
                        "    compra diretamente no extrato da fatura do cartão no internet\n" +
                        "    banking.\n");
                System.out.println("    Pode ocorrer também de o próprio banco ligar para os clientes\n" +
                        "    para verificar se eles reconhecem determinadas compras. Caso o\n" +
                        "    cliente informe que não reconhece a compra, o banco não processa\n" +
                        "    o pagamento.\n");
                System.out.println("    Atenção! Em nenhuma hipótese, o banco pede para o cliente realizar\n" +
                        "    alguma ação no internet banking ou no caixa eletrônico para sustar\n" +
                        "    ou impedir uma compra. Esse tipo de pedido é comum em golpe da\n" +
                        "    falsa central de atendimento.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 10:
                System.out.println("    | 10 ↗ Vítima não reconhece uma compra em maquininha de cartão  |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Caso não reconheça determinada compra feita em maquininha de\n" +
                        "    cartão, recomenda-se conversar com o lojista ou entrar em contato\n" +
                        "    com o banco.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.\n");
                System.out.println("    Dicas:\n" +
                        "    - Antes de digitar a senha ou de aproximar o cartão para pagar,\n" +
                        "    conferir sempre se o visor da maquininha de cartão está funcionando\n" +
                        "    corretamente e se o valor digitado está correto;\n" +
                        "    - Desabilitar a função de pagamento por aproximação se não estiver\n" +
                        "    segura com essa funcionalidade.");
                System.out.println("    -----------------------------------------------------------------");
                break;
            case 11:
                System.out.println("    | 11 ↗ Vítima caiu no golpe do falso entregador/motoboy         |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Vítima recebeu ligação falsa do banco dizendo que seu cartão\n" +
                        "    foi clonado e que um motoboy, supostamente autorizado pelo banco,\n" +
                        "    irá buscá-lo. O motoboy finge que destrói o cartão, mas mantém o\n" +
                        "    chip intacto. Também há casos em que pedem taxa de entrega ou\n" +
                        "    fazem fotos/vídeos para abrir contas digitais ou contratar\n" +
                        "    empréstimos por reconhecimento facial.\n");
                System.out.println("    A vítima deve entrar em contato imediatamente com o banco\n" +
                        "    para pedir o cancelamento do cartão. Se pagou taxa, deve pedir\n" +
                        "    a devolução.\n");
                System.out.println("    Se a situação não for resolvida, a vítima pode:\n" +
                        "    - Procurar o Procon de seu estado ou o Poder Judiciário; ou\n" +
                        "    - Registrar uma reclamação no BC.\n");
                System.out.println("    Dicas:\n" +
                        "    - Desconfiar de ligações que pedem cartão clonado;\n" +
                        "    - Não receber presentes de entregadores desconhecidos;\n" +
                        "    - Não pagar taxas de entregas desconhecidas;\n" +
                        "    - Nunca fornecer senha a terceiros;\n" +
                        "    - Pedir comprovante de todas as operações.");
                System.out.println("    -----------------------------------------------------------------");
                break;
            case 12:
                System.out.println("    | 12 ↗ Cuidado com ligações de falsas centrais de atendimento   |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Desconfie de ligações ou mensagens nas quais se identificam\n" +
                        "    como funcionários do banco e pedem para:\n" +
                        "    - Executar procedimentos no aplicativo;\n" +
                        "    - Clicar em links enviados por e-mail, SMS ou WhatsApp;\n" +
                        "    - Cancelar compra ou boleto (na verdade, é pagamento).\n");
                System.out.println("    Com esses artifícios, os golpistas invadem o celular e realizam\n" +
                        "    operações financeiras indevidas.\n");
                System.out.println("    Nunca siga instruções suspeitas: entre em contato com o gerente\n" +
                        "    ou use os canais oficiais do banco.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 13:
                System.out.println("    | 13 ↗ Golpes envolvendo Valores a Receber                      |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    O único site oficial é https://valoresareceber.bcb.gov.br.\n" +
                        "    O serviço é gratuito. O BC não envia links nem entra em contato\n" +
                        "    para tratar sobre valores ou pedir dados pessoais.\n");
                System.out.println("    Apenas a instituição que aparece na consulta pode contatar o cliente,\n" +
                        "    mas nunca pedirá senha.\n");
                System.out.println("    Dicas:\n" +
                        "    - NÃO clicar em links suspeitos;\n" +
                        "    - NÃO fazer pagamentos para acessar valores;\n" +
                        "    - NÃO existe recall de cartões de crédito.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 14:
                System.out.println("    | 14 ↗ Medidas para evitar golpes envolvendo empréstimo         |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    - Não pagar antecipado para receber empréstimos;\n" +
                        "    - Desconfiar de ofertas muito abaixo do mercado;\n" +
                        "    - Contratar apenas instituições autorizadas pelo BC;\n" +
                        "    - Desconfiar de empresas que não consultam SPC/Serasa;\n" +
                        "    - Desconfiar de links suspeitos enviados por mensagens.\n");
                System.out.println("    Sempre confirme com o gerente ou canais oficiais.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 15:
                System.out.println("    | 15 ↗ Golpes envolvendo o nome do Banco Central                |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    O Banco Central:\n" +
                        "    - Não cobra dívidas, taxas ou transferências;\n" +
                        "    - Não pede senhas, dados bancários ou recadastramentos.\n");
                System.out.println("    Dicas:\n" +
                        "    - Não pague sem confirmar a dívida;\n" +
                        "    - Contate o banco responsável pela dívida;\n" +
                        "    - O BC só liga se a pessoa tiver entrado em contato antes;\n" +
                        "    - Consultar relatórios no Registrato com Conta Gov.br (prata ou ouro).");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 16:
                System.out.println("    | 16 ↗ Golpes envolvendo mensagem Swift ou títulos do Tesouro   |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Golpistas mencionam uso de mensagens SWIFT ou títulos falsos\n" +
                        "    como garantia em operações. Usam documentos falsificados com\n" +
                        "    termos como 'Resgate' ou 'Carta de Crédito Padrão'.\n");
                System.out.println("    O BC esclarece:\n" +
                        "    - Não usa mensagens SWIFT para operações com cidadãos;\n" +
                        "    - Não pode emitir títulos públicos (apenas Tesouro Nacional);\n" +
                        "    - Títulos do Tesouro não existem em papel físico;\n" +
                        "    - Não emite documentos como 'Certidão Conjunta' ou 'Declaração de Autenticidade'.\n");
                System.out.println("    Fraudes são investigadas pela Polícia Federal.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 17:
                System.out.println("    | 17 ↗ Golpes contra prefeituras                                |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    - Só juízes e tribunais podem bloquear ou desbloquear valores;\n" +
                        "    - O BC não pode sustar ou atrasar ordens judiciais;\n" +
                        "    - Se a prefeitura receber mensagens suspeitas, deve procurar\n" +
                        "      o Poder Judiciário e autoridades policiais.");
                System.out.println("    -----------------------------------------------------------------");
                break;

            case 18:
                System.out.println("    | 18 ↗ Golpes envolvendo o Meu BC                               |");
                System.out.println("    -----------------------------------------------------------------");
                System.out.println("    Na área logada do Meu BC estão relatórios do Registrato,\n" +
                        "    Valores a Receber e muito mais. O acesso é somente pelo site\n" +
                        "    https://www.bcb.gov.br/meubc. Todos os serviços são gratuitos.\n");
                System.out.println("    O BC não usa advogados, não envia links e não pede dados pessoais.\n");
                System.out.println("    Dicas:\n" +
                        "    - NUNCA pague para ter acesso aos serviços;\n" +
                        "    - CUIDADO com páginas falsas, use sempre o site oficial;\n" +
                        "    - NÃO clique em links suspeitos recebidos por mensagens.\n");
                System.out.println("    Em caso de dúvidas, use o Fale Conosco do BC.");
                System.out.println("    -----------------------------------------------------------------");
                break;
            default:
                System.out.println("        NÃO HÁ ESSE TÓPICO! SELECIONE SEGUNDO A TABELA (1 A 18)");
                break;
        }

        leitor.close();



    }
}

