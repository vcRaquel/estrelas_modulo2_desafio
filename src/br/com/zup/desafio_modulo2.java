package br.com.zup;
//Crie um programa para gerenciar uma lista de funcionários
// de uma empresa, cada funcionário tem
// nome, telefone, email e CPF.
// No final do programa deve ser exibida
// a lista de funcionários cadastrados.

//Entrega Mínima: O sistema permite, via terminal,
// inserir pelo menos 1 funcionário
//em uma lista e retornar o mesmo na tela.

//Entrega Média: O sistema permite adicionar mais de um
// funcionário e apresenta um menu para decidir se deverá:
//1. Adicionar mais funcionários.
//2. Exibir a lista de todos os funcionários cadastrados.
//3. Encerrar o programa.

//Entrega Máxima: O Sistema permite excluir um funcionário usando como
//parâmetro o CPF e não permite inserir um funcionário com o CPF repetido.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafio_modulo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int seletor = 1;
        Map<String, String> funcionarios = new HashMap<String, String>();

        while (seletor > 0 && seletor < 4 && seletor != 4) {
            System.out.println("Programa de cadastro de funcionários");
            System.out.println("Digite 1 para cadastrar um funcionário");
            System.out.println("Digite 2 Exibir a lista de todos os funcionários cadastrados");
            System.out.println("Digite 3 para remover um cadastro de funcionário");
            System.out.println("Digite 4 para encerrar o programa e sair");
            seletor = leitor.nextInt();
            leitor.nextLine();

            switch (seletor) {
                case 1:
                    System.out.println("Digite o nome Completo do Funcionário: ");
                    String nome = leitor.nextLine();
                    System.out.println("Digite o telefone do funcionário: ");
                    String telefone = leitor.nextLine();
                    System.out.println("Digite o e-mail do funcionário: ");
                    String email = leitor.nextLine();
                    System.out.println("Digite o CPF do funcionário: ");
                    String cpf = leitor.nextLine();
                    funcionarios.put(cpf, "Nome: " + nome + " Telefone: " + telefone);
                    break;
                case 2:
                    for (String referencia : funcionarios.keySet()) {
                        System.out.println(funcionarios.get(referencia) + " CPF: " + referencia);
                    }
                    System.out.println("exibir lista");
                    break;
                case 3:
                    System.out.println("Por favor, digite o CPF do funcionário a ter o registro deletado: ");
//                    String cpfRemovido = "";
                    String cpfASerRemovido = leitor.nextLine();
                    for (String referencia : funcionarios.keySet()) {
                        if (referencia.equals(cpfASerRemovido)) {
//                          cpfRemovido = cpfASerRemovido;
                            funcionarios.remove(cpfASerRemovido);
                            System.out.println("Registro deletado com sucesso");
                            break;
                        }
                    }
//                    funcionarios.remove((cpfASerRemovido));
                case 4:
                    System.out.println("Obrigado por usar o programa de cadastro de funcionários!");

            }
        }


    }
}
