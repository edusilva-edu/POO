# Sistema de Controle de Versão

## Configuração Inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git

Sem a identifiação do usuário, não há como controlar qualquer alteração que seja feita. Por isso não é possível fazer tal ação. Assim, antes de mais nada, você precisa configurar seu usuário e email, dessa forma:

```bash
git config --global user.name "Nome"

git config --global user.email "email@email.com"
```

### Criando Personal Access Token (PAT) no GitHub

Para ter acesso aos reposítórios e poder editá-los, é preciso de uma senha, chamada de ersonal Access Token. Eles são criados para que exista segurança e que só os propriedarios possam ter acesso de edição. Seguindo os passos seguintes é simples criar um Token:

1. Na página inicial do GitHub, clique na imagem do seu perfil

1. Entre em _Settings_

1. Acesse a última opção: _Developer settings_

1. Clique na opção _Personal Access Token_ e em seguida _Tokens (classic)_

1. Vá em _Generate new token_ e depois _Generate new token (classic)_

1. Adicione o nome que desejar ao PAT (que o identifique)
 
1. Configure as permissões do Token

1. Clique em _Generate Token_

1. Copie para a área de tranferência

Uma vez que você fecha a página que o PAT aparece para se copiado, não é mais possível ter acesso a ele.

### Salvar em cache as credenciais do PAT

É aconselhado que se regere o seu PAT cada vez que for trabalhar para proteger sua conta e seus repositórios. Para que o PAT não seja de fácil acesso às outras pessoas, não é aconselhado que fique em qualquer lugar. Por isso, é comum salvar o Token em cache por algum tempo. Além de facilitar ao fazer um push, o seu PAT tem hora marcada pra ser apagado do sistema. Para fazer isso, basta executar o seguinte código:

```bash
git config −−global credential.helper 'cache −−timeout=3600'
```

## Qual a diferença entre git merge e git rebase?

Os dois comandos tem a função de fundir branches e seus conteúdos, mas existe uma diferença entre eles. 
O git merge, ao ser executado, cria um commit com a alteração. Já o git rebase não faz isso, não alterando a linha do tempo. <br>
Os dois comandos tem suas utilidades, cabe a quem for usá-los arbitrar qual for de melhor uso em cada ocasião.