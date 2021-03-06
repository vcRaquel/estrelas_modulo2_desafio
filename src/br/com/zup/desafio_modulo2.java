package br.com.zup;
//Crie um programa para gerenciar uma lista de funcionários
// de uma empresa, cada funcionário tem
// nome, telefone, email e CPF.
// No final do programa deve ser exibida
// a lista de funcionários cadastrados.

//Entrega Mínima: O sistema permite, via terminal,
// inserir pelo menos 1 funcionário
//em uma lista e retornar o mesmo na tela. OK-----------------------------------------------

//Entrega Média: O sistema permite adicionar mais de um
// funcionário e apresenta um menu para decidir se deverá:
//1. Adicionar mais funcionários. OK-----------------------------------------------
//2. Exibir a lista de todos os funcionários cadastrados. OK-----------------------------------------------
//3. Encerrar o programa. OK-----------------------------------------------

//Entrega Máxima:
// O Sistema permite excluir um funcionário usando como parâmetro o CPF OK-----------------------------------------------
// e não permite inserir um funcionário com o CPF repetido.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafio_modulo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int seletor = 1;

        Map<String, String> funcionarios = new HashMap<String, String>();

        while (seletor > 0 && seletor < 4) {
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

                    if (funcionarios.isEmpty()) {
                        funcionarios.put(cpf, "Nome: " + nome + " Telefone: " + telefone + " E-mail: " + email);
                    } else {
                        boolean verificador = false;
                        for (String referencia : funcionarios.keySet()) {
                            if (referencia.equals(cpf)) {
                                verificador = true;
                                break;
                            }
                        }
                        if (verificador) {
                            System.out.println("Este CPF já foi cadastrado");
                        } else {
                            funcionarios.put(cpf, "Nome: " + nome + " Telefone: " + telefone + " E-mail: " + email);
                        }
                    }
                    break;
                case 2:
                    if (funcionarios.isEmpty()){
                        System.out.println("Não existem cadastros a serem exibidos");
                    }
                    for (String referencia : funcionarios.keySet()) {
                        System.out.println(funcionarios.get(referencia) + " CPF: " + referencia);
                    }
                    break;
                case 3:
                    if (funcionarios.isEmpty()) {
                        System.out.println("Não existem cadastros a serem deletados");
                    } else {
                        System.out.println("Por favor, digite o CPF do funcionário a ter o registro deletado: ");
                        String cpfASerRemovido = leitor.nextLine();
                        boolean verificador = false;
                        for (String referencia : funcionarios.keySet()) {
                            if (referencia.equals(cpfASerRemovido)) {
                                verificador = true;
                                funcionarios.remove(cpfASerRemovido);
                                System.out.println("Registro deletado com sucesso");
                                break;
                            }
                        }
                        if (!verificador) {
                            System.out.println("CPF não cadastrado");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar o programa de cadastro de funcionários!");
            }
        }


    }
}
