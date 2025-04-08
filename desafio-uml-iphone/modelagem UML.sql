         +----------------------+
         |  <<interface>>       |
         |  ReprodutorMusical   |
         +----------------------+
         | +tocar(): void       |
         | +pausar(): void      |
         | +selecionarMusica(): void |
         +----------------------+

         +----------------------+
         |  <<interface>>       |
         |  AparelhoTelefonico  |
         +----------------------+
         | +ligar(): void       |
         | +atender(): void     |
         | +iniciarCorreioVoz(): void |
         +----------------------+

         +----------------------+
         |  <<interface>>       |
         |  NavegadorInternet   |
         +----------------------+
         | +exibirPagina(): void|
         | +adicionarNovaAba(): void |
         | +atualizarPagina(): void  |
         +----------------------+

               ^       ^       ^
               |       |       |
               +-------+-------+
                       |
         +-----------------------------+
         |          Iphone             |
         +-----------------------------+
         | +tocar(): void              |
         | +pausar(): void             |
         | +selecionarMusica(): void   |
         | +ligar(): void              |
         | +atender(): void            |
         | +iniciarCorreioVoz(): void  |
         | +exibirPagina(): void       |
         | +adicionarNovaAba(): void   |
         | +atualizarPagina(): void    |
         +-----------------------------+
