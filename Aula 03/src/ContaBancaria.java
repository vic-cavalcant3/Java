public class ContaBancaria { //CLASS
    public String name;
    public double balance;
    public double interestRate;

    public void  Valordeposito(double Valordeposito){//Retorno das classes
            balance += Valordeposito;
    }

    public void Valorsaque (double Valorsaque){
        if (Valorsaque > balance){
            System.out.println("Saldo Insuficiente!!");
        } else Valorsaque -= balance;
    }






}
