public class atv01{
    public String name;
    public double preco;
    public int quantidade;


public void adicionarProduto(int novoProduto ){
    quantidade += novoProduto;}

public void venderProduto(int vendaDeProduto ){
    if(vendaDeProduto > quantidade){
        System.out.println("Estoque insuficiente! \n Estoque atual: " + quantidade);
    }else{
        quantidade -= vendaDeProduto;
        System.out.println(vendaDeProduto +  " Unidades vendidas. \n " +
                "Estoque restante: " + quantidade);
    }



}

}