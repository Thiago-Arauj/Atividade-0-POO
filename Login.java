public class Login {
    String senha = "123456";

    int validaSenha(String var){

        System.out.println("Digite sua senha:");

        if (senha.equals(var)){
            System.out.println("Senha correta!");
            return 1;
        }else{
            System.out.println("Senha incorreta!");
            return 0;
        }
    }

    void novaSenha(String np){
        System.out.println("Defina uma nova senha:");
        senha = np;
        System.out.println("Senha redefinida!");
    }
}
