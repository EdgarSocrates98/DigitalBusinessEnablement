package br.com.fiap.teste;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;

import br.com.fiap.dao.LivroDAO;
import br.com.fiap.dao.impl.LivroDAOImpl;
import br.com.fiap.entity.Autor;
import br.com.fiap.entity.Editora;
import br.com.fiap.entity.Livro;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class Teste {

	public static void main(String[] args) throws Exception {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		LivroDAO dao = new LivroDAOImpl(em);

		Editora editora = new Editora("Novatec", null);
		Autor autor = new Autor("Deitel", Calendar.getInstance(), null);
		List<Autor> autores = new ArrayList<>();
		autores.add(autor);
		
		File file = new File("java.jpg");
		BufferedImage imagem = ImageIO.read(file);
		ByteArrayOutputStream array = new ByteArrayOutputStream();
		ImageIO.write(imagem, "jpg", array);
		
		Livro livro = new Livro("1234", "Java como programar", 
				 array.toByteArray() ,editora, autores);
		
		try{
			dao.cadastrar(livro);
			dao.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		em.close();
		System.exit(0);
	}
	
}




