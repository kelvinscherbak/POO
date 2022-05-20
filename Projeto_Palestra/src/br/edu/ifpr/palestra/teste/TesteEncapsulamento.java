package br.edu.ifpr.palestra.teste;

import br.edu.ifpr.palestra.modelo.Certificado;
import br.edu.ifpr.palestra.modelo.Palestra;
import br.edu.ifpr.palestra.modelo.Palestrante;
import br.edu.ifpr.palestra.modelo.Participante;
import br.edu.ifpr.palestra.modelo.Sala;

public class TesteEncapsulamento {
	public static void main(String [] args) {
		Sala sala01 = new Sala(10,"CUrso","Bloco A");
		Participante participante01 = new Participante("Mald","Email.","011312313");
		Certificado certificado01 = new Certificado(1,2,3,4);
		Palestrante palestrante01 = new Palestrante("Nome","cpf","endereco","rg","0000-00-00","cidade","Estado");
		Palestra palestra01 = new Palestra("tema","0000-00-00",true);
		
		
		
		
		
		
		
	}

}
