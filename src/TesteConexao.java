
public class TesteConexao {
	
	public static void main(String[] args) {
		
		
		
		
		// Essas 5 linhas substituem o c�digo comentado abaixo
		try(Conexao conexao = new Conexao()){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conex�o");
		}
		
		
		
		
		
		//------------------------------------------------
		
//		Conexao con = null;
//		try {
//		    con = new Conexao();
//			con.leDados();
//		} catch(IllegalStateException /*ou s� Exception*/ ex) {
//			System.out.println("Deu erro na conex�o");
//		} finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();				
//			}
//		}
		
	}
}
