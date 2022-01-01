package br.com.example.appfinancas.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Financas {

		@Id
		@GeneratedValue(strategy = GenerationType.TABLE)
		private Long id;
		private String tipo;
		private String categoria;
		private float valor;
		private String dataResgistro;
		
		
		@ManyToOne
		private Usuario login;
		@OneToMany(mappedBy = "financas")
		private List<Registro> registros = new ArrayList<>();

		public Financas() {
			
		}
		
		public Financas (String tipo, String categoria, float valor, String dataRegistro) {
			this.tipo = tipo;
			this.categoria = categoria;
			this.valor = valor;
			this.dataResgistro = dataRegistro;
		}
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}

		public String getDataResgistro() {
			return dataResgistro;
		}

		public void setDataResgistro(String dataResgistro) {
			this.dataResgistro = dataResgistro;
		}

		public Usuario getUser() {
			return login;
		}

		public void setUser(Usuario login) {
			this.login = login;
		}

		public List<Registro> getRegistros() {
			return registros;
		}

		public void setRegistros(List<Registro> registros) {
			this.registros = registros;
		}

}
