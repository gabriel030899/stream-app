# StreamApp 📱🎬

**StreamApp** é um aplicativo Android de demonstração para consumo de conteúdos multimídia, criado em Java e ideal para estudo, prototipagem e projetos acadêmicos.

## 🚀 Funcionalidades

- Tela de login estilizada (simples, sem autenticação real)
- Listagem de conteúdos fictícios (podcasts, séries, filmes, músicas)
- Detalhamento do conteúdo selecionado com título e descrição
- Design clean com tons de azul

## 🏗️ Estrutura do projeto

streamapp-full/
└── app/
└── src/
└── main/
├── java/com/streamapp/
│ ├── MainActivity.java # Tela de login
│ ├── ContentListActivity.java # Lista de conteúdos
│ └── ContentDetailActivity.java # Detalhes do conteúdo
├── res/layout/
│ ├── activity_login.xml
│ ├── activity_content_list.xml
│ └── activity_content_detail.xml
├── AndroidManifest.xml
├── build.gradle
├── build.gradle
├── settings.gradle
├── gradle.properties

## ⚙️ Como rodar

1. **Extraia** o `.zip` do projeto.
2. **Abra o Android Studio** e selecione `File > Open` > escolha a pasta `streamapp-full`.
3. Aguarde o **Gradle Sync** finalizar.
4. Rode o app em um emulador ou celular.

## 🖼️ Telas do App

- **Login:** Interface azul, usuário entra com qualquer login e senha.
- **Conteúdos Disponíveis:** Lista de podcasts, filmes, séries, etc.
- **Detalhe:** Tela mostra título e descrição do conteúdo escolhido.

## ✍️ Personalização

Você pode facilmente:
- Adicionar mais conteúdos (edite `ContentListActivity.java`)
- Trocar textos, cores ou imagens nos arquivos XML de layout
- Melhorar a navegação e incrementar novas funcionalidades

## 📚 Requisitos

- Android Studio Arctic Fox ou superior
- SDK mínimo: API 21 (Android 5.0)
- Linguagem: Java

---

> **Projeto acadêmico para estudos e PIM – Análise e Desenvolvimento de Sistemas (UNIP)**

---
