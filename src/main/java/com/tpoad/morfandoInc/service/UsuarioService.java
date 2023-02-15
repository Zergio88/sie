package com.tpoad.morfandoInc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tpoad.morfandoInc.entity.Usuario;
import com.tpoad.morfandoInc.repo.UsuarioRepo;


@Service
public class UsuarioService {

		@Autowired
		private UsuarioRepo usuariorepo;
		
		public Usuario insertar(Usuario usuario) {
			return usuariorepo.save(usuario); // devuelve el codigo con el que fue insertado en la bd
		}
		
		public Usuario actualizar(Usuario usuario) {
			return usuariorepo.save(usuario);
		}
		
		public List<Usuario> listar(){
			return usuariorepo.findAll();
		}
		
		public void eliminar(Usuario usuario) {
			usuariorepo.delete(usuario);
		}
}
