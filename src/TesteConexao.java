
public class TesteConexao {
	
	public static void main(String[] args) {
		
		
		
		
		// Essas 5 linhas substituem o código comentado abaixo
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
		
		
		
		
		
		//------------------------------------------------
		
//		Conexao con = null;
//		try {
//		    con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException /*ou só Exception*/ ex) {
//			System.out.println("Deu erro na conexão");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();				
//			}
//		}
		
	}
}
