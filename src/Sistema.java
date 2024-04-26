public class Sistema {
    private static void exibirMenu(){
        System.out.println("Menu de Exibição da Corporação Brasylsck Global LTDA\n " +
                "Somos uma plataforma para facilitar cadastramento\n " + " no Bolsa Familia, Bolsa Picanha, e Inscrição para Intercambio\n");

        System.out.println(" * * * Seja Bem-Vindo a nosso sistema de Cadastramento, Busca, Exclusão");
        System.out.println("1-) Conheça nossa Missão,Visão e Valores ");
        System.out.println("2-) Cadastrar Bolsa Familia ");
        System.out.println("3-) Cadastrar Bolsa Picanha ");
        System.out.println("4-) Cadastrar para Intercambio ");
        System.out.println("5-) Listar de Pessoas Inscritas ");
        System.out.println("6-) Procurar por Pessoas especifica ");
        System.out.println("7-) Apagar lista de Pessoas Inscritas ");
        System.out.println("8-) Remover Pessoa da Lista ");
        System.out.println("0-) Sair!");
        System.out.print("\nSelecione uma Opção: ");
    }
    private static void analisarOp(int op){
        int rg; // 3 primeiros digitos
        String nome;
        String email;
        int rendaFamiliar;
        String endereco;
        String telefone;
        String  faculdade;
        String paisDesejado;

            switch(op){
                case 1:
                    System.out.println("\n Missão, Visão e Valores da Brasylsck Global LTDA\n ");
                    System.out.println("Missão:\n" +
                            "Facilitar e simplificar o processo de registro em diversas plataformas, oferecendo aos nossos clientes uma experiência eficiente e amigável. \n" +
                            " Nosso objetivo é eliminar as barreiras burocráticas e tornar acessível a todos a participação em diferentes serviços e comunidades online.\n");
                    System.out.println("Visão:\n" +
                            "Ser a principal referência global em facilitação de registros online, reconhecida pela nossa inovação," +
                            "confiabilidade e compromisso com a excelência. Buscamos constantemente expandir nossa gama de serviços e aprimorar nossa plataforma para atender às necessidades em constante evolução de nossos clientes. \n");
                    System.out.println("Valores:\n" +
                            "\"Na Registro Fácil, nós valorizamos a simplicidade, confiança, inovação, empatia e responsabilidade em tudo o que fazemos.\n");
            break;
                case 2:
                    System.out.println("Registro no Bolsa Familia\n");
                    System.out.println("Informe seu Rg (primeiro 3 digitos) ");
                    rg = Console.lerInt();

                    System.out.println("Nome: ");
                    nome = Console.lerString();

                    System.out.println("Email: ");
                    email = Console.lerString();

                    System.out.println("Renda Familiar: ");
                    rendaFamiliar = Console.lerInt();
                    if(rendaFamiliar <=1500){
                        System.out.println("Inscrição Concluida c sucesso");
                    } else  {
                        System.out.println("Você não pode se registrar no Bolsa Familia");
                    }
                       BolsaFamilia bf = new BolsaFamilia(nome, rg, email, rendaFamiliar);
                    Registro.registrar(bf);
                 //   System.out.println("Solicitante " + nome + " registrado com sucesso!");

                    break;
                    case 3:
                        System.out.println("Registro no Bolsa Picanha\n");
                        System.out.println("Informe seu Rg (primeiro 3 digitos) ");
                        rg = Console.lerInt();

                        System.out.println("Nome: ");
                        nome = Console.lerString();

                        System.out.println("Email: ");
                        email = Console.lerString();

                        System.out.println("Informe seu endereço para comprovar a residencia: ");
                        endereco = Console.lerString();
                        System.out.println("Informe seu Telefone: ");
                        telefone = Console.lerString();

                        BolsaPicanha bp = new BolsaPicanha(nome, rg, email, endereco, telefone);
                        Registro.registrar(bp);
                        System.out.println("Registro Concluido! Em breve vocẽ poderá comer sua picanha! ");

                        break;

                        case 4:
                            System.out.println("Registro para fazer Intercambio \n");
                            System.out.println("Informe seu Rg (primeiro 3 digitos) ");
                            rg = Console.lerInt();

                            System.out.println("Nome: ");
                            nome = Console.lerString();

                            System.out.println("Email: ");
                            email = Console.lerString();

                            System.out.println("Faculdade em que estuda: ");
                            faculdade = Console.lerString();

                            System.out.println("Qual pais deseja ir: ");
                            paisDesejado = Console.lerString();
                            BolsaViagem bv = new BolsaViagem(nome, rg, email, faculdade, paisDesejado);
                            Registro.registrar(bv);
                            System.out.println("Registro Concluido! Já pode preparar suas malas amiguinho");
                        break;
                        case 5:
                            System.out.println("* * * Lista de Pessoas inscritas * * *");
                            if (Registro.getListaPessoas().size() == 0){
                                System.out.println("\n Lista sem Cadastramento! ");
                                return;
                            }
                            for (Pessoa p : Registro.getListaPessoas()) {
                                System.out.println(p.toString());
                            }
                        break;

                                case 6:
                                    System.out.println("Procurar por Pessoas especifica ");
                            System.out.println("Informe seu Rg (primeiro 3 digitos) ");
                            rg = Console.lerInt();
                            Pessoa people = Registro.buscarPessoa(rg);
                            if(people != null){
                                System.out.println("Pessoas encontrada! ");
                                System.out.println(people.toString());
                                return;
                            }
                            System.out.println(rg + "Não localizado, tente novamente! ");
                            break;

                                case 7:
                                    System.out.println("Apagar lista de Pessoas");
                                    Registro.getListaPessoas().clear();
                                    System.out.println("Lista de Pessoas apagada com sucesso!");
                            break;
                                case 8:
                                    System.out.println("Remover Pessoa da Lista\n");
                                    System.out.println("Informe o Rg (primeiros 3 dígitos) da pessoa que deseja remover: ");
                                    rg = Console.lerInt();
                                    Pessoa pessoaRemovida = Registro.removerPessoa(rg);
                                    if(pessoaRemovida != null){
                                        System.out.println("Pessoa removida com sucesso!");
                                    } else {
                                        System.out.println("Pessoa não encontrada na lista.");
                                    }
                                    break;
                                case 0:
                                    System.out.println("Programa Finalizado, Volte sempre!\n");
                                    System.out.println("developer Brayusck");

                                    break;

                                default:
                                    System.out.println("Opção invalida, tente novamente! ");




                }
        }
    public static void execut(){
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            analisarOp(op);
        }while (op !=0);

    }
    }


