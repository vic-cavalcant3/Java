import Model.Aluno;

public class Main {
    public static void main(String[] args) {

        atv01 produtos = new atv01();
        produtos.name = "Placa mãe";
        produtos.quantidade = 37;
        produtos.preco = 780.99;

//        produtos.adicionarProduto( 10);
//        produtos.venderProduto(37);
//        produtos.venderProduto(57);


        atv02 estudante1 = new atv02();
        estudante1.nome = "Victor";
        estudante1.nota1 = 8.0;
        estudante1.nota2 = 9.0;


        atv02 estudante2 = new atv02();
        estudante2.nome = "Vinicius";
        estudante2.nota1 = 8.0;
        estudante2.nota2 = 7.0;


//        System.out.println(estudante1.nome + " tem média: " + estudante1.calculateAverage());
//        System.out.println(estudante2.nome + " tem média: " + estudante2.calculateAverage());

        atv03 bond = new atv03();
        bond.name = "Tesouro Selic";
        bond.balance = 20000.00;
        bond.buyBond(24); // Compra um título com prazo de 24 meses
        bond.simulateInterest(); // Simula os juros por 24 meses

        Aluno pedro = new Aluno();
        pedro.nome = "Pedro";
        pedro.altura = 1.75;
        pedro.anoMatricula = 2021;

        Aluno carla = new Aluno();
        carla.nome = "Carla";
        carla.altura = 1.68;
        carla.anoMatricula = 2022;

        System.out.println(pedro.nome + " tem " + pedro.altura + "m de altura.");
        carla.estudar();
    }
}