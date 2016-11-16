package br.cefetrj.webdep.teste;

import br.cefetrj.webdep.model.entity.Permissao;
import br.cefetrj.webdep.model.entity.Servidor;
import br.cefetrj.webdep.model.entity.Sistema;
import br.cefetrj.webdep.model.entity.Usuario;
import br.cefetrj.webdep.services.PermissaoService;
import br.cefetrj.webdep.services.UsuarioService;

public class TestePermissao {

public static void main(String [] args){
		
		Usuario usu = new Usuario();
		Sistema sis = new Sistema();
		Permissao per = new Permissao();
		
		usu.setNome("felipe");
		usu.setEmail("email");
		usu.setLogin("login");
		usu.setSenha("senha");
		usu.setAdmGeral(true);
		
		per.setPerfil("Administartor");
	
		per.setUsuario(usu);
		
		PermissaoService.insertPermissao(per);
		
		
	}
	
	
}
