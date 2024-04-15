package Exercicio1;

class Controle {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.adicionar(new Funcionario("Caio", 20));
        sistema.adicionar(new Funcionario("Paula", 20));

        sistema.mostrar();
        sistema.editar("Caio", 21);
        sistema.mostrar();
        sistema.excluir("Paula");
        sistema.mostrar();
    }
}