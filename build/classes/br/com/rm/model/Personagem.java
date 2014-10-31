package br.com.rm.model;

/**
 * Classe utilizada para representar os personagens do jogo (personagens de jogadores e personagens do mestre)
 **/
public class Personagem {
	String nome;
	Integer HPAtual;
	Integer HPTotal;
	Integer MPAtual;
	Integer MPTotal;
	Integer nivel;
	Integer gold;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHPAtual() {
		return HPAtual;
	}
	public void setHPAtual(Integer hPAtual) {
		HPAtual = hPAtual;
	}
	public Integer getHPTotal() {
		return HPTotal;
	}
	public void setHPTotal(Integer hPTotal) {
		HPTotal = hPTotal;
	}
	public Integer getMPAtual() {
		return MPAtual;
	}
	public void setMPAtual(Integer mPAtual) {
		MPAtual = mPAtual;
	}
	public Integer getMPTotal() {
		return MPTotal;
	}
	public void setMPTotal(Integer mPTotal) {
		MPTotal = mPTotal;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public getGold () {
		return gold;
	}
	public setGold (Integer gold) {
		this.gold = gold;
	}
}
