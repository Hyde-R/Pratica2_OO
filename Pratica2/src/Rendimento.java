import java.text.NumberFormat;

public class Rendimento {

    private float investimentoInicial;
    private double taxaRendimento;
    private int numParcela;

    public Rendimento(float investimentoInicial, double taxaRendimento, int numParcela) {
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.numParcela = numParcela;
    }

    public float getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(float investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public void rendimentoCalculo(){
        double rendimentoMes = investimentoInicial;
        System.out.println("Valor Inicial: " + NumberFormat.getCurrencyInstance().format(getInvestimentoInicial()));
        System.out.println("Taxa de Juros: " + NumberFormat.getPercentInstance().format(getTaxaRendimento()/100));
        for(int i = 0; i < getNumParcela(); i++) {
            rendimentoMes = ((rendimentoMes * getTaxaRendimento()) / 100) + rendimentoMes;
            System.out.println("Mês " + (i+1) + ": " + NumberFormat.getCurrencyInstance().format(rendimentoMes));
        }

    }


}
