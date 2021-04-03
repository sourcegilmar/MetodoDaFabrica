package entidades;

public abstract class Moto {
    protected String nome; 
    protected String cilindrada;
    protected String cor;
    public String getNome() {
        return nome;
    }
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
    
}
