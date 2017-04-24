package br.com.fiap.bean;

public class Paciente extends Pessoa{

	private int codigo;
	
	private String planoSaude;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlanoSaude() {
		return planoSaude;
	}

	public void setPlanoSaude(String planoSaude) {
		this.planoSaude = planoSaude;
	}

	@Override
	public void registrar() {
		System.out.println("Senha para atendimento");
	}
	
}
