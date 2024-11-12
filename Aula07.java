/**
 * Aula 07
 * Tópico: Funções e métodos
 *
 * Nesta aula, vamos abordar:
 * - Funções e métodos
 * 
 * Objetivos:
 * 1. Compreender os conceitos básicos relacionados ao tópico
 * 2. Praticar com exemplos e exercícios
 * 3. Aplicar o conhecimento em um pequeno projeto
 */

public class Aula07 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Aula 07 - Funções e métodos");
        // Código da aula será desenvolvido aqui


        // O que é uma função?
        // Uma função é um bloco de código que realiza uma tarefa específica.
        // Elas são usadas para evitar a repetição de código e para organizar o programa.

        // Lista de nomes
        String[] nomes = { "Marcos", "Maria", "João", "Ana", "Pedro", "Paula", "Lucas", "Julia", "Carlos", "Mariana",
                "Rafael", "Camila", "Gustavo", "Larissa", "Felipe", "Amanda", "Diego", "Juliana", "Ricardo", "Isabela",
                "Fernando", "Letícia", "Hugo", "Beatriz", "Leonardo", "Gabriela", "Rodrigo", "Carolina", "Eduardo",
                "Vanessa", "Marcelo", "Patrícia", "André", "Renata", "Felipe", "Amanda", "Diego", "Juliana", "Ricardo",
                "Isabela", "Fernando", "Letícia", "Hugo", "Beatriz", "Leonardo", "Gabriela", "Rodrigo", "Carolina",
                "Eduardo", "Vanessa", "Marcelo", "Patrícia", "André", "Renata" };

        // Imprimir a saudação para cada nome
        for (String nome : nomes) {
            if (nome.startsWith("R")) {
                System.out.println(saudacao(nome));
            }
        }
    }

    // Função para somar dois números
    // public - acesso público
    // static - método da classe
    // int - tipo de retorno
    // soma - nome do método
    // a e b - parâmetros
    public static int soma(int a, int b) {
        return a + b;
    }

    // Função para subtrair dois números
    public static int subtrai(int a, int b) {
        return a - b;
    }

    // Função para dividir dois números
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    public static String saudacao(String nome) {
        return "Olá, " + nome + "!";
    }

}
